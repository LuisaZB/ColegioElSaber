package com.proyectoElSaber.service.impl;

import com.proyectoElSaber.dao.ContactoDao;
import com.proyectoElSaber.domain.Contacto;
import com.proyectoElSaber.service.ContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoDao contactoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getMensajes() {
        var lista = contactoDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Contacto getContacto(Contacto contacto) {
        return contactoDao.findById(contacto.getIdMensaje()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }

    @Override
    @Transactional
    public void delete(Contacto contacto) {
        contactoDao.delete(contacto);
    }

    @Override
    @Transactional
    public void eliminarPorIdMensaje(Long idMensaje) {
        contactoDao.eliminarPorIdMensaje(idMensaje);
    }

}
