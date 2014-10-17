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
 * Burbuja=1
 * insert=2
 * selection=3
 * quick=4
 * merge=5
 * radix=6
 * estos van a ser los numeros que tiene que tienen que ingresar
 * cuando se llama a la clase facade.
 * esta clase sirve para que despligue la cantidad en nanosegundos
 * que se demoro en hacer el ordenamiento.
 */
public class contador {
    private long contI=0;
    private long contF;
    private float total;
    public float contadorAString (String[] array, int num1, int num2, int clase){
        /**Burbuja=1
         * insert=2
         * selection=3
         * quick=4
         * merge=5
         * radix=6
         */
        if (clase==1){
            
        }
        if(clase==2){
            
        }
        if(clase==3){
            
        }
        if (clase==4){
            quickSortA quick = new quickSortA();
            contI= System.nanoTime();
            quick.QuickSortString(array, num1, num2);
        }
        if (clase==5){
            MergeSortA merge = new MergeSortA();
            contI= System.nanoTime();
            merge.mergeSortString(array, num1, num2);
        }
        if (clase==6){
            
        }
        contF= System.nanoTime();
        total= contF-contI;
        System.out.print(total);
        return total;
    }
    
    public float contadorAInt( int[] array, int num1, int num2, int clase){
        /**Burbuja=1
         * insert=2
         * selection=3
         * quick=4
         * merge=5
         * radix=6
         */
        if (clase==1){
            contI=System.nanoTime();
        }
        if(clase==2){
            contI=System.nanoTime();
        }
        if(clase==3){
            contI=System.nanoTime();
        }
        if (clase==4){
            quickSortA quick = new quickSortA();
            contI= System.nanoTime();
            quick.QuickSortInt(array, num1, num2);
        }
        if (clase==5){
            MergeSortA merge = new MergeSortA();
            contI= System.nanoTime();
            merge.mergeSortInt(array, num1, num2);
        }
        if (clase==6){
            contI=System.nanoTime();
        }
        contF= System.nanoTime();
        total= contF-contI;
        System.out.print(total);
        return total;
    }
    
    public float contadorLInt( Lista list , int clase) throws IOException{
        /**Burbuja=1
         * insert=2
         * selection=3
         * quick=4
         * merge=5
         * radix=6
         */
        if(clase==1){
            contI=System.nanoTime();
        }
        if(clase==2){
            insertSortL ISL= new insertSortL();
            contI=System.nanoTime();
            ISL.InsertSortInt(list);
        }
        if (clase==3){
            selectionsortL SSL = new selectionsortL();
            contI= System.nanoTime();
            SSL.SelectionSortInt(list);
        }
        if (clase==4){
            contI=System.nanoTime();
        }
        if (clase==5){
            contI=System.nanoTime();
        }
        if (clase==6){
            contI=System.nanoTime();
        }
        contF= System.nanoTime();
        total= contF-contI;
        System.out.print(total);
        return total;
    }
    
    public float contadorLString( Lista list, int clase) throws IOException{
        /**Burbuja=1
         * insert=2
         * selection=3
         * quick=4
         * merge=5
         * radix=6
         * estos van a ser los numeros que tiene que tienen que ingresar
         * cuando se llama a la clase facade.
         * 
         */
        if(clase==1){
            contI=System.nanoTime();
        }
        if(clase==2){
            insertSortL ISL= new insertSortL();
            contI=System.nanoTime();
            ISL.InsertSortInt(list);
        }
        if (clase==3){
            selectionsortL SSL = new selectionsortL();
            contI= System.nanoTime();
            SSL.SelectionSortInt(list);
        }
        if (clase==4){
            contI=System.nanoTime();
        }
        if (clase==5){
            contI=System.nanoTime();
        }
        if (clase==6){
            contI=System.nanoTime();
        }
        contF= System.nanoTime();
        total= contF-contI;
        System.out.print(total);
        return total;
        
    }

}
