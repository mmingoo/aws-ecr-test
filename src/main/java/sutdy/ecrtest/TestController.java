package sutdy.ecrtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String testController(){
        return "Hello!!";
    }
    @GetMapping("/hi")
    public String testController2(){
        return "hiHello!!";
    }

}
