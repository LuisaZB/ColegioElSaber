
package com.proyectoElSaber.dao;


import com.proyectoElSaber.domain.Estudiante;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteDao extends JpaRepository<Estudiante, Long> {
    List<Estudiante> findByIdEstudiante(int idEstudiante);
}
