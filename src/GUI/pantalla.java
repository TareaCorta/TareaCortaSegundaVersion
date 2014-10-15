/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Node.Lista;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author ellioth
 */
public class pantalla extends JFrame  implements ActionListener{
    private PanelDePedido panel1;
    private PanelDeGrafica panel2;
    private Lista list;
    
    public pantalla() throws IOException{
        setTitle("comparacion de programas de ordenamiento");
        setBounds(200, 300, 520, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        panel1= new PanelDePedido(this);
        panel2= new PanelDeGrafica();
        add(panel1);
        add(panel2);
        
    }
    
    public static void main(String []args) throws IOException{
        pantalla nueva= new pantalla();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==panel1.getBoton("agregar")){
             String temp= panel1.getTextField("espacio1").getText();
             if (temp.length()>1)
                list.insertHead(temp);
        }
        if (e.getSource()==panel1.getBoton("calcular")){
           panel2.StringOrInteger(0);
           if ((panel1.getTextField("espacio2").getText()).length()>=3){
                panel2.recurcionesYciclos(panel1.getTextField("espacio2").getText());
                panel2.recorreLista(list);
           }
           else
               alerta=true;
        }
        if (e.getSource()==calcular2){
            panel2.StringOrInteger(1);
           if ((espacio2.getText()).length()>=3){
                panel2.recurcionesYciclos(espacio2.getText());
                panel2.recorreLista(list);
           }
           else
               alerta=true;
        }
    }
    
}
