package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Administrador;
import com.proyectoElSaber.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RegistroAdministradoresController {
    
    @Autowired
    AdministradorService administradorService;
    
    @RequestMapping("/registroAdministradores")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/registro/registroAdministradores";
    }
    
    @PostMapping("/registroAdministradores")
    public String guardarContacto(@ModelAttribute Administrador administrador, Model model) {
        model.addAttribute("mensajeConfirmacion", "Su registro a sido guardado correctamente.");
        administradorService.save(administrador);
        return "/registro/registroAdministradores";
    }
    
}