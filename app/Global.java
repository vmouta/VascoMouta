
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

import controllers.routes;
import play.mvc.Http.Request;
import play.mvc.Http.RequestHeader;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.mvc.*;
import play.api.mvc.EssentialFilter;
import play.api.mvc.Handler;
import play.libs.F.*;
import play.filters.gzip.GzipFilter;
import play.filters.headers.SecurityHeadersFilter;
import static play.mvc.Results.*;

public class Global extends GlobalSettings {
	
	// Enable Gzip, secure headers
	@Override
	public <T extends EssentialFilter> Class<T>[] filters() {
        return new Class[]{GzipFilter.class /*, SecurityHeadersFilter.class*/};
    }

	@Override
	public void onStart(Application app) {
		super.onStart(app);
		Logger.debug("onStart...");
    }

	@Override
    public void onStop(Application app) {
        super.onStop(app);
        Logger.debug("onStop...");
    }

	@Override
	public Action onRequest(Request arg0, Method arg1)
	{
    	Logger.debug("onRequest...");	
        return super.onRequest(arg0, arg1);
    }
    
    @Override
    public Handler onRouteRequest(RequestHeader header)
    {
    	Logger.debug("onRouteRequest..." + header.toString());
		return super.onRouteRequest(header);
    }
    
    @Override
	public Promise<Result> onError(RequestHeader request, Throwable t) {
    	Logger.error("onError..." + request.toString());
    	StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		String stackTrace = sw.toString();
    	
        return super.onError(request, t);
    }
    
    @Override
	public Promise<Result> onBadRequest(RequestHeader request, String error) {
    	Logger.warn("onBadRequest..." + request.toString());
        return Promise.<Result>pure(badRequest("Don't try to hack the URI!"));
    }
    
    @Override
	public Promise<Result> onHandlerNotFound(RequestHeader request) {
    	Logger.warn("onHandlerNotFound..." + request.toString());
        return Promise.<Result>pure(notFound(
        		request.uri()
        ));
    }   
}
