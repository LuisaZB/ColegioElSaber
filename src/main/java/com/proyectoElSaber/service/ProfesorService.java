
package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Profesor;
import java.util.List;


public interface ProfesorService {
    public List<Profesor> getProfesor();
    
    public Profesor getProfesor(Profesor profesor);
 
    public void save(Profesor profesor);
    
    public void delete(Profesor profesor);
    
    public List<Profesor> buscarPorProfesor(String descripcion);
}
