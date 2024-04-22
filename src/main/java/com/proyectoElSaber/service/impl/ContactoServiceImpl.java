package com.proyectoElSaber.service.impl;

import com.proyectoElSaber.dao.ContactoDao;
import com.proyectoElSaber.domain.Contacto;
import com.proyectoElSaber.service.ContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoDao contactoDao;

    @Override
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }

    @Override
    public List<Contacto> getMensajes() {
        var lista = contactoDao.findAll();
        return lista;
    }

    @Override
    public void delete(Contacto contacto) {
        contactoDao.delete(contacto);
    }
}
