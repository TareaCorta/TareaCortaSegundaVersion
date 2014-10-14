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
public class insertSortL {
    public Lista InsertSortInt(Lista list) throws IOException{
        Node I= (list.getHead()).getNext();
        Node J= I.getPrev();
        for (int i=1; I!=null; i++){
            Node temp= I;
            int Vtemp= ((int)(temp.get_data()));
            int Vj=((int)(J.get_data()));
            for (int j=i-1; j>=0 && Vtemp<Vj ; j--){
                Node conte=J.getNext();
                conte.set_data(Vj);
                J=J.getPrev();
                if (J!=null){
                    Vj=((int)(J.get_data()));}
            }
            try{
                Node IO= J.getNext();
                IO.set_data(Vtemp);
            }catch(Exception e){
                Node cont= list.getHead();
                cont.set_data(Vtemp);
            }
            J=I;
            I=I.getNext();
        }
        return list;
    }
    
    public Lista InsertSortString(Lista list) throws IOException{
        Node I= (list.getHead()).getNext();
        Node J= I.getPrev();
        for (int i=1; I!=null; i++){
            Node temp= I;
            String Vtemp= ((String)(temp.get_data()));
            String Vj=((String)(J.get_data()));
            for (int j=i-1; j>=0 && Vtemp.compareTo(Vj)<0 ; j--){
                Node conte=J.getNext();
                conte.set_data(Vj);
                J=J.getPrev();
                if (J!=null){
                    Vj=((String)(J.get_data()));}
            }
            try{
                Node IO= J.getNext();
                IO.set_data(Vtemp);
            }catch(Exception e){
                Node cont= list.getHead();
                cont.set_data(Vtemp);
            }
            J=I;
            I=I.getNext();
        }
        return list;   
    } 
}
