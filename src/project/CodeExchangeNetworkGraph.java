/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import acm.graphics.GCanvas;
import acm.program.GraphicsProgram;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import ph.edu.dlsu.EMI.mygraph.MyGraph;
import ph.edu.dlsu.EMI.mylinkedlist.MyLinkedList;

/**
 *
 * @author Rivera
 */
public class CodeExchangeNetworkGraph extends GraphicsProgram {

    public MyGraph graph;
    public CodeExchangeDataBase database;
    public MyLinkedList<String> names;
    public MyLinkedList<MyLinkedList<String>> adjacency;
    public MyLinkedList<String> raw = new MyLinkedList<>();
    public MyLinkedList<MyLinkedList<Integer>> weights = new MyLinkedList<>();

    public CodeExchangeNetworkGraph(CodeExchangeDataBase database) throws IOException {
        this.database = database;
        getNames();
        getWeights();
        getAdjacency();
        graph = new MyGraph(names, adjacency);
    }

    public void getWeights() throws FileNotFoundException, IOException {
        String path = System.getProperty("user.dir") + "\\src\\project\\logs\\logs.txt";
        File f = new File(path);
        FileReader source = new FileReader(f);
        BufferedReader br = new BufferedReader(source);

        String temp = br.readLine();
        while (temp != null) {
            raw.add(temp);
            temp = br.readLine();

        }

    }

    public void getNames() {
        names = database.getNames();
    }

    private void getAdjacency() {
        for (int k = 1; k <= names.size(); k++) {
            MyLinkedList<Integer> temp = new MyLinkedList<>();
            for (int i = 1; i <= names.size(); i++) {
                int counter = 0;
                for (int j = 1; j <= raw.size(); j++) {
                    StringTokenizer token = new StringTokenizer(raw.get(j), "|");
                    String coder =token.nextToken();
                    String user = token.nextToken();
                    System.out.println(coder+"|"+user);
                    if (coder.equals(names.get(k)) && user.equals(names.get(i))) {
                        counter++;
                    }
                    if (user.equals(names.get(i)) && user.equals(names.get(k))) {
                        counter++;
                    }
                }
                temp.add(counter);
            }
            weights.add(temp);
        }
        printNames();
        printWeights();
    }

    private void getDataBase() {

    }

    private void printNames() {
        System.out.println("Names: " + names.size());
        for (int i = 1; i <= names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    private void printWeights() {
        System.out.println("Weights" + weights.size());

        for (int i = 1; i <= weights.size(); i++) {
            System.out.println("Adjacency of :" + names.get(i));
            MyLinkedList innerList = weights.get(i);
            for (int j = 1; j <= innerList.size(); j++) {
                System.out.println(innerList.get(j));
            }
            
        }
    }

    public void run() {
        println("mave");
    }

}
