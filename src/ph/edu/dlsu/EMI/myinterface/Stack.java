/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.myinterface;

import ph.edu.dlsu.EMI.myexception.ListFullException;
import ph.edu.dlsu.EMI.myexception.ListIndexOutOfBoundsException;

/*
 * File: List.java
 * ------------------
 * This is the List ADT definition  
 */


public interface Stack<E>{


  


  public void push( E item) throws ListIndexOutOfBoundsException, ListFullException; 
// precondition: the stack is not full
// postcondition: Insert item at the top of the stack


public E pop() throws ListIndexOutOfBoundsException;
// precondition: the stack is not empty
//postcondition: returns the item at the top of the stack and removes it from the stack
 



 public boolean isEmpty(); 
// precondition: none
// postcondition: Determine if the stack is empty







public int size();  
// precondition: none
// postcondition: Returns number of items in a list
 
}