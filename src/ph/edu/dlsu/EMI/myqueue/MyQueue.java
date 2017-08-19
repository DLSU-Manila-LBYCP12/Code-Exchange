/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.myqueue;
import java.awt.Color;
import ph.edu.dlsu.EMI.myinterface.Queue;

/**
 *
 * @author Rivera
 * @param <Item>
 */
public class MyQueue<Item> implements Queue<Item>{
    //create by Maverick C. Rivera for the Subject LBYCP12
    //for the purpose of the program only, there is no return for dequeue 
    //because dequed data is not needed anywhere else
    public static final int MAX_SIZE =50;
    private int numItems=0;
    private Item[] data ;
    private int qRear;
    
    public MyQueue(){
        data = (Item[])new Object[MAX_SIZE]; 
        numItems=0;
        qRear=0;
    }
    public void enQueue(Item item){
        data[qRear]=item;
        qRear++;
        numItems++;
    }
    public Item deQueue(){
       if(!isEmpty()){
        qRear--;
         Item temp = data[0];
        numItems--;
        //move all the data
        for(int i=0;i<numItems;i++){
            data[i]=data[i+1];
        }
        System.out.println("Dequeued");
        return temp;
       }else{
           System.out.println("List Empty Exception!");
           return null;
       }
    }
    public boolean isEmpty(){
        return numItems == 0;
    }
    public boolean isFull(){
        return numItems == MAX_SIZE;
    }
    public int size(){
        return numItems;
    }
    public void remove(Item item){
        for(int i=0;i<size();i++){
        if(item.equals(data[i])){
            remove(i);
            return;
        }
        }
            
            
    }
    public Item get(int index){
        return data[index];
    }
    public void remove(int index){
        for(int i =index;i< size();i++){
            data[i]=data[i+1];
            
        }
        numItems --; 
    }
}
