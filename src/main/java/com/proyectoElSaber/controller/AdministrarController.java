package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Estudiante;
import com.proyectoElSaber.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdministrarController {

    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping("/administrar")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/registro/administrar";
    }
    
    
    
}
