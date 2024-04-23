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
    private Long seccion;
    @Column(name = "guia")
    private String guia;
    
    @Column(name = "leccion_l_1")
    private String leccionL1;
    @Column(name = "leccion_l_2")
    private String leccionL2;
    @Column(name = "leccion_l_3")
    private String leccionL3;
    @Column(name = "leccion_l_4")
    private String leccionL4;
    @Column(name = "leccion_l_5")
    private String leccionL5;
    @Column(name = "leccion_l_6")
    private String leccionL6;
    @Column(name = "leccion_l_7")
    private String leccionL7;
    @Column(name = "leccion_l_8")
    private String leccionL8;
    @Column(name = "leccion_l_9")
    private String leccionL9;
    @Column(name = "leccion_l_10")
    private String leccionL10;
    
    @Column(name = "leccion_k_1")
    private String leccionK1;
    @Column(name = "leccion_k_2")
    private String leccionK2;
    @Column(name = "leccion_k_3")
    private String leccionK3;
    @Column(name = "leccion_k_4")
    private String leccionK4;
    @Column(name = "leccion_k_5")
    private String leccionK5;
    @Column(name = "leccion_k_6")
    private String leccionK6;
    @Column(name = "leccion_k_7")
    private String leccionK7;
    @Column(name = "leccion_k_8")
    private String leccionK8;
    @Column(name = "leccion_k_9")
    private String leccionK9;
    @Column(name = "leccion_k_10")
    private String leccionK10;
    
    @Column(name = "leccion_m_1")
    private String leccionM1;
    @Column(name = "leccion_m_2")
    private String leccionM2;
    @Column(name = "leccion_m_3")
    private String leccionM3;
    @Column(name = "leccion_m_4")
    private String leccionM4;
    @Column(name = "leccion_m_5")
    private String leccionM5;
    @Column(name = "leccion_m_6")
    private String leccionM6;
    @Column(name = "leccion_m_7")
    private String leccionM7;
    @Column(name = "leccion_m_8")
    private String leccionM8;
    @Column(name = "leccion_m_9")
    private String leccionM9;
    @Column(name = "leccion_m_10")
    private String leccionM10;
    
    @Column(name = "leccion_j_1")
    private String leccionJ1;
    @Column(name = "leccion_j_2")
    private String leccionJ2;
    @Column(name = "leccion_j_3")
    private String leccionJ3;
    @Column(name = "leccion_j_4")
    private String leccionJ4;
    @Column(name = "leccion_j_5")
    private String leccionJ5;
    @Column(name = "leccion_j_6")
    private String leccionJ6;
    @Column(name = "leccion_j_7")
    private String leccionJ7;
    @Column(name = "leccion_j_8")
    private String leccionJ8;
    @Column(name = "leccion_j_9")
    private String leccionJ9;
    @Column(name = "leccion_j_10")
    private String leccionJ10;
    
    @Column(name = "leccion_v_1")
    private String leccionV1;
    @Column(name = "leccion_v_2")
    private String leccionV2;
    @Column(name = "leccion_v_3")
    private String leccionV3;
    @Column(name = "leccion_v_4")
    private String leccionV4;
    @Column(name = "leccion_v_5")
    private String leccionV5;
    @Column(name = "leccion_v_6")
    private String leccionV6;
    @Column(name = "leccion_v_7")
    private String leccionV7;
    @Column(name = "leccion_v_8")
    private String leccionV8;
    @Column(name = "leccion_v_9")
    private String leccionV9;
    @Column(name = "leccion_v_10")
    private String leccionV10;

    public Datos() {
    }

    public Datos(Long seccion, String guia, String leccionL1, String leccionL2, String leccionL3, String leccionL4, String leccionL5, String leccionL6, String leccionL7, String leccionL8, String leccionL9, String leccionL10, String leccionK1, String leccionK2, String leccionK3, String leccionK4, String leccionK5, String leccionK6, String leccionK7, String leccionK8, String leccionK9, String leccionK10, String leccionM1, String leccionM2, String leccionM3, String leccionM4, String leccionM5, String leccionM6, String leccionM7, String leccionM8, String leccionM9, String leccionM10, String leccionJ1, String leccionJ2, String leccionJ3, String leccionJ4, String leccionJ5, String leccionJ6, String leccionJ7, String leccionJ8, String leccionJ9, String leccionJ10, String leccionV1, String leccionV2, String leccionV3, String leccionV4, String leccionV5, String leccionV6, String leccionV7, String leccionV8, String leccionV9, String leccionV10) {
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
