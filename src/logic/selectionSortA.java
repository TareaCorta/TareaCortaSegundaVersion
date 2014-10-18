/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author estadm
 */
public class selectionSortA <T>{
    public void selectionSortA(T[] arreglo,int tamaño){
        int tmp;
        for(int i=0;i<tamaño;i++){
            tmp=i;
            for(int j=i+1;j<tamaño;j++){
                try {
                    if((Integer)arreglo[j]<(Integer)arreglo[tmp]){
                        tmp=j;
                    }
                    
                } 
                catch (Exception e) {
                    int valor = ((String)arreglo[j]).compareTo((String)arreglo[tmp]);
                    if(valor<0){
                        tmp=j;   
                    }
                }
                
                
            }
            swap(tmp,i,arreglo);
        }
    
    
    }
    public T[] swap(int primer, int segundo, T[] arreglo){
        T tmp= arreglo[segundo];
        T tmp2 = arreglo[primer];
        arreglo[segundo]=tmp2;
        arreglo[primer]=tmp;
        return arreglo;
    }    
}
