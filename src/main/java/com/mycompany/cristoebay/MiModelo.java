/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Luis
 */
public class MiModelo {
    public DefaultTableModel MiModelo() throws SQLException {
        Conexion con = new Conexion();
        ResultSet rsIn = con.getConexion().executeQuery("SELECT precio_salida FROM subastar");
        ResultSet rsU = con.getConexion().executeQuery("SELECT nombre FROM Usuario");
        ResultSet rsA = con.getConexion().executeQuery("SELECT nombre FROM articulo");
        ResultSet rsf = con.getConexion().executeQuery("SELECT cantidad_pujada FROM pujar");
        ResultSet rsfi = con.getConexion().executeQuery("SELECT fecha_inicio FROM subastar");
        ResultSet rsff = con.getConexion().executeQuery("SELECT fecha_fin FROM subastar");
        int i = 0;
        rsA.beforeFirst();
        while(rsA.next()){
            i++;
        }
        rsA.beforeFirst();
        String columns[] = { "Usuario", "Articulo", "Precio Salida", "Puja Maxima", "Fecha Inicio", "Fecha Fin" };
        String data[][] = new String[i][6];
        i = 0;
        while(rsA.next()){
            rsU.first();
            String usu = rsU.getString("nombre");
            data[i][0] = usu;
            i++;
        }
        i = 0;
        rsA.beforeFirst();
        while(rsA.next()){
            String art = rsA.getString("nombre");
            data[i][1] = art;
            i++;
        }
        i = 0;
        rsIn.beforeFirst();
        while(rsIn.next()){
            int pujIn = rsIn.getInt("precio_salida");
            data[i][2] = pujIn+"";
            i++;
        }
        i=0;
        rsf.beforeFirst();
        while (rsf.next()) {
            String pujFn = rsf.getString("Puja_Actual");
            data[i][3] = pujFn;
            i++;
        }
        i=0;
        rsfi.beforeFirst();
        while(rsfi.next()){
            String fi = rsfi.getString("fecha_inicio");
            data[i][4] = fi;
            i++;
        }
        i=0;
        rsff.beforeFirst();
        while(rsff.next()){
        String ff = rsff.getString("fecha_fin");
        data[i][5] = ff;
        i++;
        }
        return new DefaultTableModel(data,columns);
    }
}
