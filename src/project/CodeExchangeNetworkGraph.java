/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import acm.graphics.GCanvas;
import java.util.ArrayList;
import ph.edu.dlsu.EMI.mygraph.MyGraph;

/**
 *
 * @author Rivera
 */
public class CodeExchangeNetworkGraph extends GCanvas{
    
    public MyGraph graph ;
    public CodeExchangeDataBase database;
    public ArrayList<String> names; 
    public ArrayList<ArrayList<String>> adjacency; 
    public CodeExchangeNetworkGraph(CodeExchangeDataBase database){
        this.database = database;
        getNames();
        getAdjacency();
        graph= new MyGraph(names, adjacency);
    }
    
    public void getNames(){
        names = database.getNames();
    }

    private void getAdjacency() {
        
    
    }

    private void getDataBase() {
        
    }
    
}
