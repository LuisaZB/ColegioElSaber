package com.proyectoElSaber.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "datos")
public class Datos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "seccion")
    private String seccion;
    private String guia;
    
    private String leccionL1;
    private String leccionL2;
    private String leccionL3;
    private String leccionL4;
    private String leccionL5;
    private String leccionL6;
    private String leccionL7;
    private String leccionL8;
    private String leccionL9;
    private String leccionL10;
    
    private String leccionK1;
    private String leccionK2;
    private String leccionK3;
    private String leccionK4;
    private String leccionK5;
    private String leccionK6;
    private String leccionK7;
    private String leccionK8;
    private String leccionK9;
    private String leccionK10;
    
    private String leccionM1;
    private String leccionM2;
    private String leccionM3;
    private String leccionM4;
    private String leccionM5;
    private String leccionM6;
    private String leccionM7;
    private String leccionM8;
    private String leccionM9;
    private String leccionM10;
    
    private String leccionJ1;
    private String leccionJ2;
    private String leccionJ3;
    private String leccionJ4;
    private String leccionJ5;
    private String leccionJ6;
    private String leccionJ7;
    private String leccionJ8;
    private String leccionJ9;
    private String leccionJ10;
    
    private String leccionV1;
    private String leccionV2;
    private String leccionV3;
    private String leccionV4;
    private String leccionV5;
    private String leccionV6;
    private String leccionV7;
    private String leccionV8;
    private String leccionV9;
    private String leccionV10;

    public Datos() {
    }

    public Datos(String seccion, String guia, String leccionL1, String leccionL2, String leccionL3, String leccionL4, String leccionL5, String leccionL6, String leccionL7, String leccionL8, String leccionL9, String leccionL10, String leccionK1, String leccionK2, String leccionK3, String leccionK4, String leccionK5, String leccionK6, String leccionK7, String leccionK8, String leccionK9, String leccionK10, String leccionM1, String leccionM2, String leccionM3, String leccionM4, String leccionM5, String leccionM6, String leccionM7, String leccionM8, String leccionM9, String leccionM10, String leccionJ1, String leccionJ2, String leccionJ3, String leccionJ4, String leccionJ5, String leccionJ6, String leccionJ7, String leccionJ8, String leccionJ9, String leccionJ10, String leccionV1, String leccionV2, String leccionV3, String leccionV4, String leccionV5, String leccionV6, String leccionV7, String leccionV8, String leccionV9, String leccionV10) {
        this.seccion = seccion;
        this.guia = guia;
        this.leccionL1 = leccionL1;
        this.leccionL2 = leccionL2;
        this.leccionL3 = leccionL3;
        this.leccionL4 = leccionL4;
        this.leccionL5 = leccionL5;
        this.leccionL6 = leccionL6;
        this.leccionL7 = leccionL7;
        this.leccionL8 = leccionL8;
        this.leccionL9 = leccionL9;
        this.leccionL10 = leccionL10;
        
        this.leccionK1 = leccionK1;
        this.leccionK2 = leccionK2;
        this.leccionK3 = leccionK3;
        this.leccionK4 = leccionK4;
        this.leccionK5 = leccionK5;
        this.leccionK6 = leccionK6;
        this.leccionK7 = leccionK7;
        this.leccionK8 = leccionK8;
        this.leccionK9 = leccionK9;
        this.leccionK10 = leccionK10;
        
        this.leccionM1 = leccionM1;
        this.leccionM2 = leccionM2;
        this.leccionM3 = leccionM3;
        this.leccionM4 = leccionM4;
        this.leccionM5 = leccionM5;
        this.leccionM6 = leccionM6;
        this.leccionM7 = leccionM7;
        this.leccionM8 = leccionM8;
        this.leccionM9 = leccionM9;
        this.leccionM10 = leccionM10;
        
        this.leccionJ1 = leccionJ1;
        this.leccionJ2 = leccionJ2;
        this.leccionJ3 = leccionJ3;
        this.leccionJ4 = leccionJ4;
        this.leccionJ5 = leccionJ5;
        this.leccionJ6 = leccionJ6;
        this.leccionJ7 = leccionJ7;
        this.leccionJ8 = leccionJ8;
        this.leccionJ9 = leccionJ9;
        this.leccionJ10 = leccionJ10;
        
        this.leccionV1 = leccionV1;
        this.leccionV2 = leccionV2;
        this.leccionV3 = leccionV3;
        this.leccionV4 = leccionV4;
        this.leccionV5 = leccionV5;
        this.leccionV6 = leccionV6;
        this.leccionV7 = leccionV7;
        this.leccionV8 = leccionV8;
        this.leccionV9 = leccionV9;
        this.leccionV10 = leccionV10;
    }
    
    
}
