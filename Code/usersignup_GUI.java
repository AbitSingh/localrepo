
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abits
 */
public class usersignup_GUI extends javax.swing.JFrame {
         JFileChooser jfc;
         File ph;
    public usersignup_GUI() 
    {
        jfc = new JFileChooser();
        initComponents();
        
        setSize(547, 760);
        //getContentPane().setBackground(Color.decode("#000000"));
      
//        background.setOpaque(true);
//        mainpanel.setBackground(Color.RED);
         ImageIcon ic = new ImageIcon("src/Downloaded_photos/signup1.jpg");       // if path wrong than photo will not paste ;                     // icon bana kai liye, label pai icon lagta hai , photo ka path bhi do;
        Image im = ic.getImage().getScaledInstance(signup_background.getWidth(), signup_background.getHeight(),Image.SCALE_SMOOTH); // image ko resize karne kai liye;
        signup_background.setIcon(new ImageIcon(im));  
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pf1 = new javax.swing.JLabel();
        pf = new javax.swing.JPasswordField();
        email1 = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        preview = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        signup_background = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Sign Up");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 0, 300, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 120, 90, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 110, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 240, 100, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 320, 80, 27);

        pf1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        pf1.setForeground(new java.awt.Color(255, 255, 255));
        pf1.setText("Photo");
        getContentPane().add(pf1);
        pf1.setBounds(70, 380, 90, 40);

        pf.setBackground(new java.awt.Color(153, 204, 255));
        pf.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        getContentPane().add(pf);
        pf.setBounds(180, 180, 280, 40);

        email1.setBackground(new java.awt.Color(153, 204, 255));
        email1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        getContentPane().add(email1);
        email1.setBounds(180, 110, 280, 40);

        address.setBackground(new java.awt.Color(153, 204, 255));
        address.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address);
        address.setBounds(180, 320, 280, 40);

        mobile.setBackground(new java.awt.Color(153, 204, 255));
        mobile.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });
        getContentPane().add(mobile);
        mobile.setBounds(180, 250, 280, 40);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Choose Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 400, 130, 40);

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 490, 140, 40);

        preview.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        preview.setForeground(new java.awt.Color(255, 255, 255));
        preview.setText("Photo Preview");
        getContentPane().add(preview);
        preview.setBounds(180, 380, 120, 90);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Already have an  VOD account?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 560, 260, 21);

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sign-In now");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(230, 590, 140, 40);
        getContentPane().add(signup_background);
        signup_background.setBounds(0, 0, 550, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed

      
    }//GEN-LAST:event_email1ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // HUM CHAHTE HAI KAI ES BUTTON KAI CLICK PAI ESA DIALOG POP-UP HO JISSAI HUM PHOTO SELECT KAR PAYE 
        // SO USE JFILECHOOSER
        int ans = jfc.showOpenDialog(this) ; // this KA MATLAB  mere ESE frame kai upar show karna hai;    
        
      if ( ans == JFileChooser.APPROVE_OPTION)
      {
        ph = jfc.getSelectedFile(); 
        // AB LABEL PAI ICON LAGTA HAI, SO ES PHOTO KO ICON BANAO
         ImageIcon ic = new ImageIcon(ph.getPath());
         Image img = ic.getImage().getScaledInstance(preview.getWidth(), preview.getHeight(), Image.SCALE_SMOOTH);
         //preview.getHeight() or preview.getWeight() karne sai label ki height or width jitne ho jayegi photo
         ImageIcon ic1 = new ImageIcon(img); 
         preview.setIcon(ic1) ;               
      }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
       // ES BUTTON KAI CLICK PAI YEAH SARA DATA GET KARO;
       //  AB HUM CHAHTE HAI KI Submit kai button click pai yeah sara data database mai 
       //  check ho ki vaha hai, agar nahi hai ki phir vaha store karvayo;
       
       String email = email1.getText();
       String password = pf.getText();
       String phone = mobile.getText();
       String add = address.getText();
       
       // if esiliye lagaya taki koi field khaali na rahe;
       if(email.equals("")|| password.equals("")|| phone.equals("") || add.equals("") || ph == null)
       { 
         // photo ka check nahi lagaya, so null save hoga aur exception generate hogi;
         // myServer kai String name pai null jayega aur try vala part nahi chalega;
         // myClient pai response res null ajayega, 
         // phir jab vo vapas gui pai jayega, else part chal jayega jaha SignUp Failed likha hua hai;
         // so for Photo use ph == null; so photo bhi khali na jaye;
           
           JOptionPane.showMessageDialog( rootPane,"Enter All Fields");
       }
       
//       else 
//       {
//         String ans = myClient.verifyEmail(email);
//         
//            if(ans.equals("exist"))
//            {
//              JOptionPane.showMessageDialog(rootPane, " Email Already Taken");
//            }
//            else 
//            {
//             //  yeah string return karega;
//                String Otp =  JOptionPane.showMessageDialog(rootPane, " Enter otp to Verify");
//               if(Otp.trim().equals( ans.trim()))
//               {
//                   String ans1 = myClient.usersignup(email, password, phone, add, ph);
//                
//                      if(ans1.equals("Success"))
//                       {
//                       JOptionPane.showMessageDialog(rootPane, "Signup Success");
//                       }
//                      else
//                       {
//                          
//                         JOptionPane.showInputDialog(rootPane, "Signup Failed");
//               
//               
//                        }
            
            
      
       /*
       // sari field bhari hai to myClient kai usersignup pai request karo; 
       else 
       {   
        String ans = myClient.usersignup_GUI(email, password, phone, add, ph);    //yeah jo .getText() karke String mai value save karvayi hai vo as parameteres pass kiye hai es function ma 
        
            if( ans.equals("success"))                            // agar yaha par space extra daal di to es sai match nahi hoga agar piche sai success bhi aaya to;
            {
                JOptionPane.showMessageDialog(rootPane, "SignUp Success");   
            }
           
            else if(ans.equals("mobile"))
            {
            JOptionPane.showMessageDialog(rootPane, "Mobile Number Already Taken!");    
            }
            else if (ans.equals("exist"))     // agar yaha par bhi space daal di to match nahi hoga;
            {
               JOptionPane.showMessageDialog(rootPane,"Email Already Taken!"); 
            }
            else 
            {
                 JOptionPane.showMessageDialog(rootPane,"Signup Failed");
            }
       }
*/
       

       else 
       {
            String ans = myClient.verifyEmail(email,phone);
           if(ans.equals("exist"))
           {
           JOptionPane.showMessageDialog(rootPane, "Email Already Taken!");    
           } 
           else if(ans.equals("mobile"))
           {
             JOptionPane.showMessageDialog(rootPane, "Mobile Already Taken!");   
           }
         
           else
           {
                String otp = JOptionPane.showInputDialog(rootPane, "Enter Otp to Verify");
                if(otp.trim().equals( ans.trim()))                                               // agar type karte space pad gayi, to kabhi match nahi hoga 
                {
               
                    String ans1 = myClient.usersignup_GUI(email, password, phone, add, ph);
              
                    if(ans1.equals("success"))
                   {
                   JOptionPane.showMessageDialog(rootPane, "Signup Success");  
                   userlogin obj = new userlogin();
                   obj.setVisible(true);
                   dispose();
                   }
               
//                    else if(ans1.equals("mobile"))
//                    {
//                    JOptionPane.showMessageDialog(rootPane, "Mobile Number Already Taken!");    
//                    }
//                    else if (ans1.equals("exist"))     // agar yaha par bhi space daal di to match nahi hoga;
//                    {
//                    JOptionPane.showMessageDialog(rootPane,"Email Already Taken!"); 
//                    }
                    else
                   {
                    JOptionPane.showMessageDialog(rootPane, "Signup Failed");  
                   }  
               }
           
                
           }
       
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
         userlogin obj = new userlogin();
         obj.setVisible(true);
        dispose(); 
        
    }//GEN-LAST:event_jButton3ActionPerformed
   
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
            java.util.logging.Logger.getLogger(usersignup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersignup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersignup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersignup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersignup_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField email1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField pf;
    private javax.swing.JLabel pf1;
    private javax.swing.JLabel preview;
    private javax.swing.JLabel signup_background;
    // End of variables declaration//GEN-END:variables
}
