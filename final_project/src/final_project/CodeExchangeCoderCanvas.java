/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import javax.swing.JButton;

import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.Program;

/**
 *
 * @author Minguez	//Changed
 */
public class CodeExchangeCoderCanvas extends ConsoleProgram{
	
	GCanvas canvas;
	JButton checkClientRequests;
	JButton checkPendingRequests;
    public CodeExchangeCoderCanvas()
    {
    	//Test initialization for canvas of coders
    	setSize(600,480);
    	canvas = new GCanvas();
    	checkClientRequests = new JButton("Check Client Requests");
    	add(checkClientRequests,NORTH + getWidth()/2);
    	checkPendingRequests = new JButton("Check Pending Requests");
    	add(checkPendingRequests, NORTH + getWidth()/2 + 50);
    }
    public static void main(String[] args)
    {
    	new CodeExchangeCoderCanvas().start(args);
    }
}
