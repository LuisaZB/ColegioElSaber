
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Contacto;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ContactoDao extends JpaRepository<Contacto,Long> {

    @Query(nativeQuery = true,
            value = "DELETE * FROM contacto where contacto.mensaje_id = mensajeId ")
    public void eliminarPorIdMensaje(@Param("mensajeId") Long mensajeId);
}
