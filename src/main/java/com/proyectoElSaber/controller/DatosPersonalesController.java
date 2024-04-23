/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.proyectoElSaber.controller;

import com.proyectoElSaber.service.EstudianteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Personal
 */
@Controller
public class DatosPersonalesController {
    
    @Autowired
    private EstudianteService estudianteService;
    
    @RequestMapping("/datospersonales")
        public String page(@RequestParam(value = "noDeCarnet") String noDeCarnet, Model model) {
        var estudiantes = estudianteService.findByNoDeCarnet(noDeCarnet);
        model.addAttribute("estudiantes", estudiantes);
        return "estudiante/datos";
    }
    
}
