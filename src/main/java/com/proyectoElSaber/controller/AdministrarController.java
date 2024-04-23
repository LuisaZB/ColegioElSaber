package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Estudiante;
import com.proyectoElSaber.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdministrarController {
//
//    @Autowired
//    private EstudianteService estudianteService;
//
//    @RequestMapping("/administrar")
//    public String page(Model model) {
//        model.addAttribute("attribute", "value");
//        return "/registro/administrar";
//    }
//
//    @GetMapping("/administrar")
//    public String listadoEstudiante(Estudiante estudiante, Model model) {
//        var estudiantes = estudianteService.getEstudiante(estudiante);
//        model.addAttribute("Estudiante", estudiantes);
//        return "/registro/administrar";
//    }
//    
//    @PostMapping("/guardar/administrar")
//    public String estudianteGuardar( Estudiante estudiante) { 
//        
//        estudianteService.save(estudiante);
//        return "/registro/administrar";
//    }
//
//    @GetMapping("/eliminar/{noDeCarnet}")
//    public String estudianteEliminar(Estudiante estudiante) {
//        estudianteService.delete(estudiante);
//        return "redirect:/registro/administrar";
//    }
//    
//    @GetMapping("/modificar/{noDeCarnet}")
//    public String estudianteModificar(Estudiante estudiante, Model model) {
//        estudiante = estudianteService.getEstudiante(estudiante);
//        model.addAttribute("estudiante", estudiante);
//        return "/registro/administrara";
//    }
    
}
