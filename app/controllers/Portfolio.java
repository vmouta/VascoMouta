package controllers;

import play.*;
import play.mvc.*;
import views.html.portfolios.*;

public class Portfolio extends AppController {
	
	public static Result alianca(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/alianca.html");
        return ok(alianca.render());
    }
	
	public static Result beetagg(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/beetagg.html");
        return ok(beetagg.render());
    }
	
    public static Result boat24(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/boat24.html");
        return ok(boat24.render());
    }
    
    public static Result caravan24(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/caravan24.html");
        return ok(caravan24.render());
    }
    
    public static Result irma(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/irma.html");
        return ok(irma.render());
    }
    
    public static Result kilimosalama(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/kilimosalama.html");
        return ok(kilimosalama.render());
    }
    
    public static Result localina(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/localina.html");
        return ok(localina.render());
    }
    
    public static Result premfire(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/premfire.html");
        return ok(premfire.render());
    }
    
    public static Result skimondo(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/skimondo.html");
        return ok(skimondo.render());
    }
    
    public static Result surfkitchen(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/surfkitchen.html");
        return ok(surfkitchen.render());
    }
    
    public static Result zeerio(String lang) {
    	if(needLanguageRedirect(lang)) return redirect("/"+ lang().code() + "/zeerio.html");
        return ok(zeerio.render());
    }
}
