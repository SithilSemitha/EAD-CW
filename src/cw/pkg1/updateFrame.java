/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cw.pkg1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Amil De Silva
 */
public class updateFrame extends javax.swing.JFrame {

    /**
     * Creates new form updateFrame
     */
    public updateFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldMobile = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldDOB = new javax.swing.JTextField();
        jTextFieldFname = new javax.swing.JTextField();
        jTextFieldMMobile = new javax.swing.JTextField();
        jTextFieldFullName = new javax.swing.JTextField();
        jTextFieldFAddress = new javax.swing.JTextField();
        jTextFieldFMobile = new javax.swing.JTextField();
        jTextFieldMAddress = new javax.swing.JTextField();
        jTextFieldMName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxgrade = new javax.swing.JComboBox<>();
        jSearchButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jUpdateButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw/pkg1/back logo.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 60, 60));

        jTextFieldAge.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 220, -1));

        jTextFieldID.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));

        jTextFieldAddress.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 220, -1));

        jTextFieldMobile.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 220, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Souvenir Lt BT", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 240, -1));

        jTextFieldDOB.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 220, -1));

        jTextFieldFname.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 220, 40));

        jTextFieldMMobile.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldMMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 220, 40));

        jTextFieldFullName.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 220, -1));

        jTextFieldFAddress.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldFAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 220, -1));

        jTextFieldFMobile.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldFMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 220, -1));

        jTextFieldMAddress.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldMAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 220, 40));

        jTextFieldMName.setFont(new java.awt.Font("Souvenir Lt BT", 1, 20)); // NOI18N
        getContentPane().add(jTextFieldMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 220, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        jComboBoxgrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05", "Grade 06", "Grade 07", "Grade 08", "Grade 09", "Grade 10", "Grade 11" }));
        getContentPane().add(jComboBoxgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 110, -1));

        jSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw/pkg1/seacrhbutton.jpg"))); // NOI18N
        jSearchButton.setBorder(null);
        jSearchButton.setBorderPainted(false);
        jSearchButton.setContentAreaFilled(false);
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, 50));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 160, 60));

        jUpdateButton.setBackground(new java.awt.Color(153, 153, 255));
        jUpdateButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jUpdateButton.setText("UPDATE");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 160, 60));

        jDeleteButton.setBackground(new java.awt.Color(153, 153, 255));
        jDeleteButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jDeleteButton.setText("DELETE");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 160, 60));

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw/pkg1/updatestudent.jpg"))); // NOI18N
        jLabel1.setText("Update");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomeFrame f1=new HomeFrame();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new updateFrame().setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
        String id = jTextFieldID.getText();
        String fullname = jTextFieldFullName.getText();
        String age = jTextFieldAge.getText();
        String address = jTextFieldAddress.getText();
        String mobile =  jTextFieldMobile.getText();
        String email = jTextFieldEmail.getText();
        String dob =  jTextFieldDOB.getText();
        String grade = (String)jComboBoxgrade.getSelectedItem();
        String enrollmentDate =  jTextArea1.getText();
        String Fname = jTextFieldFname.getText();
        String Fmobile =  jTextFieldFMobile.getText();
        String FAddress = jTextFieldFAddress.getText();
        String Mname = jTextFieldMName.getText();
        String Mmobile =  jTextFieldMMobile.getText();
        String Maddress =jTextFieldMAddress.getText();
        
            String SUrl = "jdbc:MySQL://localhost:3306/AGS";
            String SUser = "root";
            String SPass = "sithil@12345";

        try{

            Connection conn = DriverManager.getConnection(SUrl,SUser,SPass);
            PreparedStatement ps = conn.prepareStatement("update Student set sFullName=?,age=?,address=?,mobile=?,email=?,DOB=?,Grade=?,enrollmentDate=?,FName=?,FMobile=?,FAddress=?,MName=?,MMobile=?,MAddress=?where sid=?");
                    

           
            ps.setString(1, fullname);
            ps.setString(2, age);
            ps.setString(3, address);
            ps.setString(4, mobile);
            ps.setString(5, email);
            ps.setString(6, dob);
            ps.setString(7, grade);
            ps.setString(8, enrollmentDate);
            ps.setString(9, Fname);
            ps.setString(10, Fmobile);
            ps.setString(11, FAddress);
            ps.setString(12, Mname);
            ps.setString(13, Mmobile);
            ps.setString(14, Maddress);
             ps.setString(15, id);
            int K=ps.executeUpdate();
            if(K==1)
            {
                JOptionPane.showMessageDialog(null, "Successfully Updated");
            }
            else
             {
                JOptionPane.showMessageDialog(null, "Updated Unsucessfully");
             }
            setVisible(false);
            new updateFrame().setVisible(true);

        }
        catch(HeadlessException | SQLException e){

            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jUpdateButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
     int m = JOptionPane.showConfirmDialog(null, "Do you want to delete","Select",JOptionPane.YES_NO_OPTION);

        if(m==0){

            String id = jTextFieldID.getText();
            
            
            String SUrl = "jdbc:MySQL://localhost:3306/AGS";
            String SUser = "root";
            String SPass = "sithil@12345";

            try{

                Connection conn = DriverManager.getConnection(SUrl,SUser,SPass);
                Statement st = conn.createStatement();
                int k=st.executeUpdate("delete from student where sid = '"+id+"'");
                if(k==1)
                {
                 JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
                }
                
                setVisible(false);
                new updateFrame().setVisible(true);

            }catch(HeadlessException | SQLException e){

                JOptionPane.showMessageDialog(null, e);
            }
        }       
        
        
        
        
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButtonActionPerformed
         //search id and get the id to text field
        int checkid = 0;
        String id =jTextFieldID.getText();

            String SUrl = "jdbc:MySQL://localhost:3306/AGS";
            String SUser = "root";
            String SPass = "sithil@12345";
            
        try{

            Connection conn = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from student where sid='"+id+"'");

            while(rs.next()){

                checkid = 1;
                jTextFieldID.setEditable(false);
                jTextFieldFullName.setText(rs.getString(2));
                jTextFieldAge.setText(rs.getString(3));
                jTextFieldAddress.setText(rs.getString(4));
                jTextFieldMobile.setText(rs.getString(5));
                jTextFieldEmail.setText(rs.getString(6));
                jTextFieldDOB.setText(rs.getString(7));
                jComboBoxgrade.setEditable(false); 
                jTextArea1.setText(rs.getString(9));
                jTextFieldFname.setText(rs.getString(10));
                jTextFieldFMobile.setText(rs.getString(11));
                jTextFieldFAddress.setText(rs.getString(12));
                jTextFieldMName.setText(rs.getString(13));
                jTextFieldMMobile.setText(rs.getString(14));
                jTextFieldMAddress.setText(rs.getString(15));
            }
           
            

            if(checkid==0){

                JOptionPane.showMessageDialog(null, "Member ID does not exist");
            }

        }catch(HeadlessException | SQLException e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jSearchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(updateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxgrade;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFAddress;
    private javax.swing.JTextField jTextFieldFMobile;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMAddress;
    private javax.swing.JTextField jTextFieldMMobile;
    private javax.swing.JTextField jTextFieldMName;
    private javax.swing.JTextField jTextFieldMobile;
    private javax.swing.JButton jUpdateButton;
    // End of variables declaration//GEN-END:variables
}
