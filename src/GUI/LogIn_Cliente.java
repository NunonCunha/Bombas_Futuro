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
 * @author NCUNHA
 */
public class LogIn_Cliente extends javax.swing.JFrame {

    
    
    Conn connection = new Conn();   
    
     static String codigo;
    
    
    
    
    /**
     * Creates new form LogIn_Cliente
     */
    public LogIn_Cliente() {
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

        jtxtLoginCliente = new javax.swing.JTextField();
        jbttLoginCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setSize(new java.awt.Dimension(0, 0));

        jtxtLoginCliente.setToolTipText("");
        jtxtLoginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLoginClienteActionPerformed(evt);
            }
        });

        jbttLoginCliente.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        jbttLoginCliente.setText("Login");
        jbttLoginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttLoginClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("NIF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbttLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbttLoginCliente)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbttLoginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttLoginClienteActionPerformed
     
     codigo = jtxtLoginCliente.getText();
     
     connection.connGetClientes(codigo);
     //JOptionPane.showMessageDialog(this, connection.getNome());  
     
     if(connection.getNome() == null){
         JOptionPane.showMessageDialog(this, "Sem registo");
     }
     else{
         JOptionPane.showMessageDialog(this, connection.getNome());
         new Client().setVisible(true);
        this.dispose();
     }   
     
        
    }//GEN-LAST:event_jbttLoginClienteActionPerformed

    private void jtxtLoginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLoginClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLoginClienteActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbttLoginCliente;
    private javax.swing.JTextField jtxtLoginCliente;
    // End of variables declaration//GEN-END:variables
}
