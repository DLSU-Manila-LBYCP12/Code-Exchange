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


public interface Queue<E>{


  


  public void enQueue( E item) throws ListIndexOutOfBoundsException, ListFullException; 
// precondition: the queue is not full
// postcondition: Insert item at the end of the queue


public E deQueue() throws ListIndexOutOfBoundsException;
// precondition: the queue is not empty
//postcondition: returns the item at the top of the stack and removes it from the stack
 



 public boolean isEmpty(); 
// precondition: none
// postcondition: Determine if a queue is empty


public boolean isFull();
//precondition: none
//postcondition: determines if the queue is full




public int size();  
// precondition: none
// postcondition: Returns number of items in the queue
 
}