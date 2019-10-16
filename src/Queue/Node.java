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
public class Node {

    private BinarySearch.Node node;
    private Node next;
    
    
    /**
     * @return the data
     */
    public BinarySearch.Node getNode() {
        return node;
    }

    /**
     * @param data the data to set
     */
    public void setData(BinarySearch.Node node) {
        this.node = node;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
