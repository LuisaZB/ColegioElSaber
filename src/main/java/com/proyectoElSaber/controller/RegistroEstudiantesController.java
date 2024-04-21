package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Estudiante;
import com.proyectoElSaber.service.EstudianteService;
import com.proyectoElSaber.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroEstudiantesController {

    @Autowired
    EstudianteService estudianteService;

    @RequestMapping("/registroEstudiantes")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/registro/registroEstudiantes";
    }

    @PostMapping("/registroEstudiantes")
    public String guardarContacto(@ModelAttribute Estudiante estudiante, Model model) {
        model.addAttribute("mensajeConfirmacion", "Su registro a sido guardado correctamente.");
        estudianteService.save(estudiante);
        return "/registro/registroEstudiantes";
    }
}
