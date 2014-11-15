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
public class Facade <T> {
    private final contador cont= new contador();
    float temp;
    
    public float comLis(Lista list, int NumOrdenamiento) throws IOException{
        temp=cont.contadorLis(list, NumOrdenamiento);
        return temp;
    }
    
    public float comA( T[] arreglo, int inicial, int fin, int NumOrdenamiento) throws InterruptedException{
        temp=cont.contadorA(arreglo, inicial, fin, NumOrdenamiento);
        return temp;
    }
}
