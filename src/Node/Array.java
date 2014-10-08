/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Node;

import java.util.ArrayList;

/**
 *
 * @author estadm
 */
public class Array <T>{
    private ArrayList<T> array;
    
    public Array(){
        array = new ArrayList();
    }
    public void llenar(){
        array.add((T) "Hola");
        array.add((T) (Integer) 23);
    }
    public void imprimir(){
        for (int i=0;i<array.size(); i++){
            System.out.println(array.get(i));
        }
    
    }
    public static void main(String[] args) {
        Array arreglo = new Array();
        arreglo.llenar();
        arreglo.imprimir(); 
    }
}
