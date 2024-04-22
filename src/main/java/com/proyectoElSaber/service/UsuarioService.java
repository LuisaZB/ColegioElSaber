package com.proyectoElSaber.service;
import com.proyectoElSaber.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
    // Se obtiene un listado de usuarios en un List
    public List<Usuario> getUsuarios();
    
    // Se obtiene un Usuario, a partir del id de un usuario
    public Usuario getUsuario(Usuario usuario);
    
    // Se obtiene un Usuario, a partir del username de un usuario
    public Usuario getUsuarioPorUsernameONoDeCarnet(String username, String noDeCarnet);

    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameYPassword(String username, String password);
    
    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameOCorreoONoDeCarnet(String username, String correo, String noDeCarnet);
    
    // Se valida si existe un Usuario considerando el username
    public boolean existeUsuarioPorUsernameOCorreoONoDeCarnet(String username, String correo, String noDeCarnet);
    
    // Se inserta un nuevo usuario si el id del usuario esta vacío
    // Se actualiza un usuario si el id del usuario NO esta vacío
    public void save(Usuario usuario);
    
    // Se elimina el usuario que tiene el id pasado por parámetro
    public void delete(Usuario usuario);
    
}
