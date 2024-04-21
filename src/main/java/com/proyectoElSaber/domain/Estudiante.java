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
    private boolean trabajaActualmenteEncargado;  
    private String lugarDeTrabajoEncargado;  
    private String telefonoTrabajoEncargado;
    
    @Column(name = "nombre_completo_encargado_2")
    private String nombreCompletoEncargado2;
    @Column(name = "no_de_identificacion_encargado_2")
    private String noDeIdentificacionEncargado2;
    @Column(name = "telefono_movil_encargado_2")
    private String telefonoMovilEncargado2;  
    @Column(name = "correo_electronico_encargado_2")
    private String correoElectronicoEncargado2;
    @Column(name = "trabaja_actualmente_encargado_2")
    private boolean trabajaActualmenteEncargado2;
    @Column(name = "lugar_de_trabajo_encargado_2")
    private String lugarDeTrabajoEncargado2;
    @Column(name = "telefono_trabajo_encargado_2")
    private String telefonoTrabajoEncargado2;

    public Estudiante() {
    }

    public Estudiante(String noDeCarnet, String seccion, String nombreCompleto, String noDeIdentificacion, String fechaDeNacimiento, String paisDeOrigen, String correoInstitucional, String direccion, String canton, String provincia, String telefonoHabitacion, String telefonoAdicional, String nombreCompletoEncargado, String noDeIdentificacionEncargado, String telefonoMovilEncargado, String correoElectronicoEncargado, boolean trabajaActualmenteEncargado, String lugarDeTrabajoEncargado, String telefonoTrabajoEncargado, String nombreCompletoEncargado2, String noDeIdentificacionEncargado2, String telefonoMovilEncargado2, String correoElectronicoEncargado2, boolean trabajaActualmenteEncargado2, String lugarDeTrabajoEncargado2, String telefonoTrabajoEncargado2) {
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
        
        this.nombreCompletoEncargado2 = nombreCompletoEncargado2;
        this.noDeIdentificacionEncargado2 = noDeIdentificacionEncargado2;
        this.telefonoMovilEncargado2 = telefonoMovilEncargado2;
        this.correoElectronicoEncargado2 = correoElectronicoEncargado2;
        this.trabajaActualmenteEncargado2 = trabajaActualmenteEncargado2;
        this.lugarDeTrabajoEncargado2 = lugarDeTrabajoEncargado2;
        this.telefonoTrabajoEncargado2 = telefonoTrabajoEncargado2;
    }


    
}
