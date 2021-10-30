/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Pujar {
    private String Hora_puja;
    private int IDUsuario;
    private int IDArticulo;
    private LocalDate Hora_Inicio;
    private LocalDate Hora_Fin;
    private int CantidadPujada;
    private int Puja_maxima;
    private ArrayList<Integer> cmp = new ArrayList();
    private ArrayList<Integer> cmpN = new ArrayList();

    public Pujar(String d){
        Hora_puja=d;
    }
    public Pujar(){
        
    }
    public int ComparaPujas() throws SQLException{
        Conexion con = new Conexion();
        ResultSet comp = con.getConexion().executeQuery("SELECT * FROM pujar");
        while(comp.next()){
            cmpN.add(comp.getInt("id_articulo"));
            cmp.add(comp.getInt("cantidad_pujada"));
        }
        int i = 0;
        if(cmpN.size()>1){
        if(cmpN.get(i).equals(cmpN.get(i+1))){
            if(cmp.get(i)>=cmp.get(i+1)){
                con.getConexion().executeQuery("DELETE FROM pujar WHERE cantidad_pujada='"+cmp.get(i+1)+"'AND id_articulo='"+cmpN.get(i+1)+"'");
                con.getConexion().close();
                return cmp.get(i);
            }else{
                con.getConexion().executeQuery("DELETE FROM pujar WHERE cantidad_pujada='"+cmp.get(i)+"'AND id_articulo='"+cmpN.get(i)+"'");
                con.getConexion().close();
                return cmp.get(i);
            }
        }else{
            i++;
        }}else{
        return cmp.get(i);
                }
        con.getConexion().close();
        return cmp.get(i);
    }
    public void añadirPuja(Pujar d, int idU, int idA,String Fi,String Ff,int c){
        try{
            Conexion con = new Conexion();
            con.getConexion().executeQuery("INSERT INTO pujar(fecha_y_hora,id_usuario,id_articulo,fecha_inicio,fecha_fin,cantidad_pujada) VALUES('"+d.getHora_puja().toString()+"','"+idU+"','"+idA+"','"+Fi+"','"+Ff+"','"+c+"')");
            con.getConexion().close();
            
        }catch(Exception e){ 
            System.out.println(e);
        }
    }
    public String getHora_puja() {
        return Hora_puja;
    }

    public void setHora_puja(String Hora_puja) {
        this.Hora_puja = Hora_puja;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }
     public int getPujaMaxima() {
        return Puja_maxima;
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
