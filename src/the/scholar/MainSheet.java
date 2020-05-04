package the.scholar;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MainSheet extends javax.swing.JFrame {

    Connection conn = null;

    public MainSheet() {
        initComponents();
        conn = DBconnect.connect();
        showicon();

    }
     private void showicon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/main.png"));
    }
    public void username(String name) {
        lbl_username.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_student = new javax.swing.JPanel();
        panel_Banner = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_subheading = new javax.swing.JLabel();
        lbl_heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_newStudent = new javax.swing.JLabel();
        Lbl_edit = new javax.swing.JLabel();
        lbl_print = new javax.swing.JLabel();
        lbl_print1 = new javax.swing.JLabel();
        panel_insert = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        combo_batch = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        combo_term = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        combo_sec = new javax.swing.JComboBox<>();
        txt_rollNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combo_type = new javax.swing.JComboBox<>();
        combo_examindex = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_totalMarks = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_obtainedMarks = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Lbl_saveEntry = new javax.swing.JLabel();
        lbl_update_entry = new javax.swing.JLabel();
        lbl_nameStudent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Scholar");
        setUndecorated(true);

        panel_student.setBackground(new java.awt.Color(102, 0, 102));
        panel_student.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_studentMouseDragged(evt);
            }
        });
        panel_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_studentMousePressed(evt);
            }
        });
        panel_student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Banner.setBackground(new java.awt.Color(204, 0, 204));
        panel_Banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner.png"))); // NOI18N
        panel_Banner.add(lbl_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbl_username.setBackground(new java.awt.Color(255, 255, 255));
        lbl_username.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Ok_24px.png"))); // NOI18N
        lbl_username.setText("remon");
        panel_Banner.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        lbl_subheading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_subheading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_subheading.setText("Student Grarebook Application");
        panel_Banner.add(lbl_subheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 200, -1));

        lbl_heading.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_heading.setText("The Scholar");
        panel_Banner.add(lbl_heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 263, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        panel_Banner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        panel_student.add(panel_Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 986, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_newStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddStudent.png"))); // NOI18N
        lbl_newStudent.setToolTipText("New Student");
        lbl_newStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_newStudentMousePressed(evt);
            }
        });

        Lbl_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit Selected.png"))); // NOI18N
        Lbl_edit.setToolTipText("Insert Data");
        Lbl_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Lbl_editMousePressed(evt);
            }
        });

        lbl_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View.png"))); // NOI18N
        lbl_print.setToolTipText("Quick Edit");
        lbl_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_printMousePressed(evt);
            }
        });

        lbl_print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Print.png"))); // NOI18N
        lbl_print1.setToolTipText("View And Print");
        lbl_print1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_print1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_print1)
                    .addComponent(lbl_print)
                    .addComponent(Lbl_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_newStudent))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_newStudent)
                .addGap(18, 18, 18)
                .addComponent(Lbl_edit)
                .addGap(18, 18, 18)
                .addComponent(lbl_print)
                .addGap(18, 18, 18)
                .addComponent(lbl_print1)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        panel_student.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 120, 600));

        panel_insert.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Batch:");

        combo_batch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_batch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE-14", "CSE-15", "CSE-16", "CSE-17" }));
        combo_batch.setSelectedIndex(2);
        combo_batch.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Term:");

        combo_term.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_term.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Term 1", "Term 2" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sec:");

        combo_sec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sec A", "Sec B" }));

        txt_rollNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_rollNoFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Roll No:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Name:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Type:");

        combo_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class Prerformance", "Online", "Attendance", "Viva", "Observation" }));

        combo_examindex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_examindex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exam 1", "Exam 2" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Exam Index:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Total Marks:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Obtained Marks:");

        jSeparator1.setBackground(new java.awt.Color(204, 0, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 0, 204));

        jSeparator2.setBackground(new java.awt.Color(204, 0, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 0, 204));

        Lbl_saveEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save.png"))); // NOI18N
        Lbl_saveEntry.setText("Save");
        Lbl_saveEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Lbl_saveEntryMousePressed(evt);
            }
        });

        lbl_update_entry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update.png"))); // NOI18N
        lbl_update_entry.setText("Update");
        lbl_update_entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_update_entryMousePressed(evt);
            }
        });

        lbl_nameStudent.setBackground(new java.awt.Color(204, 204, 204));
        lbl_nameStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nameStudent.setText("Enter The Roll No");

        javax.swing.GroupLayout panel_insertLayout = new javax.swing.GroupLayout(panel_insert);
        panel_insert.setLayout(panel_insertLayout);
        panel_insertLayout.setHorizontalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(33, 33, 33)
                                .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_totalMarks)))
                        .addGap(83, 83, 83)
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_obtainedMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_examindex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_insertLayout.createSequentialGroup()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(Lbl_saveEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_update_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_insertLayout.createSequentialGroup()
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combo_batch, 0, 100, Short.MAX_VALUE)
                                    .addComponent(txt_rollNo))
                                .addGap(132, 132, 132)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_insertLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(combo_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lbl_nameStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_term, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(280, 280, 280)))))
                        .addGap(857, 857, 857))))
        );
        panel_insertLayout.setVerticalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_batch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(combo_term, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(combo_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_rollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_nameStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(combo_examindex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_totalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_obtainedMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_saveEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_update_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        panel_student.add(panel_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 870, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(986, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void Lbl_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_editMousePressed

    }//GEN-LAST:event_Lbl_editMousePressed
    int xx, xy;
    private void panel_studentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_studentMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panel_studentMouseDragged

    private void panel_studentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_studentMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panel_studentMousePressed

    private void lbl_newStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_newStudentMousePressed
        AddStudent as = new AddStudent();
        as.username(lbl_username.getText());
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_newStudentMousePressed

    private void Lbl_saveEntryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_saveEntryMousePressed
        Double totalmks = Double.valueOf(txt_totalMarks.getText());
        Double obtainedMks = Double.valueOf(txt_obtainedMarks.getText());
        Double centmks = (obtainedMks / totalmks) * 100;
        if (centmks <= 100 || totalmks <= 0) {
            try {
                Integer tempRoll = Integer.valueOf(txt_rollNo.getText());
                centmks = Double.parseDouble(new DecimalFormat("###.##").format(centmks));

                if (combo_type.getSelectedIndex() == 0) {
                    String query = "UPDATE main.StudentDB SET classper=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();
                    OptionDisplay op = new OptionDisplay();
                    op.Success();
                    pst.close();
                }

                if (combo_type.getSelectedIndex() == 1) {
                    if (combo_examindex.getSelectedIndex() == 0) {
                        String query = "UPDATE main.StudentDB SET online1=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                        System.out.println(query);
                        System.out.println();
                        ///JOptionPane.showMessageDialog(null, query);
                        PreparedStatement pst = conn.prepareStatement(query);

                        int rs = pst.executeUpdate();
                        OptionDisplay op = new OptionDisplay();
                        op.Success();
                        pst.close();
                    }

                    if (combo_examindex.getSelectedIndex() == 1) {
                        String query = "UPDATE main.StudentDB SET online2=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                        System.out.println(query);
                        System.out.println();
                        //JOptionPane.showMessageDialog(null, query);
                        PreparedStatement pst = conn.prepareStatement(query);

                        int rs = pst.executeUpdate();

                        System.out.println(rs);
                        OptionDisplay op = new OptionDisplay();
                        op.Success();
                        pst.close();

                    }

                }

                if (combo_type.getSelectedIndex() == 2) {
                    String query = "UPDATE main.StudentDB SET attendance=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    //JOptionPane.showMessageDialog(null, query);
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();

                    System.out.println(rs);
                    OptionDisplay op = new OptionDisplay();
                    op.Success();;
                    pst.close();
                }

                if (combo_type.getSelectedIndex() == 3) {
                    String query = "UPDATE main.StudentDB SET viva=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    //JOptionPane.showMessageDialog(null, query);
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();

                    System.out.println(rs);
                    OptionDisplay op = new OptionDisplay();
                    op.Success();
                    pst.close();
                }

                if (combo_type.getSelectedIndex() == 4) {
                    String query = "UPDATE main.StudentDB SET obsn=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    //JOptionPane.showMessageDialog(null, query);
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();

                    System.out.println(rs);

                    OptionDisplay op = new OptionDisplay();
                    op.Success();
                    pst.close();
                }

            } catch (Exception e) {
                String err = e.getMessage();
                // TODO Auto-generated catch block
                e.printStackTrace();
                //JOptionPane.showMessageDialog(null, "Error");
                OptionDisplay op = new OptionDisplay();
                op.dbFailed(err);
            }

        } else {
            OptionDisplay op = new OptionDisplay();
            op.showcustom("Obtained marks shouldn't be grater than total marks");
        }


    }//GEN-LAST:event_Lbl_saveEntryMousePressed

    private void txt_rollNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_rollNoFocusLost

        try {
            Integer tempRoll = Integer.valueOf(txt_rollNo.getText());
            String query = "select name from main.StudentDB where rollno='" + tempRoll + "';";
            try {
                PreparedStatement pst = conn.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                boolean empty = true;
                while (rs.next()) {
                    empty = false;
                    String SName = rs.getString("Name");
                    lbl_nameStudent.setFont(new java.awt.Font("Segoe UI", 0, 14));
                    lbl_nameStudent.setForeground(new java.awt.Color(0, 0, 0));
                    lbl_nameStudent.setText(SName);
                }

                if (empty) {
                    lbl_nameStudent.setFont(new java.awt.Font("Segoe UI", 0, 14));
                    lbl_nameStudent.setForeground(new java.awt.Color(255, 0, 0));
                    lbl_nameStudent.setText("Record Not found, Create new student or reinsert the correct roll no");
                }
            } catch (Exception e) {
                e.printStackTrace();
                String err = e.getMessage();
                OptionDisplay op = new OptionDisplay();
                op.dbFailed(err);

            }

        } catch (Exception e) {
            String err = e.getMessage();
            OptionDisplay op = new OptionDisplay();
            op.showcustom(err + " Invalid Roll No");
        }


    }//GEN-LAST:event_txt_rollNoFocusLost

    private void lbl_printMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_printMousePressed
        ScholarPrint sp = new ScholarPrint();
        sp.username(lbl_username.getText());
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_printMousePressed

    private void lbl_update_entryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_update_entryMousePressed
        Double totalmks = Double.valueOf(txt_totalMarks.getText());
        Double obtainedMks = Double.valueOf(txt_obtainedMarks.getText());
        Double centmks = (obtainedMks / totalmks) * 100;
        if (centmks <= 100 || totalmks <= 0) {
            try {
                Integer tempRoll = Integer.valueOf(txt_rollNo.getText());
                centmks = Double.parseDouble(new DecimalFormat("###.##").format(centmks));

                if (combo_type.getSelectedIndex() == 0) {
                    String query = "UPDATE main.StudentDB SET classper=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();
                    OptionDisplay op = new OptionDisplay();
                    op.Success();
                    pst.close();
                }

                if (combo_type.getSelectedIndex() == 1) {
                    if (combo_examindex.getSelectedIndex() == 0) {
                        String query = "UPDATE main.StudentDB SET online1=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                        System.out.println(query);
                        System.out.println();
                        //JOptionPane.showMessageDialog(null, query);
                        PreparedStatement pst = conn.prepareStatement(query);

                        int rs = pst.executeUpdate();
                        OptionDisplay op = new OptionDisplay();
                        op.Success();
                        pst.close();
                    }

                    if (combo_examindex.getSelectedIndex() == 1) {
                        String query = "UPDATE main.StudentDB SET online2=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                        System.out.println(query);
                        System.out.println();
                        //JOptionPane.showMessageDialog(null, query);
                        PreparedStatement pst = conn.prepareStatement(query);

                        int rs = pst.executeUpdate();

                        System.out.println(rs);
                        OptionDisplay op = new OptionDisplay();
                        op.Success();
                        pst.close();

                    }

                }


                if (combo_type.getSelectedIndex() == 2) {
                    String query = "UPDATE main.StudentDB SET attendance=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    //JOptionPane.showMessageDialog(null, query);
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();

                    System.out.println(rs);
                    OptionDisplay op = new OptionDisplay();
                    op.Success();;
                    pst.close();
                }

                if (combo_type.getSelectedIndex() == 3) {
                    String query = "UPDATE main.StudentDB SET viva=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    //JOptionPane.showMessageDialog(null, query);
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();

                    System.out.println(rs);
                    OptionDisplay op = new OptionDisplay();
                    op.Success();
                    pst.close();
                }

                if (combo_type.getSelectedIndex() == 4) {
                    String query = "UPDATE main.StudentDB SET obsn=  '" + centmks.doubleValue() + "' WHERE rollno = '" + tempRoll + "';";
                    System.out.println(query);
                    System.out.println();
                    //JOptionPane.showMessageDialog(null, query);
                    PreparedStatement pst = conn.prepareStatement(query);

                    int rs = pst.executeUpdate();

                    System.out.println(rs);

                    OptionDisplay op = new OptionDisplay();
                    op.Success();
                    pst.close();
                }

            } catch (Exception e) {
                String err = e.getMessage();
                // TODO Auto-generated catch block
                e.printStackTrace();
                //JOptionPane.showMessageDialog(null, "Error");
                OptionDisplay op = new OptionDisplay();
                op.dbFailed(err);
            }

        } else {
            OptionDisplay op = new OptionDisplay();
            op.showcustom("Obtained marks shouldn't be grater than total marks");
        }

    }//GEN-LAST:event_lbl_update_entryMousePressed

    private void lbl_print1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_print1MousePressed
        PrintMain pm=new PrintMain();
        pm.username(lbl_username.getText());
        pm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_print1MousePressed

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
            java.util.logging.Logger.getLogger(MainSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_edit;
    private javax.swing.JLabel Lbl_saveEntry;
    private javax.swing.JComboBox<String> combo_batch;
    private javax.swing.JComboBox<String> combo_examindex;
    private javax.swing.JComboBox<String> combo_sec;
    private javax.swing.JComboBox<String> combo_term;
    private javax.swing.JComboBox<String> combo_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_nameStudent;
    private javax.swing.JLabel lbl_newStudent;
    private javax.swing.JLabel lbl_print;
    private javax.swing.JLabel lbl_print1;
    private javax.swing.JLabel lbl_subheading;
    private javax.swing.JLabel lbl_update_entry;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPanel panel_Banner;
    private javax.swing.JPanel panel_insert;
    private javax.swing.JPanel panel_student;
    private javax.swing.JTextField txt_obtainedMarks;
    private javax.swing.JTextField txt_rollNo;
    private javax.swing.JTextField txt_totalMarks;
    // End of variables declaration//GEN-END:variables
}
