/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import java.awt.Color;

/**
 *
 * @author Rivera
 */
public class GraphEdge {

    public GraphNode nodeA, nodeB;
    private double x1, y1, x2, y2;
    private GLine connection;
    public int weight;
    public GCanvas canvas;
     GLabel weightLabel ;

    public GraphEdge(GraphNode a, GraphNode b, GCanvas canvas, int weight) {
        weightLabel = new GLabel(weight+"");
        this.weight = weight;
        nodeA = a;
        nodeB = b;
        this.canvas = canvas;
        x1 = nodeA.getCenter().getX();
        y1 = nodeA.getCenter().getY();
        x2 = nodeB.getCenter().getX();
        y2 = nodeB.getCenter().getY();
        connection = new GLine(x1, y1, x2, y2);
        connection.setVisible(true);
        
        canvas.add(connection);
        canvas.add(weightLabel,(x1+x2)/2,(y1+y2)/2);
        setColor();
        System.out.println("Connected " + a.name + " and " + b.name);
        
    }

    public void setColor() {
        switch (weight) {
            case 0:
                connection.setColor(Color.BLACK);
            break;
            case 1:
                connection.setColor(Color.BLACK);
                break;
            case 2:
                connection.setColor(Color.BLUE);
                break;
            case 3:
                connection.setColor(Color.GREEN);
                break;
            case 4:
                connection.setColor(Color.MAGENTA);
                break;
            case 5:
                connection.setColor(Color.RED);
                break;
            default:

        }
    }

    public void update() {
        x1 = nodeA.getCenter().getX();
        y1 = nodeA.getCenter().getY();
        x2 = nodeB.getCenter().getX();
        y2 = nodeB.getCenter().getY();
        connection.setStartPoint(x1, y1);
        connection.setEndPoint(x2, y2);

    }

    public void show() {
        canvas.remove(connection);
        canvas.add(connection);
        
        canvas.remove(weightLabel);
        canvas.add(weightLabel);
        connection.sendToBack();
    }

}
