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
    private int idEstudiante;
    private String seccion;  
    private String subirFoto;  
    private String nombreCompleto;  
    private String noDeIdentificacion;  
    private String fechaDeNacimeinto;  
    private String paisDeOrigen;  
    private String correoInstitucional;  
    private String direccion;  
    private String canton;  
    private String provincia;  
    private String telefonoHabitacion;  
    private String telefonoAdicional;  
    private String correoPersonal;  
    
    private String nombreCompletoEncargado;  
    private String noDeIdentificacionEncargado;  
    private String telefonoMovilEncargado;  
    private String correoElectronicoEncargado;  
    private boolean trabajaActualmenteEncargado;  
    private String lugarDeTrabajoEncargado;  
    private String telefonoTrabajoEncargado;
    
    private String nombreCompletoEncargado2;  
    private String noDeIdentificacionEncargado2;  
    private String telefonoMovilEncargado2;  
    private String correoElectronicoEncargado2;  
    private boolean trabajaActualmenteEncargado2;  
    private String lugarDeTrabajoEncargado2;  
    private String telefonoTrabajoEncargado2;

    public Estudiante() {
    }

    public Estudiante(String seccion, String subirFoto, String nombreCompleto, String noDeIdentificacion, String fechaDeNacimeinto, String paisDeOrigen, String correoInstitucional, String direccion, String canton, String provincia, String telefonoHabitacion, String telefonoAdicional, String correoPersonal, String nombreCompletoEncargado, String noDeIdentificacionEncargado, String telefonoMovilEncargado, String correoElectronicoEncargado, boolean trabajaActualmenteEncargado, String lugarDeTrabajoEncargado, String telefonoTrabajoEncargado, String nombreCompletoEncargado2, String noDeIdentificacionEncargado2, String telefonoMovilEncargado2, String correoElectronicoEncargado2, boolean trabajaActualmenteEncargado2, String lugarDeTrabajoEncargado2, String telefonoTrabajoEncargado2) {
        this.seccion = seccion;
        this.subirFoto = subirFoto;
        this.nombreCompleto = nombreCompleto;
        this.noDeIdentificacion = noDeIdentificacion;
        this.fechaDeNacimeinto = fechaDeNacimeinto;
        this.paisDeOrigen = paisDeOrigen;
        this.correoInstitucional = correoInstitucional;
        this.direccion = direccion;
        this.canton = canton;
        this.provincia = provincia;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoAdicional = telefonoAdicional;
        this.correoPersonal = correoPersonal;
        this.nombreCompletoEncargado = nombreCompletoEncargado;
        this.noDeIdentificacionEncargado = noDeIdentificacionEncargado;
        this.telefonoMovilEncargado = telefonoMovilEncargado;
        this.correoElectronicoEncargado = correoElectronicoEncargado;
        this.trabajaActualmenteEncargado = trabajaActualmenteEncargado;
        this.lugarDeTrabajoEncargado = lugarDeTrabajoEncargado;
        this.telefonoTrabajoEncargado = telefonoTrabajoEncargado;
        this.nombreCompletoEncargado2 = nombreCompletoEncargado2;
        this.noDeIdentificacionEncargado2 = noDeIdentificacionEncargado2;
        this.telefonoMovilEncargado2 = telefonoMovilEncargado2;
        this.correoElectronicoEncargado2 = correoElectronicoEncargado2;
        this.trabajaActualmenteEncargado2 = trabajaActualmenteEncargado2;
        this.lugarDeTrabajoEncargado2 = lugarDeTrabajoEncargado2;
        this.telefonoTrabajoEncargado2 = telefonoTrabajoEncargado2;
    }
    
    
}
