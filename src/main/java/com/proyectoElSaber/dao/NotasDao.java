package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Notas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NotasDao extends JpaRepository<Notas, Long> {

    public List<Notas> findByNoDeCarnet(String noDeCarnet);

    @Query(nativeQuery = true,
            value = "SELECT * FROM notas WHERE calificaciones.no_de_carnet = :noDeCarnet")
    public List<Notas> metodoNativo(@Param("noDeCarnet") String noDeCarnet);

}
