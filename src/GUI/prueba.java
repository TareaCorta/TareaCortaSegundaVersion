/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Node.Lista;
import Node.Node;

/**
 *
 * @author ellioth
 */
public class prueba {
    public static void main(String []agrs){
        Lista list = new Lista();
        list.insertHead("hola mundo");
        Node temp= list.getHead();
        System.out.println(temp.get_data());
    }
}
