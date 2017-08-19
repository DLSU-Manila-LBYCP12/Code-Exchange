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
import acm.util.RandomGenerator;
import java.util.*;
import ph.edu.dlsu.EMI.mylinkedlist.MyLinkedList;
import project.GraphEdge;
import project.GraphNode;

public class MyGraph {

    RandomGenerator rgen = new RandomGenerator().getInstance();
    MyLinkedList<String> names;
    public ArrayList<GraphNode> nodes = new ArrayList<>();
    public ArrayList<GraphEdge> edges = new ArrayList<>();
    public ArrayList<ArrayList<GraphNode>> adjacency = new ArrayList<>();
    public double x, y, width, height;
    private String name, initials = "";

    public GCanvas canvas;
    private int weights[][];
    public MyLinkedList<MyLinkedList<Integer>> weightsList = new MyLinkedList<>();

    public MyGraph(MyLinkedList<String> names, MyLinkedList<MyLinkedList<Integer>> weights, GCanvas canvas) {
        this.canvas = canvas;
        this.weightsList = weights;
        for (int i = 1; i <= names.size(); i++) {
            createNode(names.get(i),100+(i%5)*100,100+(i/5)*100);

        }
        this.names = names;
        displayNodes();
        for (int i = 1; i < weights.size() + 1; i++) {
            MyLinkedList<Integer> temp = weights.get(i);
            for (int j = 1; j < temp.size() + 1; j++) {
                if(i!=j){
                if (temp.get(j) > 0) {
                    System.out.println(i+", "+j);
                    createEdge(nodes.get(j-1), nodes.get(i-1), temp.get(j));
                    System.out.println("Created edge");
                }
                }
            }
        }
        
        displayConnections();
        
    }

//    public void traverseBFS(String rootNodeName) {
//        console.println("BFS Traversal");
//        MyGraphNode rootNode = getNode(rootNodeName);
//        MyGraphNode<String> currentNode = rootNode;
//        ArrayList<MyGraphNode> visited = new ArrayList<>();
//        MyQueue<MyGraphNode> queue = new MyQueue();
//        visited.add(rootNode);
//        console.println(rootNode.getData());
//        while(visited.size()!=nodes.size()){
//            for(int i = 0; i < currentNode.adjacency.size() ; i++ ){
//                MyGraphNode tempNode = currentNode.adjacency.get(i);
//                if(!visited.contains(tempNode)){
//                    console.println((String)tempNode.getData());
//                    queue.enQueue(tempNode);
//                    visited.add(tempNode);
//                }
//            }
//            currentNode = queue.deQueue();
//        }
//    }
    public void addNode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private GraphNode getNode(String item) {
        for (GraphNode tempItem : nodes) {
            if (tempItem.name == item) {
                return tempItem;
            }
        }
        return null;
    }

    private int getIndex(GraphNode toFindNode) {
        return nodes.indexOf(toFindNode);
    }

    public void traverseDFS(String rootNodeName) {
//        console.println("DFS Traversal");
//        GraphNode rootNode = getNode(rootNodeName);
//        ArrayList visited = new ArrayList();
//        
//        dfsRecursive(rootNode, visited);
    }

    public void dfsRecursive(GraphNode current, ArrayList visited) {
        ArrayList<GraphNode> adjacency = current.connections;
        System.out.println(current.getName());
        visited.add(current);
        for (GraphNode nextNode : adjacency) {
            if (!visited.contains(nextNode)) {
                dfsRecursive(nextNode, visited);
            }

        }
    }

//    @Override
//    public void dijkstras(String rootNodeName) {
//        GraphNode rootNode = getNode(rootNodeName);
//        ArrayList<MyGraphNode> visited = new ArrayList<>();
//        ArrayList<Integer> apparentDistance = new ArrayList<>(nodes.size());
//        ArrayList<String> paths = new ArrayList<>(nodes.size());
//        for(int i = 0 ; i < nodes.size() ; i++){
//            apparentDistance.add( Integer.MAX_VALUE);
//            paths.add((String) rootNode.getData());
//        }
//        
//        apparentDistance.set(getIndex(rootNode), 0);
//        console.println(apparentDistance);
//        MyGraphNode currentNode = rootNode;
//        visited.add(currentNode);
//        
//        while(visited.size()!=nodes.size()){
//            console.println(currentNode.getData());
//            ArrayList<MyGraphNode> adjacent = currentNode.adjacency;
//            for(MyGraphNode nextNode:adjacent){
//               if(apparentDistance.get(getIndex(currentNode)) + weights[getIndex(currentNode)][getIndex(nextNode)]<apparentDistance.get(getIndex(nextNode))){
//                   apparentDistance.set(getIndex(nextNode), apparentDistance.get(getIndex(currentNode))+weights[getIndex(currentNode)][getIndex(nextNode)]);
//                   paths.set(getIndex(nextNode), paths.get(getIndex(currentNode))+"-"+nextNode.getData());
//               }
//            }
//            console.println(apparentDistance);
//            currentNode = nodes.get(indexOfSmallest(apparentDistance, visited));
//            visited.add(currentNode);
//        }
//        
//        
//        console.println(apparentDistance);
//        console.println(paths);
//        }
    private int indexOfSmallest(ArrayList<Integer> apparentDistance, ArrayList<MyGraphNode> visited) {
        int index = 0;
        int lowest = apparentDistance.get(1);
        for (int i = 0; i < apparentDistance.size(); i++) {
            if (apparentDistance.get(i) < lowest && !visited.contains(nodes.get(i))) {
                lowest = apparentDistance.get(i);
                index = i;
            }
        }

        return index;

    }

    public GLabel traversalLabel = new GLabel("Traversal:");

    public void reset() {
        canvas.removeAll();
        nodes.removeAll(nodes);
    }

    public GraphNode createNode(String name) {

        GraphNode node = new GraphNode(name, rgen.nextDouble(100, 500), rgen.nextDouble(100, 350));
        nodes.add(node);
        checkOverlapping();

        return node;
    }
    public GraphNode createNode(String name,double x, double y) {

        GraphNode node = new GraphNode(name, x, y);
        nodes.add(node);
//        checkOverlapping();

        return node;
    }

    public void displayNodes() {
      
        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).DrawNode(canvas);
        }

    }

    private void checkOverlapping() {
        boolean overlap = true;
        for (int i = 0; i < nodes.size(); i++) {
            for (int j = 0; j < nodes.size(); j++) {
                if (i != j) {
                    double dist = distance(nodes.get(i).getLocation(), nodes.get(j).getLocation());

                    while (dist < 100) {

                        GPoint newLoc = new GPoint(rgen.nextDouble(100, 550), rgen.nextDouble(100, 350));
                        while (isOverlapping(newLoc,j)){
                            newLoc = new GPoint(rgen.nextDouble(100, 550), rgen.nextDouble(100, 350));
                        }
                        nodes.get(j).setLocation(newLoc);
                        nodes.get(j).update();

                        dist = distance(nodes.get(i).getLocation(), nodes.get(j).getLocation());
                    }
                }

            }
        }
        System.out.println("found unique location");
    }

    private double distance(GPoint gpoint1, GPoint gpoint2) {
        double dist = Math.sqrt(Math.pow(gpoint1.getX() - gpoint2.getX(), 2) + Math.pow(gpoint1.getY() - gpoint2.getY(), 2));
        
        return dist;

    }

    public void displayConnections() {
        for (int i = 0; i < edges.size(); i++) {
            edges.get(i).update();
            edges.get(i).show();

        }
    }

    public void createEdge(GraphNode a, GraphNode b, Integer weight) {
        GraphEdge newEdge = new GraphEdge(a, b, canvas, weight);
        edges.add(newEdge);
    }

    public GraphNode getNode(GObject object) {
        for (int i = 0; i < nodes.size(); i++) {
            try {
                if (nodes.get(i).node == (GOval) object) {
                    return nodes.get(i);
                }
            } catch (Exception e) {
            }
            try {
                if (nodes.get(i).label == (GLabel) object) {
                    return nodes.get(i);
                }
            } catch (Exception e) {
            }

        }
        return null;
    }

    public void removeConnection(GraphNode a, GraphNode b) {
        for (int i = 0; i < edges.size(); i++) {
            GraphEdge temp_edge = edges.get(i);
            if ((temp_edge.nodeA == a && temp_edge.nodeB == b) || (temp_edge.nodeB == a && temp_edge.nodeA == b)) {
                edges.remove(i);
//                s
            }
        }

    }

    private void displayTraversal() {
        int location = 0;
        canvas.add(traversalLabel, 100, canvas.getHeight() - 50);
//        for(int i =0 ;i < canvas.traversal.size() ; i++){
//            GLabel label = new GLabel(traversal.get(i).name);
//            add(label, traversalLabel.getX()+traversalLabel.getWidth()+20+location,traversalLabel.getY());
//            location+=label.getWidth() +10;
//        }
    }

    public void connectNodes(MyGraphNode a, MyGraphNode b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isOverlapping(GPoint newLoc, int nodeIndex) {
        boolean isNotOverlapping = false;
        for (int i = 0; i < nodes.size(); i++) {
            if (distance(newLoc, nodes.get(i).getLocation()) < 50 && i!=nodeIndex) {
                isNotOverlapping = true;
            }
        }
        return isNotOverlapping;
    }

}
