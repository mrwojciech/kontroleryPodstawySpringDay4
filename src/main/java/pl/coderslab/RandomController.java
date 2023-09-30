package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @ResponseBody
    @GetMapping("/show-random1")
    public String showRandom1() {
        Random random = new Random();
        return String.valueOf(random.nextInt(100) + 1);
    }


    // without view resolver
    @GetMapping("/show-random2")
    public String showRandom2(Model model) {
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        model.addAttribute("randomInt",randomInt);
        return "/WEB-INF/views/show-random.jsp";
    }

    //with vies resolver
    @GetMapping("/show-random3")
    public String showRandom3(Model model) {
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        model.addAttribute("randomInt", randomInt);
        return "show-random";
    }
}
