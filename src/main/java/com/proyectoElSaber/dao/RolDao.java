/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoElSaber.dao;


import com.proyectoElSaber.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author johnn
 */
public interface RolDao extends JpaRepository<Rol, Long>{
    
}
