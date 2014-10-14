/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author ellioth
 */
public class MergeSortA {
    private final quickSortA nuevo= new quickSortA();
    public String[] mergeSortString( String[] arreglo, int inicio, int fin){
        
        return arreglo;
    }
    
    public int [] mergeSortInt(int [] arreglo, int inicio, int fin){
        if (inicio==fin)
            return arreglo;
        if (fin-inicio==1){
            if (arreglo[fin]<arreglo[inicio]){
                nuevo.swapArregloInt(arreglo, fin, inicio);
            }
            return arreglo;
        }
        int mid =(inicio+fin)/2;
        if(mid-inicio>=1){
            mergeSortInt(arreglo,inicio,mid-1);
        }
        if (fin-mid>=1){
            mergeSortInt(arreglo,mid,fin);
        }
        return arreglo;
    }
    
    public static void main(String [] args){
        int [] A={1,5,8,2,3,7};
        MergeSortA nue= new MergeSortA();
        long contI = System.currentTimeMillis();
        nue.mergeSortInt(A, 0, A.length);
        long contF = System.currentTimeMillis();
        double total= contF-contI;
        System.out.print(total);
        
    }
    
}
