package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Datos;
import java.util.List;

public interface DatosService {
    
    public List<Datos> getDatoss(boolean activos);


    public Datos getDatos(Datos datos);


    public void save(Datos datos);


    public void delete(Datos datos);

   
    public List<Datos> findDatosBySeccion(Long seccion);
    
}
