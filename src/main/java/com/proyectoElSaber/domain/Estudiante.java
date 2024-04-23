package com.proyectoElSaber.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante implements Serializable{
private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long idEstudiante;
    @Column(name = "no_de_carnet")
    private String noDeCarnet;
    private String seccion;    
    private String nombreCompleto;  
    private String noDeIdentificacion;  
    private String fechaDeNacimiento;  
    private String paisDeOrigen;  
    private String correoInstitucional;  
    private String direccion;  
    private String canton;  
    private String provincia;  
    private String telefonoHabitacion;  
    private String telefonoAdicional;
    
    private String nombreCompletoEncargado;  
    private String noDeIdentificacionEncargado;  
    private String telefonoMovilEncargado;  
    private String correoElectronicoEncargado;  
    private String trabajaActualmenteEncargado;  
    private String lugarDeTrabajoEncargado;  
    private String telefonoTrabajoEncargado;
    
    

    public Estudiante() {
    }

    public Estudiante(String noDeCarnet, String seccion, String nombreCompleto, String noDeIdentificacion, String fechaDeNacimiento, String paisDeOrigen, String correoInstitucional, String direccion, String canton, String provincia, String telefonoHabitacion, String telefonoAdicional, String nombreCompletoEncargado, String noDeIdentificacionEncargado, String telefonoMovilEncargado, String correoElectronicoEncargado, String trabajaActualmenteEncargado, String lugarDeTrabajoEncargado, String telefonoTrabajoEncargado) {
        this.noDeCarnet = noDeCarnet;
        this.seccion = seccion;
        this.nombreCompleto = nombreCompleto;
        this.noDeIdentificacion = noDeIdentificacion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.paisDeOrigen = paisDeOrigen;
        this.correoInstitucional = correoInstitucional;
        this.direccion = direccion;
        this.canton = canton;
        this.provincia = provincia;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoAdicional = telefonoAdicional;

        this.nombreCompletoEncargado = nombreCompletoEncargado;
        this.noDeIdentificacionEncargado = noDeIdentificacionEncargado;
        this.telefonoMovilEncargado = telefonoMovilEncargado;
        this.correoElectronicoEncargado = correoElectronicoEncargado;
        this.trabajaActualmenteEncargado = trabajaActualmenteEncargado;
        this.lugarDeTrabajoEncargado = lugarDeTrabajoEncargado;
        this.telefonoTrabajoEncargado = telefonoTrabajoEncargado;
        
        
    }


    
}
