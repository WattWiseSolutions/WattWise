
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author riyan
 */
public class CalculateCost extends javax.swing.JFrame {

    /**
     * Creates new form CalculateCost
     */
    public CalculateCost() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        about = new javax.swing.JButton();
        contact = new javax.swing.JButton();
        faq = new javax.swing.JButton();
        contact1 = new javax.swing.JButton();
        contact2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        email3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(806, 620));

        jPanel2.setBackground(new java.awt.Color(251, 195, 132));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel7.setText("WATTWISE");

        about.setBackground(new java.awt.Color(124, 92, 68));
        about.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        contact.setBackground(new java.awt.Color(124, 92, 68));
        contact.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setText("Contact");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        faq.setBackground(new java.awt.Color(124, 92, 68));
        faq.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        faq.setForeground(new java.awt.Color(255, 255, 255));
        faq.setText("FAQ");
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });

        contact1.setBackground(new java.awt.Color(124, 92, 68));
        contact1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        contact1.setForeground(new java.awt.Color(255, 255, 255));
        contact1.setText("Log out");
        contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact1ActionPerformed(evt);
            }
        });

        contact2.setBackground(new java.awt.Color(124, 92, 68));
        contact2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        contact2.setForeground(new java.awt.Color(255, 255, 255));
        contact2.setText("Back");
        contact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(faq, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(contact2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contact1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faq)
                            .addComponent(about)
                            .addComponent(contact)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contact1)
                        .addComponent(contact2)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(251, 195, 132));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculate Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 48), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");

        email3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        email3.setToolTipText("Enter id");
        email3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        email3.setName("name"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Bill per Month");

        cost.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cost.setToolTipText("Enter id");
        cost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cost.setName("name"); // NOI18N

        jButton6.setBackground(new java.awt.Color(124, 92, 68));
        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Calculate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cost)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustrations/Logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        About obj = new About();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_aboutActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        Contact obj = new Contact();
        obj.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqActionPerformed
        Faq obj = new Faq();
        obj.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_faqActionPerformed

    private void contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact1ActionPerformed
        Login obj = new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_contact1ActionPerformed

    private void contact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact2ActionPerformed
        CheckPower obj = new CheckPower();
        obj.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_contact2ActionPerformed

    private void jButton6jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6jButton4ActionPerformed
        String c = cost.getText().toString();
        String e = email3.getText().toString();

        if (e.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all the field correctly correctly");
        } else {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WattWise", "root", "riya");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("Select email from signup where email='" + e + "';");

                int i = stmt.executeUpdate("Insert into cost(email,total_cost) values('" + e + "','" + c + "')");
                if (i > 0) {
                    cost.setText("");

                }
            } catch (SQLException error) {
                System.out.println(error.getMessage());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton contact;
    private javax.swing.JButton contact1;
    private javax.swing.JButton contact2;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField email3;
    private javax.swing.JButton faq;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
