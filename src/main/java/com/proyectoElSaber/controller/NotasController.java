/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.proyectoElSaber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyectoElSaber.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Personal
 */
@Controller
public class NotasController {

    @Autowired
    private NotasService notasService;


    @RequestMapping("/notas")
    public String page(@RequestParam(value = "noDeCarnet") String noDeCarnet, Model model) {
        var notas = notasService.findByNoDeCarnet(noDeCarnet);
        model.addAttribute("notas", notas);
        return "/estudiante/queryNotas";
    }

//    @PostMapping("/consultaPorCarnet")
//    public String consultaPorCarnet(Usuario usuario, Model model) {
//
//        List<Notas> notas = notasService.metodoNativo(session.setAttribute("usuario.noDeCarnet", usuario.getNoDeCarnet()));
//        model.addAttribute("notas", notas);
//        return "/estudiante/queryNotas";
//    }
}
