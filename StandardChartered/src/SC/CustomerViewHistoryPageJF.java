/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SC;

/**
 *
 * @author Jungle
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CustomerViewHistoryPageJF extends javax.swing.JFrame {

    /**
     * Creates new form CustomerViewHistoryPageJF
     */
    public CustomerViewHistoryPageJF() {
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

        jLabel3 = new javax.swing.JLabel();
        NID = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        AB = new javax.swing.JTextField();
        PW = new javax.swing.JTextField();
        LN = new javax.swing.JTextField();
        UN = new javax.swing.JTextField();
        WD = new javax.swing.JTextField();
        Un = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        n = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 35)); // NOI18N
        jLabel3.setText("View history");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 260, 40));

        NID.setBackground(new java.awt.Color(0, 153, 204));
        NID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIDActionPerformed(evt);
            }
        });
        getContentPane().add(NID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 140, 30));

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 90, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SC/backbutton.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 260, 80));

        AB.setBackground(new java.awt.Color(0, 153, 204));
        AB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABActionPerformed(evt);
            }
        });
        getContentPane().add(AB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 130, 30));

        PW.setBackground(new java.awt.Color(0, 153, 255));
        PW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWActionPerformed(evt);
            }
        });
        getContentPane().add(PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, 30));

        LN.setBackground(new java.awt.Color(0, 153, 204));
        LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNActionPerformed(evt);
            }
        });
        getContentPane().add(LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 130, 30));

        UN.setBackground(new java.awt.Color(51, 153, 255));
        UN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNActionPerformed(evt);
            }
        });
        getContentPane().add(UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 30));

        WD.setBackground(new java.awt.Color(0, 153, 204));
        WD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WDActionPerformed(evt);
            }
        });
        getContentPane().add(WD, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 130, 30));

        Un.setBackground(new java.awt.Color(255, 204, 51));
        Un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnActionPerformed(evt);
            }
        });
        getContentPane().add(Un, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 150, 30));

        nm.setBackground(new java.awt.Color(0, 153, 255));
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        getContentPane().add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 140, 30));

        n.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n.setText("Name");
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("National ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        DP.setBackground(new java.awt.Color(0, 153, 204));
        DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPActionPerformed(evt);
            }
        });
        getContentPane().add(DP, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Deposit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Loan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Account Balance");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        Nid.setBackground(new java.awt.Color(255, 204, 0));
        Nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NidActionPerformed(evt);
            }
        });
        getContentPane().add(Nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("National ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Withdraw");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("UserName");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, 20));

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("input here");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Input Here");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, -1, -1));

        BG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SC/texture-background-wallpaper-5.jpg"))); // NOI18N
        BG.setText("jLabel1");
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new CustomerHomePageJF().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIDActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
//        // TODO add your handling code here:
  
        String un=Un.getText();
        String ND=Nid.getText();
        
        
        try
        {
            
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("Select UserName from CustomerInfo where UserName='"+un+"' and NationalID='"+ND+"' ");
           if(rs.next())
           {    
           ResultSet bs = stmt.executeQuery("Select * from CustomerInfo where UserName='"+un+"' ");
           
       
       if(bs.next()  )
            {
                String st1=bs.getString("UserName");
                String st2=bs.getString("Password");
                String st3=bs.getString("CustomerName");
                String st4=bs.getString("NationalID");
                
              
                UN.setText(st1);
                PW.setText(st2);
                nm.setText(st3);
                NID.setText(st4);
                
         ResultSet ms = stmt.executeQuery("Select * from CustomerReport where NationalID='"+ND+"' "); 
         
                while(ms.next())
                {
                String st5=ms.getString("Withdraw");
                String st6=ms.getString("Deposit");
                String st7=ms.getString("Loan");
                String st8=ms.getString("AccountBalance");
                
                WD.setText(st5);
                DP.setText(st6);
                LN.setText(st7);
                AB.setText(st8);
                }
            }
       
       
           }
           
           else{JOptionPane.showMessageDialog(null, "Sorry! Wrong Input!");}
        } 
	catch (Exception err) {
            System.out.println("ERROR: " + err);
        }
        
        
        
    }//GEN-LAST:event_okActionPerformed

    private void UNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UNActionPerformed

    private void PWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWActionPerformed

    private void WDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WDActionPerformed

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

    private void UnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnActionPerformed

    private void ABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ABActionPerformed

    private void DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DPActionPerformed

    private void LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNActionPerformed

    private void NidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NidActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerViewHistoryPageJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerViewHistoryPageJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerViewHistoryPageJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerViewHistoryPageJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerViewHistoryPageJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AB;
    private javax.swing.JLabel BG;
    private javax.swing.JTextField DP;
    private javax.swing.JTextField LN;
    private javax.swing.JTextField NID;
    private javax.swing.JTextField Nid;
    private javax.swing.JTextField PW;
    private javax.swing.JTextField UN;
    private javax.swing.JTextField Un;
    private javax.swing.JTextField WD;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel n;
    private javax.swing.JTextField nm;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
