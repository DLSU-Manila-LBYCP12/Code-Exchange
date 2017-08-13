package project;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import acmx.export.javax.swing.JButton;
import acmx.export.javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class Project extends Program {
   
    public static int APPLICATION_WIDTH=800;
    public static int APPLICATIUON_HEIGHT=800;
    
    JLabel Label;
    JButton Home;
    JButton Notifications;
    JButton Profile;
    JButton ProfilePic;
    JButton Requests;
    JButton Settings;
    
    
    Color ClrBack = Color.blue;
    Color ClrText = Color.white;
    
    Canvas canvas = new Canvas();
    
        public static void main(String[] args) {
            new Project().start(args);
        }
        
        public void run(){
            display();
        }
        
        public void display(){
            Label = new JLabel("     Code Exchange                        ");
            Label.setFont(new Font("Calibri", Font.PLAIN, 32));
            Label.setBackground(ClrBack);
            Label.setForeground(ClrText);
            
            Home = new JButton("Home");
            Home.setFont(new Font("Calibri", Font.PLAIN, 24));
            Home.setBackground(ClrBack);
            Home.setForeground(ClrText);
            
            Notifications = new JButton("Notifications");
            Notifications.setFont(new Font("Calibri", Font.PLAIN, 24));
            Notifications.setBackground(ClrBack);
            Notifications.setForeground(ClrText);
            
            Profile = new JButton("Profile");
            Profile.setFont(new Font("Calibri", Font.PLAIN, 24));
            Profile.setBackground(ClrBack);
            Profile.setForeground(ClrText);
            
            ProfilePic = new JButton("  ");
            ProfilePic.setVisible(false);
            ProfilePic.setBackground(Color.white);
            
            Requests = new JButton("View requests");
            Requests.setFont(new Font("Calibri", Font.PLAIN, 24));
            Requests.setBackground(ClrBack);
            Requests.setForeground(ClrText);
            
           Settings = new JButton("Settings");
            Settings.setFont(new Font("Calibri", Font.PLAIN, 24));
            Settings.setBackground(ClrBack);
            Settings.setForeground(ClrText);
            
            add(Label,BorderLayout.NORTH);
            add(Home,BorderLayout.NORTH);
            add(Notifications,BorderLayout.NORTH);
            add(Profile,BorderLayout.NORTH);
            add(ProfilePic,BorderLayout.NORTH);
            add(Requests,BorderLayout.EAST);
            add(new JLabel(" "),BorderLayout.EAST);
            add(Settings,BorderLayout.EAST);
            add(canvas,BorderLayout.CENTER);
            Home.addActionListener(this);
            Notifications.addActionListener(this);
            Profile.addActionListener(this);
            ProfilePic.addActionListener(this);
            Requests.addActionListener(this);
            Settings.addActionListener(this);
           
        }
     
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Home")) {
                System.out.println("Current: Home");
                canvas.Home();
            }
            if(e.getActionCommand().equals("Notifications")){
                System.out.println("Displaying: Notifications");
            }
        
            if(e.getActionCommand().equals("Profile")||e.getActionCommand().equals("  ")){
                System.out.println("Displaying: Profile");
            } 
            if(e.getActionCommand().equals("Requests")){
                System.out.println("Displaying: Requests");
            } 
            if(e.getActionCommand().equals("Settings")){
                System.out.println("Displaying: Settings");
            } 
        }
}

        

