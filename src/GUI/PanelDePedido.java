/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Node.Lista;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ellioth
 */
public class PanelDePedido extends JPanel{
    private JTextField espacio1;
    private JTextField espacio2;
    private JButton agregar;
    private JButton calcular;
    private JButton calcular2;
    private JLabel texto1;
    private JLabel texto2;
    private JLabel alerT;
    private PanelDeGrafica tipo;
    private Lista list;
    private boolean alerta;
    public PanelDePedido(pantalla PantPrin){
        this.setBackground(Color.ORANGE);
        FlowLayout Lay= new FlowLayout();
        setLayout(Lay);
        espacio1= new JTextField(20);
        espacio2= new JTextField(20);
        agregar= new JButton("Agregar metodo");
        calcular= new JButton("Calcular con Strings");
        calcular2= new JButton("Calcular con int");
        texto1= new JLabel("Metodo de ordenamiento deseado");
        texto2= new JLabel("Cantidad de datos y recurciones");
        calcular.addActionListener(PantPrin);
        calcular2.addActionListener(PantPrin);
        agregar.addActionListener(PantPrin);
        add(texto1);
        add(espacio1);
        add(texto2);
        add(espacio2);
        add(agregar);
        add(calcular);
        add(calcular2);
        if(alerta==true){
            alerT= new JLabel("Falta cantidad de datos a revizar y recurciones");
            add(alerT);
        }
        
        
    }

    public JButton getBoton(String boton){
        if (boton.equals("agregar"))
            return agregar;
        else if(boton.equals("calcular"))
            return calcular;
        else if (boton.equals("calcular2"))
            return calcular2;
        return null;
    } 
    
    public JTextField getTextField(String field){
        if (field.equals("espacio1"))
            return espacio1;
        if (field.equals("espacio2"))
            return espacio2;
        return null;
    }
}
