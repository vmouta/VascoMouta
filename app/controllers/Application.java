package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends AppController {

    public static Result index() {
        return ok(index.render("Vasco Mouta"));
    }
    
    public static Result protfolio() {
        return ok(portfolio.render());
    }
    
    public static Result resume() {
        return ok(resume.render());
    }
    
    public static Result blog() {
        return ok(contact.render());
    }
    
    public static Result contact() {
        return ok(contact.render());
    }
    
	/* Expoused routes to javascript */
	public static Result jsRoutes() {
		return ok(Routes.javascriptRouter("jsRoutes")).as("text/javascript");
	}

}
