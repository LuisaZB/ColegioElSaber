
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorDao extends JpaRepository<Profesor, Long> {
    Profesor findByNoDeCarnet(String noDeCarnet);
}