
package com.proyectoElSaber.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author johnn
 */
@Data
@Entity
@Table(name = "administrador")
public class Administrador implements Serializable{
private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_de_carnet")
    private String noDeCarnet; 
    private String subirFoto;  
    private String nombreCompleto;  
    private String noDeIdentificacion;  
    private String fechaDeNacimeinto;  
    private String paisDeOrigen;  
    private String correoInstitucional;  
    private String area;  
    private String correoPersonal;
    private String tituloAcademico;
    private String direccion;
    private String canton;  
    private String provincia;  
    private String telefonoHabitacion;  
    private String telefonoAdicional;  

    public Administrador() {
    }

    public Administrador(String noDeCarnet, String subirFoto, String nombreCompleto, String noDeIdentificacion, String fechaDeNacimeinto, String paisDeOrigen, String correoInstitucional, String area, String correoPersonal, String tituloAcademico, String direccion, String canton, String provincia, String telefonoHabitacion, String telefonoAdicional) {
        this.noDeCarnet = noDeCarnet;
        this.subirFoto = subirFoto;
        this.nombreCompleto = nombreCompleto;
        this.noDeIdentificacion = noDeIdentificacion;
        this.fechaDeNacimeinto = fechaDeNacimeinto;
        this.paisDeOrigen = paisDeOrigen;
        this.correoInstitucional = correoInstitucional;
        this.area = area;
        this.correoPersonal = correoPersonal;
        this.tituloAcademico = tituloAcademico;
        this.direccion = direccion;
        this.canton = canton;
        this.provincia = provincia;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoAdicional = telefonoAdicional;
    }
      
    
}
