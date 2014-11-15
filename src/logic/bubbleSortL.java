/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;
import Node.*;
import java.io.IOException;
/**
 *
 * @author jairo
 */
public class bubbleSortL {
    public bubbleSortL(){
        
    }
    
    public void bubbleSortA (Lista lista){
        try{
            ordenarInt(lista);
        }
        catch (Exception e) {
            ordenarStr(lista);
        }
        
    }
    
    private boolean estanOrdenadosInt(Lista lista){
        boolean cond=true;
        Node tmp=lista.getHead();
        while(tmp.getNext()!=null){
            if ((int)tmp.get_data()>(int)tmp.getNext().get_data()){
                cond=false;
                break;
            }
            else
                tmp=tmp.getNext();
        }
        return cond;
    }
    public boolean estanOrdenadosStr(Lista lista){
        boolean cond=true;
        Node tmp=lista.getHead();
        while(tmp.getNext()!=null){
            if (((String)lista.getHead().get_data()).compareTo((String)lista.getHead().getNext().get_data())>0){
                cond=false;
                break;
            }
            else
                tmp=tmp.getNext();
        }
        return cond;
    }
    
    private Lista ordenarInt(Lista lista){
        if(estanOrdenadosInt(lista)==true)
                return lista;
        if (lista.length()<=2){            
            Node tmp =lista.getHead();
            Node tmp2;
            tmp2=tmp.getNext();
            lista.setHead(tmp2);
            lista.getHead().setNext(tmp);
            tmp.setPrev(lista.getHead());
            tmp.getNext().setPrev(null);
            tmp.setNext(null);
            return lista;
        }
        else
            return ordenarIntAux(lista);
    }
    
    private Lista ordenarIntAux(Lista lista){
        Node tmp =lista.getHead();
        Node tmp2;
        while(estanOrdenadosInt(lista)==false){
            if (tmp.getNext()==null)
                return ordenarIntAux(lista);
            if (tmp.getNext().getNext()==null && (int)tmp.get_data()>(int)tmp.getNext().get_data()){
                tmp2=tmp.getNext();
                tmp.getNext().setPrev(null);
                tmp.setNext(null);
                tmp.getPrev().setNext(tmp2);
                tmp.getPrev().getNext().setPrev(tmp.getPrev());
                tmp.getPrev().getNext().setNext(tmp);
                tmp.setPrev(tmp.getPrev().getNext()); 
                if(estanOrdenadosInt(lista)==false)
                    return ordenarIntAux(lista);
                else
                    break;
            }
            if (tmp.getPrev()==null && (int)tmp.get_data()>(int)tmp.getNext().get_data()){
                tmp2=tmp.getNext();
                tmp.setNext(tmp.getNext().getNext());
                tmp.getNext().getPrev().setNext(null);
                tmp.getNext().getPrev().setPrev(null);
                tmp.getNext().setPrev(tmp);
                tmp2.setNext(tmp);
                tmp.setPrev(tmp2);
                lista.setHead(tmp2);
            }
            if ((int)tmp.get_data()>(int)tmp.getNext().get_data()){
                tmp2=tmp.getNext();
                tmp.setNext(tmp.getNext().getNext());
                tmp.getNext().getPrev().setNext(null);
                tmp.getNext().getPrev().setPrev(null);
                tmp.getNext().setPrev(tmp);
                tmp.getPrev().setNext(tmp2);
                tmp.getPrev().getNext().setPrev(tmp.getPrev());
                tmp.getPrev().getNext().setNext(tmp);
                tmp.setPrev(tmp.getPrev().getNext());
                tmp=tmp.getNext();
            }
            else
                tmp=tmp.getNext();
        }
        return lista;        
    }
    private Lista ordenarStr(Lista lista){
        if(estanOrdenadosStr(lista)==true)
                return lista;
        if (lista.length()<=2){            
            Node tmp =lista.getHead();
            Node tmp2;
            tmp2=tmp.getNext();
            lista.setHead(tmp2);
            lista.getHead().setNext(tmp);
            tmp.setPrev(lista.getHead());
            tmp.getNext().setPrev(null);
            tmp.setNext(null);
            return lista;
        }
        else
            return ordenarStrAux(lista);
    }
    private Lista ordenarStrAux(Lista lista){
        Node tmp =lista.getHead();
        Node tmp2;
        while(estanOrdenadosStr(lista)==false){
            if (tmp.getNext()==null)
                return ordenarStrAux(lista);
            if (tmp.getNext().getNext()==null && ((String)tmp.get_data()).compareTo((String)tmp.getNext().get_data())>0){
                tmp2=tmp.getNext();
                tmp.getNext().setPrev(null);
                tmp.setNext(null);
                tmp.getPrev().setNext(tmp2);
                tmp.getPrev().getNext().setPrev(tmp.getPrev());
                tmp.getPrev().getNext().setNext(tmp);
                tmp.setPrev(tmp.getPrev().getNext()); 
                if(estanOrdenadosInt(lista)==false)
                    return ordenarStrAux(lista);
                else
                    break;
            }
            if (tmp.getPrev()==null && ((String)tmp.get_data()).compareTo((String)tmp.getNext().get_data())>0){
                tmp2=tmp.getNext();
                tmp.setNext(tmp.getNext().getNext());
                tmp.getNext().getPrev().setNext(null);
                tmp.getNext().getPrev().setPrev(null);
                tmp.getNext().setPrev(tmp);
                tmp2.setNext(tmp);
                tmp.setPrev(tmp2);
                lista.setHead(tmp2);
            }
            if (((String)tmp.get_data()).compareTo((String)tmp.getNext().get_data())>0){
                tmp2=tmp.getNext();
                tmp.setNext(tmp.getNext().getNext());
                tmp.getNext().getPrev().setNext(null);
                tmp.getNext().getPrev().setPrev(null);
                tmp.getNext().setPrev(tmp);
                tmp.getPrev().setNext(tmp2);
                tmp.getPrev().getNext().setPrev(tmp.getPrev());
                tmp.getPrev().getNext().setNext(tmp);
                tmp.setPrev(tmp.getPrev().getNext());
                tmp=tmp.getNext();
            }
            else
                tmp=tmp.getNext();
        };
        return lista;        
    }
}