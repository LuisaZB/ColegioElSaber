
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorDao extends JpaRepository<Administrador, Long> {
    Administrador findByNoDeCarnet(String noDeCarnet);
}
