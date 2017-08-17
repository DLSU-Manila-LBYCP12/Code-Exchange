/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.EMI.myinterface;

import ph.edu.dlsu.EMI.mytree.MyTreeNode;

/**
 *
 * @author Rivera
 */
public interface Tree {
    public void preFix(MyTreeNode root);
    //precondition: none
    //postcondition: output traversal in prefix order
    
    public void inFix(MyTreeNode root);
    //precondition: none
    //postcondition: output traversal in infix order
    
    public void postFix(MyTreeNode root);
    //precondition: none
    //postcondition: output traversal in postfix order
}
