package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    String hello() {
        return "hello";
    }


    @RequestMapping("/hello2")
    String hello2(Model model) {
        int hour = LocalTime.now().getHour();
        if (hour > 20 || hour < 8) {
            model.addAttribute("fontColor", "green");
            model.addAttribute("backgroundColor", "red");
        } else {
            model.addAttribute("fontColor", "red");
            model.addAttribute("backgroundColor", "green");
        }
        return "hello";
    }


}
