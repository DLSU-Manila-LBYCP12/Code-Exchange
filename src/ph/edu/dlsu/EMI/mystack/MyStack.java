/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mystack;
import java.util.NoSuchElementException;
import ph.edu.dlsu.EMI.myinterface.Stack;

/**
 *
 * @author student
 */
public class MyStack<Item>  implements Stack<Item>{
    private static final int MAX_SIZE = 100;
    private Node<Item> first;     // top of stack
    private int n;                // size of the stack

    @Override
    public int size() {
        return n;}

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty stack.
     */
    public MyStack() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if this stack is empty.
     *
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }
    public boolean full() {
        return n>=100;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return the number of items in this stack
     */
    

    /**
     * Adds the item to this stack.
     *
     * @param  item the item to add
     */
    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Removes and returns the item most recently added to this stack.
     *
     * @return the item most recently added
     * @throws NoSuchElementException if this stack is empty
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }


    /**
     * Returns (but does not remove) the item most recently added to this stack.
     *
     * @return the item most recently added to this stack
     * @throws NoSuchElementException if this stack is empty
     */
    public Item top() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @param args
     * @return the sequence of items in this stack in LIFO order, separated by spaces
     */
    public String toString(){
        MyStack<Item> tempStack = new MyStack<>();
        String temp="{Top: ";
        while(size()!=1){
            temp+= top() +", ";
            tempStack.push(pop());
        }
        temp += top() + "}";
        while(!tempStack.isEmpty()){
            push(tempStack.pop());
        }
        
        
        return temp;
    }
       

  
    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        
    }
    
}
