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
public class contador <T> {
    private long contI=0;
    private long contF;
    private float total;
  
    public float contadorA( T[] array, int num1, int num2, int clase){
        /**Burbuja=1
         * insert=2
         * selection=3
         * quick=4
         * merge=5
         * radix=6
         */
        if (clase==1){
            bubbleSortA burbuja = new bubbleSortA();
            contI=System.currentTimeMillis();
            burbuja.Bsort(array, array.length);
        }
        //else if(clase==2){
        //    contI=System.currentTimeMillis();
        //}
        else if(clase==3){
            selectionSortA select= new selectionSortA();
            contI=System.currentTimeMillis();
            select.selectionSortA(array, array.length);
        }
        else if (clase==4){
            quickSortA quick = new quickSortA();
            contI= System.currentTimeMillis();
            quick.QuickSort(array, num1, num2);
        }
        else if (clase==5){
            MergeSortA merge = new MergeSortA();
            contI= System.currentTimeMillis();
            merge.mergeSort(array);
        }
        /*else if (clase==6){
            contI=System.currentTimeMillis();
        }*/
        contF= System.currentTimeMillis();
        total= Math.abs(contF-contI);
        return total;
    }
    
     public float contadorLis( Lista list , int clase) throws IOException{
        /**Burbuja=1
         * insert=2
         * selection=3
         * quick=4
         * merge=5
         * radix=6
         *
        *if(clase==1){
            contI=System.currentTimeMillis();
        }*/
        if(clase==2){
            insertSortL ISL= new insertSortL();
            contI=System.currentTimeMillis();
            ISL.InsertSort(list);
        }
        else if (clase==3){
            selectionsortL SSL = new selectionsortL();
            contI= System.currentTimeMillis();
            SSL.SelectionSort(list);
        }
        //else if (clase==4){
        //    contI=System.currentTimeMillis();
        //}
        else if (clase==5){
            mergeSortL merge = new mergeSortL();
            selectionsortL sel= new selectionsortL();
            contI=System.currentTimeMillis();
            merge.MergeSort(list, 0, sel.cuentaLista(list));
        }
        //else if (clase==6){
        //    contI=System.currentTimeMillis();
        //}
        contF= System.currentTimeMillis();
        total=  Math.abs(contF-contI);
        return total;
    }
    
}
