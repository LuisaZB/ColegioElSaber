
package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Estudiante;
import java.util.List;


public interface EstudianteService {
    public List<Estudiante> getEstudiantes();
    
   // public Estudiante getEstudiantes(Estudiante estudiante);
 
    public void save(Estudiante estudiante);
    
    public void delete(Estudiante estudiante);
    
    public List<Estudiante> buscarPorEstudiante(Long idDeEstudiante);
}
