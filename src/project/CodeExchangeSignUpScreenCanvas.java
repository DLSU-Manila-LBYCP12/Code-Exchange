/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import acmx.export.javax.swing.JButton;
import acmx.export.javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @authauthor Inicca
 */
public class CodeExchangeSignUpScreenCanvas extends GCanvas{
    public static int space = 30;
    
    private final GLabel label = new GLabel("Welcome to CodeExchange! Fill the form down below");
    public static final int BOTTOM_MARGIN =20;
    public CodeExchangeSignUpScreenCanvas(){
        this.setSize(500, 300);
        label.setColor(Color.BLACK);
        label.setFont("Tahoma-22");
        this.add(label,20,label.getHeight() +25);
        Form();
    }
    
    public void Form(){
        GLabel Name = new GLabel("Name:  ");
        GLabel Password = new GLabel("Password:  ");
        GLabel Occupation = new GLabel("Occupation:  ");
        GLabel Company = new GLabel("Company:  ");
        GLabel Email = new GLabel("Email:  ");
        
        JTextField name = new JTextField();
        JTextField password = new JTextField();
        JTextField occupation = new JTextField();
        JTextField company = new JTextField();
        JTextField email = new JTextField();
        JButton enterBtn= new JButton("Enter");
        
        Name.setFont("Tahoma-22");
        Password.setFont("Tahoma-22");
        Occupation.setFont("Tahoma-22");
        Email.setFont("Tahoma-22");
        Company.setFont("Tahoma-22");
        
        name.setSize(name.getWidth(), 22);
        password.setSize(name.getWidth(), 22);
        occupation.setSize(name.getWidth(), 22);
        email.setSize(name.getWidth(), 22);
        company.setSize(name.getWidth(), 22);
        
        Name.setLocation(300,100);
        name.setLocation(300+(int) Name.getWidth(), (int) Name.getY()-(int)Name.getHeight()+10);
        Password.setLocation(300, 100+space);
        password.setLocation(300+(int) Password.getWidth(), (int) Password.getY()-(int)Password.getHeight()+10);
        Occupation.setLocation(300, 100+2*space);
        occupation.setLocation(300+(int) Occupation.getWidth(), (int) Occupation.getY()-(int)Occupation.getHeight()+10);
        Company.setLocation(300, 100+3*space);
        company.setLocation(300+(int) Company.getWidth(), (int) Company.getY()-(int)Company.getHeight()+10);
        Email.setLocation(300, 100+4*space);
        email.setLocation(300+(int) Email.getWidth(), (int) Email.getY()-(int)Email.getHeight()+10);
        
        enterBtn.setSize(80, 30);
        enterBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        
        this.add(Name);
        this.add(name);
        this.add(Password);
        this.add(password);
        this.add(Occupation);
        this.add(occupation);
        this.add(Company);
        this.add(company);
        this.add(Email);
        this.add(email);
        this.add(enterBtn, 300,100+5*space);
        
    }
    
    public void showMessage(String text){
        GLabel message = new GLabel(text);
        message.setLocation(getWidth()/2-message.getWidth()/2, getHeight()-BOTTOM_MARGIN);
        this.add(message);
    }
}
