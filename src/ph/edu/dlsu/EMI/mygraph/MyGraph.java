/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mygraph;

/**
 *
 * @author Rivera
 */

import acm.graphics.*;
import acm.io.IOConsole;
import acm.util.RandomGenerator;
import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
import ph.edu.dlsu.EMI.mylinkedlist.MyLinkedList;
import ph.edu.dlsu.EMI.myqueue.MyQueue;

public class MyGraph implements ph.edu.dlsu.EMI.myinterface.Graph {

    RandomGenerator rgen = new RandomGenerator().getInstance();
    public ArrayList<MyGraphNode> nodes = new ArrayList<>();
    public ArrayList<MyGraphEdge> edges = new ArrayList<>();
    public ArrayList<ArrayList<MyGraphNode>> adjacency = new ArrayList<>();
    public double x, y, width, height;
    private String name, initials = "";
    graphDemo console;
    private int weights[][];

    public MyGraph(ArrayList<String> initNodes, ArrayList<ArrayList<String>> initAdjacency, graphDemo console) {
        this.console = console;
        for(int i=0;i<initNodes.size();i++){
            MyGraphNode<String> newNode = new MyGraphNode<>((String)initNodes.get(i));
            nodes.add(newNode);
                    
        }
        for(int i = 0; i<nodes.size(); i++){
            
            for(int j = 0; j < initAdjacency.get(i).size() ; j++){
                MyGraphNode<String> tempNode = getNode((String) initAdjacency.get(i).get(j));
                nodes.get(i).addAdjacentNode(tempNode);
            }
        }
    }
    public MyGraph(ArrayList<String> initNodes, ArrayList<ArrayList<String>> initAdjacency,int[][] weights,graphDemo console) {
        this.console = console;
        for(int i=0;i<initNodes.size();i++){
            MyGraphNode<String> newNode = new MyGraphNode<>((String)initNodes.get(i));
            nodes.add(newNode);
                    
        }
        for(int i = 0; i<nodes.size(); i++){
            
            for(int j = 0; j < initAdjacency.get(i).size() ; j++){
                MyGraphNode<String> tempNode = getNode((String) initAdjacency.get(i).get(j));
                nodes.get(i).addAdjacentNode(tempNode);
            }
        }
        this.weights = weights;
    }
    public MyGraph(ArrayList<String> nodes, ArrayList<ArrayList<String>> adjacency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MyGraph(MyLinkedList<String> names, MyLinkedList<MyLinkedList<String>> adjacency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    public void traverseBFS(String rootNodeName) {
        console.println("BFS Traversal");
        MyGraphNode rootNode = getNode(rootNodeName);
        MyGraphNode<String> currentNode = rootNode;
        ArrayList<MyGraphNode> visited = new ArrayList<>();
        MyQueue<MyGraphNode> queue = new MyQueue();
        visited.add(rootNode);
        console.println(rootNode.getData());
        while(visited.size()!=nodes.size()){
            for(int i = 0; i < currentNode.adjacency.size() ; i++ ){
                MyGraphNode tempNode = currentNode.adjacency.get(i);
                if(!visited.contains(tempNode)){
                    console.println((String)tempNode.getData());
                    queue.enQueue(tempNode);
                    visited.add(tempNode);
                }
            }
            currentNode = queue.deQueue();
        }
    }

    
  

    
    public void addNode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void connectNodes(MyGraphNode a, MyGraphNode b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private MyGraphNode getNode(String item){
        for(MyGraphNode tempItem : nodes){
            if(tempItem.getData() == item){
                return tempItem;
            }
        }
        return null;
    }
    private int getIndex(MyGraphNode toFindNode){
        return nodes.indexOf(toFindNode);
    }
    

    @Override
    public void addNode(MyGraphNode nodeToAdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void traverseDFS(String rootNodeName) {
        console.println("DFS Traversal");
        MyGraphNode rootNode = getNode(rootNodeName);
        ArrayList visited = new ArrayList();
        
        dfsRecursive(rootNode, visited);
    }

    public void dfsRecursive(MyGraphNode current, ArrayList visited){
        ArrayList<MyGraphNode> adjacency = current.adjacency;
        console.println(current.getData());
        visited.add(current);
        for(MyGraphNode nextNode:adjacency){
            if(!visited.contains(nextNode)){
            dfsRecursive(nextNode, visited);}
            
        }
    }

    @Override
    public void dijkstras(String rootNodeName) {
        MyGraphNode rootNode = getNode(rootNodeName);
        ArrayList<MyGraphNode> visited = new ArrayList<>();
        ArrayList<Integer> apparentDistance = new ArrayList<>(nodes.size());
        ArrayList<String> paths = new ArrayList<>(nodes.size());
        for(int i = 0 ; i < nodes.size() ; i++){
            apparentDistance.add( Integer.MAX_VALUE);
            paths.add((String) rootNode.getData());
        }
        
        apparentDistance.set(getIndex(rootNode), 0);
        console.println(apparentDistance);
        MyGraphNode currentNode = rootNode;
        visited.add(currentNode);
        
        while(visited.size()!=nodes.size()){
            console.println(currentNode.getData());
            ArrayList<MyGraphNode> adjacent = currentNode.adjacency;
            for(MyGraphNode nextNode:adjacent){
               if(apparentDistance.get(getIndex(currentNode)) + weights[getIndex(currentNode)][getIndex(nextNode)]<apparentDistance.get(getIndex(nextNode))){
                   apparentDistance.set(getIndex(nextNode), apparentDistance.get(getIndex(currentNode))+weights[getIndex(currentNode)][getIndex(nextNode)]);
                   paths.set(getIndex(nextNode), paths.get(getIndex(currentNode))+"-"+nextNode.getData());
               }
            }
            console.println(apparentDistance);
            currentNode = nodes.get(indexOfSmallest(apparentDistance, visited));
            visited.add(currentNode);
        }
        
        
        console.println(apparentDistance);
        console.println(paths);
        }
    private int indexOfSmallest(ArrayList<Integer> apparentDistance, ArrayList<MyGraphNode> visited){
        int index=0;
        int lowest = apparentDistance.get(1);
        for(int i = 0 ; i< apparentDistance.size() ; i++){
            if(apparentDistance.get(i)<lowest && !visited.contains(nodes.get(i))){
                lowest=apparentDistance.get(i);
                index = i;
            }
        }
        
        return index;
        
    }
}
