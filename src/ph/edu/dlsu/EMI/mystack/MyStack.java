/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mystack;
import acm.program.*;
import acm.util.*;


public class MyStack<E>{

     private final int MAX_LIST =1000000;     
     private E[] items;                     
     private int numItems;                 
     
     @SuppressWarnings("unchecked")
     public MyStack(){
         createList();
     }
     
     public void createList(){
           items = (E[])new Object[MAX_LIST]; 
           numItems = 0;
     }

     public void push(E item) {
         numItems++; 
         items[numItems-1]=item;
     } 

     public E pop(){
        E result;
        result = items[numItems-1];
        numItems--;
        return result;
    } 

    public boolean isEmpty(){
           return numItems == 0;          
    }
    public int size(){
        return numItems;
    }
    public E top(){
        E item;
        item=items[numItems-1];
        return item;
    } 
    public E get(int index){
        E item;
        item = items[index-1];
         return item;
    }
    public void remove(int index){
        for(int i =index -1 ; i<numItems - 1;i++){
            items[i]=items[i+1];
            
        }
        numItems--;
    }
}