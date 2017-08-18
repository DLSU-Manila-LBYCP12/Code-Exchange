package project;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
//import acmx.export.javax.swing.JButton;
//import acmx.export.javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;


public class CodeExchange extends Program {
    public CodeExchangeDataBase database;
    public static int APPLICATION_WIDTH=800;
    public static int APPLICATIUON_HEIGHT=800;
    
    JLabel Label;
    JButton Home;
    JButton Notifications;
    JButton Profile;
    JButton ProfilePic;
    JButton Requests;
    JButton Settings;
    JButton Login;
    JButton Signup;
    
    Color ClrBack = Color.blue;
    Color ClrText = Color.white;
    
    Boolean checkProfile = false;
    
    CodeExchangeLogInScreenCanvas canvas = new CodeExchangeLogInScreenCanvas();
    LogInScreen login = new LogInScreen();
    
    
    
        public static void main(String[] args) {
            new CodeExchange().start(args);
        }
        
        public void run(){
        try {
            initDataBase();
        } catch (IOException ex) {
            Logger.getLogger(CodeExchange.class.getName()).log(Level.SEVERE, null, ex);
        }
            loginScreen();
//            display();
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
            
            Requests = new JButton("View Requests");
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
                
            }
            if(e.getActionCommand().equals("Notifications")){
                System.out.println("Displaying: Notifications");
            }
        
            if(e.getActionCommand().equals("Profile")||e.getActionCommand().equals("  ")){
                System.out.println("Displaying: Profile");
            } 
            if(e.getActionCommand().equals("View Requests")){
                System.out.println("Displaying: Requests");
            } 
            if(e.getActionCommand().equals("Settings")){
                System.out.println("Displaying: Settings");
            } 
            if(e.getActionCommand().equals("Log in")){
                System.out.println("Displaying: Login screen");
                //login.
            } 
            
            if (e.getActionCommand().equals("Sign up")) {
                System.out.println("Displaying: Signup screen");
                String[] options = new String[]{"User", "Coder", "Cancel"};
                int choice = JOptionPane.showOptionDialog(null, "Select the type of account you want to create.", "Register",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options, options[0]);
                switch (choice) {
                    case 0:
                        registrationUser();
                        break;
                    case 1:
                        registrationCoder();
                        break;
                    case 2:
                        break;
                    default:
                        break;
                }
            }
        }

    private void loginScreen() {
            Label = new JLabel("                 Code Exchange                        ");
            Label.setFont(new Font("Calibri", Font.PLAIN, 32));
            Label.setBackground(ClrBack);
            Label.setForeground(ClrText);
            
            Login = new JButton("Log in");
            Login.setFont(new Font("Calibri", Font.PLAIN, 24));
            Login.setBackground(ClrBack);
            Login.setForeground(ClrText);
            Login.addActionListener(this);
            
            Signup = new JButton("Sign up");
            Signup.setFont(new Font("Calibri", Font.PLAIN, 24));
            Signup.setBackground(ClrBack);
            Signup.setForeground(ClrText);
            Signup.addActionListener(this);
            
            
            add(Label,BorderLayout.NORTH);
            add(canvas,BorderLayout.CENTER );
            add(Login,BorderLayout.EAST );
            add(Signup,BorderLayout.EAST );
            addActionListeners();
            canvas.showMessage("This is a test message.");
         }
    
    private void registrationUser() {
        JFrame reg = new JFrame("Register");
        
        reg.setVisible(true);
        reg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RegistrationUser newForm = new RegistrationUser();
        reg.setSize(500,450);
        newForm.setVisible(true);
        reg.add(newForm);
    }
    private void registrationCoder() {
        JFrame reg = new JFrame("Register");
        
        reg.setVisible(true);
        reg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RegistrationCoder newForm = new RegistrationCoder();
        reg.setSize(500,450);
        newForm.setVisible(true);
        reg.add(newForm);
    }

    private void initDataBase() throws IOException {
        database = new CodeExchangeDataBase();
        database.printAllProfiles();
    }
}

        

