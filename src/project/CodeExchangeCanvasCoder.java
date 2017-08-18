/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import acm.graphics.*;
import acm.program.ConsoleProgram;
import java.awt.Color;
import java.awt.Font;
import ph.edu.dlsu.EMI.mylinkedlist.MyLinkedList;
import project.CodeExchangeCoderProfile;

/**
 *
 * @author lyle
 */
public class CodeExchangeCanvasCoder extends GCanvas{
    //Di ko na gagalawin yung jbuttons na iimplement, canvas itself lang
    //Paano ko papalitan yung Canvas ng main?????
    private static final int LEFT_MARGIN = 20;
    private static final int TOP_MARGIN =30;
    
    public CodeExchangeCanvasCoder()
    {
        
    }
    

    public void display(CodeExchangeCoderProfile profile)
    {
        removeAll();
        addCoderName(profile.getName());
        addCoderAlias(profile.getAlias());
        addCoderEmail(profile.getEmail());
        addCoderLanguage(profile.getLanguages());
        addCoderNumber(profile.getNumber());
        
    }
    private GLabel Name; 
    private GLabel Alias;
    private GLabel Email;
    private GLabel Language;
    private GLabel Number;
    private void addCoderName(String name)
    {
        double x, y;
        Name = new GLabel(name);
        x = LEFT_MARGIN;
        y = TOP_MARGIN + Name.getHeight();
        Name.setFont(Font.SERIF);
        Name.setColor(Color.RED);
        add(Name, x, y);
        System.out.println("Added: " + name);
    }
    
    private void addCoderAlias(String alias)
    {
        double x, y;
        Alias = new GLabel(alias);
        x = LEFT_MARGIN;
        y = TOP_MARGIN + Name.getHeight() + Alias.getHeight();
        Alias.setFont(Font.SERIF);
        Alias.setColor(Color.GRAY);
        add(Alias,x, y);
        System.out.println("Added Alias: " + alias);
    }
    
    private void addCoderEmail(String email)
    {
        
    }
    
    private void addCoderLanguage(MyLinkedList<String> language)
    {
        
    }
    
    private void addCoderNumber(String number)
    {
        
    }

}
