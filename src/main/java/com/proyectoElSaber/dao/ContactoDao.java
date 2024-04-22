
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Contacto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactoDao extends JpaRepository<Contacto,Long> {
    
}
