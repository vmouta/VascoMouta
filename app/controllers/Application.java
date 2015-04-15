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
	
	public static Result index() {
        return i18nRedirect("");
    }
    
    public static Result indexI18n(String lang) {
    	return redirect("/"+ lang + "/home.html");
    }
    
    public static Result i18nRedirect(String uri) {
    	Cookie langCookie = request().cookie(Cookies.PLAY_LANG);
    	if(langCookie == null) {
    		String lang = Lang.preferred(request().acceptLanguages()).code();
    		AppLogger.debugLog("Set application language to " + lang);
    		changeLang(lang);
    	} else if(findLanguage(langCookie.value()) == null) {
    		String lang = Lang.preferred(request().acceptLanguages()).code();
    		AppLogger.debugLog("Language cookie not found set language to " + lang);
    		changeLang(lang);
    	} else {
    		AppLogger.debugLog("Cookie Language " + langCookie.value());
    	}
        return redirect("/"+ lang().code() + "/"+ uri);
    }
    
    public static Result home(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/home.html");
    	return ok(index.render("Vasco Mouta"));
    }
    
    public static Result protfolio(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/protfolio.html");
        return ok(portfolio.render());
    }
    
    public static Result resume(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/resume.html");
        return ok(resume.render());
    }
    
    public static Result blog(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/blog.html");
        return ok(contact.render());
    }
    
    public static Result contact(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/contact.html");
        return ok(contact.render());
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
