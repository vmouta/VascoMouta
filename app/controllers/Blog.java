package controllers;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import com.bkahlert.wpws.WordPressWebServicePortTypeProxy;
import com.bkahlert.wpws.model.Post;

import play.*;
import play.mvc.*;
import views.html.*;

public class Blog extends AppController {
	
    public static Result blog(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/blog.html");
    	
    	String args = "post_type=attachment&posts_per_page=-1&post_status=any&post_parent=null";
    	
    	Post[] posts = null;
		WordPressWebServicePortTypeProxy a = new WordPressWebServicePortTypeProxy();
		try {
			posts = a.getPosts(null);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		if(posts != null) {
			return ok(myblog.render(posts,1,1));
		}
		return ok();
    }
}
