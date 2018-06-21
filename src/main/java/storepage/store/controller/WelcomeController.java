package storepage.store.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello Worldaaaaaaaaaaaaaaaaaaa";

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }
    @RequestMapping("/home")
    public String home(Map<String, Object> model) {
        model.put("message", "hola pipo");
        model.put("data2", "hola pipo22222222222");
        return "home";
    }
}
