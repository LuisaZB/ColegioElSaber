
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Datos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DatosDao extends JpaRepository<Datos,Long>  {
    
}
