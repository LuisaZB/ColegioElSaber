package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Contacto;
import com.proyectoElSaber.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @RequestMapping("/contacto")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/contacto/contacto";
    }

    @RequestMapping("/mensajes")
    public String mensajes(Model model) {
        var contactos = contactoService.getMensajes();
        model.addAttribute("contactos", contactos);
        return "/registro/mensajes";
    }

    @PostMapping("/contacto")
    public String guardarContacto(@ModelAttribute Contacto contacto, Model model) {
        model.addAttribute("mensajeConfirmacion", "Su formulario ha sido enviado correctamente. Nos pondremos en contacto con usted lo antes posible.");
        contactoService.save(contacto);
        return "/contacto/contacto";
    }

    @GetMapping("/mensajes/eliminar/{idMensaje}")
    public String contactoEliminar(Contacto contacto) {
        contactoService.delete(contacto);
        return "redirect:/mensajes";
    }
}
