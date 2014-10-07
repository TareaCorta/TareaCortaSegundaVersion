/*
 * Class Node, in this class, will stand everything about the creation of lists.
 *
 * Creado el 06 / 10 / 2014, 23:33.
 */

package Node;

/**
 *
 * @author Albin y Jairo
 */
public class Node <T>{
    /** Private constants to the dates */
    private T _data;
    private Node _next;
    private Node _prev;
     
    public Node (T pdata){
        this._data=pdata;           
    }
    /**
     * 
     * @return the previous element
     */
    public Node getPrev(){
        return _prev;
    }  
    /**
     * 
     * @return the actual element
     */
    public T get_data (){
            return _data;
    }
    /**
     *  
     * @return the next element
     */
    public Node getNext (){
            return _next;
    }
    /**
     * 
     * @param prev, edit the previous element 
     */
    public void setPrev (Node prev){
        this._prev=prev;
    }
    /**
     * 
     * @param pdata, edit the actual element 
     */
    public void set_data(T pdata){
        _data=pdata;
    }
    /**
     * 
     * @param next, edit the next element 
     */
    public void setNext (Node next){
        this._next=next;
    }
    
}
