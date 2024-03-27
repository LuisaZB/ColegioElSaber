/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Estudiante;
import java.util.List;

/**
 *
 * @author johnn
 */
public interface EstudianteService {
    public List<Estudiante> getEstudiantes();
    
    public Estudiante getEstudiantes(Estudiante estudiante);
 
    public void save(Estudiante estudiante);
    
    public void delete(Estudiante estudiante);
    
    public List<Estudiante> buscarPorEstudiante(String descripcion);
}
