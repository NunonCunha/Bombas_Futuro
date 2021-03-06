/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import connections.Conn;

/**
 *
 * @author Grupo A
 */
public class Supervisor extends javax.swing.JFrame {
    
    Conn connection = new Conn();  
    
    LogIn_Sup dados = new LogIn_Sup();
       
    
    public void labelName(){
        connection.connGetSupervisor(dados.user, dados.password);       
        jlblSupervisor.setText("Bem vindo/a "+connection.getUserSupervisor());   
    }
    
    private String bomba;
    
    public void setBomba(){
        
        connection.setBomba(this.bomba);
        connection.valorTotalbomba();
        connection.quantidadeTotalBomba();        
        connection.connGetDataSupervisor(); 
        jtextAreaSupervisor.setText("\nBomba "+this.bomba+"\nValor total Vendido: "+connection.getValorTotalBomba()+"\nQuantidade total Abastecida: "+connection.getQuantidadeTotalBomba());
    }
    
    /**
     * Creates new form Supervisor
     */
    public Supervisor() {
        
        initComponents();
        labelName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblApp = new javax.swing.JLabel();
        jlblSupervisor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextAreaSupervisor = new javax.swing.JTextArea();
        jbttBomba3 = new javax.swing.JButton();
        jbttBomba1 = new javax.swing.JButton();
        jbttBomba2 = new javax.swing.JButton();
        jbttBomba6 = new javax.swing.JButton();
        jbttBomba4 = new javax.swing.JButton();
        jbttBomba5 = new javax.swing.JButton();
        jbttBomba9 = new javax.swing.JButton();
        jbttBomba8 = new javax.swing.JButton();
        jbttBomba7 = new javax.swing.JButton();
        jbttBomba10 = new javax.swing.JButton();
        jbttTotal = new javax.swing.JButton();
        jbttSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção");

        jlblApp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Capture (1).png"))); // NOI18N

        jlblSupervisor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblSupervisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSupervisor.setText("Nome");
        jlblSupervisor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jlblSupervisorPropertyChange(evt);
            }
        });

        jtextAreaSupervisor.setColumns(20);
        jtextAreaSupervisor.setRows(5);
        jScrollPane1.setViewportView(jtextAreaSupervisor);

        jbttBomba3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba3.setText("Bomba 3");
        jbttBomba3.setHideActionText(true);
        jbttBomba3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba3ActionPerformed(evt);
            }
        });

        jbttBomba1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba1.setText("Bomba 1");
        jbttBomba1.setHideActionText(true);
        jbttBomba1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba1ActionPerformed(evt);
            }
        });

        jbttBomba2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba2.setText("Bomba 2");
        jbttBomba2.setHideActionText(true);
        jbttBomba2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba2ActionPerformed(evt);
            }
        });

        jbttBomba6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba6.setText("Bomba 6");
        jbttBomba6.setHideActionText(true);
        jbttBomba6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba6ActionPerformed(evt);
            }
        });

        jbttBomba4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba4.setText("Bomba 4");
        jbttBomba4.setHideActionText(true);
        jbttBomba4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba4ActionPerformed(evt);
            }
        });

        jbttBomba5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba5.setText("Bomba 5");
        jbttBomba5.setHideActionText(true);
        jbttBomba5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba5ActionPerformed(evt);
            }
        });

        jbttBomba9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba9.setText("Bomba 9");
        jbttBomba9.setHideActionText(true);
        jbttBomba9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba9ActionPerformed(evt);
            }
        });

        jbttBomba8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba8.setText("Bomba 8");
        jbttBomba8.setHideActionText(true);
        jbttBomba8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba8ActionPerformed(evt);
            }
        });

        jbttBomba7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba7.setText("Bomba 7");
        jbttBomba7.setHideActionText(true);
        jbttBomba7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba7ActionPerformed(evt);
            }
        });

        jbttBomba10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttBomba10.setText("Bomba 10");
        jbttBomba10.setToolTipText("");
        jbttBomba10.setHideActionText(true);
        jbttBomba10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttBomba10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttBomba10ActionPerformed(evt);
            }
        });

        jbttTotal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttTotal.setText("Total");
        jbttTotal.setToolTipText("");
        jbttTotal.setHideActionText(true);
        jbttTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttTotalActionPerformed(evt);
            }
        });

        jbttSair.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbttSair.setText("Sair");
        jbttSair.setToolTipText("");
        jbttSair.setHideActionText(true);
        jbttSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jbttSair, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbttBomba10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbttTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbttBomba1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbttBomba2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbttBomba4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbttBomba5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbttBomba7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbttBomba8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbttBomba3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbttBomba6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbttBomba9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblApp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblSupervisor)
                    .addComponent(jlblApp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbttBomba3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbttBomba6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbttBomba9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbttBomba2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbttBomba1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbttBomba5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbttBomba4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbttBomba7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbttBomba8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttBomba10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlblSupervisorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jlblSupervisorPropertyChange

    }//GEN-LAST:event_jlblSupervisorPropertyChange

    private void jbttBomba3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba3ActionPerformed
        this.bomba = "3";
        setBomba();
    }//GEN-LAST:event_jbttBomba3ActionPerformed

    private void jbttBomba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba1ActionPerformed
        this.bomba = "1";
        setBomba();
    }//GEN-LAST:event_jbttBomba1ActionPerformed

    private void jbttBomba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba2ActionPerformed
        this.bomba = "2";
        setBomba();
    }//GEN-LAST:event_jbttBomba2ActionPerformed

    private void jbttBomba6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba6ActionPerformed
        this.bomba = "6";
        setBomba();
    }//GEN-LAST:event_jbttBomba6ActionPerformed

    private void jbttBomba4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba4ActionPerformed
        this.bomba = "4";
        setBomba();
    }//GEN-LAST:event_jbttBomba4ActionPerformed

    private void jbttBomba5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba5ActionPerformed
        this.bomba = "5";
        setBomba();
    }//GEN-LAST:event_jbttBomba5ActionPerformed

    private void jbttBomba9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba9ActionPerformed
        this.bomba = "9";
        setBomba();
    }//GEN-LAST:event_jbttBomba9ActionPerformed

    private void jbttBomba8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba8ActionPerformed
        this.bomba = "8";
        setBomba();
    }//GEN-LAST:event_jbttBomba8ActionPerformed

    private void jbttBomba7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba7ActionPerformed
        this.bomba = "7";
        setBomba();
    }//GEN-LAST:event_jbttBomba7ActionPerformed

    private void jbttBomba10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttBomba10ActionPerformed
        this.bomba = "10";
        setBomba();
    }//GEN-LAST:event_jbttBomba10ActionPerformed

    private void jbttTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttTotalActionPerformed
        connection.totalPosto();
        connection.connGetTotalPosto();        
        jtextAreaSupervisor.setText("Total do Posto de Abastecimento\nValor total Vendido: "+connection.getTotalValorPosto()+"\nQuantidade total Abastecida: "+connection.getTotalQuantidadePosto());
    }//GEN-LAST:event_jbttTotalActionPerformed

    private void jbttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbttSairActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbttBomba1;
    private javax.swing.JButton jbttBomba10;
    private javax.swing.JButton jbttBomba2;
    private javax.swing.JButton jbttBomba3;
    private javax.swing.JButton jbttBomba4;
    private javax.swing.JButton jbttBomba5;
    private javax.swing.JButton jbttBomba6;
    private javax.swing.JButton jbttBomba7;
    private javax.swing.JButton jbttBomba8;
    private javax.swing.JButton jbttBomba9;
    private javax.swing.JButton jbttSair;
    private javax.swing.JButton jbttTotal;
    private javax.swing.JLabel jlblApp;
    private javax.swing.JLabel jlblSupervisor;
    protected javax.swing.JTextArea jtextAreaSupervisor;
    // End of variables declaration//GEN-END:variables
}
