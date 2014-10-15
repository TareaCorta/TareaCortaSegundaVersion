/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import logic.*;
import Node.*;
import java.io.IOException;

/**
 *
 * @author ellioth
 */
public class Facade {
    private final contador cont= new contador();
    float temp;
    public float comLString(Lista list, int NumOrdenamiento) throws IOException{
        temp=cont.contadorLString(list, NumOrdenamiento);
        return temp;
    }
    
    public float comLInt(Lista list, int NumOrdenamiento) throws IOException{
        temp=cont.contadorLInt(list, NumOrdenamiento);
        return temp;
    }
    
    public float comAString( String [] arreglo, int inicial, int fin, int NumOrdenamiento){
        temp=cont.contadorAString(arreglo, inicial, fin, NumOrdenamiento);
        return temp;
    }
    
    public float comAInt( int[] arreglo, int inicial, int fin, int NumOrdenamiento){
        temp=cont.contadorAInt(arreglo, inicial, fin, NumOrdenamiento);
        return temp;
    }
}
