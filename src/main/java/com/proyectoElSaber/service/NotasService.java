/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoElSaber.service;

import com.proyectoElSaber.domain.Notas;
import java.util.List;


public interface NotasService {
    public List<Notas> getNotass(boolean activos);


    public Notas getNotas(Notas notas);


    public void save(Notas notas);


    public void delete(Notas notas);

   
    public List<Notas> findByNoDeCarnet(String noDeCarnet);
    public List<Notas> metodoNativo(String noDeCarnet);
}
