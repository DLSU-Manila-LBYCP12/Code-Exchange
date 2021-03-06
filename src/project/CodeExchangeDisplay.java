package project;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iwcnrlee1
 */
public class CodeExchangeDisplay extends javax.swing.JFrame {

    public CodeExchangeDataBase database;
    public Boolean Logged = false;
    // Get the size of the screen
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form NewJFrame
     */
    public CodeExchangeDisplay() throws IOException {
        initDataBase();
        initComponents();
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        stats = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeExhange by Rivera, Lee, Minguez");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("jLabel1");
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/project/9c8c6fd5-3565-45cf-8805-9bad492e0084.png"))); // NOI18N
        jLabel1.setEnabled(false);
        jLabel1.setFocusTraversalPolicyProvider(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Register Sans BTN", 1, 36)); // NOI18N
        jLabel2.setText("Welcome to Code Exchange!");

        loginBtn.setFont(new java.awt.Font("Symphony Black", 1, 14)); // NOI18N
        loginBtn.setText("Log In");
        loginBtn.setAutoscrolls(true);
        loginBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginBtn.setBorderPainted(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signupBtn.setFont(new java.awt.Font("Swis721 Ex BT", 1, 14)); // NOI18N
        signupBtn.setText("Sign Up");
        signupBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signupBtn.setBorderPainted(false);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        label3.setBackground(new java.awt.Color(204, 255, 255));
        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("___________________________________________________________________");

        label4.setBackground(new java.awt.Color(204, 255, 255));
        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("___________________________________________________________________");

        jLabel3.setFont(new java.awt.Font("Register Sans BTN", 1, 36)); // NOI18N
        jLabel3.setText("Do you want to Log in or Sign up?");

        stats.setText("Stats");
        stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(stats)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stats)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try {
            database.updateDataBase();
        } catch (IOException ex) {
            Logger.getLogger(CodeExchangeDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.Window dialog = SwingUtilities.windowForComponent(loginBtn);
        System.out.println("Displaying: Login screen");
        JFrame log = new JFrame("LogIn");
        log.setVisible(true);
        log.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LogInScreen newForm = null;
        try {
            newForm = new LogInScreen(database,  dialog);
        } catch (IOException ex) {
            Logger.getLogger(CodeExchangeDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        log.setSize(500, 350);
        log.setLocation(WIDTH, WIDTH);
        newForm.setVisible(true);
        log.add(newForm);

        
        int w = log.getSize().width;
        int h = log.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

       
        log.setLocation(x, y);

        Logged = true;
        //UpdateScreen();
        Logged = true;
//        UpdateScreen();
    }//GEN-LAST:event_loginBtnActionPerformed
    
    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        System.out.println("Displaying: Signup screen");
        String[] options = new String[]{"User", "Coder", "Cancel"};
        int choice = JOptionPane.showOptionDialog(null, "Select the type of account you want to create.", "Register",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        switch (choice) {
            case 0:
        {
            try {
                registrationUser();
            } catch (IOException ex) {
                Logger.getLogger(CodeExchangeDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 1:
        {
            try {
                registrationCoder();
            } catch (IOException ex) {
                Logger.getLogger(CodeExchangeDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 2:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_signupBtnActionPerformed

    private void statsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsActionPerformed

        // TODO add your handling code here:
        JFrame frame = new JFrame("Network Graph Visualization");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CodeExchangeNetworkGraph graph = null;
        try {
            graph = new CodeExchangeNetworkGraph(database);
        } catch (IOException ex) {
            Logger.getLogger(CodeExchangeDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
//        graph.start();
        frame.setSize(700,500);
        frame.setVisible(true);
        frame.add(graph.getContentPane());
        
    }//GEN-LAST:event_statsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CodeExchangeDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeExchangeDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeExchangeDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeExchangeDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CodeExchangeDisplay().setVisible(true);
                } catch (Exception e) {

                }
            }
        });
    }

    private void registrationUser() throws IOException {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame reg = new JFrame("Register");
        reg.setVisible(true);
        reg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RegistrationUser newForm = new RegistrationUser(database);
        reg.setSize(500, 500);
        newForm.setVisible(true);
        reg.add(newForm);
        int w = reg.getSize().width;
        int h = reg.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        reg.setLocation(x, y);
        database = new CodeExchangeDataBase();
    }

    private void registrationCoder() throws IOException {
        JFrame reg = new JFrame("Register");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        reg.setVisible(true);
        reg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RegistrationCoder newForm = new RegistrationCoder(database);
        reg.add(newForm);
        reg.setSize(500, 450);
        newForm.setVisible(true);
        int w = reg.getSize().width;
        int h = reg.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        reg.setLocation(x, y);
        
        database = new CodeExchangeDataBase();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton signupBtn;
    private javax.swing.JButton stats;
    // End of variables declaration//GEN-END:variables

    private void UpdateScreen() {
        removeAll();
    }

    private void initDataBase() throws IOException {
        database = new CodeExchangeDataBase();
        database.printAllProfiles();
    }
}
