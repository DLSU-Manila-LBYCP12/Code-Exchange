/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 * File: MyList.java
 * ------------------
 * This is the List ADT implementation
 */
package ph.edu.dlsu.EMI.myarraylist;

import acm.program.*;
import acm.util.*;
import ph.edu.dlsu.EMI.myexception.ListFullException;
import ph.edu.dlsu.EMI.myexception.ListIndexOutOfBoundsException;
import ph.edu.dlsu.EMI.myinterface.List;


public class MyList<E> implements List<E>{

     /// private data fields
     private final int MAX_LIST = 10;     // max length of list
     private E[] items;                     // array of list items
     private int NumItems;                  // current size of list

     /// list items are already allocated above with T items[MAX_LIST]
     @SuppressWarnings("unchecked")
     public MyList(){
         createList();
     }
     public void createList(){
           items = (E[])new Object[MAX_LIST]; 
           NumItems = 0;
     }

     public void add(int index, E item) throws ListIndexOutOfBoundsException, ListFullException{
          if ( index > 0 && index <= NumItems + 1){
               if (NumItems == MAX_LIST){
                    throw new ListFullException("ERROR: List Already Full"); 
               }  
               else { // insert the element
                    int j = NumItems;
                    while(j >= index){
                        items[j] = items[j - 1];
                        j--; 
                    }
                    items[index-1] = item; 
                    NumItems++;
               }
          }
          else
            throw new ListIndexOutOfBoundsException("ERROR: List Index Out Of Bounds");
     } 
     public void add(E item){
          if (NumItems == MAX_LIST){
                    throw new ListFullException("ERROR: List Already Full"); 
               }  else {
              items[NumItems]=item;
              NumItems++;
          }
          
     }

     public void delete(int index) throws ListIndexOutOfBoundsException{
          if ( index > 0 && index <= NumItems){
                    for(int i = index; i < NumItems; i++){
                        items[i-1] = items[i];
                    }
                    NumItems--;
              }
          else
            throw new ListIndexOutOfBoundsException("ERROR: List Index Out Of Bounds");
    } 

    public boolean isEmpty(){
           return NumItems == 0;          
    }

    public E get(int index) throws ListIndexOutOfBoundsException{
         if ( index > 0 && index <= NumItems){
             return items[index-1];
         }
          else
            throw new ListIndexOutOfBoundsException("ERROR: List Index Out Of Bounds");
    }

    public int size(){
           return NumItems;
    }
    public boolean contains(E item){
        for(int i = 0 ;i < NumItems;i++){
            if(item == items[i]){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E item){
        for(int i = 0 ;i < NumItems;i++){
            if(item == items[i]){
                return i+1;
            }
        }
        return -1;
    }
    public String toString(){
        String temp="{";
        if(isEmpty()){
            return "{}";
        }
        
        for(int i=0;i<NumItems-1;i++){
            temp+=items[i]+", ";
        }
        temp += items[NumItems-1] + "}";
        return temp;
    }
    public boolean remove(E item){
       for(int i=0;i<NumItems;i++){
           if(items[i]==item){
               items[i]=items[i+1];
               for(int j=i+1;j<NumItems-1;j++){
                   items[j]=items[j+1];
               }
               NumItems--;
               return true;
           }
       }
       return false;
    }
    public boolean containsAll(MyList<E> list){
        for(int i =1 ; i< list.size() +1; i++){
            if(!contains(list.get(i))){
                return false;
            }
        }
        return true;
    }
    public void addAll(MyList<E> list){
        for(int i =1 ; i< list.size() +1; i++){
            add(list.get(i));
        }
    }
    public void removeAll(MyList<E> list){
        for(int i =1 ; i< list.size() +1; i++){
            delete(i);
        }
    }
    public void clear(){
        items = (E[])new Object[MAX_LIST]; 
        NumItems=0;
    }
    public void sort(){
        items = mergeSort(items,size());
    }
    public E[] mergeSort(E[] toBeSorted,int size){
        //merge sort
         E[] lowerhalf;
         E[] upperhalf; 
        if(toBeSorted.length==1){
            return toBeSorted;
        }
        int half = size/2;
        lowerhalf =  (E[])new Object[half]; 
        upperhalf =  (E[])new Object[size-half]; 
        System.out.println("lower length = "+lowerhalf.length);
        System.out.println("upper length = "+upperhalf.length);
        for(int i=0 ; i <half ;i ++ ){
            lowerhalf[i]=toBeSorted[i];
            
        }
        for(int i =half;i<size;i++){
            upperhalf[i-half]=toBeSorted[i];
        }
        lowerhalf=mergeSort(lowerhalf,lowerhalf.length);
        upperhalf=mergeSort(upperhalf,upperhalf.length);
        
        toBeSorted =  merge(lowerhalf,  upperhalf);
        return toBeSorted;
         
    }
    
    private E[] merge(E[] lowerhalf, E[] upperhalf){
        E[] merged = (E[])new Object[lowerhalf.length+upperhalf.length];  
        int i=0,j=0,k=0;
//        System.out.println("lowerhalf = "+lowerhalf);
//        System.out.println("upperhalf = "+upperhalf);
        
        while(i<lowerhalf.length && j<upperhalf.length){
            System.out.println("lower[i]="+(Integer)lowerhalf[i]);
            System.out.println("higher[j]="+(Integer)upperhalf[j]);
            
            if((Integer)lowerhalf[i]<(Integer)upperhalf[j]){
                merged[k] = lowerhalf[i];
                k++;
                i++;
            }else{
                merged[k] = upperhalf[j];
                k++;
                j++;
            }
            
            
        }
        while(i<lowerhalf.length){
            merged[k++]=lowerhalf[i++];
        }
        while(j<upperhalf.length){
            merged[k++]=upperhalf[j++];
        }
        
        return merged;
                
    }
    public MyList<E> intersection(MyList<E> list){
        MyList<E> intersection = new MyList<>();
        for(int i=1;i<list.size()+1;i++){
            if(contains(list.get(i))){
                
                intersection.add(list.get(i));
                
            }
        }
        return intersection;
    }
    public boolean isEqual(MyList<E> list){
        return containsAll(list) && size()==list.size();
    }
    public static void main(String[] args ){
        MyList<Integer> list = new MyList<>();
        MyList<Integer> secondList = new MyList<>();
        MyList<Integer> thirdList = new MyList<>();
        thirdList.add(1);
        thirdList.add(2);
        secondList.add(5);
        secondList.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("The current list " + list);
        System.out.println("list contains 1: "+list.contains(1));
        System.out.println("list contains 5: "+list.contains(5));
        System.out.println("The size of the list is "+ list.size());
        System.out.println("removed 4 from the list");
        
        list.remove(4);
        System.out.println("The current list " + list);
        System.out.println("The size of the list is "+ list.size());
        System.out.println("The list "+ list + " contains every element of "+ secondList+" : " + list.containsAll(secondList));
        System.out.println("The list "+ list + " contains every element of "+ thirdList+" : " + list.containsAll(thirdList));
        System.out.print("Added list "+ secondList +" to the list "+ list);
        list.addAll(secondList);
        System.out.println(". The resulting list is "+ list);
        
        
                list.sort();
                System.out.println("Sorted the list using merge sort"+ list);

        System.out.print("Removed all elements of "+ thirdList +" to the list "+ list);
        list.removeAll(secondList);
        System.out.println(". The resulting list is "+ list);
        
        System.out.print("The intersection of "+ list+ " and "+secondList);
        thirdList = list.intersection(secondList);
        System.out.println(" is "+ thirdList);
       System.out.print("The list "+list + " is cleared. ");
       list.clear();
         
       System.out.println("The resulting list is "+ list);
    }
}