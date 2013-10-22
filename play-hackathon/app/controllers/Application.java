package controllers;

import java.util.HashMap;
import java.util.Map;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Result index() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("test key", "test value");
		return ok(play.libs.Json.toJson(map)/* index.render("Hackathon!") */);
	}

}