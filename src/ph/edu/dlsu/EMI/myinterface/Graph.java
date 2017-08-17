/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.myinterface;

import ph.edu.dlsu.EMI.mygraph.MyGraphNode;

/**
 *
 * @author Rivera
 */
public interface Graph {
    public void traverseBFS(String rootNode);
    //precondition: the data of the root node
    //postcondition: output of the Breadth First Search Graph Traversal
    
    public void traverseDFS(String rootNode);
    //precondition: the data of the root node
    //postcondition: output of the Deapth First Search Graph Traversal
    
    public void addNode(MyGraphNode nodeToAdd);
    //precondition: node to be added
    //postcondition: nonde
    
    public void connectNodes(MyGraphNode a, MyGraphNode b);
    
    public void dijkstras(String rootNode);
    //precondition: the data of the start node(root node)
    //postcondition: output of the Shortest Path to Each Node including the weights
    
}
