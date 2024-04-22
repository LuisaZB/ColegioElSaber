package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Contacto;
import java.util.List;

public interface ContactoService {
    public List<Contacto> getMensajes();
    public Contacto getContacto(Contacto contacto);
    public void delete(Contacto contacto);
    public void save(Contacto contacto);
}
