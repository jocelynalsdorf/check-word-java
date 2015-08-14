
import java.util.*;

import java.io.Console;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class CheckWord {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    // String layout = "templates/layout.vtl";
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    
    // get("/results", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/results.vtl");
    
    //   String something = request.queryParams("something");
    //  
    
    //   Integer getMethodName = getMethodName(something, somethingElse);
    
    //   model.put("something", something);
    //  
    //   model.put("getMethodName", getMethodName(something, somethingElse));
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());

  }
  public static String getChanged(String sentence){
        String newString = " ";
        newString = sentence.replaceAll( "[aeiouAEIOU]", "-" );
        
        return newString;

  }
}
