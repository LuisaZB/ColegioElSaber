
package com.proyectoElSaber.dao;


import com.proyectoElSaber.domain.Estudiante;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EstudianteDao extends JpaRepository<Estudiante, String> {
    
    List<Estudiante> findByNoDeCarnet(String noDeCarnet);
    
    @Query(nativeQuery = true,
            value = "SELECT * FROM estudiantes where estudiante.no_de_carnet = noDeCarnet ")
    public void buscarPorNoDeCarnet(@Param("noDeCarnet") String noDeCarnet);
}
