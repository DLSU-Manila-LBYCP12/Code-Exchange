/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import java.awt.Color;

/**
 *
 * @author Rivera
 */
public class CodeExchangeLogInScreenCanvas extends GCanvas{
    private GLabel label = new GLabel("Welcome to CodeExchange! Do you want to sign in or sign up?");
    public static final int BOTTOM_MARGIN =20;
    public CodeExchangeLogInScreenCanvas(){
        this.setSize(500, 300);
        label.setColor(Color.BLACK);
        label.setFont("Tahoma-22");
        this.add(label,20,label.getHeight() +20);
    }
    public void showMessage(String text){
        GLabel message = new GLabel(text);
        message.setLocation(getWidth()/2-message.getWidth()/2, getHeight()-BOTTOM_MARGIN);
        this.add(message);
    }
}
