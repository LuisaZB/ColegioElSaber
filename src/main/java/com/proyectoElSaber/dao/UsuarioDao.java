package com.proyectoElSaber.dao;

import com.proyectoElSaber.domain.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {    
    Usuario findByUsername(String username);
    Usuario findByNoDeCarnet(String noDeCarnet);
    
    Usuario findByUsernameAndPassword(String username, String Password);

    Usuario findByUsernameOrCorreoOrNoDeCarnet(String username, String correo, String noDeCarnet);

    boolean existsByUsernameOrCorreoOrNoDeCarnet(String username, String correo, String noDeCarnet);
    
    @Query(nativeQuery = true,
            value = "DELETE * FROM usuario where usuario.no_de_carnet = noDeCarnet ")
    public void eliminarPorNoDeCarnet(@Param("noDeCarnet") String noDeCarnet);
}
