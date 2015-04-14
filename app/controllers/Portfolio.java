package controllers;

import play.*;
import play.mvc.*;
import views.html.portfolios.*;

public class Portfolio extends AppController {
	
	public static Result alianca() {
        return ok(alianca.render());
    }
	
	public static Result beetagg() {
        return ok(beetagg.render());
    }
	
    public static Result boat24() {
        return ok(boat24.render());
    }
    
    public static Result caravan24() {
        return ok(caravan24.render());
    }
    
    public static Result irma() {
        return ok(irma.render());
    }
    
    public static Result kilimosalama() {
        return ok(kilimosalama.render());
    }
    
    public static Result localina() {
        return ok(localina.render());
    }
    
    public static Result premfire() {
        return ok(premfire.render());
    }
    
    public static Result skimondo() {
        return ok(skimondo.render());
    }
    
    public static Result surfkitchen() {
        return ok(surfkitchen.render());
    }
    
    public static Result zeerio() {
        return ok(zeerio.render());
    }
}
