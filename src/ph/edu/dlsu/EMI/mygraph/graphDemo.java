/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mygraph;

import acm.io.IOConsole;
import acm.program.ConsoleProgram;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Rivera
 */
public class graphDemo extends ConsoleProgram{
    ArrayList<String> nodes = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
    ArrayList<ArrayList<String>> adjacency = new ArrayList<>();
    int[][] weights = {{0,5,0,1,0},{5,0,4,0,1},{0,4,0,2,0},{1,0,2,0,2},{0,1,0,2,0}}; 
    public void run(){
        ArrayList<String> temp;
        temp = new ArrayList<>(Arrays.asList("B","D"));
        adjacency.add(temp);
        temp = new ArrayList<>(Arrays.asList("A","C","E"));
        adjacency.add(temp);
        temp = new ArrayList<>(Arrays.asList("D","B"));
        adjacency.add(temp);
        temp = new ArrayList<>(Arrays.asList("A","C","E"));
        adjacency.add(temp);
        temp = new ArrayList<>(Arrays.asList("B","D"));
        adjacency.add(temp);
        println(nodes);
        println(adjacency);
        MyGraph graph = new MyGraph(nodes, adjacency,this);
        MyGraph dijkstras = new MyGraph(nodes, adjacency, weights, this);
        
        graph.traverseDFS("A");
        
        graph.traverseBFS("A");
        println("Dijkstras");
        dijkstras.dijkstras("A");
    }
    public static void main(String[] args ){
        new graphDemo().start(args);
    }
}
