/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.scholar;

import com.itextpdf.text.DocumentException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.io.FileOutputStream;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Optimus Prime
 */
public class PrintMain extends javax.swing.JFrame {

    Connection conn = null;
    public static final String RESULT = "Result.pdf";

    public void createPdf(String filename)
            throws IOException, DocumentException {

        com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4.rotate());
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        document.open();

        Font font = new Font(FontFamily.UNDEFINED, 14, Font.BOLD);
        Font fontsub = new Font(FontFamily.UNDEFINED, 11, Font.NORMAL);
        Font fontblock = new Font(FontFamily.UNDEFINED, 8, Font.NORMAL);
        Paragraph para = new Paragraph("MILITARY INSTITUTE OF SCIENCE AND TECHNOLOGY ", font);
        para.setAlignment(Element.ALIGN_CENTER);
        document.add(para);

        Paragraph para1 = new Paragraph("Department of Computer Science and Engineering (CSE)\n"
                + "Course No- CSE-16, Level-02, Term-II, 2017 \n"
                + "Course Title- Object Oriented Programming Language Sessional II\n"
                + "Course Code- CSE 220, Credit- 0.75 ", fontsub);
        para1.setSpacingAfter(15);//set space after paragraph
        para1.setAlignment(Element.ALIGN_CENTER);
        para1.setLeading(11);
        document.add(para1);

        PdfPTable table = createTable1();
        table.setTotalWidth(document.getPageSize().getWidth() - 80);
        table.setLockedWidth(true);
        document.add(table);

//        Paragraph para2 = new Paragraph("----------------------------------------\n" + "(Signature of Subject Teachers)\n"
//                +"\n"+ "Colonel Nishith Kumar Datta \n"
//                + "Lt Cdr Naresh Singh Chauhan\n"
//                + "Lec Sanjida Nasreen Tumpa\n"
//                + "Lec Esrat Farzana Rupu   \n"
//                + " ", fontblock);
        Paragraph para2 = new Paragraph("-------------------------------------------                                                                                                                                                                                                                                    -----------------------------------------------\n"  
                + "(Signature of Subject Teachers)                                                                                                                                                                                                                                     (Signature of the Head of the Dept.)\n"
                + " Lec Sanjida Nasreen Tumpa                                                                                                                                                                                                                                            Colonel A B M Humayun Kabir\n"                                                                                                                                                                                                                                         
                + " Lec Md. Saidul Hoque Anik \n"                                                                                                                                                                                                                                            
                + " Lec Zinia Sultana\n"
                + " ", fontblock);
        para2.setSpacingBefore(120);
        //para2.setSpacingAfter(12);//set space after paragraph
        para2.setAlignment(Element.ALIGN_LEFT);
        para2.setAlignment(Element.ALIGN_BOTTOM);
        para2.setLeading(11);
        document.add(para2);

        document.close();
    }

    public PdfPTable createTable1() throws DocumentException {
        float[] columnWidths = {1f, 2, 3, 2, 2, 1.5f, 2, 1.5f, 2, 1.5f, 2, 1};
        PdfPTable table = new PdfPTable(columnWidths);

        table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);

//table.setWidthPercentage(100);
        table.addCell("Ser No.");
        table.addCell("Roll No");
        table.addCell("Name");
        table.addCell("Online 1\n" + "(25%)");
        table.addCell("Online 2\n" + "(25%)");
        table.addCell("Viva\n" + "(10%)");
        table.addCell("Attendance\n" + "(10)");
        table.addCell("Obsn.\n" + "(10%)");
        table.addCell("Class perf.\n" + "(20%)");
        table.addCell("Total\n" + "(100%)");
        table.addCell("Letter Gr.");
        table.addCell("GPA");

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            int row = i;
            String serial = jTable1.getModel().getValueAt(row, 0).toString();
            String rollno = (jTable1.getModel().getValueAt(row, 1).toString());
            String name = jTable1.getModel().getValueAt(row, 2).toString();
            String online1 = (jTable1.getModel().getValueAt(row, 3).toString());
            String online2 = (jTable1.getModel().getValueAt(row, 4).toString());
            String classper = (jTable1.getModel().getValueAt(row, 5).toString());
            String viva = (jTable1.getModel().getValueAt(row, 6).toString());
            String obsn = (jTable1.getModel().getValueAt(row, 8).toString());
            String attendance = (jTable1.getModel().getValueAt(row, 7).toString());
            String total = jTable1.getModel().getValueAt(row, 9).toString();
            String gradepoint = jTable1.getModel().getValueAt(row, 10).toString();
            String ltrgrade = jTable1.getModel().getValueAt(row, 11).toString();

            if (Double.valueOf(online1) < 0) {
                online1 = "A";
            }
            if (Double.valueOf(online2) < 0) {
                online2 = "A";
            }
            if (Double.valueOf(classper) < 0) {
                classper = "A";
            }
            if (Double.valueOf(viva) < 0) {
                viva = "A";
            }
            if (Double.valueOf(obsn) < 0) {
                obsn = "A";
            }
            if (Double.valueOf(attendance) < 0) {
                attendance = "A";
            }
            if (Double.valueOf(total) < 0) {
                total = "0.0";
                gradepoint = "0.0";
                ltrgrade = "F";
            }

            table.addCell(serial);
            table.addCell(rollno);
            table.addCell(name);
            table.addCell(online1);

            table.addCell(online2);
            table.addCell(classper);
            table.addCell(viva);
            table.addCell(obsn);

            table.addCell(attendance);
            table.addCell(total);
            table.addCell(gradepoint);
            table.addCell(ltrgrade);

        }
        return table;
    }

    public PrintMain() {
        initComponents();
        conn = DBconnect.connect();
        showtable();
        showicon();
    }

    private void showicon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/main.png"));
    }

    public void username(String name) {
        lbl_activename.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lbl_activename.setForeground(new java.awt.Color(255, 255, 255));
        lbl_activename.setText(name);
    }

    public void showtable() {
        try {
            String query = "select * from main.StudentDB";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            String err = e.getMessage();
            OptionDisplay op = new OptionDisplay();
            op.dbFailed(err);
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

        panel_print_main = new javax.swing.JPanel();
        panel_navigation = new javax.swing.JPanel();
        lbl_newStudent = new javax.swing.JLabel();
        Lbl_edit = new javax.swing.JLabel();
        lbl_print = new javax.swing.JLabel();
        lbl_print1 = new javax.swing.JLabel();
        panel_Banner = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        lbl_activename = new javax.swing.JLabel();
        lbl_subheading = new javax.swing.JLabel();
        lbl_heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_printmain = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_rollno = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_name = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_print_main.setBackground(new java.awt.Color(255, 255, 255));
        panel_print_main.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_print_mainMouseDragged(evt);
            }
        });
        panel_print_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_print_mainMousePressed(evt);
            }
        });

        panel_navigation.setBackground(new java.awt.Color(255, 255, 255));

        lbl_newStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddStudent.png"))); // NOI18N
        lbl_newStudent.setToolTipText("New Student");
        lbl_newStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_newStudentMousePressed(evt);
            }
        });

        Lbl_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit.png"))); // NOI18N
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

        lbl_print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printSelected.png"))); // NOI18N
        lbl_print1.setToolTipText("View And Print");

        javax.swing.GroupLayout panel_navigationLayout = new javax.swing.GroupLayout(panel_navigation);
        panel_navigation.setLayout(panel_navigationLayout);
        panel_navigationLayout.setHorizontalGroup(
            panel_navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_navigationLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_print)
                    .addComponent(Lbl_edit)
                    .addComponent(lbl_newStudent)
                    .addComponent(lbl_print1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel_navigationLayout.setVerticalGroup(
            panel_navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_navigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_newStudent)
                .addGap(18, 18, 18)
                .addComponent(Lbl_edit)
                .addGap(18, 18, 18)
                .addComponent(lbl_print)
                .addGap(18, 18, 18)
                .addComponent(lbl_print1)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        panel_Banner.setBackground(new java.awt.Color(204, 0, 204));

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner.png"))); // NOI18N

        lbl_activename.setBackground(new java.awt.Color(255, 255, 255));
        lbl_activename.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_activename.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Ok_24px.png"))); // NOI18N
        lbl_activename.setText("remon");

        lbl_subheading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_subheading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_subheading.setText("Student Grarebook Application");

        lbl_heading.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_heading.setText("The Scholar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_BannerLayout = new javax.swing.GroupLayout(panel_Banner);
        panel_Banner.setLayout(panel_BannerLayout);
        panel_BannerLayout.setHorizontalGroup(
            panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BannerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_icon)
                .addGap(36, 36, 36)
                .addGroup(panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BannerLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lbl_subheading, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(457, 457, 457)
                .addGroup(panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_activename))
                .addContainerGap())
        );
        panel_BannerLayout.setVerticalGroup(
            panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BannerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_icon))
            .addGroup(panel_BannerLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl_subheading))
            .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panel_BannerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_activename))
        );

        panel_printmain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Roll No:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Name:");

        txt_rollno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(204, 0, 204));

        lbl_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png"))); // NOI18N
        jLabel4.setText("Print");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_printmainLayout = new javax.swing.GroupLayout(panel_printmain);
        panel_printmain.setLayout(panel_printmainLayout);
        panel_printmainLayout.setHorizontalGroup(
            panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_printmainLayout.createSequentialGroup()
                .addGroup(panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_printmainLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_printmainLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_printmainLayout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_printmainLayout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        panel_printmainLayout.setVerticalGroup(
            panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_printmainLayout.createSequentialGroup()
                .addGroup(panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_printmainLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_printmainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(panel_printmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_printmainLayout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(116, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel_print_mainLayout = new javax.swing.GroupLayout(panel_print_main);
        panel_print_main.setLayout(panel_print_mainLayout);
        panel_print_mainLayout.setHorizontalGroup(
            panel_print_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_print_mainLayout.createSequentialGroup()
                .addComponent(panel_navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_printmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panel_Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_print_mainLayout.setVerticalGroup(
            panel_print_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_print_mainLayout.createSequentialGroup()
                .addComponent(panel_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_print_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_printmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_print_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_print_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1058, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_newStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_newStudentMousePressed
        AddStudent as = new AddStudent();
        as.username(lbl_activename.getText());
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_newStudentMousePressed

    private void Lbl_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_editMousePressed
        MainSheet m = new MainSheet();
        m.username(lbl_activename.getText());
        m.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Lbl_editMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed
    int xx, xy;
    private void panel_print_mainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_print_mainMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panel_print_mainMousePressed

    private void panel_print_mainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_print_mainMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panel_print_mainMouseDragged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        txt_rollno.setText(jTable1.getModel().getValueAt(row, 1).toString());
        lbl_name.setText(jTable1.getModel().getValueAt(row, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void lbl_printMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_printMousePressed
        ScholarPrint sp = new ScholarPrint();
        sp.username(lbl_activename.getText());
        sp.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lbl_printMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        try {
            //        MessageFormat header = new MessageFormat("Result Sheet");
//
//        MessageFormat footer = new MessageFormat("Restricted");
//        try {
//            jTable1.print(JTable.PrintMode.NORMAL);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

            createPdf(RESULT);
            OptionDisplay op = new OptionDisplay();
            op.printf();

        } catch (IOException ex) {
            Logger.getLogger(PrintMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PrintMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabel4MousePressed

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
            java.util.logging.Logger.getLogger(PrintMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_activename;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_newStudent;
    private javax.swing.JLabel lbl_print;
    private javax.swing.JLabel lbl_print1;
    private javax.swing.JLabel lbl_subheading;
    private javax.swing.JPanel panel_Banner;
    private javax.swing.JPanel panel_navigation;
    private javax.swing.JPanel panel_print_main;
    private javax.swing.JPanel panel_printmain;
    private javax.swing.JLabel txt_rollno;
    // End of variables declaration//GEN-END:variables
}
