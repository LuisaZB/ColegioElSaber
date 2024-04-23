
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Datos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DatosDao extends JpaRepository<Datos,Long>  {
    public List<Datos> findDatosBySeccion(Long seccion);
}
