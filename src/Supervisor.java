
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Supervisor extends javax.swing.JFrame {

    /**
     * Creates new form Supervisor
     */
    int id;
    Login l;
    Connection conn=null;
    public Supervisor() {
        l=new Login();
        initComponents();
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complaint = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        workType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mc1 = new javax.swing.JTextField();
        mc2 = new javax.swing.JTextField();
        mc3 = new javax.swing.JTextField();
        mc4 = new javax.swing.JTextField();
        mc5 = new javax.swing.JTextField();
        mc6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rm1 = new javax.swing.JTextField();
        rm2 = new javax.swing.JTextField();
        rm3 = new javax.swing.JTextField();
        rm4 = new javax.swing.JTextField();
        rm5 = new javax.swing.JTextField();
        rm6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        worker = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(889, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 58, 232));

        jLabel1.setText("WELCOME SUPERVISOR");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 50, 40));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supervisor.png"))); // NOI18N
        jLabel2.setText("SUPERVISOR");

        jButton1.setBackground(new java.awt.Color(242, 227, 148));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examination-32.png"))); // NOI18N
        jButton1.setText("GET COMPLAINT LIST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(242, 227, 148));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checklist-32.png"))); // NOI18N
        jButton2.setText("UPDATE COMPLAINT STATUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(242, 227, 148));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-32.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(64, 177, 239));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(996, 600));

        complaint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Complaint ID", "Road ID", "status", "Complaint"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        complaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                complaintMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(complaint);
        if (complaint.getColumnModel().getColumnCount() > 0) {
            complaint.getColumnModel().getColumn(0).setPreferredWidth(100);
            complaint.getColumnModel().getColumn(1).setPreferredWidth(100);
            complaint.getColumnModel().getColumn(3).setPreferredWidth(500);
        }

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel3.setText("Complaint ID");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel5.setText("Type of work");

        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        cid.setEditable(false);

        workType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bridge Repair", "Pot Holes Repair", "New road building", "Speed breaker", "FootPath building" }));
        workType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workTypeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel4.setText("Mahcines");

        jLabel6.setText("Road Rollers");

        jLabel7.setText("Road Marking Machines");

        jLabel8.setText("Chips Spreader");

        jLabel9.setText("Concrete Road Pavers");

        jLabel10.setText("Asphalt Drum Mix Plant");

        jLabel11.setText("JCB");

        mc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mc1ActionPerformed(evt);
            }
        });

        mc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mc4ActionPerformed(evt);
            }
        });

        mc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mc6ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel12.setText("Raw Materials");

        jLabel13.setText("Sand bags");

        jLabel14.setText("Brick Trucks");

        jLabel15.setText("Asphalt");

        jLabel16.setText("Concrete");

        jLabel17.setText("Cement bags");

        jLabel18.setText("Limestone");

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel19.setText("Workers Required");

        worker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel20.setText("Priotity");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low", "Medium", "High" }));

        jButton3.setBackground(new java.awt.Color(242, 227, 148));
        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-2-32.png"))); // NOI18N
        jButton3.setText("Enter and schedule work");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel21.setText("Days required to complete the wrok");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(rm2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel16))
                                            .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(worker, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mc2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rm1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mc1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mc3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rm3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rm4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mc4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(workType, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mc5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                            .addComponent(rm5)
                                            .addComponent(mc6)
                                            .addComponent(rm6))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(54, 54, 54)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(208, 208, 208))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(mc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(mc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(mc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(mc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(mc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(rm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(rm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rm5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(rm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rm6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(rm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(worker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(184, 184, 184))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JTextField locality = new JTextField();        
        Object[] message = {
            "Locality ID:", locality
            
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Locality", JOptionPane.OK_CANCEL_OPTION);
       
        if (option == JOptionPane.CANCEL_OPTION) {
            return ;
        }
        id= Integer.parseInt(locality.getText());
        this.setVisible(false);
        update u=new update();
        u.id=id;
        u.showComplaints();
        u.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    int st;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JTextField locality = new JTextField();        
        Object[] message = {
            "Locality ID:", locality
            
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Locality", JOptionPane.OK_CANCEL_OPTION);
       
        if (option == JOptionPane.CANCEL_OPTION) {
            return ;
        }
        id= Integer.parseInt(locality.getText());
        Statement stmt=null;
        try {
            stmt=conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql="SELECT * from complaints where locid="+id;
        try {
            DefaultTableModel mo=(DefaultTableModel)complaint.getModel ();
            if (mo.getRowCount() > 0) {
                for (int i = mo.getRowCount() - 1; i > -1; i--) {
                    mo.removeRow(i);
                }
            }
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                int coid=rs.getInt("comid");
                int st=rs.getInt("status");
                int rid=rs.getInt("RoadID");
                String status;
                if(st==1)
                {
                    status="Reviewed";
                }
                else if(st==0)
                {
                    status="Pending";
                }
                else if(st==2)
                {
                    status="Allocated";
                }
                else
                    status="Completed";
                String compl=rs.getString("Complaint");
                mo.addRow(new Object[]{coid,rid,status,compl});                
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
        
        }    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mc6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mc6ActionPerformed

    private void mc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mc4ActionPerformed

    private void mc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mc1ActionPerformed

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void complaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaintMouseClicked
        int row=complaint.getSelectedRow();
        int col=complaint.getSelectedColumn();
        Object id=complaint.getValueAt(row,0);
        
        int comid=(int)id;
        cid.setText(""+comid);
        mc1.setText("0");mc2.setText("0");mc3.setText("0");mc4.setText("0");mc5.setText("0");mc6.setText("0");
        
        rm1.setText("0");rm2.setText("0");rm3.setText("0");rm4.setText("0");rm5.setText("0");rm6.setText("0");
        worker.setText("0");days.setText("0");
    }//GEN-LAST:event_complaintMouseClicked

    private void workerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if( mc1.getText().equals("") || mc1.getText().equals("") || mc1.getText().equals("") || mc2.getText().equals("") 
            || mc3.getText().equals("") || mc4.getText().equals("") || mc5.getText().equals("") ||mc6.getText().equals("")
            || rm1.getText().equals("") || rm2.getText().equals("") || rm3.getText().equals("") || rm4.getText().equals("")
            || rm5.getText().equals("") || rm6.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"All fields must be filled" );
        }
        else {
        int comid=Integer.parseInt(cid.getText());
        String sql="SELECT status from complaints where comid="+comid;
        Statement stmt1=null;
        try {
            stmt1=conn.createStatement();
            ResultSet rs=stmt1.executeQuery(sql);
            while(rs.next())
            {
                int status=rs.getInt("status");
                if(status!=0)
                {
                    JOptionPane.showMessageDialog(complaint, "Complaint is Not Pending");
                    return ;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
        int m1=Integer.parseInt(mc1.getText());int m2=Integer.parseInt(mc2.getText());int m3=Integer.parseInt(mc3.getText());
        int m4=Integer.parseInt(mc4.getText());int m5=Integer.parseInt(mc5.getText());int m6=Integer.parseInt(mc6.getText());
        int r1=Integer.parseInt(rm1.getText());int r2=Integer.parseInt(rm2.getText());int r3=Integer.parseInt(rm6.getText());
        int r4=Integer.parseInt(rm4.getText());int r5=Integer.parseInt(rm5.getText());int r6=Integer.parseInt(rm6.getText());
        int w= Integer.parseInt(worker.getText());
        int da=Integer.parseInt(days.getText());
        int type=workType.getSelectedIndex();
        int pri=jComboBox2.getSelectedIndex();
        sql="Insert into work(comid,alloc,type,priority,m1,m2,m3,m4,m5,m6,r1,r2,r3,r4,r5,r6"
                + ",w,start,days) values("+comid+','+0+','+type+','+pri+','+m1+','+m2+','+m3+','+m4+','+m5+','+m6
                +','+r1+','+r2+','+r3+','+r4+','+r5+','+r6+','+w+','+"NOW()"+','+da+')';
        Statement stmt=null;
        try {
            stmt=conn.createStatement();
            stmt.execute(sql);
            JOptionPane.showMessageDialog(complaint, "Resouces Updated");
            String sql2="Update complaints set status=1 where comid="+comid;
            stmt.execute(sql2);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "All fields must be integer");
            return;
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void workTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workTypeActionPerformed

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
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cid;
    private javax.swing.JTable complaint;
    private javax.swing.JTextField days;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mc1;
    private javax.swing.JTextField mc2;
    private javax.swing.JTextField mc3;
    private javax.swing.JTextField mc4;
    private javax.swing.JTextField mc5;
    private javax.swing.JTextField mc6;
    private javax.swing.JTextField rm1;
    private javax.swing.JTextField rm2;
    private javax.swing.JTextField rm3;
    private javax.swing.JTextField rm4;
    private javax.swing.JTextField rm5;
    private javax.swing.JTextField rm6;
    private javax.swing.JComboBox workType;
    private javax.swing.JTextField worker;
    // End of variables declaration//GEN-END:variables
}
