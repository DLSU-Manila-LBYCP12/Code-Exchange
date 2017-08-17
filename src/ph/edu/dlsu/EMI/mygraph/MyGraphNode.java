/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mygraph;


import java.util.ArrayList;


/**
 *
 * @author Rivera
 */
public class MyGraphNode<E> {

    public ArrayList<MyGraphNode> adjacency = new ArrayList<>();
    public ArrayList<Integer> weights = new ArrayList<>();
  
    public E data;

    public MyGraphNode(){
        //empty constructor
    }
    public MyGraphNode(E item) {
        data = item;
    }

    
    public void connect(MyGraphNode toConnect) {
        adjacency.add(toConnect);
        weights.add(1);
    }

    public void connect(MyGraphNode toConnect, int weight) {
        adjacency.add(toConnect);
        weights.add(weight);
    }

    public void disconnect(MyGraphNode toDisconnect) {
        int index = adjacency.indexOf(toDisconnect);
        adjacency.remove(toDisconnect);
        weights.remove(index);

    }

    public E getData() {
        return data;
    }
    
    public void addAdjacentNode(MyGraphNode<E> toConnect){
        adjacency.add(toConnect);
    }
}
