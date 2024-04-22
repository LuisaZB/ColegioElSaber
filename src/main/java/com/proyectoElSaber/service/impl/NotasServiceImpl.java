package com.proyectoElSaber.service.impl;

import com.proyectoElSaber.dao.NotasDao;
import com.proyectoElSaber.domain.Notas;
import com.proyectoElSaber.service.NotasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotasServiceImpl implements NotasService {

    @Autowired
    private NotasDao notasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Notas> getNotass(boolean activos) {
        var lista = notasDao.findAll();
//        if (activos) {
//            lista.removeIf(e -> !e.getNoDeCarnet());
//        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Notas getNotas(Notas notas) {
        return notasDao.findById(notas.getCodigo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Notas notas) {
        notasDao.save(notas);
    }

    @Override
    @Transactional
    public void delete(Notas notas) {
        notasDao.delete(notas);
    }

    // Lista de notass con precio entre ordendados por descripción ConsultaAmpliada
    @Override
    @Transactional(readOnly = true)
    public List<Notas> metodoNativo(String noDeCarnet) {
        return notasDao.metodoNativo(noDeCarnet);
    }

    @Override
    public List<Notas> findByNoDeCarnet(String noDeCarnet) {
        return notasDao.findByNoDeCarnet(noDeCarnet);
    }

}
