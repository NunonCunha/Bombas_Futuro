/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import connections.Conn;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo A
 */
public class LogIn_Sup extends javax.swing.JFrame {

    Conn connection = new Conn();
    
   static String user;
   static String password;
    
    
    /**
     * Creates new form LogIn
     */
    public LogIn_Sup() {
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

        jlblMenuname = new javax.swing.JLabel();
        jtxtfldUser = new javax.swing.JTextField();
        jlblUser = new javax.swing.JLabel();
        jlblPass = new javax.swing.JLabel();
        jtxtlblPass = new javax.swing.JTextField();
        jlblLogo = new javax.swing.JLabel();
        jbttLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblMenuname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblMenuname.setText("Supervisor Login");

        jlblUser.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jlblUser.setText("User:");

        jlblPass.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jlblPass.setText("Password:");

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Capture (1).png"))); // NOI18N

        jbttLogin.setText("Login");
        jbttLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblLogo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jlblMenuname)))
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblPass)
                    .addComponent(jlblUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtfldUser)
                    .addComponent(jtxtlblPass)
                    .addComponent(jbttLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblMenuname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtfldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPass)
                    .addComponent(jtxtlblPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jbttLogin)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbttLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttLoginActionPerformed
       user = jtxtfldUser.getText();
       password = jtxtlblPass.getText();
       
       connection.connGetSupervisor(user, password);
       
       if(connection.getUserSupervisor() == null && connection.getPassSupervisor() == null){
           JOptionPane.showMessageDialog(this, "Sem registo");
       }
       else{
           new Supervisor().setVisible(true);
           this.dispose();
         
     }
    }//GEN-LAST:event_jbttLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn_Sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn_Sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn_Sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn_Sup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn_Sup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbttLogin;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblMenuname;
    private javax.swing.JLabel jlblPass;
    private javax.swing.JLabel jlblUser;
    private javax.swing.JTextField jtxtfldUser;
    private javax.swing.JTextField jtxtlblPass;
    // End of variables declaration//GEN-END:variables
}
