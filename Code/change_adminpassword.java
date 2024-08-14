
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cool Abit
 */
public class change_adminpassword extends javax.swing.JFrame {

    /**
     * Creates new form change_adminpassword
     */
    public change_adminpassword(String email) {
        initComponents();
        currentadminemail.setText(email);
        currentadminemail.setEditable(false);
        setSize(732, 740); 
        
         ImageIcon ic = new ImageIcon("src/Downloaded_photos/signup2.jpg");       // if path wrong than photo will not paste ;                     // icon bana kai liye, label pai icon lagta hai , photo ka path bhi do;
        Image im = ic.getImage().getScaledInstance(changeadminpassword_background.getWidth(), changeadminpassword_background.getHeight(),Image.SCALE_SMOOTH); // image ko resize karne kai liye;
        changeadminpassword_background.setIcon(new ImageIcon(im)); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        currentadminemail = new javax.swing.JTextField();
        admin_submit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        admin_newpassword = new javax.swing.JPasswordField();
        reenterpassword = new javax.swing.JPasswordField();
        changeadminpassword_background = new javax.swing.JLabel();

        jLabel25.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("We'll ask for this password whenever you sign-in ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 90, 340, 17);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current admin email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 100, 250, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter new password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 170, 240, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Re-enter new password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 250, 260, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Secure admin password tips:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 430, 300, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change your admin password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 530, 50);

        currentadminemail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        currentadminemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentadminemailActionPerformed(evt);
            }
        });
        getContentPane().add(currentadminemail);
        currentadminemail.setBounds(380, 110, 300, 40);

        admin_submit.setBackground(new java.awt.Color(255, 153, 0));
        admin_submit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        admin_submit.setForeground(new java.awt.Color(255, 255, 255));
        admin_submit.setText("Save changes");
        admin_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_submitActionPerformed(evt);
            }
        });
        getContentPane().add(admin_submit);
        admin_submit.setBounds(280, 350, 170, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("password must be atleast 6 characters");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 200, 230, 20);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("•  Create a password that is at least 12-16 characters long. Use a mix of upper and lower case letters, ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(60, 460, 770, 20);
        getContentPane().add(jLabel24);
        jLabel24.setBounds(80, 450, 30, 0);

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("•  Generate passwords that are random and not easily associated with personal information such as ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(60, 500, 730, 20);

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("•  Change your passwords periodically, ideally every few months.");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 540, 460, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("•  Be cautious of phishing attempts that try to trick you into revealing your password. Always verify ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(60, 570, 660, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" numbers, and special characters.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 470, 240, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" birthdays,names, or addresses.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 510, 220, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" the authenticity of requests.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 580, 270, 30);

        admin_newpassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        getContentPane().add(admin_newpassword);
        admin_newpassword.setBounds(380, 182, 300, 40);

        reenterpassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        getContentPane().add(reenterpassword);
        reenterpassword.setBounds(380, 252, 300, 40);
        getContentPane().add(changeadminpassword_background);
        changeadminpassword_background.setBounds(0, 0, 740, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_submitActionPerformed
        // TODO add your handling code here:
        
        String new_password = admin_newpassword.getText();
        String re_enter_password= reenterpassword.getText();
        String user_email= currentadminemail.getText(); // same variable mai store kiya to error
        
        if(new_password.equals("")|| re_enter_password.equals("")) 
        {
         JOptionPane.showMessageDialog(rootPane, "Please enter your password");
        }
        
        else if(!new_password.equals(re_enter_password))
        {
        JOptionPane.showMessageDialog(rootPane,"Must match your new password");
        }
        else
        {
         String ans = myClient.changeadmin_password(user_email,new_password); 
         
           if(ans.equals("updated"))         
           {
             JOptionPane.showMessageDialog(rootPane,"Admin Password Changed!");
             userlogin obj = new userlogin();
           }
           else if(ans.equals("same_previous_password"))
           {
             JOptionPane.showMessageDialog(rootPane," You cannot use a previous admin password!");
           }
           else    //if (ans.equals("password_not_updated"))
           {
             JOptionPane.showMessageDialog(rootPane," Admin Password not Changed!"); 
           }
        }
        
        
        
        
        
        
        
        
         
    }//GEN-LAST:event_admin_submitActionPerformed

    private void currentadminemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentadminemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentadminemailActionPerformed

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
            java.util.logging.Logger.getLogger(change_adminpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change_adminpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change_adminpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change_adminpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_adminpassword("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField admin_newpassword;
    private javax.swing.JButton admin_submit;
    private javax.swing.JLabel changeadminpassword_background;
    private javax.swing.JTextField currentadminemail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField reenterpassword;
    // End of variables declaration//GEN-END:variables
}
