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
public class quickSortA <T>{
    
    public T[] QuickSort(T[] A, int i, int j){
        int piv= i;
        int k = i;
        int r= j;
        while(k<r){
            try{
            if((((String)A[k]).compareTo((String)A[piv]))<=0){
                k++;
            }
            if((((String)A[r]).compareTo((String)A[piv]))>=0){
                r--;
            }
            if((((String)A[r]).compareTo((String)A[i])<0) && (((String)A[k]).compareTo((String)A[i])>0)){
                swapArreglo(A,k,r);
                k++;
                r--;
            }
            }catch(Exception e){
                if((Integer)A[k]<=(Integer)A[piv]){
                k++;
                }
                if((Integer)A[r]>=(Integer)A[piv]){
                    r--;
                }
                if(((Integer)A[r])<((Integer)A[i]) && ((Integer)A[k])>((Integer)A[i])){
                    swapArreglo(A,k,r);
                    k++;
                    r--;
                }
            }
        }
        swapArreglo(A,i,r);
        if (i<r-1){
            QuickSort(A,i,r-1);
        }
        if (k+1<j){
            QuickSort(A,r+1,j);
        }
        return A;
    }
    
    public void swapArreglo(T[] arreglo, int num1, int num2){
        T tmp= arreglo[num1];
        arreglo[num1]=arreglo[num2];
        arreglo[num2]=tmp;
    }
    
   
}
