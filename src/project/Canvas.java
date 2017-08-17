/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import acm.graphics.*;
import acm.program.*;
import acmx.export.javax.swing.JButton;
import acmx.export.javax.swing.JLabel;
import acmx.export.javax.swing.JPanel;
import java.awt.*;

/**
 *
 * @author iwcnrlee1
 */
public class Canvas extends GraphicsProgram{
    public static int APPLICATION_WIDTH=800;
    public static int APPLICATIUON_HEIGHT=600;
    public Canvas() {
        Home();
    }
    
    public void Home(){
        GLabel LogIn= new GLabel("Log In:",400,400);
        add(LogIn);
    }
    
    public void Login(){
       // add(new GLabel("Log In:") ,150,120);
        //add(new JTextField(), 150,150);
    }
}
