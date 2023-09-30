package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/first")
public class FormController {


    @GetMapping("/form")
    public String hello() {
        return "/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String showParams(@RequestParam(name = "paramName") String paramName,
                             @RequestParam(name = "paramDate") String paramDate) {
        LocalDate date = LocalDate.parse(paramDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return "paramName: " + paramName + " paramDate: " + date;
    }
}
