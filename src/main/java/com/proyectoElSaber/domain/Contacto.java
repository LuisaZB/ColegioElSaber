
package com.proyectoElSaber.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="contacto")
public class Contacto implements Serializable{
private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensaje")
    private Long idMensaje;
    private String mensaje;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Contacto() {
    }

    public Contacto(String mensaje, String nombre, String apellido, String correo, String telefono) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    
}

