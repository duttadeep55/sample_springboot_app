package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hi from Kloud9!";
    }

    @RequestMapping("/version")
    public String getVersion() {
        return "1.0";
    }

}
