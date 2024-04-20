package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Datos;
import com.proyectoElSaber.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DatosController {

    @Autowired
    private DatosService datosService;

    @RequestMapping("/datos")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/registro/datos";
    }

    @PostMapping("/datos")
    public String guardarContacto(@ModelAttribute Datos datos, Model model) {
        model.addAttribute("mensajeConfirmacion", "Su formulario ha sido enviado correctamente");
        datosService.save(datos);
        return "/registro/datos";

    }
}
