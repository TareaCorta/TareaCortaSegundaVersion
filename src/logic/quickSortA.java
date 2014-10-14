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
public class quickSortA {
    
    public String[] QuickSortString(String[] A, int i, int j){
        int piv= i;
        int k = i;
        int r= j;
        while(k<r){
            if((A[k].compareTo(A[piv]))<=0){
                k++;
            }
            if((A[r].compareTo(A[piv]))>=0){
                r--;
            }
            if((A[r].compareTo(A[i])<0) && (A[k].compareTo(A[i])>0)){
                swapArregloString(A,k,r);
                k++;
                r--;
            }
        }
        swapArregloString(A,i,r);
        if (i<r-1){
            QuickSortString(A,i,r-1);
        }
        if (k+1<j){
            QuickSortString(A,r+1,j);
        }
        return A;
    }
    
    public void swapArregloString(String [] arreglo, int num1, int num2){
        String tmp= arreglo[num1];
        arreglo[num1]=arreglo[num2];
        arreglo[num2]=tmp;
    }
    
    public int[] QuickSortInt(int[] A,int i, int j){
        int piv= i;
        int k = i;
        int r= j;
        while(k<r){
            if(A[k]<=A[piv]){
                k++;
            }
            if(A[r]>=A[piv]){
                r--;
            }
            if(A[r]<A[i]&& A[k]>A[i]){
                swapArregloInt(A,k,r);
                k++;
                r--;
            }
        }
        swapArregloInt(A,i,r);
        if (i<r-1){
            QuickSortInt(A,i,r-1);
        }
        if (k+1<j){
            QuickSortInt(A,r+1,j);
        }
        return A;
    }
    
    public void swapArregloInt(int[] arreglo, int num1, int num2){
        int tmp= arreglo[num1];
        arreglo[num1]=arreglo[num2];
        arreglo[num2]=tmp;
    }
}
