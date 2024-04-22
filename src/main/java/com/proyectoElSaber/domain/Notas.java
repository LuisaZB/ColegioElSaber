
package com.proyectoElSaber.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="calificaciones")
public class Notas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;
    @Column(name = "no_de_carnet")
    private String noDeCarnet;
    private String materia;
    private String profesor;
    private double notaProyecto;
    private double notaFinal;
    private String estado;
//    private String noDeCarnet2 = usuario.getNoDeCarnet();


    public Notas() {

    }

    public Notas(Long codigo, String materia, String profesor, double notaProyecto, double notaFinal, String estado, String noDeCarnet, Asignatura asignatura) {
        this.codigo = codigo;
        this.materia = materia;
        this.profesor = profesor;
        this.notaProyecto = notaProyecto;
        this.notaFinal = notaFinal;
        this.estado = estado;
        this.noDeCarnet = noDeCarnet;

    }

    
    
    
}
