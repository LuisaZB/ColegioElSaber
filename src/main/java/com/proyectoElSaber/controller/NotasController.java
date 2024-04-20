/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.proyectoElSaber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Personal
 */
@Controller
public class NotasController {
    
    @RequestMapping("/notas")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "estudiante/notas";
    }
//    @PostMapping("/notas")
//    public String consultaQuery1(@RequestParam(value = "precioInf") double precioInf,
//            @RequestParam(value = "precioSup") double precioSup, Model model) {
//        var productos = productoService.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
//        model.addAttribute("productos", productos);
//        model.addAttribute("precioInf", precioInf);
//        model.addAttribute("precioSup", precioSup);
//        model.addAttribute("totalProductos", productos.size());
//        return "/pruebas/listado2";
//    }
}
