/*
 * In this class, the lists are controlled.
 * 
 * Create 7/ 10 / 2014 at 00:15
 */

package Node;

/**
 *
 * @author Albin y Jairo
 */
public class Lista <T>{
    private Node _head;
    private Node _tail;
    
    public Lista (){
        this._head=null;
        this._tail=null;
    }
    /**
     * 
     * @param pData
     * Insert a new element in the list. 
     */
    public void insertHead(T pData){
       if(_head==null){
            _head =_tail= new Node(pData);
        }
        else{
            Node tmp = new Node(pData);
            tmp.setNext(_head);
            _head.setPrev(tmp);
            _head=tmp;
        }
    }
    /**
     * 
     * @param pData
     * Delete an element of the list. 
     */
    public void delete(T pData){ 
        boolean estado;
        estado= false;
        Node tmp = _head;
        
        if(_head == _tail){
               _head = _tail = null;
               estado= true;
        } 
        if (_head.get_data().equals(pData)){
            Node tmp2= _head;
            _head=_head.getNext();
            tmp2.setNext(null);
            _head.setPrev(null);
            estado=true;
        }
        if(_tail.get_data().equals(pData)&& estado==false){
               Node tmp2 = _tail;
               _tail= tmp2.getPrev();
               tmp2.setPrev(null);
               _tail.setNext(null);
               estado=true;
        }
                
        if (estado == false){
            while(tmp != null){
                if(tmp.get_data().equals(pData)){
                    tmp.getNext().setPrev(tmp.getPrev());
                    tmp.getPrev().setNext(tmp.getNext());
                    tmp.setPrev(null);
                    tmp.setNext(null);
                    tmp = null;
                }
                else{
                    tmp=tmp.getNext();
                }
            }
        }
    }
    /**
     * 
     * @param pdata
     * search an element in the list
     * @return true if the element is in the list, false if doesn't.
     */
    public boolean buscarEnLista(String pdata){
        Node tmp;
        tmp=_head;
        while ((tmp!= null)){
            if(tmp.get_data().equals(pdata)){
                return true;
            }
            else
                tmp=tmp.getNext();
        }
        return false;
    }
    public T getData(Node tmp){
        return (T) (tmp.get_data());
    }
    
    public void setData(Node tmp,T pdata){
        tmp.set_data(pdata);
    }
    
    public Node listaGetNext(Node tmp){
        tmp=tmp.getNext();
        return tmp;
    }
    
    public Node getHead(){
        return _head;
    }
    public void imprimir(){
        Node tmp=_head;
        while(tmp != null){
            System.out.println(tmp.get_data());
            tmp= tmp.getNext();
        }
    }
    public void setHead(Node head){
        _head= head;
    
    }
    public int length(){
       int cont =0;
       Node tmp = _head;
       while(tmp!= null){
           cont++;
           tmp = tmp.getNext();
       }
       return cont;
   }
}
