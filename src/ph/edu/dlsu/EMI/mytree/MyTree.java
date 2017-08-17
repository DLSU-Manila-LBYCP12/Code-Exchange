/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mytree;

import java.util.ArrayList;
import ph.edu.dlsu.EMI.myinterface.Tree;
import ph.edu.dlsu.EMI.myqueue.MyQueueHighLimit;

/**
 *
 * @author Rivera
 */
public class MyTree implements Tree{
    private MyTreeNode rootNode;
    private TreeDemo console;
    public MyTree(ArrayList<String> tree){
        MyQueueHighLimit<MyTreeNode> queue = new MyQueueHighLimit();
        for(int i = 0 ; i < tree.size() ;i++){
            
            MyTreeNode newNode = new MyTreeNode(tree.get(i));
            queue.enQueue(newNode);
            if(i==0){
                rootNode =  newNode ;
                
            }
            if(!queue.peek().hasLeftandRight()){
                if(!queue.peek().hasLeft()){
                    queue.peek().setLeftChild(newNode);
                }else{
                     queue.peek().setRightChild(newNode);
                }
            }else{
                queue.deQueue();
                queue.peek().setLeftChild(newNode);
            }
            
        }
    }

    MyTree(ArrayList<String> tree, TreeDemo console) {
        this.console = console;
        MyQueueHighLimit<MyTreeNode> queue = new MyQueueHighLimit();
        for(int i = 0 ; i < tree.size() ;i++){
            
            MyTreeNode newNode = new MyTreeNode(tree.get(i));
            queue.enQueue(newNode);
            if(i==0){
                rootNode = newNode;
                
            }else{
            if(!queue.peek().hasLeftandRight()){
                if(queue.peek().hasLeft()){
                    queue.peek().setRightChild(newNode);
                    queue.deQueue();
                }else{
                     
                    queue.peek().setLeftChild(newNode);
                }
            }else{
                
                queue.peek().setLeftChild(newNode);
            }
            
        }
        }
        
        }

 
    @Override
    public void preFix(MyTreeNode root) {
//        console.println("prefix traversal");
        if(root == null){
         return;}
        System.out.println(root);
        if(console!=null){
            console.println(root);
        }
        preFix(root.getLeftChild());
        preFix(root.getRightChild());
    }

    @Override
    public void inFix(MyTreeNode root) {
//        console.println("Infix traversal");
        if(root == null){
         return;}
        
        inFix(root.getLeftChild());
        System.out.println(root);
        if(console!=null){
            console.println(root);
        }
        inFix(root.getRightChild());
        }

    @Override
    public void postFix(MyTreeNode root) {
//        console.println("postfix traversal");
        if(root == null){
         return;}
        
        postFix(root.getLeftChild());
        postFix(root.getRightChild());
        System.out.println(root);
        if(console!=null){
            console.println(root);
        }
    }
        
   public MyTreeNode getRoot(){
       return rootNode;
   }
}
