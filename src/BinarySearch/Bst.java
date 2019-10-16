/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import Queue.Queue;
import Queue.Node;


/**
 *
 * @author Ismath
 */
public class Bst {
    
    public void BreadthFirst(BinarySearch.Node root){
        Queue q=new Queue();
        q.Enque(root);
        
        while(!q.IsEmpty()){
            Node front=q.getFront();
            System.out.println(front.getNode().getData());
            if(front.getNode().getLeft()!=null){q.Enque(front.getNode().getLeft());}
            if(front.getNode().getRight()!=null){q.Enque(front.getNode().getRight());}
            q.Deque();
        }
        
    }
    
    public int Height(BinarySearch.Node root){
        
        if(root==null){
        return -1;
        }
        
        int heightLeft=Height(root.getLeft());
        int heightRight=Height(root.getRight());
       
        return Math.max(heightLeft,heightRight)+1;
    }
    
    public int min(BinarySearch.Node root){
        if(root.getLeft()==null) {
            return root.getData();
        };
        BinarySearch.Node tmp=root;
        while(tmp.getLeft()!=null){
            tmp=tmp.getLeft();
        }
        return tmp.getData();
    }

    public BinarySearch.Node Insert(BinarySearch.Node root,int data){
        
        if(root==null){
            root=new BinarySearch.Node();
            root.setData(data);
            return root;
        }
        else if(data<=root.getData()){
            root.setLeft(Insert(root.getLeft(),data));
        }
        else if(root.getData()<data){
            root.setRight(Insert(root.getRight(),data));
        }
        
        return root;
    }
    
    public boolean Search(BinarySearch.Node root,int data){
        
        if(root==null){return false;}
        else if(root.getData()==data){
            System.out.println("root");
            return true;
        }
        else if(data<=root.getData()){
            System.out.println("going to left "+root.getData());
            Search(root.getLeft(),data);
        }
        else if(data>=root.getData()){
            System.out.println("going to right "+root.getData());
            Search(root.getRight(),data);
        }
        
        return false;
    }
    
}
