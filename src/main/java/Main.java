import java.lang.reflect.Method;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        //e.g. /getters/org.bukkit.event.entity.CreatureSpawnEvent
        get("/getters/:s", (request, response) -> {
            String jClass = request.params("s"); //grab string from request
            Class c = null;
            try {
                c = Class.forName(jClass); //interpret class from string
            } catch (Exception e) {
                e.getMessage();
            }
            if (c != null) {
                Method[] methods = c.getMethods(); //list methods
                String resp = "";
                for (final Method m : methods) {
                    if (!m.getReturnType().equals(Void.TYPE) //choose methods that have non-void return type, and no params
                            && m.getParameterCount() == 0) {
                        resp += m.getName() + "<br>";
                    }
                }
                return resp;
            }
            return "error";
        });
    }
}
