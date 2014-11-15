/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import Node.Lista;
import Node.Node;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author ellioth
 */
public class generador <T>{
   private Random rnd = new Random();
   private String[] a= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
   public Lista generadorListString(int cantMax) throws IOException{
       Lista list = new Lista();
       for(int i=0; i<cantMax; i++){
        list.insertHead(randomString(5,a));
       }
       return list;
   }
   public Lista generadorListInt(int cantMax)throws IOException{
       Lista list = new Lista();
       int i=0;
       while (i<cantMax){
        list.insertHead(rnd.nextInt(100000));
        i++;
       }
       return list;
   }
   public T[] generadorArrString(int cantMax){
       T [] arreglo= (T[]) new Object[cantMax];
       for (int i=0; i<cantMax; i++){
           arreglo[i]=(T)randomString(5,a);
       }
       return arreglo;
   }
   public T[] generadorArrInt(int cantMax){
       T [] arreglo =(T[]) new Object[cantMax];
       for(int i=0; i<cantMax; i++){
           arreglo[i]= (T)((Integer)rnd.nextInt(cantMax));
       }
       return arreglo;
   }
   public String randomString(int cantMax, String[] arreglo){
       String palabra="";
       for (int i=0; i<cantMax; i++){
           palabra+=arreglo[rnd.nextInt(arreglo.length)];
       }
       return palabra;
   }   
}
