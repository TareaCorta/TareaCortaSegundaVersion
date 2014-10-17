/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;

/**
 *
 * @author ellioth
 */
public class pruebaGrafica extends JFrame{
    public pruebaGrafica(DefaultCategoryDataset cuadro){
    cuadro= new DefaultCategoryDataset();
    String Tmetodo1= "quickSortA";
    String Tmetodo2= "insertSortL";
    cuadro.addValue(0.003, Tmetodo1, "");
    cuadro.addValue(0.006, Tmetodo2, "");
    JFreeChart graf= ChartFactory.createBarChart3D("Velocidad en tiempo de ejecucion", "metodos de ordenamiento", "tiempo", cuadro, PlotOrientation.VERTICAL, true, true, false);
    ChartPanel contenedor = new ChartPanel(graf);
    setBounds(200, 300, 300, 300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(contenedor);
    
    }
    
}
