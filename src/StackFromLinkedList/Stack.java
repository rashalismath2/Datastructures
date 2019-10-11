/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackFromLinkedList;

/**
 *
 * @author Ismath
 */
public class Stack {
    Node head;
    
    public void Push(char data){
        if(head==null) {
            head=new Node();
            head.setData(data);
        }
        else{
            Node tmp=new Node();
            tmp.setNext(head);
            tmp.setData(data);
            head=tmp;
        }
    }
    
    public void Pop(){
        if(head==null){return;}
        
        if(head.getNext()==null){head=null;}
        else{
            Node temp=head;
            head=temp.getNext();
            temp=null;
        }
    }
    
    public void PrintAll(){
        Node tmp=head;
        while(tmp.getNext()!=null){
            System.out.print(tmp.getData()+" ");
            tmp=tmp.getNext();
        }
        System.out.print(tmp.getData());
    }
}
