/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Articulo {
    private int IDArticulo;
    private String Nombre;
    private String Descripcion;
    private String Imagen;
    private ArrayList<Articulo> ListaArticulos;
    
    public Articulo(int i,String n,String d, String im){
        IDArticulo=i;
        Nombre=n;
        Descripcion=d;
        Imagen=im;
    }
    public Articulo(){
        
    }
    public void añadirArticulo(Articulo a){
        try{
            Conexion con = new Conexion();
            PreparedStatement pStmt = null;
            ResultSet rs = con.getConexion().executeQuery("select ID_Articulo from Articulo");
            con.getConexion().executeQuery("INSERT INTO Articulo(nombre_articulo,descripcion,imagen) VALUES('"+a.getNombre().toString()+"','"+a.getDescripcion().toString()+"','"+a.getImagen().toString()+"')");
            con.getConexion().close();
        }catch(Exception e){ 
            System.out.println(e);
        }
    }
    public int getIDArticulo() {
        return IDArticulo;
    }

    public void setIDArticulo(int IDArticulo) {
        this.IDArticulo = IDArticulo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    
}
