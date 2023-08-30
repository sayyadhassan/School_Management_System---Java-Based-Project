
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Employees_Infromation_System extends javax.swing.JFrame {

    /**
     * Creates new form Employees_Infromation_System
     */
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public Employees_Infromation_System() {
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

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_texit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_permanent = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tclear = new javax.swing.JButton();
        txt_birthday = new javax.swing.JTextField();
        txt_position = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmd_tdelete = new javax.swing.JButton();
        cmd_tsave = new javax.swing.JButton();
        txt_tupdate = new javax.swing.JButton();
        txt_lastname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        txt_present = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_sex = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_teacher_ID = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmd_search = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txt_date = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Close");
        jButton2.setToolTipText("Close The Window");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 102, 255));
        jButton3.setText("Home");
        jButton3.setToolTipText("Back To The Main Manu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        txt_texit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_texit.setForeground(new java.awt.Color(255, 51, 51));
        txt_texit.setText("Exit");
        txt_texit.setToolTipText("Exit from The program");
        txt_texit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_texitActionPerformed(evt);
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

        txt_permanent.setToolTipText("Enter Permanent Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Birth Day:");

        txt_tclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_tclear.setForeground(new java.awt.Color(153, 0, 153));
        txt_tclear.setText("Clear");
        txt_tclear.setToolTipText("Clear Data");
        txt_tclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tclearActionPerformed(evt);
            }
        });

        txt_birthday.setToolTipText("Enter BOD: yyyy-mm-dd");
        txt_birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_birthdayActionPerformed(evt);
            }
        });

        txt_position.setToolTipText("Enter Junior senior ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Present Address:");

        cmd_tdelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_tdelete.setForeground(new java.awt.Color(255, 0, 102));
        cmd_tdelete.setText("Delete");
        cmd_tdelete.setToolTipText("Delete The Selected Data");
        cmd_tdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_tdeleteActionPerformed(evt);
            }
        });

        cmd_tsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_tsave.setForeground(new java.awt.Color(51, 0, 51));
        cmd_tsave.setText("Save Data");
        cmd_tsave.setToolTipText("Save all the input data");
        cmd_tsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_tsaveActionPerformed(evt);
            }
        });

        txt_tupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_tupdate.setForeground(new java.awt.Color(204, 51, 0));
        txt_tupdate.setText("Update");
        txt_tupdate.setToolTipText("Update The Selected Data");
        txt_tupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tupdateActionPerformed(evt);
            }
        });

        txt_lastname.setToolTipText("Enter last name");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Employee's ID");

        txt_mobile.setToolTipText("Enter Your Mobile Number");

        txt_present.setToolTipText("Enter Present Address");
        txt_present.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_presentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Sex:");

        txt_sex.setToolTipText("male,famale");

        jLabel13.setBackground(new java.awt.Color(51, 255, 153));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("MSITM Degree College, Gonda");

        jLabel11.setText("Note : *All field Must be fill up step by step");

        txt_teacher_ID.setToolTipText("Enter Six Digit ID number");
        txt_teacher_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_teacher_IDActionPerformed(evt);
            }
        });

        txt_firstname.setToolTipText("Enter First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Position:");

        cmd_search.setBackground(new java.awt.Color(255, 204, 204));
        cmd_search.setForeground(new java.awt.Color(255, 51, 51));
        cmd_search.setToolTipText("Search The Entry Data");
        cmd_search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cmd_search.setSelectedTextColor(new java.awt.Color(0, 153, 153));
        cmd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_searchActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("Search here");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Employees Information System");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 255));
        jButton1.setText("View Data");
        jButton1.setToolTipText("View All The Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Ex: yyyy-mm-dd");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel20.setText("Four Digits Only");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("Ex: male,female");

        jLabel24.setText("Max: 30 Digits");

        jLabel25.setText("Max: 30 Digits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel9)))
                                    .addGap(27, 27, 27))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmd_search, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_permanent, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_teacher_ID)
                                                .addComponent(txt_firstname)
                                                .addComponent(txt_lastname)
                                                .addComponent(txt_position)
                                                .addComponent(txt_birthday)
                                                .addComponent(txt_mobile)
                                                .addComponent(txt_sex)
                                                .addComponent(jLabel5)
                                                .addComponent(txt_present, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel20)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmd_tsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_texit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_tclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_tupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmd_tdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel25))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_tsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tclear)
                        .addGap(10, 10, 10)
                        .addComponent(cmd_tdelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(9, 9, 9)
                        .addComponent(txt_texit)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_teacher_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20)
                        .addGap(1, 1, 1)
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
                            .addComponent(txt_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_permanent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_present, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel25))))
                .addComponent(jLabel11)
                .addGap(27, 27, 27))
        );

        txt_time.setText("jLabel26");

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

        txt_date.setText("jLabel25");

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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton4)
                    .addComponent(txt_date)
                    .addComponent(txt_time)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Students_and_Teachers_Management e = new Students_and_Teachers_Management();
        e.setVisible(true);
        close();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_texitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_texitActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_txt_texitActionPerformed

    private void txt_tclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tclearActionPerformed
        // TODO add your handling code here:
//        int p=JOptionPane.showConfirmDialog(null, "Do you Want to Clear Data?","Clear",JOptionPane.YES_NO_OPTION);
//        if(p==0)
//        {
        
        cmd_search.setText("");
        txt_teacher_ID.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_position.setText("");
        txt_birthday.setText("");
        txt_mobile.setText("");
        txt_sex.setText("");
        txt_permanent.setText("");
        txt_present.setText("");
        
//         JOptionPane.showMessageDialog(null, "Data field Clear.");
//        }
    }//GEN-LAST:event_txt_tclearActionPerformed

    private void txt_birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_birthdayActionPerformed

    private void cmd_tdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_tdeleteActionPerformed
        // TODO add your handling code here:

        int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Delete?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            String sql="delete from employee_info where Employee_id=?";
            try {
                pst=conn.prepareStatement(sql);

                pst.setString(1, txt_teacher_ID.getText());

                pst.execute();

                JOptionPane.showMessageDialog(null, "Data Deleted Successfully.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"We face a Problem.");
            }

        }
    }//GEN-LAST:event_cmd_tdeleteActionPerformed

    private void cmd_tsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_tsaveActionPerformed
        // TODO add your handling code here:

        int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Save?","Save",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            try {

                String sql="insert into employee_info (Employee_id,First_name,Last_name,Position,Birth_day,Mobile_no,Sex,Permanent,Present) values(?,?,?,?,?,?,?,?,?)";

                pst=conn.prepareStatement(sql);

                pst.setString(1, txt_teacher_ID.getText());
                pst.setString(2, txt_firstname.getText());
                pst.setString(3, txt_lastname.getText());
                pst.setString(4, txt_position.getText());
                pst.setString(5, txt_birthday.getText());
                pst.setString(6, txt_mobile.getText());
                pst.setString(7, txt_sex.getText());
                pst.setString(8, txt_permanent.getText());
                pst.setString(9, txt_present.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Saved Successfully.");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "We face a Problem.");
            }

        }
    }//GEN-LAST:event_cmd_tsaveActionPerformed

    private void txt_tupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tupdateActionPerformed
        // TODO add your handling code here:

        int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Update?","Update",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            try {

                String value1=txt_teacher_ID.getText();
                String value2=txt_firstname.getText();
                String value3=txt_lastname.getText();
                String value4=txt_position.getText();
                String value6=txt_birthday.getText();
                String value7=txt_mobile.getText();
                String value8=txt_sex.getText();
                String value9=txt_permanent.getText();
                String value10=txt_present.getText();

                String sql="Update employee_info set Employee_id='"+value1+"',First_name='"+value2+"',Last_name='"+value3+"',Position='"+value4+"',Birth_day='"+value6+"',Mobile_no='"+value7+"',Sex='"+value8+"',permanent='"+value9+"',Present='"+value10+"' where Employee_id='"+value1+"'";

                pst=conn.prepareStatement(sql);
                pst.execute();

                JOptionPane.showMessageDialog(null,"Table Updated Successfully.");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,"We face a Problem.");
            }
        }

    }//GEN-LAST:event_txt_tupdateActionPerformed

    private void txt_presentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_presentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_presentActionPerformed

    private void txt_teacher_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_teacher_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_teacher_IDActionPerformed

    private void cmd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_searchActionPerformed
        // TODO add your handling code here:

        try {
            String sql="select  * from  employee_info where Employee_id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
            
            else 
            {
                  JOptionPane.showMessageDialog(null,"No data Found.Please try again!!!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        
        
                try {
            String sql="select  * from  employee_info where First_name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        
                 try {
            String sql="select  * from  employee_info where Last_name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        
         try {
            String sql="select  * from  employee_info where Position=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        
         
          try {
            String sql="select  * from  employee_info where Birth_day=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        
           try {
            String sql="select  * from  employee_info where Mobile_no=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        

            try {
            String sql="select  * from  employee_info where Sex=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        
             try {
            String sql="select  * from  employee_info where Permanent=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
         try {
            String sql="select  * from  employee_info where Present=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cmd_search.getText());

            rs=pst.executeQuery();

            if(rs.next())
            {

                String add1=rs.getString("Employee_id");
                txt_teacher_ID.setText(add1);

                String add2=rs.getString("First_name");
                txt_firstname.setText(add2);

                String add3=rs.getString("Last_name");
                txt_lastname.setText(add3);

                String add4=rs.getString("Position");
                txt_position.setText(add4);

                String add5=rs.getString("Birth_day");
                txt_birthday.setText(add5);

                String add6=rs.getString("Mobile_no");
                txt_mobile.setText(add6);

                String add7=rs.getString("Sex");
                txt_sex.setText(add7);

                String add8=rs.getString("Permanent");
                txt_permanent.setText(add8);

                String add9=rs.getString("Present");
                txt_present.setText(add9);

            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"We face a Problem.");

        }
        
            
    }//GEN-LAST:event_cmd_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        All_Employees_Data_Details e = new All_Employees_Data_Details();
        e.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Employees_Infromation_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees_Infromation_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees_Infromation_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees_Infromation_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees_Infromation_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cmd_search;
    private javax.swing.JButton cmd_tdelete;
    private javax.swing.JButton cmd_tsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_birthday;
    private javax.swing.JLabel txt_date;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_permanent;
    private javax.swing.JTextField txt_position;
    private javax.swing.JTextField txt_present;
    private javax.swing.JTextField txt_sex;
    private javax.swing.JButton txt_tclear;
    private javax.swing.JTextField txt_teacher_ID;
    private javax.swing.JButton txt_texit;
    private javax.swing.JLabel txt_time;
    private javax.swing.JButton txt_tupdate;
    // End of variables declaration//GEN-END:variables
}
