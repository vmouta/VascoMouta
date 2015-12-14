package models;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import play.i18n.Messages;

import com.bkahlert.wpws.WordPressWebServicePortTypeProxy;
import com.bkahlert.wpws.model.Image;

public class Post {
	
	private static final WordPressWebServicePortTypeProxy wordpress = new WordPressWebServicePortTypeProxy();
	private static final String ATTATCHMENT_ARGS = "post_type=attachment&posts_per_page=-1&post_status=any&post_parent=null";

	private com.bkahlert.wpws.model.Post wordpressPost;
	
	private Post previousWordpressPost = null;
	private Post nextWordpressPost = null;

	public static List<Post> getPosts() {
		List<Post> posts = new ArrayList<Post>();
		com.bkahlert.wpws.model.Post[] wordpress_posts = null;
		try {
			wordpress_posts = wordpress.getPosts(null);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if(wordpress_posts != null) {
			Post previous_wordpress_posts = null;
			for(com.bkahlert.wpws.model.Post wordpress_post : wordpress_posts) {
				Post new_wordpress_posts = new Post(wordpress_post);
				if(previous_wordpress_posts != null) {
					new_wordpress_posts.nextWordpressPost = previous_wordpress_posts;
					previous_wordpress_posts.previousWordpressPost = new_wordpress_posts;
				}
				previous_wordpress_posts = new_wordpress_posts;
				posts.add(new_wordpress_posts);
			}
		}
		return posts;
	}
	
	public static Post getPost(int id) {
		Post post = null;
		com.bkahlert.wpws.model.Post wordpress_post = null;
		try {
			wordpress_post = wordpress.getPost(id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if(wordpress_post != null) post = new Post(wordpress_post);
		return post;
	}
	
	public static Post getPost(int year, int month, int day, String name) {
		Post post = null;
		List<Post> posts = getPosts();
		if(posts != null) {
			for(Post cPost : posts) {
				if(cPost.getName().equals(name)) {
					post = cPost;
					break;
				}
			}
		}
		return post;
	}
	
	private Post(com.bkahlert.wpws.model.Post wordpress_post) {
		super();
		this.wordpressPost = wordpress_post;
	}
	
	/**
     * Gets the id value for this Post.
     * 
     * @return id
     */
    public int getId() {
        return wordpressPost.getId();
    }
    
    public String getAuthor() {
    	return "Vasco Mouta";
    }

    /**
     * Gets the title value for this Post.
     * 
     * @return title
     */
    public String getTitle() {
        return wordpressPost.getTitle();
    }
    
    /**
     * Gets the name value for this Post.
     * 
     * @return name
     */
    public String getName() {
        return wordpressPost.getName();
    }
    
    public String getText() {
    	String content = wordpressPost.getContent();
    	if(content != null) content = content.replaceAll("(?s)<img[^>]*>.*?</img>", "");
    	if(content != null) content = content.replaceAll("(?s)<img[^>]*/>", "");
    	return (content!=null?content.replaceAll("(?s)<img[^>]*>", ""):"");
    }
    
    public String getTextShort() {
    	return StringUtils.abbreviate(getText(), 400);
    }
    
    public Calendar getDate() {
    	return wordpressPost.getDate();
    }
    
    public int getNumComments() {
    	return wordpressPost.getCommentCount();
    }
    
    public String getDateString() {
    	String dateFormat = Messages.get("date.format", "dd.MMM.yyyy");
    	Calendar date = getDate();
    	return (date!=null?new SimpleDateFormat(dateFormat).format(date.getTime()):null);
    }
    
    public String getDateStringFull() {
    	String dateFormat = Messages.get("date.format.full", "dd MMMM yyyy");
    	Calendar date = getDate();
    	return (date!=null?new SimpleDateFormat(dateFormat).format(date.getTime()):null);
    }
    
    /**
     * Gets the number of images for this Post.
     * 
     * @return number of Images
     */
    public int getImagesCount() {
    	Image[] images = (wordpressPost.getGallery()!=null?wordpressPost.getGallery().getImages():null);
        return (images!=null?images.length:0);
    }
    
    public String mainImageUrl() {
    	Image image = (wordpressPost.getGallery()!=null?wordpressPost.getGallery().getMainImage():null);
    	return (image!=null?image.getUrl():null);
    }
    
    public String mainImageUrl(String width, String height) {
    	Image image = (wordpressPost.getGallery()!=null?wordpressPost.getGallery().getMainImage():null);
    	String url = (image!=null?image.getResizeableUrl():null);
    	if(url!=null) {
    		url = url.replace("%{WIDTH}", width);
    		url = url.replace("%{HEIGHT}", height);
    	}
    	return url;
    }
    
    public String imageUrl(int index, String width, String height) {
    	Image[] images = (wordpressPost.getGallery()!=null?wordpressPost.getGallery().getImages():null);
    	String url = (images!=null&&images.length>index?images[index].getResizeableUrl():null);
    	if(url!=null) {
    		url = url.replace("%{WIDTH}", width);
    		url = url.replace("%{HEIGHT}", height);
    	}
    	return url;
    }
    
    public String getRelativeUrl() {
    	Calendar date = getDate();
    	StringBuffer url = new StringBuffer();
    	url.append("/");
    	url.append(new SimpleDateFormat("yyyy/MM/dd/").format(date.getTime()));
    	url.append(getName());
        return url.toString();
    }
    
    public Post getPreviousPost() {
    	return previousWordpressPost;
    }
    
    public Post getNextPost() {
    	return nextWordpressPost;
    }
}

