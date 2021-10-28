/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Luis
 */
public class Subastar {
    private int IDUsuario;
    private int IDArticulo;
    private String Hora_fin;
    private String Estado;
    private int PrecioSalida;

    public Subastar(String f,String e, int p){
        Hora_fin=f;
        Estado=e;
        PrecioSalida=p;
    }
    public Subastar(){
        
    }
    public void añadirSubasta(Subastar a){
        try{
            Conexion con = new Conexion();
            ResultSet rs;
            rs = con.getConexion().executeQuery("SELECT id_articulo FROM Articulo");
            rs.first();
            con.getConexion().executeQuery("INSERT INTO Subastar(id_articulo,fecha_fin,estado,precio_salida) VALUES('"+Integer.valueOf(rs.getInt(1))+"','"+a.getHora_fin().toString()+"','"+a.getEstado().toString()+"','"+a.getPrecioSalida()+"')");
            con.getConexion().close();
        }catch(Exception e){ 
            System.out.println(e);
        }
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

    public String getHora_fin() {
        return Hora_fin;
    }

    public void setHora_fin(String Hora_fin) {
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
