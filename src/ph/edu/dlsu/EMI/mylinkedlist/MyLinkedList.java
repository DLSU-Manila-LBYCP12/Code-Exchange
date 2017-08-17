package ph.edu.dlsu.EMI.mylinkedlist;


import ph.edu.dlsu.EMI.myarraylist.MyList;
import ph.edu.dlsu.EMI.myexception.ListIndexOutOfBoundsException;
import ph.edu.dlsu.EMI.myinterface.List;

public class MyLinkedList<E> implements List<E>{
       private Node<E> head;
        private Node<E> tail;
       private int numItems;
 
   public  MyLinkedList(){   
      createList();
   } //end constructor
       @Override
   public void createList(){
       numItems = 0;
      head = null;
   }
   public void add(int index, E item) throws ListIndexOutOfBoundsException {
       
       if ( index > 0 && index <= numItems + 1){
             if (index == 1){ // Create head
		Node<E> newNode = new Node<>(item);
		newNode.setNext(head);
		head = newNode;
               
                
            }
	    else
            {
		Node<E> newNode = new Node<>(item);
		Node<E> previous = find(index-1);
		newNode.setNext(previous.getNext());
		previous.setNext(newNode);
            
	    
       	    }
             numItems++;
       }else{
            throw new ListIndexOutOfBoundsException("ADD ERROR: List Index Out Of Bounds");}
       
   }
    public void add(E item){
        if(numItems==0){
           Node<E> newNode = new Node<E>(item);
		
		head = newNode;
                tail = newNode;
                
       }else{
        Node<E> newNode = new Node<>(item);
        
        tail=find(numItems);
        tail.setNext(newNode);
        
        }
        numItems++;
    }
       @Override
   public void delete(int index) throws ListIndexOutOfBoundsException{
       if ( index > 0 && index < numItems + 1){
          if (index == 1){ 
              head = head.getNext(); 
          }
          else{
             Node<E> previous = find(index-1);
             Node<E> current = previous.getNext();
             previous.setNext(current.getNext());
           }
           numItems--;
       }
      else
            throw new ListIndexOutOfBoundsException("REMOVE ERROR: List Index Out Of Bounds");
   }
   




   public boolean isEmpty(){
           return numItems == 0;          
   }





   public E get(int index) throws ListIndexOutOfBoundsException{
       if ( index > 0 && index <= numItems + 1){
             Node<E> current = find(index);
             E item = current.getItem();
             return item;
       }
       else
            throw new ListIndexOutOfBoundsException("GET ERROR: List Index Out Of Bounds");
   }

   public int size(){
           return numItems;
   }

   /// Locate a specified node in a linked list:
   private Node<E> find(int index){
   // precondition: index is the number of the desired node,
   // precondition: assume 1 ≤ index ≤ numItems+1;
   // postcondition: returns a reference to the desired node.
   Node<E> current = head;
 
   for (int i = 1; i < index; i++)
   { 
      current = current.getNext(); 
   }

   return current;
   } //end find

   
    
    public String toString(){
        String temp="{";
        if(isEmpty()){
            return "{}";
        }
        for(int i=1;i<size();i++){
            temp += get(i)+", ";
        }
        temp+=get(size())+"}";
        
        return temp;
    }
    public boolean remove(E item){
        for(int i=1;i<size()+1;i++){
            if(get(i)==item){
                tail = find(i-1);
                delete(i);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean contains(E item) {
        for(int i = 1 ;i < size()+1;i++){
            if(item == get(i)){
                return true;
            }
        }
        return false;
        
        
    }

    public boolean containsAll(MyLinkedList<E> list) {
        for(int i =1 ; i< list.size() + 1; i++){
            if(!contains(list.get(i))){
                return false;
            }
        }
        return true;
    }

    public void addAll(MyLinkedList<E> list) {
        for(int i =1 ; i< list.size() + 1; i++){
            add(list.get(i));
        }}

    public void removeAll(MyLinkedList<E> list) {
         for(int i =1 ; i< list.size() + 1; i++){
            remove(list.get(i));
        }
    }

    public void clear() {
        numItems=0;
        head=null;
        tail=null;
    }
    
    public MyLinkedList<E> intersection(MyLinkedList<E> list){
        MyLinkedList<E> intersection = new MyLinkedList<>();
        for(int i=1;i<list.size()+1;i++){
            if(contains(list.get(i))){
                
                intersection.add(list.get(i));
                
            }
        }
        return intersection;
    }
    
    public static void main(String[] args ){
        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyLinkedList<Integer> secondList = new MyLinkedList<>();
        MyLinkedList<Integer> thirdList = new MyLinkedList<>();
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
        
        System.out.print("Removed all elements of "+ thirdList +" in the list "+ list);
        list.removeAll(thirdList);
        System.out.println(". The resulting list is "+ list);
       System.out.print("The list "+list + " is cleared. ");
       list.clear();
       System.out.println("The resulting list is "+ list);
       
    }

    public void sort() {
        MyList<E> list = new MyList<>();
        for(int i=1;i<=size();i++){
             list.add(get(i));
        }
        list.sort();
        clear();
        for(int i=1;i<=list.size();i++){
             add(list.get(i));
        }
        }

    public boolean isEqual(MyLinkedList<E> list) {
         return containsAll(list) && size()==list.size();
        
        }

    
    
    
}//end class
