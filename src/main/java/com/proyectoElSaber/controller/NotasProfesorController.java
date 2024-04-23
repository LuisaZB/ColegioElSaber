/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Notas;
import com.proyectoElSaber.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyectoElSaber.service.NotasService;
import com.proyectoElSaber.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Personal
 */
@Controller
public class NotasProfesorController {

    @Autowired
    private NotasService notasService;


    @RequestMapping("/notasProfesor")
    public String page(@RequestParam(value = "username") String username, Model model) {
        var notas = notasService.findByProfesor(username);
        model.addAttribute("notas", notas);
        return "/profesor/notasProfesor";
    }

    @GetMapping("/nota/eliminar/{codigo}")
    public String notaEliminar(Notas notas) {
        notasService.delete(notas);

        return "/profesor/notasProfesor";
    }
    @PostMapping("nota/guardar")
    public String notaGuardar(Notas notas) {
        notasService.save(notas);
        return "/profesor/notasProfesor";
    }
    @GetMapping("nota/modificar/{codigo}")
    public String notaModificar(Notas notas, Model model) {
        notas = notasService.getNotas(notas);
        model.addAttribute("notas", notas);
        return "/profesor/notasProfesorModificar";
    }

//    @PostMapping("/consultaPorCarnet")
//    public String consultaPorCarnet(Usuario usuario, Model model) {
//
//        List<Notas> notas = notasService.metodoNativo(session.setAttribute("usuario.noDeCarnet", usuario.getNoDeCarnet()));
//        model.addAttribute("notas", notas);
//        return "/estudiante/queryNotas";
//    }
}
