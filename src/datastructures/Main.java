/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import BinarySearch.Bst;
import BinarySearch.Node;
import Queue.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 *
 * @author Ismath
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bst bst=new Bst();
  
        Node root=bst.Insert(null, 100);
        bst.Insert(root, 90);
        bst.Insert(root, 80);
        bst.Insert(root, 70);
        bst.Insert(root, 60);
        bst.Insert(root, 50);
          bst.Insert(root, 120);
//        bst.Search(root,50);
        
//        System.out.println(bst.min(root));
//        System.out.println(bst.Height(root));
        
bst.BreadthFirst(root);
        
        
    }
}
