package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Estudiante;
import com.proyectoElSaber.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Personal
 */
@Controller
public class RegistroEstudiantesController {

    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping("/registroEstudiantes")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/registro/registroEstudiantes";
    }

    @PostMapping("/registroEstudiantes")
    public String guardarContacto(@ModelAttribute Estudiante estudiante, Model model) {
        model.addAttribute("mensajeConfirmacion", "Se han guardado correctamente.");
        estudianteService.save(estudiante);
        return "/registro/registroEstudiantes";

    }
}
