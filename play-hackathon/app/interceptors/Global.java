package interceptors;

import java.lang.reflect.Method;

import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.mvc.Action;
import play.mvc.Http;

public class Global extends GlobalSettings {

	@Override
	public void onStart(Application app) {
		Logger.info("Application has started");
	}

	@Override
	public void onStop(Application app) {
		Logger.info("Application shutdown...");
	}

	@Override
	public Action onRequest(Http.Request request, Method actionMethod) {
		Logger.info("before each request..." + request.toString());
		return super.onRequest(request, actionMethod);
	}
}