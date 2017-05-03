import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.List;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/",(request,response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template","templates/index.vtl");
      return new ModelAndView(model,layout);
    },new VelocityTemplateEngine());

    get("leagues/:id/hero/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      League league = League.find(Integer.parseInt(request.params(":id")));
      model.put("league",league);
      model.put("template", "templates/league-Hero-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/heroes", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("heroes", Hero.all());
      model.put("template", "templates/heroes.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/hero",(request,response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      League league = League.find(Integer.parseInt(request.queryParams("leagueId")));
      String name = request.queryParams("name");
      Hero newHero = new Hero(name);
      league.addHero(newHero);
      // request.session().attribute("name",newHero);
      model.put("league",league);
      model.put("template","templates/league-heroes-success.vtl");
      return new ModelAndView(model,layout);
    },new VelocityTemplateEngine());

    get("/hero/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Hero hero = Hero.find(Integer.parseInt(request.params(":id")));
      model.put("hero", hero);
      model.put("template", "templates/hero.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/leagues/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/league-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/leagues", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      League newLeague = new League(name);
      model.put("template", "templates/league-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/leagues", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("leagues", League.all());
      model.put("template", "templates/leagues.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/leagues/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      League league = League.find(Integer.parseInt(request.params(":id")));
      List heroes = league.getHeroes();
      model.put("league", league);
      model.put("heroes",heroes);
      model.put("template", "templates/league.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
