
package com.proyectoElSaber.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="profesores")
public class Profesor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_de_carnet")
    private String seccion;
    private String subirFoto;
    private String nombreCompleto;
    private String noDeIdentificacion;
    private String fechaDeNacimiento;
    private String paisDeOrigen;
    private String correoInstitucional;
    private String materiaImpartida;
    private String correoPersonal;
    private String tituloAcademico;
    private String direccion;
    private String canton;
    private String provincia;
    private String telefonoHabitacion;
    private String telefonoAdicional;
    
    @OneToOne
    @JoinColumn(name = "no_de_carnet")
    Usuario usuario;

    public Profesor() {
    }

    public Profesor(String seccion, String subirFoto, String nombreCompleto, String noDeIdentificacion, String fechaDeNacimiento, String paisDeOrigen, String correoInstitucional, String materiaImpartida, String correoPersonal, String tituloAcademico, String direccion, String canton, String provincia, String telefonoHabitacion, String telefonoAdicional) {
        this.seccion = seccion;
        this.subirFoto = subirFoto;
        this.nombreCompleto = nombreCompleto;
        this.noDeIdentificacion = noDeIdentificacion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.paisDeOrigen = paisDeOrigen;
        this.correoInstitucional = correoInstitucional;
        this.materiaImpartida = materiaImpartida;
        this.correoPersonal = correoPersonal;
        this.tituloAcademico = tituloAcademico;
        this.direccion = direccion;
        this.canton = canton;
        this.provincia = provincia;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoAdicional = telefonoAdicional;
        
    }
    
    
}
