/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cristoebay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Luis
 */
public class VistaPrincipal extends JFrame{
    public VistaPrincipal(){
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setTitle("CristoBay");
        JLabel et_p1=new JLabel("Añadir Subasta");
        JTabbedPane pestañas=new JTabbedPane();
        
        JTextField Producto = new JTextField(10);
        JTextField Precio_Inicial = new JTextField(3);
        JTextArea Descripcion = new JTextArea();
        JPanel panel1=new JPanel();
        panel1.add(et_p1);
        panel1.add(Producto);
        panel1.add(Precio_Inicial);
        panel1.add(Descripcion);
       
        pestañas.addTab("Crear Subasta", panel1);
        
        JPanel panel2=new JPanel();
        pestañas.addTab("Ver Subastas", panel2);
        JLabel et_p2=new JLabel("Ver Subastas");
        panel2.add(et_p2);
 
        JPanel panel3=new JPanel();
        JLabel et_p3=new JLabel("Modificar Subastas");
        panel3.add(et_p3);
        pestañas.addTab("Modificar Subastas", panel3);
 
        JPanel panel4=new JPanel();
        JLabel et_p4=new JLabel("Eliminar Subastas");
        panel4.add(et_p4);
 
        pestañas.addTab("Eliminar Subastas", panel4);
        getContentPane().add(pestañas);
    }
    public static void main(String args[]) {
        VistaPrincipal a = new VistaPrincipal();
    }
}

