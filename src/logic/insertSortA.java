/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author jairo
 */
public class insertSortA <T>{
    
    public void selectionSortA(T[] arreglo,int tamaño){
        T tmp;
        try{
            for (int i = 1; i < tamaño; i++) {
                tmp = arreglo[i];
                for (int j = i - 1; j >= 0 && (Integer)arreglo[j] > (Integer)tmp; j--) {
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        catch(Exception e){
            for (int i = 1; i < tamaño; i++) {
                tmp = arreglo[i];
                for (int j = i - 1; j >= 0 && ((String)arreglo[j]).compareTo((String)tmp)>0; j--) {
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
    }
}
