/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;
import Node.Lista;
import Node.Node;

/**
 *
 * @author estadm
 */
public class bubbleSortA<T>{
    public void Bsort(T[] arreglo, int n){
        boolean flag=true;
        int tam_counter = n;
        while(flag){
            flag=false;
            try {
                for(int i=0; i<tam_counter-1;i++){
                    if((Integer)arreglo[i] > (Integer)arreglo[i+1]){
                        flag=true;
                        T tmp = arreglo[i];
                        arreglo[i]=arreglo[i+1];
                        arreglo[i+1]=tmp;
                    }
                }
                tam_counter--;
            } 
            catch (Exception e) {
                for(int i=0; i<tam_counter-1;i++){
                    int valor = ((String)arreglo[i]).compareTo((String)arreglo[i+1]);
                    if( valor > 0){
                        flag=true;
                        T tmp = arreglo[i];
                        arreglo[i]=arreglo[i+1];
                        arreglo[i+1]=tmp;
                    }
                }
                tam_counter--;
            }
            
        }
    }
    
}
