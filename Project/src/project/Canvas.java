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
public class Canvas extends JPanel{
    public Canvas() {
        setLayout(null);
        Home();
    }
    
    public void Home(){
        JLabel Text = new JLabel("Welcome to Code Exhange!");
        Text.setFont(new Font("Arial", Font.BOLD, 24));
        Text.setLocation(50,50);
        add(Text);
    }
    
    public void Login(){
       // add(new GLabel("Log In:") ,150,120);
        //add(new JTextField(), 150,150);
    }
}
