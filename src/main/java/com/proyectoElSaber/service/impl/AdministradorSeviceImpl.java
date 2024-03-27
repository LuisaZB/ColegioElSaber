/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoElSaber.service.impl;

import com.proyectoElSaber.dao.AdministradorDao;
import com.proyectoElSaber.domain.Administrador;
import com.proyectoElSaber.service.AdministradorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author johnn
 */
@Service
public class AdministradorSeviceImpl implements AdministradorService {

    @Autowired
    private AdministradorDao administradorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Administrador> getAdministrador() {
        var lista = administradorDao.findAll();
        return lista;
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Administrador getAdministrador(Administrador administrador) {
//        return administradorDao.findByNoDeCarnet(administrador.getNoDeCarnet()).orElse(null);
//    }

    @Override
    public void save(Administrador administrador) {
        administradorDao.save(administrador);
    }

    @Override
    public void delete(Administrador administrador) {
        administradorDao.delete(administrador);
    }

    @Override
    public List<Administrador> buscarPorAdministrador(String noDeCarnet) {
        return administradorDao.findByNoDeCarnet(noDeCarnet);
    }
    
    
}

