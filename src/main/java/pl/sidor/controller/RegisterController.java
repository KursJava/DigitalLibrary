package pl.sidor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.sidor.model.Adres;
import pl.sidor.model.Login;
import pl.sidor.model.User;

@Controller
public class RegisterController {

    @RequestMapping(value = "registerPanel", method = RequestMethod.POST)
    public String registerPanel(Model model, @ModelAttribute("User") User user, @ModelAttribute("Adres") Adres adres, @ModelAttribute("Login") Login login) {

        model.addAttribute("name", user.getName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("adres", adres.getLocality());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("login", login.getLogin());
        model.addAttribute("password", login.getPassword());

        return "registerPanel";
    }

}
