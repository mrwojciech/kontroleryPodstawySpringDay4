package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class PathController {


    @ResponseBody
    @GetMapping("/path-controller/{min}/{max}")
    String pathController(@PathVariable(name = "max") Integer max,
                          @PathVariable(name = "min") Integer min) {
        int random = new Random().nextInt(max - min+ 1) + min ;
        return "Towja liczba z zakresu od:" + min + " do: " + max + " to: " + random;
    }
}
