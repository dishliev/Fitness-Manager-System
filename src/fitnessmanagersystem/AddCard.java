/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessmanagersystem;

import static fitnessmanagersystem.Administrator.jTable2sdad;
import static fitnessmanagersystem.GUI.Panel11;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DISHLIEV
 */
public class AddCard extends javax.swing.JPanel {

    /**
     * Creates new form AddCard
     */
    public AddCard() {
        initComponents();
        findUsers();
    }
    
 public int compareTimes(Date d1, Date d2)
{
    int     t1;
    int     t2;

    t1 = (int) (d1.getTime() % (24*60*60*1000L));
    t2 = (int) (d2.getTime() % (24*60*60*1000L));
    return (t1 - t2);
}
    
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
          public void executeSQlQuery(String query, String message)
   {
       Connection con = getConnection();
       Statement st;
   
       try{
       
           st = con.createStatement();
          if((st.executeUpdate(query)) == 1)
          {

               
           //    JOptionPane.showMessageDialog(null, "Данните са "+message+" Успешно!");
           }else{
               JOptionPane.showMessageDialog(null, "Данните не са "+message);
          }
       }catch(SQLException | HeadlessException ex){
       }
   }
        public ArrayList<Cards> ListUsers(String valToSearch){
            ArrayList<Cards> usersList = new ArrayList<>();
          
            Statement st;
            ResultSet rs;
            
            try{
                   Connection con = getConnection();
             st= con.createStatement();
            String searchQuery = "SELECT * FROM  `fitness_cards`  WHERE CONCAT(`type`,`visits`, `periodDays`, `price` ) LIKE'%"+valToSearch+"%'";
            
             rs = st.executeQuery(searchQuery);
             Cards user;
             
             while(rs.next()){
                     
             
                 user = new Cards(rs.getString("type"), rs.getInt("visits") ,rs.getInt("periodDays"), rs.getDouble("price"));
                   
                 usersList.add(user);
             }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
   return usersList;
   
        }
        
        public void findUsers(){
               ArrayList<Cards> users = ListUsers(jTextField3sdfvsadf.getText());
               
       DefaultTableModel model = new DefaultTableModel();
       final JTable table = new JTable(model);
      model.setColumnIdentifiers(new Object[]{"вид карта","посещения","валидност в дни","цена"});
       Object[] row = new Object[4];
        for (Cards user : users) {
            row[0] = user.getType();
            row[1] = user.getVisits();
            row[2] = user.getPeriodDays();
            row[3] = user.getPrice();
           
            
            
            int visits1 = user.getVisits();  //ако посещенията в базата са -1 да се изписва в таблицата "неограничени"
             if(visits1==-1){
                  row[1]="неограничени";
            }
           
            model.addRow(row);
        }
       jTable1cardss.setModel(model);
    
}
      

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_typeC = new javax.swing.JTextField();
        jTextField_visitsC = new javax.swing.JTextField();
        jTextField_priceC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox_poseshteniq = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField_daysC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1cardss = new javax.swing.JTable();
        jTextField3sdfvsadf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Име на  карта:");

        jLabel3.setText("Цена:");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\gnome_media_floppy.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\cancel.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox_poseshteniq.setText("ограничение за брой посещения");
        jCheckBox_poseshteniq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_poseshteniqMouseClicked(evt);
            }
        });

        jLabel5.setText("Период на валидност (в дни):");

        jTable1cardss.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1cardss);

        jTextField3sdfvsadf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3sdfvsadfKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Списък с карти");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Нова фитнес карта");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\search-icon.png")); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\delete.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jCheckBox_poseshteniq)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(311, 311, 311))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_typeC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_daysC, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_visitsC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addComponent(jTextField_priceC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3sdfvsadf, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_typeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_visitsC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_poseshteniq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_daysC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_priceC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3sdfvsadf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addContainerGap())))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jCheckBox_poseshteniq.isSelected()){
        
        
        String query =
        "INSERT INTO `fitness_cards`(`type`,`visits`,`periodDays`, `price`) VALUES ('"+jTextField_typeC.getText()+"','"+jTextField_visitsC.getText()+"','"+jTextField_daysC.getText()+"','"+jTextField_priceC.getText()+"')";
        executeSQlQuery(query, "записана");
}else{
 String query =
        "INSERT INTO `fitness_cards`(`type`,`periodDays`, `price`) VALUES ('"+jTextField_typeC.getText()+"','"+jTextField_daysC.getText()+"','"+jTextField_priceC.getText()+"')";
        executeSQlQuery(query, "записана");
}
  findUsers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      HomePanel p1 = new HomePanel();
                            p1.setSize(949, 100);
                            p1.setLocation(0, 0);
                            
                            Panel11.setLayout(new GridLayout(0,1));
                            Panel11.removeAll();
                            Panel11.add(p1,BorderLayout.PAGE_END);
                            Panel11.revalidate();
                            Panel11.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox_poseshteniqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_poseshteniqMouseClicked
           if(jCheckBox_poseshteniq.isSelected()){    jTextField_visitsC.setEnabled(true);}
      else{
        jTextField_visitsC.setEnabled(false);}
    }//GEN-LAST:event_jCheckBox_poseshteniqMouseClicked

    private void jTextField3sdfvsadfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3sdfvsadfKeyTyped
           jTextField3sdfvsadf.getDocument().addDocumentListener(new DocumentListener() {

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
    }//GEN-LAST:event_jTextField3sdfvsadfKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        DelFCa frame = new DelFCa();
frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setVisible(true);    
        
        
      
      
 
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox_poseshteniq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1cardss;
    private javax.swing.JTextField jTextField3sdfvsadf;
    private javax.swing.JTextField jTextField_daysC;
    private javax.swing.JTextField jTextField_priceC;
    private javax.swing.JTextField jTextField_typeC;
    public static javax.swing.JTextField jTextField_visitsC;
    // End of variables declaration//GEN-END:variables
}
