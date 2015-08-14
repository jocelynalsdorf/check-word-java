
import java.util.*;

import java.io.Console;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class CheckWord {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    
    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");
    
      String sentence = request.queryParams("sentence");
      String getChanged = getChanged(sentence);
    
      model.put("sentence", sentence); 
      model.put("getChanged", getChanged(sentence));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
  public static String getChanged(String sentence){
        String newString = " ";
        newString = sentence.replaceAll( "[aeiouAEIOU]", "-" );
        return newString;

  }
}
