/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Administrador;
import java.util.List;

/**
 *
 * @author johnn
 */
public interface AdministradorService {
    public List<Administrador> getAdministrador();
    
    public Administrador getAdministrador(Administrador administrador);
 
    public void save(Administrador administrador);
    
    public void delete(Administrador administrador);
    
    public List<Administrador> buscarPorAdministrador(String descripcion);
}
