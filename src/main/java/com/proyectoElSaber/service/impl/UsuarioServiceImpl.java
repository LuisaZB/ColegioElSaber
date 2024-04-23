package com.proyectoElSaber.service.impl;

import com.proyectoElSaber.dao.UsuarioDao;
import com.proyectoElSaber.domain.Usuario;
import com.proyectoElSaber.service.UsuarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;


    @Override
    @Transactional(readOnly = true)
    public List<Usuario> getUsuarios() {
        return usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findByNoDeCarnet(usuario.getNoDeCarnet());
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Usuario getUsuarioPorUsername(String username) {
//        return usuarioDao.findByUsername(username);
//    }

    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuarioPorUsernameYPassword(String username, String password) {
        return usuarioDao.findByUsernameAndPassword(username, password);
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Usuario getUsuarioPorUsernameOCorreo(String username, String correo) {
//        return usuarioDao.findByUsernameOrCorreo(username, correo);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo) {
//        return usuarioDao.existsByUsernameOrCorreo(username, correo);
//    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
        
    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    public Usuario getUsuarioPorUsernameONoDeCarnet(String username, String noDeCarnet) {
        return usuarioDao.findByUsername(username);
    }

    @Override
    public Usuario getUsuarioPorUsernameOCorreoONoDeCarnet(String username, String correo, String noDeCarnet) {
        return usuarioDao.findByUsernameOrCorreoOrNoDeCarnet(username, correo, noDeCarnet);
    }

    @Override
    public boolean existeUsuarioPorUsernameOCorreoONoDeCarnet(String username, String correo, String noDeCarnet) {
        return usuarioDao.existsByUsernameOrCorreoOrNoDeCarnet(username, correo,noDeCarnet);
    }

    @Override
    @Transactional
    public void eliminarPorNoDeCarnet(String noDeCarnet) {
        usuarioDao.eliminarPorNoDeCarnet(noDeCarnet);
    }
}

