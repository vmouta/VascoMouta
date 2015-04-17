package controllers;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Post;
import play.*;
import play.mvc.*;
import views.html.*;
import views.html.blog.*;

public class Blog extends AppController {
	
	public static final int POSTS_PER_PAGE = 5;
	
    public static Result blog(String lang, int page) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/blog.html");
    	List<Post> posts = Post.getPosts();
    	int numberPages = (posts.size() + POSTS_PER_PAGE - 1) / POSTS_PER_PAGE;
    	int offset = (page-1)*POSTS_PER_PAGE;
    	if(page<1) {
    		page=1;
    		offset = 0;
    	} else if(page>numberPages || offset>posts.size()) {
    		page = numberPages;
    		offset = (page-1)*POSTS_PER_PAGE;
    	}
    	
    	List<Post> pagePosts = new ArrayList<Post>();
    	for(int i=0,j=offset;(i<POSTS_PER_PAGE && j<posts.size()); i++,j++) {
    		pagePosts.add(posts.get(j));
    	}
    	return ok(myblog.render("Vasco Mouta", pagePosts,page,numberPages));
    }
    
    public static Result postById(String lang, String id) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/blog.html");
    	
    	Post post = Post.getPost(Integer.valueOf(id));
    	return ok(myblog_post.render(post));
    }
    
    public static Result post(String lang, int year, int month, int day, String name) {
		Post post = Post.getPost(year, month, day, name);
		return ok(myblog_post.render(post));
	}
}
