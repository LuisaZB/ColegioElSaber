package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Estudiante;
import java.util.List;

public interface EstudianteService {

    List<Estudiante> getEstudiantes();

    Estudiante getEstudiante(Estudiante estudiante);

    void save(Estudiante estudiante);

    void delete(Estudiante estudiante);
    public List<Estudiante> findByNoDeCarnet(String noDeCarnet);

    void buscarPorEstudiante(String noDeCarnet);
    
    public void eliminarPorNoDeCarnet(String noDeCarnet);
}
