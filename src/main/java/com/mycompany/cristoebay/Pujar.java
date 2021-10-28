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
public class Pujar {
    private LocalDate Hora_puja;
    private int IDUsuario;
    private int IDArticulo;
    private LocalDate Hora_Inicio;
    private LocalDate Hora_Fin;
    private int CantidadPujada;

    public LocalDate getHora_puja() {
        return Hora_puja;
    }

    public void setHora_puja(LocalDate Hora_puja) {
        this.Hora_puja = Hora_puja;
    }

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

    public LocalDate getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(LocalDate Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    public LocalDate getHora_Fin() {
        return Hora_Fin;
    }

    public void setHora_Fin(LocalDate Hora_Fin) {
        this.Hora_Fin = Hora_Fin;
    }

    public int getCantidadPujada() {
        return CantidadPujada;
    }

    public void setCantidadPujada(int CantidadPujada) {
        this.CantidadPujada = CantidadPujada;
    }
    
}
