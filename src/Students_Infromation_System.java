
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.awt.print.*;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Students_Infromation_System extends javax.swing.JFrame {

        
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    /**
     * Creates new form Students_Infromation_System
     */
    public Students_Infromation_System() {
        initComponents();
        conn=javaconnect.connerDb();
         CurrentDate();
        
    }
    
     
        public  void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }
        
                
    public void CurrentDate() 
    {

        
        Thread clock=new Thread()
        {
            public void run()
            {
                for(;;)
                    
                {
                
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        txt_date.setText(day+"/"+(month+1)+"/"+(year));
        
        
        
        int second=cal.get(Calendar.SECOND); 
        int mint=cal.get(Calendar.MINUTE);
        int hour=cal.get(Calendar.HOUR);
        txt_time.setText(hour+":"+(mint)+":"+(second));  
        

                    
                    try {
                        sleep(1000);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Students_and_Teachers_Management.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        
        
        
        clock.start();
        
                
    }
    
 

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_permanent = new javax.swing.JTextField();
        txt_year = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_birthday = new javax.swing.JTextField();
        txt_classname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmd_delete = new javax.swing.JButton();
        cmd_save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_lastname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        txt_present = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_sex = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_roll = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmd_search = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_close = new javax.swing.JButton();
        txt_home = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txt_date = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu1.setText("jMenu1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("jMenu10");

        jMenu11.setText("File");
        jMenuBar5.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar5.add(jMenu12);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setText("Exit");
        jButton5.setToolTipText("Exit from The program");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Mobile No:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Permanent Address:");

        txt_permanent.setToolTipText("Your Permanent Address");

        txt_year.setToolTipText("Academic Year");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Year:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Birth Day:");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("Clear");
        jButton3.setToolTipText("Clear Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_birthday.setToolTipText("Enter BOD:yyyy-mm-dd");
        txt_birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_birthdayActionPerformed(evt);
            }
        });

        txt_classname.setToolTipText("Enter Class:6,7,8,9,10");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Present Address:");

        cmd_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_delete.setForeground(new java.awt.Color(0, 51, 51));
        cmd_delete.setText("Delete");
        cmd_delete.setToolTipText("Delete The Selected Data");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmd_save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_save.setForeground(new java.awt.Color(102, 102, 255));
        cmd_save.setText("Save Data");
        cmd_save.setToolTipText("Save all the input data");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 51));
        jButton2.setText("Update");
        jButton2.setToolTipText("Update The Selected Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_lastname.setToolTipText("Enter Last Name");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Class Roll Number:");

        txt_mobile.setToolTipText("Enter Your Mobile Number");

        txt_present.setToolTipText("Your Present Address");
        txt_present.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_presentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Sex:");

        txt_sex.setToolTipText("male,female");

        jLabel13.setBackground(new java.awt.Color(51, 255, 153));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("MSITM Degree College, Gonda");

        jLabel11.setText("Note : *All field Must be fill up step by step");

        txt_roll.setToolTipText("Enter Five Digit Class Roll Number");
        txt_roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rollActionPerformed(evt);
            }
        });

        txt_firstname.setToolTipText("Enter First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Class:");

        cmd_search.setBackground(new java.awt.Color(255, 204, 204));
        cmd_search.setForeground(new java.awt.Color(255, 51, 51));
        cmd_search.setToolTipText("Search Entry Data");
        cmd_search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cmd_search.setSelectedTextColor(new java.awt.Color(0, 153, 153));
        cmd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_searchActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("Search here");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Students Information System");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("View Data");
        jButton1.setToolTipText("View All The Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel20.setText("Five Digits Only");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("EX: 6,7,8,9,10");

        jLabel22.setText("Ex: yyyy-mm-dd");

        jLabel23.setText("Max: 30 Digits");

        jLabel24.setText("Max: 30 Digits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmd_search, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel20)
                                        .addComponent(txt_firstname)
                                        .addComponent(txt_lastname)
                                        .addComponent(txt_classname)
                                        .addComponent(txt_year)
                                        .addComponent(txt_birthday)
                                        .addComponent(txt_mobile)
                                        .addComponent(txt_sex)
                                        .addComponent(txt_permanent)
                                        .addComponent(txt_present, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(txt_roll, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmd_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmd_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel13)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(10, 10, 10)
                        .addComponent(cmd_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(9, 9, 9)
                        .addComponent(jButton5)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_classname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel21)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_permanent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_present, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel24))))
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jLabel15.setText("jLabel15");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        txt_close.setBackground(new java.awt.Color(0, 153, 0));
        txt_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_close.setForeground(new java.awt.Color(51, 51, 255));
        txt_close.setText("Close");
        txt_close.setToolTipText("Close The Window");
        txt_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_closeActionPerformed(evt);
            }
        });

        txt_home.setBackground(new java.awt.Color(153, 102, 255));
        txt_home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_home.setForeground(new java.awt.Color(102, 204, 0));
        txt_home.setText("Home");
        txt_home.setToolTipText("Back to Home Manu");
        txt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_homeActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("Time:");
        jButton4.setToolTipText("Time");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 51));
        jButton6.setText("Current date:");
        jButton6.setToolTipText("Current date");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txt_date.setText("jLabel25");

        txt_time.setText("jLabel26");

        jMenu2.setBackground(new java.awt.Color(255, 0, 204));
        jMenu2.setForeground(new java.awt.Color(255, 153, 255));
        jMenu2.setText("File");
        jMenu2.setToolTipText("File Option");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("New File");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_home)
                        .addGap(18, 18, 18)
                        .addComponent(txt_close))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(jButton4)
                        .addComponent(txt_date)
                        .addComponent(txt_time))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_close)
                        .addComponent(txt_home)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_searchActionPerformed
        // TODO add your handling code here:

        try {
            String sql="select  * from  student_info where Roll=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }
            
        else 
            {
                  JOptionPane.showMessageDialog(null,"No data Found.Please try again!!!");
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where First_name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where Last_name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);

        }

        try {
            String sql="select  * from  student_info where Class=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where Year=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where Birth_date=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where Mobile_no=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where Sex=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where permanent=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }

        try {
            String sql="select  * from  student_info where Present=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Roll");
                txt_roll.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Class");
                txt_classname.setText(add4);

                String add5=rs.getString("Year");
                txt_year.setText(add5);

                String add6=rs.getString("Birth_date");
                txt_birthday.setText(add6);

                String add7=rs.getString("Mobile_no");
                txt_mobile.setText(add7);

                String add8=rs.getString("Sex");
                txt_sex.setText(add8);

                String add9=rs.getString("permanent");
                txt_permanent.setText(add9);

                String add10=rs.getString("Present");
                txt_present.setText(add10);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);

        }

    }//GEN-LAST:event_cmd_searchActionPerformed

    private void txt_presentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_presentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_presentActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        
        int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Save?","Save",JOptionPane.YES_NO_OPTION);
       if(p==0)
        {
        try {

            String sql="insert into student_info (Roll,First_name,Last_name,Class,Year,Birth_date,Mobile_no,Sex,permanent,Present) values(?,?,?,?,?,?,?,?,?,?)";
  
            pst=conn.prepareStatement(sql);

            pst.setString(1, txt_roll.getText());
            pst.setString(2, txt_firstname.getText());
            pst.setString(3, txt_lastname.getText());
            pst.setString(4, txt_classname.getText());
            pst.setString(5, txt_year.getText());
            pst.setString(6, txt_birthday.getText());
            pst.setString(7, txt_mobile.getText());
            pst.setString(8, txt_sex.getText());
            pst.setString(9, txt_permanent.getText());
            pst.setString(10, txt_present.getText());

           int i=pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Save Successfully.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        }
        
     

    }//GEN-LAST:event_cmd_saveActionPerformed

    private void txt_birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_birthdayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        cmd_search.setText("");
        txt_roll.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_classname.setText("");
        txt_year.setText("");
        txt_birthday.setText("");
        txt_mobile.setText("");
        txt_sex.setText("");
        txt_permanent.setText("");
        txt_present.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        close();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                
        int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Update data?","Update",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
           try {
            
            String value1=txt_roll.getText();
            String value2=txt_firstname.getText();  
            String value3=txt_lastname.getText();
            String value4=txt_classname.getText();
            String value5=txt_year.getText();
            String value6=txt_birthday.getText();
            String value7=txt_mobile.getText();
            String value8=txt_sex.getText();
            String value9=txt_permanent.getText();
            String value10=txt_present.getText();
            
            String sql="Update student_info set Roll='"+value1+"',First_name='"+value2+"',Last_name='"+value3+"',Class='"+value4+"', Year='"+value5+"',Birth_date='"+value6+"',Mobile_no='"+value7+"',Sex='"+value8+"',permanent='"+value9+"',Present='"+value10+"' where Roll='"+value1+"'";        
            
            
            
            pst=conn.prepareStatement(sql);
             pst.execute();
            
           JOptionPane.showMessageDialog(null,"Table Updated Successfully."); 
            
        } catch (Exception e) {
              
            JOptionPane.showMessageDialog(null,"We face a Problem."); 
        }
        
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
             //   Admin e = new Admin();
              //  e.setVisible(true);
                
        int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Delete?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
        String sql="delete from student_info where Roll=?";
        try {
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, txt_roll.getText());

            pst.execute();

             JOptionPane.showMessageDialog(null, "Data Deleted Successfully"); 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"We face a Problem."); 
        }
        }
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void txt_rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rollActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_rollActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                All_Students_Data_Details e = new All_Students_Data_Details();
                e.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_homeActionPerformed
        // TODO add your handling code here:
                
                Students_and_Teachers_Management e = new Students_and_Teachers_Management();
                e.setVisible(true);
                close();
        
    }//GEN-LAST:event_txt_homeActionPerformed

    private void txt_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_closeActionPerformed
        // TODO add your handling code here:
        
        close();
    }//GEN-LAST:event_txt_closeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_save;
    private javax.swing.JTextField cmd_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField txt_birthday;
    private javax.swing.JTextField txt_classname;
    private javax.swing.JButton txt_close;
    private javax.swing.JLabel txt_date;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JButton txt_home;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_permanent;
    private javax.swing.JTextField txt_present;
    private javax.swing.JTextField txt_roll;
    private javax.swing.JTextField txt_sex;
    private javax.swing.JLabel txt_time;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
