/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import datastructures.DoublyLinkedList.DoublyLinkedList;

/**
 *
 * @author Ismath
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    DoublyLinkedList list=new DoublyLinkedList();
    list.InsertAtStart(5);
    list.InsertAtStart(6);
    
    list.ShowAll();
       list.InsertAtStart(7);
        list.ShowAll();
    list.ReverseAll();
        list.ShowAll();
     list.InsertAtStart(4);
     list.ShowAll();
        list.ReverseAll();
          list.ShowAll();
    }
    
}
