package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Estudiante;
import java.util.List;

public interface EstudianteService {

    List<Estudiante> getEstudiantes(boolean trabajaActualmenteEncargado, boolean trabajaActualmenteEncargado2);

    Estudiante getEstudiante(Estudiante estudiante);

    void save(Estudiante estudiante);

    void delete(Estudiante estudiante);

    void buscarPorEstudiante(String noDeCarnet);
}
