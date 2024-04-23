
package com.proyectoElSaber.service.impl;


import com.proyectoElSaber.dao.DatosDao;
import com.proyectoElSaber.domain.Datos;
import com.proyectoElSaber.service.DatosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatosServiceImpl implements DatosService{
    
    @Autowired
    private DatosDao datosDao;


    @Override
    @Transactional(readOnly = true)
    public List<Datos> getDatoss(boolean activos) {
        var lista = datosDao.findAll();
//        if (activos) {
//            lista.removeIf(e -> !e.getNoDeCarnet());
//        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Datos getDatos(Datos datos) {
        return datosDao.findById(datos.getSeccion()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Datos datos) {
        datosDao.save(datos);
    }

    @Override
    @Transactional
    public void delete(Datos datos) {
        datosDao.delete(datos);
    }



    @Override
    public List<Datos> findDatosBySeccion(Long seccion) {
        return datosDao.findDatosBySeccion(seccion);
    }
    
}
