/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Administrador;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorDao extends JpaRepository<Administrador, Long> {
    List<Administrador> findByNoDeCarnet(String noDeCarnet);
}
