
package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Administrador;
import java.util.List;


public interface AdministradorService {
    public List<Administrador> getAdministrador();
    
    public Administrador getAdministrador(Administrador administrador);
 
    public void save(Administrador administrador);
    
    public void delete(Administrador administrador);
    
    public List<Administrador> buscarPorAdministrador(String descripcion);
}
