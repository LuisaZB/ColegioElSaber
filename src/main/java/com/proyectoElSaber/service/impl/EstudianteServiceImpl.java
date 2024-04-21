
package com.proyectoElSaber.service.impl;

import com.proyectoElSaber.dao.EstudianteDao;
import com.proyectoElSaber.domain.Estudiante;
import com.proyectoElSaber.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteDao estudianteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> getEstudiantes() {
        var lista = estudianteDao.findAll();
        
        return lista;
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Estudiante getEstudiantes(Estudiante estudiante) {
//        return estudianteDao.findByIdEstudiante(estudiante.getIdEstudiante()).orElse(null);
//    }

    @Override
    public void save(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }

    @Override
    public void delete(Estudiante estudiante) {
        estudianteDao.delete(estudiante);
    }

    @Override
    public List<Estudiante> buscarPorEstudiante(Long idDeEstudiante) {
        return estudianteDao.findByIdEstudiante(idDeEstudiante);
    }
    
    
}
