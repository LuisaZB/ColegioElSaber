package com.proyectoElSaber.controller;

import com.proyectoElSaber.domain.Usuario;
import com.proyectoElSaber.service.FirebaseStorageService;
import com.proyectoElSaber.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private FirebaseStorageService firebaseStorageService;

    @RequestMapping("/usuario")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/registro/usuario";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario, Model model) {
        model.addAttribute("mensajeConfirmacion", "Su registro a sido guardado correctamente.");
        usuario.setPassword(new BCryptPasswordEncoder().encode(usuario.getPassword()));
        usuario.setActivo(true); // Para crearlo siempre activo
        usuarioService.save(usuario);
        return "/registro/usuario";
    }

}
