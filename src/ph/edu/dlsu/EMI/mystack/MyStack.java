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
     private int NumItems;                 
     
     @SuppressWarnings("unchecked")
     public MyStack(){
         createList();
     }
     
     public void createList(){
           items = (E[])new Object[MAX_LIST]; 
           NumItems = 0;
     }

     public void push(E item) {
         NumItems++; 
         items[NumItems-1]=item;
     } 

     public E pop(){
        E result;
        result = items[NumItems-1];
        NumItems--;
        return result;
    } 

    public boolean isEmpty(){
           return NumItems == 0;          
    }
    public int size(){
        return NumItems;
    }
    public E top(){
        E item;
        item=items[NumItems-1];
        return item;
    } 
}