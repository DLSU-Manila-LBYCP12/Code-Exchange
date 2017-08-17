/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mytree;

import acm.program.ConsoleProgram;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Rivera
 */
public class TreeDemo extends ConsoleProgram{
    public ArrayList<String> tree = new ArrayList(Arrays.asList("A","B","C","D","E","F","G"));
    @Override
    public void run(){
        println(tree);
        println("Maverick");
        MyTree sampleTree = new MyTree(tree,this);
        println("Prefix Traversal");
        sampleTree.preFix(sampleTree.getRoot());
        println("Infix Traversal");
        sampleTree.inFix(sampleTree.getRoot());
        println("Postfix Traversal");
        sampleTree.postFix(sampleTree.getRoot());
        
    }
    public static void main(String[] args){
        new TreeDemo().start(args);
    }
}
