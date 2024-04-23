
package com.proyectoElSaber.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import java.io.Serializable;

import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "no_de_carnet")
    private String noDeCarnet;
    private String username;
//  private String subirFoto;
    private String password;
    private String correo;
    private String rol;
    @Column(name = "seccion")
    private String seccion;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String noDeCarnet, String username, String password, String correo, String rol, String seccion, boolean activo) {
        this.noDeCarnet = noDeCarnet;
        this.username = username;
//      this.subirFoto = subirFoto;
        this.password = password;
        this.correo = correo;
        this.rol = rol;
        this.seccion = seccion;
        this.activo = activo;
    }

}
