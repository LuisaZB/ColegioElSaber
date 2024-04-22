/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Notas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.proyectoElSaber.service.NotasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Personal
 */
@Controller
public class NotasController {
    
    @Autowired
    private NotasService notasService;
    
    @RequestMapping("/notas")
    
        public String consultaPorCarnet(@RequestParam(value = "noDeCarnet") String noDeCarnet, Model model) {
        List<Notas> notas = notasService.metodoNativo(noDeCarnet);
        model.addAttribute("notas", notas);
        return "/notas";
    }
//    @PostMapping("/consultaPorCarnet")
//    public String consultaPorCarnet(@RequestParam(value = "noDeCarnet") String noDeCarnet, Model model) {
//        List<Notas> notas = notasService.metodoNativo(noDeCarnet);
//        model.addAttribute("notas", notas);
//        return "/ruta/a/tu/vista"; // Cambia "/ruta/a/tu/vista" por la ruta de tu vista
//    }
}
