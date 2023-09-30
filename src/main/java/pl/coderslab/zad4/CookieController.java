package pl.coderslab.zad4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @GetMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setCookies(@PathVariable(name = "value1") String value1,
                             @PathVariable(name = "value2") String value2, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("cookie1", value1);
        cookie1.setPath("/");
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);

        return "dodano ciasteczka cookie1 value1:" + value1 + " cookie2 value2: " + value2;
    }

    @GetMapping("getcookies")
    @ResponseBody
    public String getCookies(HttpServletRequest request) {
        Cookie cookie1 = WebUtils.getCookie(request, "cookie1");
        Cookie cookie2 = WebUtils.getCookie(request, "cookie2");

        return "<pre>" +
                "name: " + cookie1.getName() + "value: " + cookie1.getValue() +
                "name: " + cookie2.getName() + "value: " + cookie2.getValue() + "</pre>";
    }
}
