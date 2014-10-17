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
public class generador {
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
   public String[] generadorArrString(int cantMax){
       String [] arreglo= new String[cantMax];
       for (int i=0; i<cantMax; i++){
           arreglo[i]=randomString(5,a);
       }
       return arreglo;
   }
   public int[] generadorArrInt(int cantMax){
       int [] arreglo = new int[cantMax];
       for(int i=0; i<cantMax; i++){
           arreglo[i]= rnd.nextInt(100000);
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
   
   public static void main(String [] agrs) throws IOException{
       generador nuevo = new generador();
       String [] arreglo = nuevo.generadorArrString(10000);
       contador cont = new contador ();
       double temp= cont.contadorAString(arreglo, 0, arreglo.length-1, 4);
       //orde.QuickSortString(arreglo, 0, arreglo.length-1);
       //for (int i=0; i<arreglo.length; i++){
       //    System.out.println(arreglo[i]);
       //}
   }
}
