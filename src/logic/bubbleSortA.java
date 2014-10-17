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
                System.out.println("aquei");
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
                    System.out.println((String)arreglo[i+1]);
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
    @SuppressWarnings("empty-statement")
    public void llamar(){
        T[]años = (T[]) new Object[4];
        años[0]= (T)"zxccv";
        años[1]=(T)"weer";
        años[2]=(T)"hffr";
        años[3]=(T)"asdd";
        
        
        
        bubbleSortA bs = new bubbleSortA();
        imprimir(años, años.length);
        bs.Bsort(años,4);
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
        bubbleSortA bs = new bubbleSortA();
        bs.llamar();
        
        
    }
    
}
