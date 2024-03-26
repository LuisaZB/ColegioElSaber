
package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Contacto;
import com.proyectoElSaber.service.ContactoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        return "contacto";
    }
    
    @PostMapping("/contacto")
    public String guardarContacto(@ModelAttribute Contacto contacto, Model model) {
        model.addAttribute("mensajeConfirmacion", "Su formulario ha sido enviado correctamente. Nos pondremos en contacto con usted lo antes posible.");
        contactoService.save(contacto);
        return "contacto";
      
    
}
}

