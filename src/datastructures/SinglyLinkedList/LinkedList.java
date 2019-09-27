/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.SinglyLinkedList;

/**
 *
 * @author Ismath
 */
public class LinkedList {
   
    //Head node
   public Node head;
    
   public void Insert(int data){
       
       //create a new node
       Node newNode=new Node();
       newNode.setData(data);
       newNode.setNext(null);
       
       //if head is not found this node is the head
       if(head==null){
           head=newNode;
       }else{ //if theres is a head already
           //start from the head
           Node n=head;
           //go all the way upto last node which valaue is null
           while(n.getNext()!=null){
               n=n.getNext();
           }
           // and assign its next as new node
           n.setNext(newNode);
       }
   }
   
   public void Show (){
       Node n=head;
       while(n.getNext()!=null){
           System.out.print(n.getData()+",");
           n=n.getNext();
       }
       System.out.println(n.getData());
   }
   
   public void InsertAtStart(int data){
       
       Node newNode=new Node();
       newNode.setData(data);
       //set new nodes next as heads address
       newNode.setNext(head);
       //make new node as the head
       head=newNode;
   }
   
   public void InsertAt(int index,int data){
       
       Node n=head;
       
       Node newNode=new Node();
       newNode.setData(data);
       
       if(index==0){
           this.InsertAtStart(data);
       }
       else{
           //go until node before the index value
            for(int i=0;i<index-1;i++){
                n=n.getNext();
            }
            //set new nodes next value as the address of node before the index
            newNode.setNext(n.getNext());
            //set next value of node before index as new node
            n.setNext(newNode);
       }
   }
   
   public void DeleteAt(int index){
       if(index==0){
           head=head.getNext();
       }else{
           Node n=head;
           for(int i=0;i<index-1;i++){
               n=n.getNext();
           }
           //get a temp node 
           Node tempNode=null;
           //get temp node as node after the index
           tempNode=n.getNext();
           //set next value of node before index as tempnodes next value
           n.setNext(tempNode.getNext());
       }
   }
   
   public void Reverse(){
       Node next;
       Node prev=null;
       Node current=head;
       
       while(current.getNext()!=null){
           next=current.getNext();
           current.setNext(prev);
           prev=current;
           current=next;
       }
       current.setNext(prev);
       head=current;
       
   }
   
   public void ShowRecursive(Node head){
      
          if(head.getNext()==null){return;}
       head=head.getNext();
       ShowRecursive(head);
        System.out.println(head.getData());
   }
   
   public void ReverseRecursive(Node head){
       if(head.getNext()==null){
           this.head=head;
           return;
       }
       
       ReverseRecursive(head.getNext());
       Node q=head.getNext();
       q.setNext(head);
       head.setNext(null);
   }
   
   
}
