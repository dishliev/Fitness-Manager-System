/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessmanagersystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DISHLIEV
 */
public class AdminW extends javax.swing.JPanel {

    /**
     * Creates new form AdminW
     */
    public AdminW() {
        initComponents();
    }
          
     public Connection getConnection()
   {
      
       Connection con;
    
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/fitness-manager-system?characterEncoding=utf8", "root","");
           //
           return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
     public void executeSQlQuery(String query, String message)
   {
       Connection con = getConnection();
       Statement st;
       try{
           st = con.createStatement();
          if((st.executeUpdate(query)) == 1)
          {

               
               JOptionPane.showMessageDialog(null, "Данните са "+message+" Успешно!");
           }else{
               JOptionPane.showMessageDialog(null, "Данните не са "+message);
          }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
      public static class Function2{
       
       Connection con = null;
       ResultSet rs = null;
    
       PreparedStatement ps = null;
 
      
       
       
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/fitness-manager-system?characterEncoding=utf8", "root","");

        
ps = con.prepareStatement("SELECT * FROM `adminsinfo` WHERE `id` =?");

           ps.setString(1, s);
         
           
          
           rs = ps.executeQuery();
           
           
       
           
           }
           catch(Exception ex){
           //    JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
          
       }
 
      
    }
        public static class Function3{
       
       Connection con = null;
       ResultSet rs = null;
    
       PreparedStatement ps = null;
 
      
       
       
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/fitness-manager-system?characterEncoding=utf8", "root","");

        
ps = con.prepareStatement("SELECT * FROM `trainerinfo` WHERE `id` =?");

           ps.setString(1, s);
         
           
          
           rs = ps.executeQuery();
           
           
       
           
           }
           catch(Exception ex){
           //    JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
          
       }
 
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Emaila = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_infoa = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Telephoneaa = new javax.swing.JTextField();
        jTextField_fNameAdmina = new javax.swing.JTextField();
        jTextField_lNameAdmina = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_idADMINa = new javax.swing.JTextField();
        ajTextField_Streeta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_AdminAgea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_middleNamea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField_usernamea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        type111 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox_Citya = new javax.swing.JTextField();
        jComboBox_Sexa = new javax.swing.JTextField();

        jTextField_Emaila.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_EmailaKeyTyped(evt);
            }
        });

        jTextArea_infoa.setColumns(20);
        jTextArea_infoa.setRows(5);
        jTextArea_infoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea_infoaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea_infoa);

        jLabel16.setText("Телефон:");

        jLabel17.setText("Емайл:");

        jLabel14.setText("Име:");

        jTextField_Telephoneaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TelephoneaaKeyTyped(evt);
            }
        });

        jTextField_fNameAdmina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_fNameAdminaKeyTyped(evt);
            }
        });

        jTextField_lNameAdmina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_lNameAdminaKeyTyped(evt);
            }
        });

        jLabel18.setText("Бележка:");

        jLabel13.setText("Фамилия:");

        jLabel10.setText("ID номер:");

        jTextField_idADMINa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_idADMINaKeyTyped(evt);
            }
        });

        ajTextField_Streeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ajTextField_StreetaKeyTyped(evt);
            }
        });

        jLabel12.setText("Улица:");

        jLabel11.setText("Град:");

        jLabel8.setText("username:");

        jTextField_AdminAgea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AdminAgeaActionPerformed(evt);
            }
        });
        jTextField_AdminAgea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_AdminAgeaKeyTyped(evt);
            }
        });

        jLabel2.setText("Парола:");

        jLabel9.setText("Дата на раждане:");

        jLabel7.setText("Пол:");

        jTextField_middleNamea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_middleNameaKeyTyped(evt);
            }
        });

        jLabel5.setText("Презиме:");

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jTextField_usernamea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_usernameaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_usernameaKeyTyped(evt);
            }
        });

        jLabel3.setText("Повтори парола:");

        jLabel1.setText("Служител:");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\delete.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\Untitled-28-128.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(type111, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_idADMINa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_fNameAdmina)
                                    .addComponent(jTextField_lNameAdmina)
                                    .addComponent(jTextField_usernamea)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox_Sexa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox_Citya, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_Emaila, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_AdminAgea, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_middleNamea, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ajTextField_Streeta, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_Telephoneaa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jButton2)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_middleNamea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_AdminAgea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox_Sexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Citya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ajTextField_Streeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jTextField_Telephoneaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Emaila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_idADMINa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_fNameAdmina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_lNameAdmina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_usernamea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(192, 192, 192)
                        .addComponent(jButton2)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_EmailaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_EmailaKeyTyped
      
    }//GEN-LAST:event_jTextField_EmailaKeyTyped

    private void jTextArea_infoaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_infoaKeyTyped
     
    }//GEN-LAST:event_jTextArea_infoaKeyTyped

    private void jTextField_TelephoneaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelephoneaaKeyTyped
      
    }//GEN-LAST:event_jTextField_TelephoneaaKeyTyped

    private void jTextField_fNameAdminaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_fNameAdminaKeyTyped
       
    }//GEN-LAST:event_jTextField_fNameAdminaKeyTyped

    private void jTextField_lNameAdminaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_lNameAdminaKeyTyped
     
    }//GEN-LAST:event_jTextField_lNameAdminaKeyTyped

    private void jTextField_idADMINaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_idADMINaKeyTyped
   
    }//GEN-LAST:event_jTextField_idADMINaKeyTyped

    private void ajTextField_StreetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ajTextField_StreetaKeyTyped
       
    }//GEN-LAST:event_ajTextField_StreetaKeyTyped

    private void jTextField_AdminAgeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AdminAgeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AdminAgeaActionPerformed

    private void jTextField_AdminAgeaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AdminAgeaKeyTyped
      
    }//GEN-LAST:event_jTextField_AdminAgeaKeyTyped

    private void jTextField_middleNameaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_middleNameaKeyTyped
      
    }//GEN-LAST:event_jTextField_middleNameaKeyTyped

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed

 
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
      
    }//GEN-LAST:event_jPasswordField2KeyTyped

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
   
     
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
       
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jTextField_usernameaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_usernameaKeyPressed
   
    }//GEN-LAST:event_jTextField_usernameaKeyPressed

    private void jTextField_usernameaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_usernameaKeyTyped
     
    }//GEN-LAST:event_jTextField_usernameaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   delAd frame = new delAd();
frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setVisible(true);   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

   String query999 = "UPDATE `admins` SET `firstName`='"+jTextField_fNameAdmina.getText()+"',`lastName`='"+jTextField_lNameAdmina.getText()+"',`username`='"+jTextField_usernamea.getText()+"',`password`='"+jPasswordField1.getText()+"' WHERE `id` = "+jTextField_idADMINa.getText();
        executeSQlQuery(query999, "Променени");
        
          String query9993 = "UPDATE `admins_info` SET `middleName`='"+jTextField_middleNamea.getText()+"',`age`='"+jTextField_AdminAgea.getText()+"',`city`='"+jComboBox_Citya.getText()+"',`street`='"+ajTextField_Streeta.getText()+"',`telephone`='"+jTextField_Telephoneaa.getText()+"',`email`='"+jTextField_Emaila.getText()+"',`info`='"+jTextArea_infoa.getText()+"' WHERE `id` = "+jTextField_idADMINa.getText();
        executeSQlQuery(query9993, "");
      
     
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ajTextField_Streeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JTextField jComboBox_Citya;
    public static javax.swing.JTextField jComboBox_Sexa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea_infoa;
    public static javax.swing.JTextField jTextField_AdminAgea;
    public static javax.swing.JTextField jTextField_Emaila;
    public static javax.swing.JTextField jTextField_Telephoneaa;
    public static javax.swing.JTextField jTextField_fNameAdmina;
    public static javax.swing.JTextField jTextField_idADMINa;
    public static javax.swing.JTextField jTextField_lNameAdmina;
    public static javax.swing.JTextField jTextField_middleNamea;
    public static javax.swing.JTextField jTextField_usernamea;
    public static javax.swing.JTextField type111;
    // End of variables declaration//GEN-END:variables
}
