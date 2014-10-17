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
public class mergeSortL <T>{
    /*public void MergeSort(Lista lista,int init,int end){
        System.out.println("enicio "+init+" fin"+end);
        Node Ninit = lista.getHead();
        Node Nend = lista.getHead();
        if(init==end)
            return;
        if(end-init==1){
            
            for(int i=0;i<init-1;i++){
                Ninit= Ninit.getNext();
            }
            for(int i=0;i<end-1;i++){
                Nend= Nend.getNext();
            }
            System.out.println((Integer)lista.getData(Nend)+" otro"+(Integer)lista.getData(Ninit));
            if((Integer)lista.getData(Nend)<(Integer)lista.getData(Ninit)){
                System.out.println("cambio");
                Swap(Ninit,Nend,lista);
                return;
            }
        }
        int mid=(init+end)/2;
        System.out.println(mid);
        if(mid-1>=init){
            MergeSort(lista, init,mid-1);
            MergeSort(lista,mid, end);
        }else
            return;   
    }*/
    public Lista MergeSort(Lista lista,int init,int end){
        if(init != end-1 && init <end){
            int med= (init+end)/2;
            MergeSort(lista, init,med-1);
            MergeSort(lista, med, end);
            
            lista= merge(lista,init,med-1,med,end);
            System.out.println("llamo");
        }
        return lista;
    }
    public Lista merge(Lista lista,int init1,int end1,int init2,int end2){
        mergeSortL ms = new mergeSortL();
        int i =0;
        int li=0;
        int ri=0;
        ri=init2;
        
        while(i<end2){
            if((li<(end1)) &&(ri<end2)){
                Node l1= lista.getHead();
                Node l2= lista.getHead();
                for(int z=0; z<li;z++){
                    l1=l1.getNext();
                }
                for(int w=0;w<ri;w++){
                    l2=l2.getNext();
                }
                System.out.println((int)lista.getData(l1)+"<"+(int)lista.getData(l2));
                if((int)lista.getData(l1)<(int)lista.getData(l2)){
                    i++;
                    li++;
                }
                else{
                    Swap(l1, l2, lista);
                    i++;
                    ri++;
                
                }
            }
            else
                i++;
        }  
        return lista;
    }
    public void Swap(Node a, Node b,Lista lista){
        if(a.getPrev()==null && b.getNext()==null){
            Node tmp= a.getNext();
            a.setNext(null);
            a.setPrev(b.getPrev());
            b.getPrev().setNext(a);
            b.setPrev(null);
            b.setNext(tmp);
            tmp.setPrev(b);
            lista.setHead(b);
        }
        else if(a.getPrev()==null){
            if(a.getNext()==b){
                Node tmp=b.getNext();
                a.setNext(tmp);
                tmp.setPrev(a);

                b.setNext(a);    
                b.setPrev(null);
                lista.setHead(b);
            }
            else{
                Node Nsiguiente= a.getNext();
                
                a.setNext(b.getNext());
                b.getNext().setPrev(a);
                a.setPrev(b.getPrev());
                b.getPrev().setNext(a);
                b.setPrev(null);
                b.setNext(Nsiguiente);
                lista.setHead(b);
            }
        }
        else if(b.getNext()==null){
            if(a.getNext()!= b){
                Node tmpa = a;
                Node tmpb = b;
                Node asiguiente= a.getNext();
                Node aanterior=a.getPrev();
                a.setNext(null);
                a.setPrev(b.getPrev());
                b.getPrev().setNext(a);
                b.setNext(asiguiente);
                asiguiente.setPrev(b);
                b.setPrev(aanterior);
                aanterior.setNext(b);
            }
            else{
                Node tmp= a.getPrev();
                a.setNext(null);
                a.setPrev(b);
                b.setNext(a);
                b.setPrev(tmp);
                tmp.setNext(b);
            
            }

        }
        else if(a.getNext()==b){
            Node tmp=a.getPrev();  
            a.setNext(b.getNext());
            b.getNext().setPrev(a);
            a.setPrev(b);
            b.setNext(a);
            b.setPrev(tmp.getPrev());
            tmp.setNext(b);
        
        }
        
        else{
            Node tmpb = b;
            Node asiguiente= a.getNext();
            Node aanterior=a.getPrev();
            a.setNext(tmpb.getNext());
            a.setPrev(tmpb.getPrev());
            tmpb.getNext().setPrev(a);
            tmpb.getPrev().setNext(a);
            tmpb.setNext(asiguiente);
            tmpb.setPrev(aanterior);
            tmpb.getNext().setPrev(tmpb);
            tmpb.getPrev().setNext(tmpb);
            
        }
    }
    public void llamar(){
        Lista lista = new Lista();
        lista.insertHead(12);
        lista.insertHead(23);
        lista.insertHead(8);
        lista.insertHead(9);
        lista.insertHead(2);
        lista.insertHead(21);
        lista.insertHead(20);
        
        lista.imprimir();
        mergeSortL bs = new mergeSortL();
        
        lista= bs.MergeSort(lista,0,7);
        //lista= bs.MergeSort(lista,0,7);
        System.out.println("hora de la verdad");
        lista.imprimir();
        /*Node a = lista.getHead();
        Node b = lista.getHead().getNext();
        Node c = lista.getHead().getNext().getNext();
        Node d = lista.getHead().getNext().getNext().getNext();
        Node e = lista.getHead().getNext().getNext().getNext().getNext();
        Node f = lista.getHead().getNext().getNext().getNext().getNext().getNext();
        Node g = lista.getHead().getNext().getNext().getNext().getNext().getNext().getNext();*/
    }
    public static void main(String[] args) {
        mergeSortL bs = new mergeSortL();
        bs.llamar();
        
        
    }
    
}
