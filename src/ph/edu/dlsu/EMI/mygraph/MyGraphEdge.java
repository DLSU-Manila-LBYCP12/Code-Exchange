/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mygraph;

import acm.graphics.GCanvas;
import acm.graphics.GLine;
import java.awt.Color;

/**
 *
 * @author Rivera
 */
public class MyGraphEdge {

    public MyGraphNode nodeA, nodeB;
    public int weight;
    public MyGraphEdge(MyGraphNode a, MyGraphNode b) {
        nodeA = a;
        nodeB = b;
        
    }

    public MyGraphEdge(MyGraphNode a, MyGraphNode b, int weight) {
        this.weight = weight;
        nodeA = a;
        nodeB = b;
    }

    

}
