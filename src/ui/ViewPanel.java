/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.regex.*;

import javax.swing.JOptionPane;
import model.user;
/**
 *
 * @author payal
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private user newUser;
    public ViewPanel(user newUser) {
        initComponents();
        this.newUser = newUser;
        populateData();
    }

    ViewPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstName = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        email_validation = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        fname_validation = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        age_validation = new javax.swing.JLabel();
        message_validation = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        lName_validation = new javax.swing.JLabel();

        firstName.setText("First Name:");

        emailLabel.setText("Age:");

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyReleased(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("View User Form");

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        lastNameLabel.setText("Email:");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyReleased(evt);
            }
        });

        ageLabel.setText("Last Name:");

        messageLabel.setText("Message:");

        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(280, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(age_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstName)
                                .addComponent(ageLabel)
                                .addComponent(emailLabel)
                                .addComponent(lastNameLabel)
                                .addComponent(messageLabel))
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(lastNameTextField)
                                .addComponent(ageTextField)
                                .addComponent(emailTextField)
                                .addComponent(messageTextField))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(email_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lName_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fname_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(message_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(130, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstName)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fname_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lName_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ageLabel)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(emailLabel)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(age_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(email_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageLabel)
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(message_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(143, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void lastNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[a-zA-Z]{0,30}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(lastNameTextField.getText());
        if(!match.matches()){
            lName_validation.setText("Invalid last Name");
        }
        else
        lName_validation.setText(null);
    }//GEN-LAST:event_lastNameTextFieldKeyReleased

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(emailTextField.getText());
        if(!match.matches()){
            email_validation.setText("Invalid Email");
        }
        else
        email_validation.setText(null);
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void firstNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[a-zA-Z]{0,30}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(firstNameTextField.getText());
        if(!match.matches()){
            fname_validation.setText("Invalid First Name");
        }
        else
        fname_validation.setText(null);
    }//GEN-LAST:event_firstNameTextFieldKeyReleased

    private void ageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[0-9]{0,3}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(ageTextField.getText());
        if(!match.matches()){
            age_validation.setText("Invalid Age");
        }
        else
        age_validation.setText(null);
    }//GEN-LAST:event_ageTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel age_validation;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel email_validation;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel fname_validation;
    private javax.swing.JLabel lName_validation;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JLabel message_validation;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        firstNameTextField.setText(this.newUser.getFirstName());
        lastNameTextField.setText(this.newUser.getLastName());
        ageTextField.setText(this.newUser.getAge());
        emailTextField.setText(this.newUser.getEmail());
        messageTextField.setText(this.newUser.getMessage());
    }
}
