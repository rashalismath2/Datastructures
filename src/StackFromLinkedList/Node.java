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
public class Node {
    private char data;
    private Node next;

    /**
     * @return the data
     */
    public char getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(char data) {
        this.data = data;
    }

    /**
     * @return the node
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param node the node to set
     */
    public void setNext(Node node) {
        this.next = node;
    }
}
