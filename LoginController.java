
package com.proyectoElSaber.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Login
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "login";
}
}