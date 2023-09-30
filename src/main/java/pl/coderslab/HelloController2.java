package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class HelloController2 {


    @ResponseBody
    @GetMapping("/hello2-controller/{firstName}/{lastName}")
    String pathController(@PathVariable(name = "lastName") String lastName,
                          @PathVariable(name = "firstName") String firstName) {
        return "Witaj " + firstName + " " + lastName;
    }
}
