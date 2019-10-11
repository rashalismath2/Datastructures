/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackFromDynamicArray;

/**
 *
 * @author Ismath
 */
public class Stack {
    private int top=-1;
    private int[] arr=new int[5];
    
    public void Push(int data){
        if(top==arr.length-1){
            int[] temp=new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            arr=temp;
        }
        else{
            top++;
            arr[top]=data;}
    }
    
    public void Pop(){
        if(top==-1){return ;}
        else{
            top--;
        }
    }
    
    public void print(){
        System.out.println("New Array length: "+arr.length);
        for(int i :arr){
            System.out.print(arr[i]+" ");
        }
    }
    
}
