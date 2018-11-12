package pl.sidor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = GET)
    public String home(Model model) {
        model.addAttribute("name", "Karol");
        return "home";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register() {
        return "register";
    }
}
