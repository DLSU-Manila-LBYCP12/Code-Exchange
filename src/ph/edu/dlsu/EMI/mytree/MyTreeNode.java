/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.mytree;

/**
 *
 * @author Rivera
 */
public class MyTreeNode {

    private String data;
    private MyTreeNode leftChild, rightChild;
    private MyTreeNode parent;
    

    public MyTreeNode(String data) {
        this.data = data;
    }

    public MyTreeNode(String data, MyTreeNode left, MyTreeNode right, MyTreeNode parent) {
        this.data = data;
        this.leftChild = left;
        this.rightChild = right;
        this.parent = parent;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLeftChild(MyTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(MyTreeNode rightChild) {
        this.rightChild = rightChild;
    }
    
    public MyTreeNode getRightChild(){
        return this.rightChild;
    }
    
    public MyTreeNode getLeftChild(){
        return this.leftChild;
    }
    public boolean hasLeftandRight(){
        if(leftChild!=null && rightChild != null){
            return true;
        }else{
            return false;
        }
    }
    public boolean hasLeft(){
        if(leftChild != null){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        
        return data;
    }
}
