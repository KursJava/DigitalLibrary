package pl.sidor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.sidor.model.Login;

@Controller
public class LoginController {


    @RequestMapping(value = "log", method = RequestMethod.POST)
    public String log(Model model, @ModelAttribute("Login") Login login) {


        if (login != null && login.getLogin().equals("admin") && login.getPassword().equals("admin")) {
            return "adminPanel";
        } else {
            model.addAttribute("userName", login.getLogin());
            model.addAttribute("userPassword", login.getPassword());
            return "userPanel";
        }

    }

}
