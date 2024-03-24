package com.proyectoElSaber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Personal
 */
@Controller
public class RegistroAdministradoresController {
    
    @RequestMapping("/registroAdministradores")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "registroAdministradores";
    }
    
}