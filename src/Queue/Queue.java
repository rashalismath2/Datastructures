/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Ismath
 */
public class Queue {
    private Node front=null;
    private Node rare=null;
    
    public void Enque(BinarySearch.Node root){
        
        if(front==null && rare==null){
            Node tmp=new Node();
            rare=front=tmp;
            tmp.setData(root);
        }
        else if(front==rare){
            Node tmp=new Node();
            tmp.setData(root);
            front.setNext(tmp);
            rare=tmp;
        }
        else{
            Node tmp=new Node();
            tmp.setData(root);
            rare.setNext(tmp);
            rare=tmp;
        }
     
        
    }
    public boolean IsEmpty(){
        if(front==null && rare ==null){
            return true;
        }
        return false;
    }
    
    public void Deque(){
     
        if(front==null && rare==null){return;}
        else if(front==rare){
            front=rare=null;
        }
        else{
            Node tmp=front;
            front=front.getNext();
            tmp=null;
        }
        
    }
    
    public void list(){
//        while(getFront().getRight()!=null){
//            System.out.print(getFront().getData());
//            front=getFront().getRight();
//        }
//        System.out.print(getFront().getData());
    }

    /**
     * @return the front
     */
    public Node getFront() {
        return this.front;
    }

    /**
     * @return the rare
     */
    public Node getRare() {
        return this.rare;
    }
}
