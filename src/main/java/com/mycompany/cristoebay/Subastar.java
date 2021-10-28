/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.time.LocalDate;

/**
 *
 * @author Luis
 */
public class Subastar {
    private int IDUsuario;
    private int IDArticulo;
    private LocalDate Hora_inicio;
    private LocalDate Hora_fin;
    private String Estado;
    private int PrecioSalida;

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public int getIDArticulo() {
        return IDArticulo;
    }

    public void setIDArticulo(int IDArticulo) {
        this.IDArticulo = IDArticulo;
    }

    public LocalDate getHora_inicio() {
        return Hora_inicio;
    }

    public void setHora_inicio(LocalDate Hora_inicio) {
        this.Hora_inicio = Hora_inicio;
    }

    public LocalDate getHora_fin() {
        return Hora_fin;
    }

    public void setHora_fin(LocalDate Hora_fin) {
        this.Hora_fin = Hora_fin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getPrecioSalida() {
        return PrecioSalida;
    }

    public void setPrecioSalida(int PrecioSalida) {
        this.PrecioSalida = PrecioSalida;
    }
    
    
}
