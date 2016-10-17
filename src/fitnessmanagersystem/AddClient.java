/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessmanagersystem;
import com.github.sarxos.webcam.Webcam;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import static fitnessmanagersystem.AddAdministrator1.jCheckBox_dataAdmin;
import static fitnessmanagersystem.AddClient.CardsPanel;
import static fitnessmanagersystem.AddClient.jTextField_Age;
import static fitnessmanagersystem.FitnessCards.jButton1asdasdsssssss;
import static fitnessmanagersystem.FitnessCards.jButton3sadgvasssssssss;

import static fitnessmanagersystem.FitnessCards.jComboBox_typeCard1111;
import static fitnessmanagersystem.FitnessCards.jTextField_days;
import static fitnessmanagersystem.FitnessCards.jTextField_price;
import static fitnessmanagersystem.FitnessCards.jTextField_visitsCards;
import static fitnessmanagersystem.GUI.Panel11;
import static fitnessmanagersystem.GUI.administrator;
import static fitnessmanagersystem.Picture.jButton1asdvasdvfasdfvsdvfsdvfsdvfs;
import static fitnessmanagersystem.Picture.jButton1sdvsdsvdvsvdsvdvs1;
import static fitnessmanagersystem.Picture.jButton2asdvasdv;
import static fitnessmanagersystem.Picture.jPanel1picture;
import static fitnessmanagersystem.SolariumCards.jButton1ererererererr;
import static fitnessmanagersystem.SolariumCards.jButton3asasassaasassasss;
import static fitnessmanagersystem.SolariumCards.jComboBox1asadadsasdasd;
import static fitnessmanagersystem.SolariumCards.jTextField1asdvasvd;
import static fitnessmanagersystem.SolariumCards.jTextField2periodsss;
import static fitnessmanagersystem.SolariumCards.jTextField3cenaaa;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.gray;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static javax.swing.DefaultButtonModel.SELECTED;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;
import org.jdesktop.swingx.prompt.PromptSupport;



/**
 *
 * @author DISHLIEV
 */
public class AddClient extends javax.swing.JPanel {
public static int dd;
     String s;
    public AddClient() {
    
      
        initComponents();
   
    
 
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

               
          
           }else{
             
          }
       }catch(SQLException | HeadlessException ex){
       }
   }


ResultSet rs = null;
String id = "id";
String fname = "fname";
String lname = "lname";
String dateOfBirdth = "dateOfBirdth";
String sex = "sex";
String telephone = "telephone";
String city = "city";
String street = "street";
String typeCard = "typeCard";
String visits = "visits";
String admin = "admin";

 public static void changed1() {
     if(jCheckBox_fitnesCard.isSelected()||jCheckBox2solarium.isSelected()) {
     if (jTextField_IdClient1.getText().equals("")||
             jTextField_FirstName.getText().equals("")||
             jTextField_LastName.getText().equals("")||
             jTextField_Age.getText().equals("")||
             jComboBox_Sex.getSelectedItem().toString().equals("")||
             jTextField_Telephone.getText().equals("")||
             jTextField_Email.getText().equals("")|| 
             jComboBox_City11111.getSelectedItem().toString().equals("")||
             jTextField_Street.getText().equals("")
             
             )
             
             {
      jButton222222222.setEnabled(false);
       changed1();
     }
     else {
       jButton222222222.setEnabled(true);
    }

}}
 
public ImageIcon ResizeImage(String imgPath){ 
ImageIcon MyImage = new ImageIcon(imgPath); 
Image img = MyImage.getImage(); 
Image newImage = img.getScaledInstance(jLabel10sadvasd.getWidth(), jLabel10sadvasd.getHeight(),Image.SCALE_SMOOTH); 
ImageIcon image = new ImageIcon(newImage);
return image;
} 
public static void EmailValidator()  {
    
   
        try {
            String mydomain = jTextField_Email.getText();
            String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            Boolean b = mydomain.matches(emailregex);
            
            if (b == false) {
           
                }else if(b == true){
                   
                     dd=1;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_IdClient1 = new javax.swing.JTextField();
        jTextField_FirstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_Age = new javax.swing.JTextField();
        jTextField_Street = new javax.swing.JTextField();
        jButton222222222 = new javax.swing.JButton();
        Validate1 = new javax.swing.JLabel();
        jTextField_Telephone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox_City11111 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jComboBox_Sex = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        CardsPanel = new javax.swing.JPanel();
        jCheckBox_fitnesCard = new javax.swing.JCheckBox();
        jCheckBox2solarium = new javax.swing.JCheckBox();
        jLabel10sadvasd = new javax.swing.JLabel();
        jButton1wevwevwe = new javax.swing.JButton();
        jButton2camera = new javax.swing.JButton();
        jCheckBox1_addPic = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(1120, 392));

        jLabel1.setText("ID номер:");

        jLabel2.setText("Име:");

        jLabel3.setText("Фамилия:");

        jLabel4.setText("Дата на раждане:");

        jLabel5.setText("Емайл:");

        jTextField_IdClient1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_IdClient1KeyTyped(evt);
            }
        });

        jTextField_FirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FirstNameKeyTyped(evt);
            }
        });

        jLabel6.setText("Град:");

        jLabel7.setText("ул.");

        jTextField_LastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_LastNameKeyTyped(evt);
            }
        });

        jTextField_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_EmailKeyTyped(evt);
            }
        });

        jTextField_Age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_AgeMouseClicked(evt);
            }
        });
        jTextField_Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_AgeKeyTyped(evt);
            }
        });

        jTextField_Street.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_StreetKeyTyped(evt);
            }
        });

        jButton222222222.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\gnome_media_floppy.png")); // NOI18N
        jButton222222222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton222222222ActionPerformed(evt);
            }
        });

        jTextField_Telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TelephoneKeyTyped(evt);
            }
        });

        jLabel9.setText("Телефон:");

        jComboBox_City11111.setEditable(true);
        jComboBox_City11111.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Айтос ", "Асеновград ", "Ахтопол ", "Балчик ", "Банкя", "Банско ", "Батак ", "Белене", "Белица ", "Белослав  ", "Берковица ", "Битоля ", "Благоевград ", "Ботевград", "Брацигово ", "Брезник ", "Бургас ", "Бяла ", "Варна ", "Велес", "Велики Преслав ", "Велико Търново ", "Велинград ", "Видин ", "Враца ", "Вършец ", "Габрово ", "Гевгели", "Горна Оряховица", "Гоце Делчев ", "Гюмюрджина ", "Дедеагач ", "Демир Хисар ", "Димитровград ", "Добрич ", "Дойран ", "Долна Баня ", "Долна Оряховица ", "Долни Дъбник ", "Драма ", "Дупница ", "Елена ", "Исперих ", "Ихтиман ", "Кавала ", "Каварна ", "Казанлък ", "Калофер ", "Карлово ", "Карнобат ", "Кешан ", "Китен ", "Козлодуй ", "Копривщица ", "Костенец ", "Костур ", "Котел ", "Кресна", "Крушево ", "Ксанти ", "Кукуш ", "Кърджали ", "Кюстендил ", "Лерин ", "Ловеч ", "Лозенград ", "Лом ", "Люле Бургас ", "Мадан ", "Мелник " }));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\cancel.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox_Sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "мъж", "жена" }));

        jLabel8.setText("Пол:");

        CardsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout CardsPanelLayout = new javax.swing.GroupLayout(CardsPanel);
        CardsPanel.setLayout(CardsPanelLayout);
        CardsPanelLayout.setHorizontalGroup(
            CardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        CardsPanelLayout.setVerticalGroup(
            CardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCheckBox_fitnesCard.setText("карта за фитнес");
        jCheckBox_fitnesCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_fitnesCardMouseClicked(evt);
            }
        });
        jCheckBox_fitnesCard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_fitnesCardItemStateChanged(evt);
            }
        });
        jCheckBox_fitnesCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_fitnesCardActionPerformed(evt);
            }
        });

        jCheckBox2solarium.setText("карта за солариум");
        jCheckBox2solarium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2solariumMouseClicked(evt);
            }
        });
        jCheckBox2solarium.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2solariumItemStateChanged(evt);
            }
        });
        jCheckBox2solarium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2solariumActionPerformed(evt);
            }
        });

        jLabel10sadvasd.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\User-blue-icon.png")); // NOI18N
        jLabel10sadvasd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1wevwevwe.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\folder-search-smal.png")); // NOI18N
        jButton1wevwevwe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1wevwevweActionPerformed(evt);
            }
        });

        jButton2camera.setIcon(new javax.swing.ImageIcon("C:\\Users\\DISHLIEV\\Documents\\1\\FitnessManagerSystem\\icons\\Camera-Next-icon.png")); // NOI18N
        jButton2camera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2cameraActionPerformed(evt);
            }
        });

        jCheckBox1_addPic.setText("добави снимка");
        jCheckBox1_addPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1_addPicMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_City11111, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jTextField_Street, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField_Telephone, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField_IdClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField_Age, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.Alignment.LEADING))))
                                            .addComponent(jComboBox_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox1_addPic)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jButton1wevwevwe)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton2camera))
                                                .addComponent(jLabel10sadvasd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(CardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Validate1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jCheckBox_fitnesCard)
                                .addGap(51, 51, 51)
                                .addComponent(jCheckBox2solarium)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton222222222)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_IdClient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_fitnesCard)
                    .addComponent(jCheckBox2solarium)
                    .addComponent(jCheckBox1_addPic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10sadvasd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1wevwevwe)
                            .addComponent(jButton2camera))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CardsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Validate1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox_City11111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(2, 2, 2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton222222222)
                                    .addComponent(jButton3))))
                        .addGap(41, 41, 41))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton222222222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton222222222ActionPerformed

         
        Date date12 = null;
String inputDate = jTextField_Age.getText();
try {
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    formatter.setLenient(false);
    date12 = formatter.parse(inputDate);
    
 
    EmailValidator();
      
        if(dd==1){
        
        
    if(jCheckBox1_addPic.isSelected()){    
        try{ Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fitness-manager-system","root",""); 
PreparedStatement ps = con.prepareStatement("insert into clients_images(id,Image) values(?,?)");


InputStream is = new FileInputStream(new File(s)); 
ps.setString(1, jTextField_IdClient1.getText());
ps.setBlob(2,is); 
ps.executeUpdate(); 

        
}catch(SQLException | FileNotFoundException | HeadlessException ex){ 

}
    }else{
    
    }
        
        
        
        
   Date date = new Date();
Format formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1 = formatter1.format(date);      
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Calendar c = Calendar.getInstance();
c.setTime(new Date()); // Now use today date.



     
           
        
        if(jCheckBox_fitnesCard.isSelected()) {
        try{    
          String visits11=jTextField_visitsCards.getText();    
     
@SuppressWarnings("UnusedAssignment")
       String visits111 = "-1";
       if(!Objects.equals(visits11, "неограничени")){
    
     visits111 = jTextField_visitsCards.getText(); 
       }else{
       visits111 = "-1";
       }
       
String s=jTextField_days.getText();      
        Integer s1=Integer.valueOf(s);
c.add(Calendar.DATE, s1); // Adding days
String output = sdf.format(c.getTime());

               
    
            
        String query =
        "INSERT INTO `clients`(`id`,`firstName`, `lastName`, `dateOfBirdth`,`sex`,`telephone`,`email`,`city`,`street`,`admin`) VALUES ('"
                +jTextField_IdClient1.getText()+"','"+jTextField_FirstName.getText()+"','"+jTextField_LastName.getText()+"','"+jTextField_Age.getText()+"','"+jComboBox_Sex.getSelectedItem().toString()+"','"+jTextField_Telephone.getText()+"','"+jTextField_Email.getText()+"','"+jComboBox_City11111.getSelectedItem().toString()+"','"+jTextField_Street.getText()+"','"+administrator+" / "+date1+"')"; 
        
        
     
            
           String query1 =
                    "INSERT INTO `fitness_clients_cards`(`id`,`typeCliendCard`,`visits`,`periodDays`,`price`) VALUES ('"
                  +jTextField_IdClient1.getText()+
                    "','"+jComboBox_typeCard1111.getSelectedItem().toString()+                
                    "','"+visits111+
                    "','"+output+
                    "','"+jTextField_price.getText()+
               "')"; 
            executeSQlQuery(query,"");
             executeSQlQuery(query1,"");
             
             //  JOptionPane.showMessageDialog(null,"Клиента е записан успешно.","Съобщение",JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException | HeadlessException e){
            
              JOptionPane.showMessageDialog(null,"Клиента не е записан.","Грешка",JOptionPane.ERROR_MESSAGE);
            
        }
                }
      
 
 else if(jCheckBox2solarium.isSelected()) {
         
 try{       
 String s3=jTextField2periodsss.getText();
 Integer s4 = Integer.valueOf(s3);
c.add(Calendar.DATE, s4); // Adding days
String output1 = sdf.format(c.getTime());
        
        
       String query3 =
        "INSERT INTO `clients`(`id`,`firstName`, `lastName`, `dateOfBirdth`,`sex`,`telephone`,`email`,`city`,`street`,`admin`) VALUES ('"
                +jTextField_IdClient1.getText()+"','"+jTextField_FirstName.getText()+"','"+jTextField_LastName.getText()+"','"+jTextField_Age.getText()+"','"+jComboBox_Sex.getSelectedItem().toString()+"','"+jTextField_Telephone.getText()+"','"+jTextField_Email.getText()+"','"+jComboBox_City11111.getSelectedItem().toString()+"','"+jTextField_Street.getText()+"','"+administrator+" / "+date1+"')"; 
        
        
     
            
           String query4 =
                    "INSERT INTO `solarium_clients_cards`(`id`,`typeCliendCard`,`minutes`,`periodDays`,`price`) VALUES ('"
                  +jTextField_IdClient1.getText()+
                    "','"+jComboBox1asadadsasdasd.getSelectedItem().toString()+                
                    "','"+jTextField1asdvasvd.getText()+
                    "','"+output1+
                    "','"+jTextField3cenaaa.getText()+
               "')"; 
            executeSQlQuery(query3,"");
             executeSQlQuery(query4,"");
           //    JOptionPane.showMessageDialog(null,"Клиента е записан успешно.","Грешка",JOptionPane.ERROR_MESSAGE);
        
  
  }catch(NumberFormatException | HeadlessException e){
  
     JOptionPane.showMessageDialog(null,"Клиента не е записан.","Грешка",JOptionPane.ERROR_MESSAGE);
  }
            
          
         }

    
        }
    ////////////////
    
    
    
    System.out.println("daa");
} catch (ParseException e) { 
    
    System.out.println("ne");
      JOptionPane.showMessageDialog(null,"Дата на раждане е невалидна.","Грешка",JOptionPane.ERROR_MESSAGE);
    
}
        
        
        
       
      
    }//GEN-LAST:event_jButton222222222ActionPerformed

    private void jTextField_FirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FirstNameKeyTyped
             //максимален брой символи
        if(jTextField_FirstName.getText().length()>=10) {
            getToolkit().beep(); //издава звук
            evt.consume();
        }
        //ограничение да се въвежда само букви
        char c = evt.getKeyChar();
        if(!(Character.isLetter(c)||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
            getToolkit().beep(); //издава звук
            evt.consume();}
              jTextField_FirstName.getDocument().addDocumentListener(new DocumentListener() {
  @Override
  public void changedUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void removeUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void insertUpdate(DocumentEvent e) {
    changed1();
  }});
    }//GEN-LAST:event_jTextField_FirstNameKeyTyped

    private void jTextField_AgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AgeKeyTyped
        if(jTextField_Age.getText().length()>=10) {
            getToolkit().beep(); //издава звук
            evt.consume();
        }

  



               jTextField_Age.getDocument().addDocumentListener(new DocumentListener() {
  @Override
  public void changedUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void removeUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void insertUpdate(DocumentEvent e) {
    changed1();
  }});
    }//GEN-LAST:event_jTextField_AgeKeyTyped

    private void jTextField_TelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelephoneKeyTyped
       if(jTextField_Telephone.getText().length()>=10) {
            getToolkit().beep(); //издава звук
            evt.consume();
        }
        //ограничение да се въвеждат само цифри
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
            getToolkit().beep();  //издава звук при въвеждане на буква
            evt.consume();

        }
               jTextField_Telephone.getDocument().addDocumentListener(new DocumentListener() {
  @Override
  public void changedUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void removeUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void insertUpdate(DocumentEvent e) {
    changed1();
  }});
    }//GEN-LAST:event_jTextField_TelephoneKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   HomePanel p1 = new HomePanel();
    p1.setSize(949, 100);
    p1.setLocation(0, 0);

    Panel11.setLayout(new GridLayout(0,1));
    Panel11.removeAll();
    Panel11.add(p1,BorderLayout.PAGE_END);
    Panel11.revalidate();
    Panel11.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox_fitnesCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_fitnesCardMouseClicked
    if(jCheckBox_fitnesCard.isSelected()){ 
    
            FitnessCards p1 = new FitnessCards();
            p1.setSize(949, 100);
    p1.setLocation(0, 0);

    CardsPanel.setLayout(new GridLayout(0,1));
    CardsPanel.removeAll();
    CardsPanel.add(p1,BorderLayout.PAGE_END);
    CardsPanel.revalidate();
    CardsPanel.repaint();
    
    jButton1asdasdsssssss.setVisible(false);
    jButton3sadgvasssssssss.setVisible(false);
    
    jTextField_visitsCards.setEditable(false);
            jTextField_days.setEditable(false);
            jTextField_price.setEditable(false);
            
            jCheckBox2solarium.setSelected(false);
              changed1();
 
    }else{
        
          CardsPanel.removeAll();       
          CardsPanel.revalidate();
          CardsPanel.repaint();
            changed1();
       }
  
 

 
    }//GEN-LAST:event_jCheckBox_fitnesCardMouseClicked

    private void jCheckBox_fitnesCardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_fitnesCardItemStateChanged
 if(jCheckBox_fitnesCard.isSelected()){
    
            FitnessCards p1 = new FitnessCards();
            p1.setSize(300, 200);
            p1.setLocation(0, 0);

            CardsPanel.removeAll();
            CardsPanel.add(p1,BorderLayout.CENTER);
            CardsPanel.revalidate();
            CardsPanel.repaint();
jCheckBox2solarium.setSelected(false);
 
    }else{
           CardsPanel.setVisible(true);
            setSize(300, 200);
            setLocation(0, 0);
       }
      
    }//GEN-LAST:event_jCheckBox_fitnesCardItemStateChanged

    private void jCheckBox2solariumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2solariumMouseClicked
     if(jCheckBox2solarium.isSelected()){

     
            SolariumCards p1 = new SolariumCards();
            p1.setSize(949, 100);
    p1.setLocation(0, 0);

    CardsPanel.setLayout(new GridLayout(0,1));
    CardsPanel.removeAll();
    CardsPanel.add(p1,BorderLayout.PAGE_END);
    CardsPanel.revalidate();
    CardsPanel.repaint();
    
    jButton1ererererererr.setVisible(false);
    jButton3asasassaasassasss.setVisible(false);
    
    jTextField1asdvasvd.setEditable(false);
    jTextField2periodsss.setEditable(false);
    jTextField3cenaaa.setEditable(false);
    
    
jCheckBox_fitnesCard.setSelected(false);
  changed1();

     }else{
       CardsPanel.removeAll();
            
            CardsPanel.revalidate();
           CardsPanel.repaint();
             changed1();
     }   
    }//GEN-LAST:event_jCheckBox2solariumMouseClicked

    private void jCheckBox2solariumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2solariumItemStateChanged
    
    }//GEN-LAST:event_jCheckBox2solariumItemStateChanged

    private void jCheckBox_fitnesCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_fitnesCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_fitnesCardActionPerformed

    private void jTextField_IdClient1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_IdClient1KeyTyped
         jTextField_IdClient1.getDocument().addDocumentListener(new DocumentListener() {
  @Override
  public void changedUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void removeUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void insertUpdate(DocumentEvent e) {
    changed1();
  }});
    }//GEN-LAST:event_jTextField_IdClient1KeyTyped

    private void jTextField_LastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_LastNameKeyTyped
       jTextField_LastName.getDocument().addDocumentListener(new DocumentListener() {
  @Override
  public void changedUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void removeUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void insertUpdate(DocumentEvent e) {
    changed1();
  }});
    }//GEN-LAST:event_jTextField_LastNameKeyTyped

    private void jTextField_EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_EmailKeyTyped
         jTextField_Email.getDocument().addDocumentListener(new DocumentListener() {
  @Override
  public void changedUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void removeUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void insertUpdate(DocumentEvent e) {
    changed1();
  }});
    }//GEN-LAST:event_jTextField_EmailKeyTyped

    private void jTextField_StreetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_StreetKeyTyped
            jTextField_Street.getDocument().addDocumentListener(new DocumentListener() {
  @Override
  public void changedUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void removeUpdate(DocumentEvent e) {
    changed1();
  }
  @Override
  public void insertUpdate(DocumentEvent e) {
    changed1();
  }});
    }//GEN-LAST:event_jTextField_StreetKeyTyped

    private void jButton1wevwevweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1wevwevweActionPerformed

        
        JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png"); 
        fileChooser.addChoosableFileFilter(filter); int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){ 
            File selectedFile = fileChooser.getSelectedFile();
         String path = selectedFile.getAbsolutePath(); jLabel10sadvasd.setIcon(ResizeImage(path)); s = path; 
        } else if(result == JFileChooser.CANCEL_OPTION) { System.out.println("No Data"); 
        
        }

    }//GEN-LAST:event_jButton1wevwevweActionPerformed

    private void jCheckBox1_addPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1_addPicMouseClicked
   if(jCheckBox1_addPic.isSelected()){
   
      jLabel10sadvasd.setEnabled(true);
        jButton1wevwevwe.setEnabled(true);
        jButton2camera.setEnabled(true);
   
   }else{
      jLabel10sadvasd.setEnabled(false);
        jButton1wevwevwe.setEnabled(false);
        jButton2camera.setEnabled(false);
   
   }
    }//GEN-LAST:event_jCheckBox1_addPicMouseClicked

    private void jButton2cameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2cameraActionPerformed
        Picture frame = new Picture();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setVisible(true);

    }//GEN-LAST:event_jButton2cameraActionPerformed

    private void jTextField_AgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_AgeMouseClicked
      JTextField unicorns =  jTextField_Age;
   PromptSupport.setPrompt("дд/мм/гггг", unicorns);
     
                PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, unicorns);

                PromptSupport.setFontStyle(Font.BOLD, unicorns);
  
    }//GEN-LAST:event_jTextField_AgeMouseClicked

    private void jCheckBox2solariumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2solariumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2solariumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel CardsPanel;
    public static javax.swing.JLabel Validate1;
    public static javax.swing.JButton jButton1wevwevwe;
    public static javax.swing.JButton jButton222222222;
    public static javax.swing.JButton jButton2camera;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1_addPic;
    public static javax.swing.JCheckBox jCheckBox2solarium;
    public static javax.swing.JCheckBox jCheckBox_fitnesCard;
    public static javax.swing.JComboBox jComboBox_City11111;
    public static javax.swing.JComboBox jComboBox_Sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel10sadvasd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField_Age;
    public static javax.swing.JTextField jTextField_Email;
    public static javax.swing.JTextField jTextField_FirstName;
    public static javax.swing.JTextField jTextField_IdClient1;
    public static javax.swing.JTextField jTextField_LastName;
    public static javax.swing.JTextField jTextField_Street;
    public static javax.swing.JTextField jTextField_Telephone;
    // End of variables declaration//GEN-END:variables
}
