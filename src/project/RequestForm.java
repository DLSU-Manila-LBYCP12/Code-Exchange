/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iwcnrlee1
 */
public class RequestForm extends javax.swing.JFrame {

    private String requester;

    /**
     * Creates new form RequestForm
     */
    public RequestForm(String name) {
        requester = name;
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        Project = new javax.swing.JLabel();
        projectNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        featuresField = new javax.swing.JTextArea();
        Description = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        Features = new javax.swing.JLabel();
        Language = new javax.swing.JLabel();
        languageField = new javax.swing.JTextField();
        Theme = new javax.swing.JLabel();
        themeField = new javax.swing.JTextField();
        Payment = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/9c8c6fd5-3565-45cf-8805-9bad492e0084.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Request Form");

        Project.setText("Project Name:");

        projectNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNameFieldActionPerformed(evt);
            }
        });

        featuresField.setColumns(20);
        featuresField.setRows(5);
        jScrollPane1.setViewportView(featuresField);

        Description.setText("Description:");

        descriptionField.setColumns(20);
        descriptionField.setRows(5);
        jScrollPane2.setViewportView(descriptionField);

        Features.setText("Additional Features:");

        Language.setText("Language Required:");

        languageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageFieldActionPerformed(evt);
            }
        });

        Theme.setText("Color Theme:");

        themeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeFieldActionPerformed(evt);
            }
        });

        Payment.setText("Payment:");

        paymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentFieldActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Project)
                            .addComponent(Description)
                            .addComponent(Features)
                            .addComponent(Language)
                            .addComponent(Theme)
                            .addComponent(Payment))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(projectNameField)
                            .addComponent(jScrollPane2)
                            .addComponent(languageField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(themeField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paymentField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addGap(87, 87, 87)
                .addComponent(cancelBtn)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Project)
                    .addComponent(projectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Description)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Features)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(Language)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Theme)
                            .addComponent(themeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Payment)
                            .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(languageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(submitBtn))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNameFieldActionPerformed

    private void languageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageFieldActionPerformed

    private void themeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themeFieldActionPerformed

    private void paymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentFieldActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cancelBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("Submitted a request form.");
        String n = System.lineSeparator();
        String submissionForm = "";
        submissionForm = requester + n + projectNameField.getText() + n + "start description" + n + descriptionField.getText() + n + "end description" + n + "start features" + n + featuresField.getText() + n + "end features" + n + languageField.getText() + n + themeField.getText() + n + paymentField.getText() + n + "end";
        String path = System.getProperty("user.dir") + "\\src\\project\\requests\\requests.txt";
        File f = new File(path);
        FileReader source;

        BufferedReader br;
        String temp;
        FileWriter writer;
        try {

            source = new FileReader(f);
            br = new BufferedReader(source);
            temp = br.readLine();
            br.close();
            if (temp.equals("")) {
                writer = new FileWriter(path, false);
            } else {
                writer = new FileWriter(path, true);
            }
            PrintWriter print = new PrintWriter(writer);
            print.println(submissionForm);
            print.close();
        } catch (IOException ex) {
            Logger.getLogger(RequestForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Request Submitted!");
        this.dispose();
    }//GEN-LAST:event_submitBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Description;
    private javax.swing.JLabel Features;
    private javax.swing.JLabel Language;
    private javax.swing.JLabel Payment;
    private javax.swing.JLabel Project;
    private javax.swing.JLabel Theme;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JTextArea featuresField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField languageField;
    private javax.swing.JTextField paymentField;
    private javax.swing.JTextField projectNameField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField themeField;
    // End of variables declaration//GEN-END:variables
}
