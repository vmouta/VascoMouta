package controllers;

import static play.data.Form.form;
import play.*;
import play.i18n.Lang;
import play.mvc.*;
import play.mvc.Http.Cookie;
import utils.AppLogger;
import utils.Cookies;
import views.html.*;

public class Application extends AppController {

	public static Result goHome() {
		return indexI18n(lang().code());
	}
	
	public static Result updateLang(String lang) {
		return redirect("/"+ lang + "/home.html");
	}
	
	public static Result index() {
        return i18nRedirect("");
    }
    
    public static Result indexI18n(String lang) {
    	return redirect("/"+ lang + "/home.html");
    }
    
    public static Result home(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/home.html");
    	return ok(index.render("Vasco Mouta"));
    }
    
    public static Result protfolio(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/protfolio.html");
        return ok(portfolio.render("Vasco Mouta - Portfolio"));
    }
    
    public static Result resume(String lang, int company) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/resume.html");
        return ok(resume.render(company));
    }
    
    public static Result contact(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/contact.html");
        return ok(contact.render("Vasco Mouta - Contact"));
    }
    
    public static Result routerI18n(String lang, String uri) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/" + uri);
    	return notFound();
    }
    
	/* Expoused routes to javascript */
	public static Result jsRoutes() {
		return ok(Routes.javascriptRouter("jsRoutes")).as("text/javascript");
	}

}
