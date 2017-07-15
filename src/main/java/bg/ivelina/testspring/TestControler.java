package bg.ivelina.testspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IDD on 7/15/2017.
 */
@RestController
public class TestControler {

    @RequestMapping("/test/{name}")
    public String getTest(@PathVariable String name){
        return "Hello " + name;
    }

    @RequestMapping("/home")
    public Home getHome(){

        return new Home(1, "HomePage");
    }
}
