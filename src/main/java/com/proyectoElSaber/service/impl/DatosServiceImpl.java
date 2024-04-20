
package com.proyectoElSaber.service.impl;


import com.proyectoElSaber.dao.DatosDao;
import com.proyectoElSaber.domain.Datos;
import com.proyectoElSaber.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosServiceImpl implements DatosService{
    
    @Autowired
    private DatosDao datosDao;


    @Override
    public void save(Datos datos) {
      datosDao.save(datos);
    }
    
}
