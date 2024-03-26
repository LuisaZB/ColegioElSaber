
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactoDao extends JpaRepository<Contacto,Long> {
    
}
