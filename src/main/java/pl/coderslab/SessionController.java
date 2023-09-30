package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@SessionAttributes("loginStart")
@Controller
public class SessionController {


    @ResponseBody
    @RequestMapping("/session")
    public String showLoginStart(Model model, HttpSession session) {
        String loginStart = (String) session.getAttribute("loginStart");


        if (loginStart == null) {
            loginStart= String.valueOf(LocalDate.now());
            session.setAttribute("loginStart", loginStart);
//            model.addAttribute("loginStart", loginStart);
            return "Wartosc ustawiona na:" + loginStart;
        }

        return "loginStart=" + loginStart;
    }
}
