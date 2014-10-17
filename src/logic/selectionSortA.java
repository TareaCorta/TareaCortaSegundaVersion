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
    public void llamar(){
        T[]años = (T[]) new Object[4];
        años[0]= (T)(Integer)100;
        años[1]=(T)(Integer)50;
        años[2]=(T)(Integer)101;
        años[3]=(T)(Integer)(10);
 
        selectionSortA bs = new selectionSortA();
        imprimir(años, años.length);
        bs.selectionSortA(años,4);
        imprimir(años,años.length);
    }
    public void imprimir(T[] arreglo,int lenght){
        System.out.println("imprimiendo");
        for(int i=0;i<=lenght-1;i++){
            System.out.println(arreglo[i]);
        }
        System.out.println("fin___________________- ");
    }
    public static void main(String[] args) {
        selectionSortA bs = new selectionSortA();
        bs.llamar();
        
        
    }
    
}
