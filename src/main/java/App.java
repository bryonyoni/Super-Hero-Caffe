import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/",(request,response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template","templates/index.vtl");
      return new ModelAndView(model,layout);
    },new VelocityTemplateEngine());

    post("/tasks",(request,response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      Hero newHero = new Hero(name);
      request.session().attribute("name",newHero);
      model.put("template","templates/success.vtl");
      return new ModelAndView(model,layout);
    },new VelocityTemplateEngine());
  }
}
