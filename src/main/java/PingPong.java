import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");
      String userStringNumber = request.queryParams("userNumber");
      Integer userNumber = Integer.parseInt(userStringNumber);
      ArrayList<Object> results = new ArrayList<Object>();
      results = PingPong.countPingPong(userNumber);

      model.put("results", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static ArrayList countPingPong(Integer number) {
    ArrayList<Object> numbersArray = new ArrayList<Object>();

    for(Integer i = 1; i <= number; i ++) {
      if(i % 15 == 0) {
        numbersArray.add("ping-pong");
      } else if (i % 5 == 0) {
        numbersArray.add("pong");
      } else if (i % 3 == 0) {
        numbersArray.add("ping");
      } else {
        numbersArray.add(i);
      }
    }
    return numbersArray;
  }

}
