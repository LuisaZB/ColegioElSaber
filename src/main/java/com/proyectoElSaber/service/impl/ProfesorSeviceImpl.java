
package com.proyectoElSaber.service.impl;

import com.proyectoElSaber.dao.ProfesorDao;
import com.proyectoElSaber.domain.Profesor;
import com.proyectoElSaber.service.ProfesorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProfesorSeviceImpl implements ProfesorService {

    @Autowired
    private ProfesorDao profesorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Profesor> getProfesor() {
        var lista = profesorDao.findAll();
        return lista;
    }

    @Transactional(readOnly = true)
    public Profesor getProfesor(Profesor profesor) {
        return profesorDao.findByNoDeCarnet(profesor.getNoDeCarnet());
    }

    @Override
    public void save(Profesor profesor) {
        profesorDao.save(profesor);
    }

    @Override
    public void delete(Profesor profesor) {
        profesorDao.delete(profesor);
    }

    @Override
    public List<Profesor> buscarPorProfesor(String noDeCarnet) {
        return (List<Profesor>) profesorDao.findByNoDeCarnet(noDeCarnet);
    }
    
    
}

