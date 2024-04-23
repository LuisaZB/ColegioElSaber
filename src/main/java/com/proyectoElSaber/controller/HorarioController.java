/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.proyectoElSaber.controller;

import com.proyectoElSaber.service.DatosService;
import com.proyectoElSaber.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Personal
 */
@Controller
public class HorarioController {
    @Autowired
    private DatosService datosService;
    
    @RequestMapping("/horario")
    public String page(@RequestParam(value = "seccion") Long seccion, Model model) {
        var datos = datosService.findDatosBySeccion(seccion);
        model.addAttribute("datos", datos);
        return "estudiante/horario";
    }
    
}
