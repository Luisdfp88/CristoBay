/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    private ArrayList IDs = new ArrayList();
    
    public Articulo(String n,String d, String im){
        Nombre=n;
        Descripcion=d;
        Imagen=im;
    }
    public Articulo(){
        
    }
    public void añadirArticulo(Articulo a){
        try{
            Conexion con = new Conexion();
            con.getConexion().executeQuery("INSERT INTO Articulo(nombre,descripcion,imagen) VALUES('"+a.getNombre().toString()+"','"+a.getDescripcion().toString()+"','"+a.getImagen().toString()+"')");
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

    public String getNombre()  {
        return Nombre;
    }
    public ArrayList getArrayNombres() throws SQLException {
        ArrayList ar = new ArrayList();
        Conexion con = new Conexion();
        ResultSet rs = con.getConexion().executeQuery("SELECT * FROM articulo");
        while(rs.next()){
            ar.add(rs.getString("nombre"));
        }
        con.getConexion().close();
        return ar;
    }
    public ArrayList getArrayIDs() throws SQLException {
        ArrayList ar = new ArrayList();
        Conexion con = new Conexion();
        ResultSet rs = con.getConexion().executeQuery("SELECT * FROM articulo");
        while(rs.next()){
            IDs.add(rs.getString("id_articulo"));
        }
        con.getConexion().close();
        return IDs;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public ArrayList getDescripcionArt() throws SQLException {
        Conexion con = new Conexion();
        ResultSet rs = con.getConexion().executeQuery("SELECT descripcion FROM articulo");
        ArrayList str = new ArrayList();
        while(rs.next()){
            str.add(rs.getString("descripcion"));
        }
        con.getConexion().close();
        return str;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getImagen() {
        return Imagen;
    }
    public ArrayList getArrayImagenes() throws SQLException{
        Conexion con = new Conexion();
        ResultSet rs = con.getConexion().executeQuery("SELECT imagen FROM articulo");
        ArrayList str = new ArrayList();
        while(rs.next()){
            str.add(rs.getString("imagen"));
        }
        con.getConexion().close();
        return str;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
}
    

