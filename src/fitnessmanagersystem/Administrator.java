/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessmanagersystem;

import static fitnessmanagersystem.GUI.Panel11;

import static fitnessmanagersystem.Administrator.jTable2sdad;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import static fitnessmanagersystem.GUI.Panel11;
import static fitnessmanagersystem.SearchClient.jTable1_clients;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import static fitnessmanagersystem.AddAdministrator1.jButton11111111;
import static fitnessmanagersystem.AddAdministrator1.jCheckBox_dataAdmin;
import static fitnessmanagersystem.AddAdministrator1.jComboBox_Sex;
import static fitnessmanagersystem.AddAdministrator1.jComboBox_City;
import static fitnessmanagersystem.AddAdministrator1.jTextArea_info;

import static fitnessmanagersystem.AddAdministrator1.jTextField_middleName;

import static fitnessmanagersystem.AddAdministrator1.jTextField_AdminAge;
import static fitnessmanagersystem.AddAdministrator1.jTextField_Email;
import static fitnessmanagersystem.AddAdministrator1.jTextField_Street;
import static fitnessmanagersystem.AddAdministrator1.jTextField_Telephone;
import static fitnessmanagersystem.AddAdministrator1.jTextField_idADMIN;
import static fitnessmanagersystem.AddProduct.jTextField_IdProducts;
import static fitnessmanagersystem.AdminW.ajTextField_Streeta;
import static fitnessmanagersystem.AdminW.jComboBox_Citya;
import static fitnessmanagersystem.AdminW.jComboBox_Sexa;

import static fitnessmanagersystem.AdminW.jTextArea_infoa;
import static fitnessmanagersystem.AdminW.jTextField_AdminAgea;
import static fitnessmanagersystem.AdminW.jTextField_Emaila;
import static fitnessmanagersystem.AdminW.jTextField_Telephoneaa;
import static fitnessmanagersystem.AdminW.jTextField_fNameAdmina;
import static fitnessmanagersystem.AdminW.jTextField_idADMINa;
import static fitnessmanagersystem.AdminW.jTextField_lNameAdmina;
import static fitnessmanagersystem.AdminW.jTextField_middleNamea;
import static fitnessmanagersystem.AdminW.jTextField_usernamea;
import static fitnessmanagersystem.AdminW.type111;


import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.HeadlessException;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JTable;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


/**
 *
 * @author DISHLIEV
 */
public final class Administrator extends javax.swing.JPanel {

    /**
     * Creates new form Administrator
     */
    public Administrator() {
        initComponents();
  
      
        findUsers();
        }
      public static String id1;
    public static String firstName1;
    public static String lastName1;
    public static String username1;
    public static String type1;

    
   public Connection getConnection()
   {
       Connection con;
    
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/fitness-manager-system?characterEncoding=utf8", "root","");
         
           return con;
       } catch (Exception e) {
       
      return null;
       }
      
   }
        public ArrayList<Admins> ListUsers(String valToSearch){
            ArrayList<Admins> usersList = new ArrayList<>();
          
            Statement st;
            ResultSet rs;
            
            try{
                   Connection con = getConnection();
             st= con.createStatement();
            String searchQuery = "SELECT * FROM  `admins`  WHERE CONCAT(`id`,`username`, `firstName`, `lastName`,  `type` ) LIKE'%"+valToSearch+"%' UNION SELECT * FROM `trainerlogin` WHERE CONCAT(`id`,`username`, `firstName`, `lastName` ) LIKE'%"+valToSearch+"%'";
            
             rs = st.executeQuery(searchQuery);
             Admins user;
             
             while(rs.next()){
             
                 user = new Admins(rs.getInt("id"),rs.getString("username"),rs.getString("firstName"), rs.getString("lastName"), rs.getString("type"));
                   usersList.add(user);
             }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
   return usersList;
   
        }
        
        public void findUsers(){
               ArrayList<Admins> users = ListUsers(jTextField1.getText());
               
       DefaultTableModel model = new DefaultTableModel();
       final JTable table = new JTable(model);
      model.setColumnIdentifiers(new Object[]{"ID номер","username","име","фамилия","тип"});
       Object[] row = new Object[5];
        for (Admins user : users) {
            row[0] = user.getID();
            row[1] = user.getUsername();
            row[2] = user.getFirstName();
            row[3] = user.getLastName();
             row[4] = user.getType();
           
            model.addRow(row);
        }
       jTable2sdad.setModel(model);
    
}
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPanel = new javax.swing.JPanel();
        jPanelqq = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2sdad = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jPanelqq.setPreferredSize(new java.awt.Dimension(955, 484));

        jTable2sdad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2sdad);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\delete.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\open.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\cancel.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\addadminnew-icon.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelqqLayout = new javax.swing.GroupLayout(jPanelqq);
        jPanelqq.setLayout(jPanelqqLayout);
        jPanelqqLayout.setHorizontalGroup(
            jPanelqqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelqqLayout.createSequentialGroup()
                .addGroup(jPanelqqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelqqLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(87, 87, 87)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4))
                    .addGroup(jPanelqqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanelqqLayout.setVerticalGroup(
            jPanelqqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelqqLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanelqqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanelqqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3)
                        .addComponent(jButton2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelqq, javax.swing.GroupLayout.PREFERRED_SIZE, 1734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelqq, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AddAdministrator1 p1 = new AddAdministrator1();
    p1.setSize(1000, 500);
    p1.setLocation(0, 0);
    
    Panel11.removeAll();
    Panel11.add(p1,BorderLayout.AFTER_LAST_LINE);
    Panel11.revalidate();
    Panel11.repaint();
    
     
        jTextField_middleName.setEnabled(false);
   
       jComboBox_Sex.setEnabled(false);
        jTextField_AdminAge.setEnabled(false);
        jComboBox_City.setEnabled(false);
        jTextField_Street.setEnabled(false);
          jTextField_Telephone.setEnabled(false);
             jTextField_Email.setEnabled(false);
              jTextArea_info.setEnabled(false);
              jButton11111111.setEnabled(false);
             
            

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            HomePanel p1 = new HomePanel();
                            p1.setSize(949, 100);
                            p1.setLocation(0, 0);
                            
                            Panel11.setLayout(new GridLayout(0,1));
                            Panel11.removeAll();
                            Panel11.add(p1,BorderLayout.PAGE_END);
                            Panel11.revalidate();
                            Panel11.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
      jTextField1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
   findUsers();
         
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
     findUsers();
         
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
           findUsers();
            }

        });
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//jTextField_idADMINa.setEditable(false);
//type111.setEditable(false);
//jComboBox_Sexa.setEditable(false);
        
        
        
        int row = jTable2sdad.getSelectedRow();

if(row == -1)
{
  JOptionPane.showMessageDialog(null,"Изберете администратор!");
}
else
{
         
        AdminW p1 = new AdminW();
        p1.setSize(1000, 500);
        p1.setLocation(0, 0);
        Panel11.removeAll();
        Panel11.add(p1,BorderLayout.AFTER_LAST_LINE);
        Panel11.revalidate();
        Panel11.repaint();
        TableModel model = jTable2sdad.getModel();
        int i = jTable2sdad.getSelectedRow();
        Administrator.id1 = model.getValueAt(i,0).toString();
        Administrator.username1 = model.getValueAt(i,1).toString();
        Administrator.firstName1 = model.getValueAt(i,2).toString();
        Administrator.lastName1 = model.getValueAt(i,3).toString();
        Administrator.type1 = model.getValueAt(i,4).toString();
       
        jTextField_idADMINa.setText(id1);
        jTextField_fNameAdmina.setText(firstName1);
        jTextField_lNameAdmina.setText(lastName1);
        jTextField_usernamea.setText(username1);
        type111.setText(type1);
        
       
   if(type1.equals("администратор")){


          AdminW.Function2 f = new AdminW.Function2 ();
ResultSet rs = null;



rs = f.find(model.getValueAt(i,0).toString());

try{
    if(rs.next()){
     
  
    
     jTextField_middleNamea.setText(rs.getString("middleName"));
  
          jTextField_AdminAgea.setText(rs.getString("age"));
          jTextField_Emaila.setText(rs.getString("email"));
          jTextArea_infoa.setText(rs.getString("info"));
          jTextField_Telephoneaa.setText(rs.getString("telephone"));
          ajTextField_Streeta.setText(rs.getString("street"));
          jComboBox_Citya.setText(rs.getString("city"));
          jComboBox_Sexa.setText(rs.getString("sex"));
     
  //    jLabel6sdssssssssssssss.setText(rs.getString("periodDays"));
  
    //        jLabel9dddddddddddddd.setText(rs.getString("visits"));
    //   
    

  
    }
    else{
  
    }
}catch(  SQLException | NumberFormatException | HeadlessException ex){
     JOptionPane.showMessageDialog(null, ex.getMessage());
    
}  }
   else{
       
          AdminW.Function3 f = new AdminW.Function3();
ResultSet rs = null;



rs = f.find(model.getValueAt(i,0).toString());

try{
    if(rs.next()){
     
  
 jTextField_middleNamea.setText(rs.getString("middleName"));
  
          jTextField_AdminAgea.setText(rs.getString("age"));
          jTextField_Emaila.setText(rs.getString("email"));
          jTextArea_infoa.setText(rs.getString("info"));
          jTextField_Telephoneaa.setText(rs.getString("telephone"));
          ajTextField_Streeta.setText(rs.getString("street"));
          jComboBox_Citya.setText(rs.getString("city"));
          jComboBox_Sexa.setText(rs.getString("sex"));

  
    }
    else{
  
    }
}catch(  SQLException | NumberFormatException | HeadlessException ex){
     JOptionPane.showMessageDialog(null, ex.getMessage());
    
}  }
       
       
       
}
/*
     try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fitness-manager-system","root","");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from clientsimages where ID = '"+id+"'");
                if(rs.next()){
                    byte[] img = rs.getBytes("Image");


                    //Resize The ImageIcon
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(195,195,Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    jLabel1000.setIcon(newImage);
                }
                
                else{
                  //  JOptionPane.showMessageDialog(null, "Няма снимка!");
                }
            }catch(SQLException | HeadlessException ex){
            }
        
        */
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           
        DeleteAdmin frame = new DeleteAdmin();
frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanelqq;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable2sdad;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
