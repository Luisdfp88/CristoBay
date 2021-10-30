/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Usuario {
    private int IDUsuario;
    private String Username;
    private String Password;
    private int Monedero;
    private String Nombre;
    private String Apellidos;
    private String Correo;
    private ArrayList IDs = new ArrayList();

    public int getIDUsuario() {
        return IDUsuario;
    }
    public ArrayList getArrayUsuarios() throws SQLException{
        ArrayList ar = new ArrayList();
        Conexion con = new Conexion();
        ResultSet rsU = con.getConexion().executeQuery("SELECT * FROM Usuario");
        while(rsU.next()){
            ar.add(rsU.getString("nombre"));
        }
        con.getConexion().close();
        return ar;
    }
    public ArrayList getIDUsuarios() throws SQLException{
        ArrayList ar = new ArrayList();
        Conexion con = new Conexion();
        ResultSet rsU = con.getConexion().executeQuery("SELECT * FROM Usuario");
        while(rsU.next()){
            IDs.add(rsU.getInt("id_usuario"));
        }
        return IDs;
    }
    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getMonedero() {
        return Monedero;
    }

    public void setMonedero(int Monedero) {
        this.Monedero = Monedero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
