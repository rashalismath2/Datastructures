/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.DoublyLinkedList;

/**
 *
 * @author Ismath
 */
public class DoublyLinkedList {
    Node head;
    
    public void InsertAtStart(int data){
        
        if(this.head==null){
            head=new Node();
            head.setData(data);
            head.setPrevious(null);
            head.setNext(null);
        }else{
            Node temp=new Node();
            temp.setNext(head);
            head.setPrevious(temp);
            temp.setData(data);
            temp.setPrevious(null);
            head=temp;
        }
    }
    
    public void ShowAll(){
        Node temp=head;

        while(temp.getNext()!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.print(temp.getData()+"\n");
    }
    
    public void ReverseAll(){
       Node current=head;
       Node next;

        while(current.getNext()!=null){
            next=current.getNext();
            current.setNext(current.getPrevious());
            current.setPrevious(next);

            current=next;
        }
        current.setNext(current.getPrevious());
        head=current;
        
    }
}
