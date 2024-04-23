package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Profesor;
import com.proyectoElSaber.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RegistroProfesoresController {

    @Autowired
    ProfesorService profesorService;
    
    @RequestMapping("/registroProfesores")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/registro/registroProfesores";
    }
    
    @PostMapping("/registroProfesores")
    public String guardarProfesor(@ModelAttribute Profesor profesor, Model model) {
        model.addAttribute("mensajeConfirmacion", "Su registro a sido guardado correctamente.");
        profesorService.save(profesor);
        return "/registro/registroProfesores";
    }

}
