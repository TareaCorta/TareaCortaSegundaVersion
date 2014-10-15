/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Node.Lista;
import Node.Node;
import javax.swing.JPanel;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import logic.*;
import facade.Facade;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

/**
 *
 * @author ellioth
 */
public class PanelDeGrafica  extends JPanel{
    private String burbuja;
    private String insertar;
    private String seleccion;
    private String rapida;
    private String merge;
    private String raddix;
    private float BBL;
    private float BBA;
    private float INL;
    private float INA;
    private float SLL;
    private float SLA;
    private float QKL;
    private float QKA;
    private float MGL;
    private float MGA;
    private float RDL;
    private float RDA;
    private Node temp;
    private char tipo;
    private DefaultCategoryDataset cuadro;
    private Facade fac;
    private generador rnd;
    private int cantMax;
    private int recur;
    
    public PanelDeGrafica() throws IOException{
        this.setBackground(Color.ORANGE);
        GridLayout grd= new GridLayout();
        setLayout(grd);
        cuadro = new DefaultCategoryDataset();
        fac= new Facade();
        rnd= new generador();
        if (tipo=='S'){
            String [] arreglo = rnd.generadorArrString(cantMax);
            metodosOrdAS(cuadro, fac, arreglo);
            Lista Tlist = rnd.generadorListString(cantMax);
            metodosOrdLS(cuadro, fac, Tlist );
        }
        if (tipo=='I'){
           int [] arreglo = rnd.generadorArrInt(cantMax);
           metodosOrdAI(cuadro, fac, arreglo);
           Lista Tlist = rnd.generadorListInt(cantMax);
           metodosOrdLI(cuadro, fac, Tlist); 
        }
        JFreeChart graf= ChartFactory.createBarChart3D("Velocidad en tiempo de ejecucion", "metodos de ordenamiento", "tiempo", cuadro, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel contenedor = new ChartPanel(graf);
        setBounds(0, 0, 200, 200);
        add(contenedor);
    }
    
    public void recurcionesYciclos(String palabra){
        int x=0;
        int y=x+1;
        String conte="";
        for (int i=0; y<=palabra.length(); i++){
            if ((palabra.substring(i, y)).equals("-")){
                cantMax= Integer.parseInt(conte);
                y=palabra.length();
                recur= Integer.parseInt(palabra.substring(i+1, y));
            }
            else{
                conte+=palabra.substring(i, y);
            }
            y++;       
        }   
    }
    
    public void recorreLista(Lista list){
        temp=list.getHead();
        selectionsortL contadorL= new selectionsortL();
        int i=0;
        int j= contadorL.cuentaLista(list);
        String Vtemp= ((String)(temp.get_data()));
        while (i<j){
            ListaDeMetodos(Vtemp);
            temp=temp.getNext();
            Vtemp= ((String)(temp.get_data()));
            i++;
        }
    }
    
    public void ListaDeMetodos(String Vtemp){
        if (Vtemp.equals("burbujasort-arreglo"))
                burbuja= "Orde. BurbujaA";
        if (Vtemp.equals("burbujasort-lista"))
            burbuja= "Orde. BurbujaL";
        if (Vtemp.equals("insertrsort-arreglo"))
            insertar= "Orde. InsertA";               
        if (Vtemp.equals("insertrsort-lista"))
            insertar= "Orde. InsertL";
        if (Vtemp.equals("mergesort-arreglo"))
            merge= "Orde. MergeA";
        if (Vtemp.equals("mergesort-lista"))
            merge= "Orde. MergeL";
        if (Vtemp.equals("raddixsort-arreglo"))
            raddix= "Orde. RaddixA";
        if (Vtemp.equals("raddixsort-lista"))
            raddix= "Orde. RaddixL";
        if (Vtemp.equals("quicksort-arreglo"))
            rapida= "Orde. QuickA";
        if (Vtemp.equals("quicksort-lista"))
            rapida= "Orde. QuickL";
        if (Vtemp.equals("selectionsort-arreglo"))
            seleccion= "Orde. SelectionA";
        if (Vtemp.equals("selectionsort-lista"))
            seleccion= "Orde. SelectionL";
            
    }
    
    public void StringOrInteger(int i){
        if (i==0)
            tipo='S';
        if (i==1)
            tipo='I';
    }
    
    public void metodosOrdAI(DefaultCategoryDataset cuadro,Facade fac, int[] arreglo ){
        if (burbuja.equals("Orde. BurbujaA")){
            BBA= fac.comAInt(arreglo, 0, arreglo.length, 1);
            cuadro.addValue(BBA, burbuja, "");
        }
        if (insertar.equals("Orde. InsertA")){
            INA= fac.comAInt(arreglo, 0, arreglo.length, 2);
            cuadro.addValue(INA, insertar, "");
        }
        if (merge.equals("Orde. MergeA")){
            MGA= fac.comAInt(arreglo, 0, arreglo.length, 5);
            cuadro.addValue(MGA, merge, "");
        }
        if (raddix.equals("Orde. RaddixA")){
            RDA= fac.comAInt(arreglo, 0, arreglo.length, 6);
            cuadro.addValue(RDA, raddix, "");
        }
        if (rapida.equals("Orde. QuickA")){
            QKA= fac.comAInt(arreglo, 0, arreglo.length, 4);
            cuadro.addValue(QKA, rapida, "");
        }
        if (seleccion.equals("Orde. SelectionA")){
            SLA= fac.comAInt(arreglo, 0, arreglo.length, 3);
            cuadro.addValue(SLA, seleccion, "");
        }
    }
    
    public void metodosOrdAS(DefaultCategoryDataset cuadro,Facade fac, String[] arreglo ){
       if (burbuja.equals("Orde. BurbujaA")){
            BBA= fac.comAString(arreglo, 0, arreglo.length, 1);
            cuadro.addValue(BBA, burbuja, "");
       }
        if (insertar.equals("Orde. InsertA")){
            INA= fac.comAString(arreglo, 0, arreglo.length, 2);
            cuadro.addValue(INA, insertar, "");
        }
        if (merge.equals("Orde. MergeA")){
            MGA= fac.comAString(arreglo, 0, arreglo.length, 5);
            cuadro.addValue(MGA, merge, "");
        }
        if (raddix.equals("Orde. RaddixA")){
            RDA= fac.comAString(arreglo, 0, arreglo.length, 6);
            cuadro.addValue(RDA, raddix, "");
        }
        if (rapida.equals("Orde. QuickA")){
            QKA= fac.comAString(arreglo, 0, arreglo.length, 4);
            cuadro.addValue(QKA, rapida, "");
        }
        if (seleccion.equals("Orde. SelectionA")){
            SLA= fac.comAString(arreglo, 0, arreglo.length, 3);
            cuadro.addValue(SLA, seleccion, "");
        }
    }
    
    public void metodosOrdLI(DefaultCategoryDataset cuadro,Facade fac, Lista list ) throws IOException{
        if (burbuja.equals("Orde. BurbujaL")){
            BBL= fac.comLInt(list, 1);
            cuadro.addValue(BBL, burbuja, "");
        }
        if (insertar.equals("Orde. InsertL")){
            INL= fac.comLInt(list, 2);
            cuadro.addValue(INL, insertar, "");
        }
        if (merge.equals("Orde. MergeL")){
            MGL= fac.comLInt(list, 5);
            cuadro.addValue(MGL, merge, "");
        }
        if (raddix.equals("Orde. RaddixL")){
            RDL= fac.comLInt(list, 6);
            cuadro.addValue(RDL, raddix, "");
        }
        if (rapida.equals("Orde. QuickL")){
            QKL= fac.comLInt(list, 4);
            cuadro.addValue(QKL, rapida, "");
        }
        if (seleccion.equals("Orde. SelectionL")){
            SLL= fac.comLInt(list, 3);
            cuadro.addValue(SLL, seleccion, "");
        }
    }
    
    public void metodosOrdLS(DefaultCategoryDataset cuadro,Facade fac, Lista list ) throws IOException{
        if (burbuja.equals("Orde. BurbujaL")){
            BBL= fac.comLString(list, 1);
            cuadro.addValue(BBL, burbuja, "");
        }
        if (insertar.equals("Orde. InsertL")){
            INL= fac.comLString(list, 2);
            cuadro.addValue(INL, insertar, "");
        }
        if (merge.equals("Orde. MergeL")){
            MGL= fac.comLString(list, 5);
            cuadro.addValue(MGL, merge, "");
        }
        if (raddix.equals("Orde. RaddixL")){
            RDL= fac.comLString(list, 6);
            
        }
        if (rapida.equals("Orde. QuickL")){
            QKL= fac.comLString(list, 4);
            cuadro.addValue(RDL, raddix, "");
        }
        if (seleccion.equals("Orde. SelectionL")){
            SLL= fac.comLString(list, 3);
            cuadro.addValue(SLL, seleccion, "");
        }
    }
}
