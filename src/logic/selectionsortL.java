/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.IOException;
import Node.*;
/**
 *
 * @author ellioth
 */
public class selectionsortL {
    
    public Lista SelectionSortInt(Lista list) throws IOException{
        Node I= list.getHead();
        Node J= I.getNext();
        Node Min;
        int Vmin;
        int Vj;
        for (int i=0; i<cuentaLista(list)-1; i++){
            Min=I;
            Vmin=((int)(Min.get_data()));
            for (int j=i+1; j<cuentaLista(list);j++){
                Vj=((int)(J.get_data()));
                if (Vj<Vmin){
                    Min=J;
                    Vmin=((int)(Min.get_data()));
                }
                J=J.getNext();
            }
            int temp= Vmin;
            Min.set_data(((int)(I.get_data())));
            I.set_data(temp);
            I=I.getNext();
            J=I.getNext();
        }
        return list;
    }
    
    public Lista SelectionSortString(Lista list) throws IOException{
        Node I= list.getHead();
        Node J= I.getNext();
        Node Min;
        String Vmin;
        String Vj;
        for (int i=0; i<cuentaLista(list)-1; i++){
            Min=I;
            Vmin=((String)(Min.get_data()));
            for (int j=i+1; j<cuentaLista(list);j++){
                Vj=((String)(J.get_data()));
                if (Vj.compareTo(Vmin)<0){
                    Min=J;
                    Vmin=((String)(Min.get_data()));
                }
                J=J.getNext();
            }
            String temp= Vmin;
            Min.set_data(((String)(I.get_data())));
            I.set_data(temp);
            I=I.getNext();
            J=I.getNext();
        }
        return list;
    }
    
    public int cuentaLista(Lista list){
        int cont=0;
        Node temp=list.getHead();
        while(temp!=null){
            temp=temp.getNext();
            cont++;
        }
        return cont;
    }   
}
