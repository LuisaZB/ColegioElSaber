/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoElSaber.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_de_carnet")
    private String noDeCarnet;
    private String username;
    private String subirFoto;
    private String password;
    private String correo;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String noDeCarnet, String username, String subirFoto, String password, String correo, boolean activo) {
        this.noDeCarnet = noDeCarnet;
        this.username = username;
        this.subirFoto = subirFoto;
        this.password = password;
        this.correo = correo;
        this.activo = activo;
    }

}
