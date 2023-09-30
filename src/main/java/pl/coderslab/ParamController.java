package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParamController {


    @GetMapping("/paramViewer")
    @ResponseBody
    String showParams(@RequestParam(name = "param1", required = false, defaultValue = "default") String param1) {
        if (param1 == null) {
            return "Nie podano parametru param1, wic ustawione na wartosc domyslna:" + param1;
        }
        return "Twoj parametr param1 to :" + param1;
    }

    @GetMapping("/paramViewerInt")
    @ResponseBody
    String showParamsInt(@RequestParam(name = "param1", required = false, defaultValue = "1") Integer param1) {
        if (param1 == null) {
            return "Nie podano parametru param1, wic ustawione na wartosc domyslna:" + param1;
        }
        return "Twoj parametr param1 to :" + param1;
    }
}
