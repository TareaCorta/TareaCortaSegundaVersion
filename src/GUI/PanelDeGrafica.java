/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Node.Lista;
import Node.Node;
import org.jfree.data.category.*;
import logic.*;
import facade.Facade;
import java.io.IOException;

/**
 *
 * @author ellioth
 * @param <T>
 */
public class PanelDeGrafica <T> {
    private String burbuja="";
    private String insertar="";
    private String seleccion="";
    private String rapida="";
    private String merge="";
    private String raddix="";
    private final int Metbur=1;
    private final int Metin=2;
    private final int Metsel=3;
    private final int Metrap=4;
    private final int Metmer=5;
    private final int Metrad=6;
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
    private pantalla1 Panprin;
    private int cantMax;
    private int recur;
    
    public void ListaDeMetodos(Lista list){
        Node temp= list.getHead();
        int i=0;
        selectionsortL cont = new selectionsortL();
        int j= cont.cuentaLista(list);
        while(i<j){
            String Vtemp= ((String)(temp.get_data()));
            if (Vtemp.equals("burbuja-array"))
                    burbuja= "BurbujaA";
            else if (Vtemp.equals("burbuja-lista"))
                burbuja= "BurbujaL";
            else if (Vtemp.equals("insert-array"))
                insertar= "InsertA";
            else if (Vtemp.equals("insert-lista"))
                insertar= "InsertL";
            else if (Vtemp.equals("merge-array"))
                merge= "MergeA";
            else if (Vtemp.equals("merge-lista"))
                merge= "MergeL";
            else if (Vtemp.equals("raddix-array"))
                raddix= "RaddixA";
            else if (Vtemp.equals("raddix-lista"))
                raddix= "RaddixL";
            else if (Vtemp.equals("quick-array"))
                rapida= "QuickA";
            else if (Vtemp.equals("quick-lista"))
                rapida= "QuickL";
            else if (Vtemp.equals("selection-array"))
                seleccion= "SelectionA";
            else if (Vtemp.equals("selection-lista"))
                seleccion= "SelectionL";
            temp=temp.getNext();
            i++;
        }
    }
    
    public void metodosOrdA(DefaultCategoryDataset cuadro, T[] arreglo ) throws IOException{
        Facade fac= new Facade();
        Panprin= new pantalla1();
        recur= Panprin.getCantRecur();
        if (burbuja.equals("BurbujaA")){
            for (int i= 0; i< recur; i++)
                BBA+= fac.comA(arreglo, 0, cantMax, Metbur);
            this.BBA=(BBA/recur);
            cuadro.addValue(this.BBA, burbuja, "segundos");
        }
        else if (insertar.equals("InsertA")){
            for (int i= 0; i< recur; i++)
                INA+= fac.comA(arreglo, 0, cantMax, Metin);
            this.INA= (INA/recur);
            cuadro.addValue(this.INA, insertar, "segundos");
        }
        else if (merge.equals("MergeA")){
            for (int i= 0; i< recur; i++)
                MGA+= fac.comA(arreglo, 0, cantMax, Metmer);
            this.MGA= (MGA/recur);
            cuadro.addValue(this.MGA, merge, "segundos");
        }
        else if (raddix.equals("RaddixA")){
            for (int i= 0; i< recur; i++)
                RDA+= fac.comA(arreglo, 0, cantMax, Metrad);
            this.RDA= (RDA/recur);
            cuadro.addValue(this.RDA, raddix, "segundos");
        }
        else if (rapida.equals("QuickA")){
            for (int i= 0; i< recur; i++)
                QKA+= fac.comA(arreglo, 0, cantMax, Metrap);
            this.QKA= (QKA/recur);
            cuadro.addValue(this.QKA, rapida, "segundos");
        }
        else if (seleccion.equals("SelectionA")){
            for (int i= 0; i< recur; i++)
                SLA= fac.comA(arreglo, 0, cantMax, Metsel);
            this.SLA= (SLA/recur);
            cuadro.addValue(this.SLA, seleccion,"segundos");
        }
    }
    
    public void metodosOrdL(DefaultCategoryDataset cuadro, Lista list ) throws IOException{
        Facade fac= new Facade();
        Panprin= new pantalla1();
        recur= Panprin.getCantRecur();
        if (burbuja.equals("BurbujaL")){
             for (int i= 0; i< recur; i++)
                BBL= fac.comLis(list, Metbur);
            this.BBL=(BBL/recur); 
            cuadro.addValue(this.BBL, burbuja, "segundos");
        }
        else if (insertar.equals("InsertL")){
            for (int i= 0; i< recur; i++)
                INL= fac.comLis(list, Metin);
            this.INL=INL/recur;
            cuadro.addValue(this.INL, insertar, "segundos");
        }
        else if (merge.equals("MergeL")){
            for (int i= 0; i< recur; i++)
                MGL= fac.comLis(list, Metmer);
            this.MGL= MGL/recur;
            cuadro.addValue(this.MGL, merge, "segundos");
        }
        else if (raddix.equals("RaddixL")){
            for (int i= 0; i< recur; i++)
                RDL= fac.comLis(list, Metrad);
            this.RDL=(RDL/recur);
            cuadro.addValue(this.RDL, raddix, "segundos");
        }
        else if (rapida.equals("QuickL")){
            for (int i= 0; i< recur; i++)
                QKL= fac.comLis(list, Metrap);
            this.QKL=(QKL/recur);
            cuadro.addValue(this.QKL, rapida, "segundos");
        }
        else if (seleccion.equals("SelectionL")){
            for (int i= 0; i< recur; i++)
                SLL= fac.comLis(list, Metsel);
            this.SLL=(SLL/recur);
            cuadro.addValue(this.SLL, seleccion, "segundos");
        }
    }
}
