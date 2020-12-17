/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import connections.Conn;
import java.util.Random;
import javax.swing.JOptionPane;
import user.client;

/**
 *
 * @author NCUNHA
 */
public class Client extends javax.swing.JFrame {
       
    //Objectos
    Conn connection = new Conn();
    //client data = new client();
    LogIn_Cliente codigo = new LogIn_Cliente();
    
    //Ramdom para atestar
    Random rand = new Random();
    
      
    //Atributos
    private final int botaoUmValor=1;
    private final int botaoCincoValor=5;
    private final int botaoDezValor=10;
    private int botaoAtestar;
    private int totalAbastecer;  
    private int totalPagar;
    private String energia;    
        
    
    
    public void labelName(){
        //objecto para retornar o codigo de log in do cliente
        connection.connGetClientes(codigo.codigo);
        jlblClient.setText("Bem-Vindo/a "+connection.getNome()+" "+connection.getApelido());
        jtextAreaCliente.setText("Quantidade:" +totalAbastecer + "unidades" );
        
    }     
      
    
    /**
     * Creates new form Client
     */
    public Client() {

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
        jbttAtestar = new javax.swing.JButton();
        jbttbotaoUm = new javax.swing.JButton();
        jbttbotaoCinco = new javax.swing.JButton();
        jbttbotaoDez = new javax.swing.JButton();
        jbttLimpar = new javax.swing.JButton();
        jbttAbastecer = new javax.swing.JButton();
        jbttGasolina = new javax.swing.JButton();
        jbttGasoleo = new javax.swing.JButton();
        jbttElet = new javax.swing.JButton();
        jbttGas = new javax.swing.JButton();
        jlblClient = new javax.swing.JLabel();
        jbttPlasma = new javax.swing.JButton();
        jbttHidro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextAreaCliente = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");

        jlblApp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblApp.setText("BOFU");

        jbttAtestar.setText("Atestar");
        jbttAtestar.setToolTipText("");
        jbttAtestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttAtestarActionPerformed(evt);
            }
        });

        jbttbotaoUm.setText("1 Quantidade");
        jbttbotaoUm.setToolTipText("");
        jbttbotaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttbotaoUmActionPerformed(evt);
            }
        });

        jbttbotaoCinco.setText("5 Quantidades");
        jbttbotaoCinco.setToolTipText("");
        jbttbotaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttbotaoCincoActionPerformed(evt);
            }
        });

        jbttbotaoDez.setText("10 Quantidades");
        jbttbotaoDez.setToolTipText("");
        jbttbotaoDez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttbotaoDezActionPerformed(evt);
            }
        });

        jbttLimpar.setText("Limpar");
        jbttLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttLimparActionPerformed(evt);
            }
        });

        jbttAbastecer.setText("Abastecer");
        jbttAbastecer.setToolTipText("");
        jbttAbastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttAbastecerActionPerformed(evt);
            }
        });

        jbttGasolina.setText("Gasolina");
        jbttGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttGasolinaActionPerformed(evt);
            }
        });

        jbttGasoleo.setText("Gasóleo");
        jbttGasoleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttGasoleoActionPerformed(evt);
            }
        });

        jbttElet.setText("Eletricidade");
        jbttElet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttEletActionPerformed(evt);
            }
        });

        jbttGas.setText("Gás");
        jbttGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttGasActionPerformed(evt);
            }
        });

        jlblClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblClient.setText("Nome");
        jlblClient.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jlblClientPropertyChange(evt);
            }
        });

        jbttPlasma.setText("Plasma");
        jbttPlasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttPlasmaActionPerformed(evt);
            }
        });

        jbttHidro.setText("Hidrogenio");
        jbttHidro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttHidroActionPerformed(evt);
            }
        });

        jtextAreaCliente.setColumns(20);
        jtextAreaCliente.setRows(5);
        jScrollPane1.setViewportView(jtextAreaCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jlblClient, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jlblApp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbttGasoleo)
                                        .addComponent(jbttGasolina, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(101, 101, 101)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbttPlasma, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbttHidro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbttGas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbttElet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbttbotaoUm)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbttbotaoCinco)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbttbotaoDez))
                                        .addComponent(jScrollPane1))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbttAtestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbttLimpar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbttAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlblApp)
                .addGap(32, 32, 32)
                .addComponent(jlblClient)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttElet)
                    .addComponent(jbttGasolina)
                    .addComponent(jbttPlasma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttGasoleo)
                    .addComponent(jbttGas)
                    .addComponent(jbttHidro))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttbotaoCinco)
                    .addComponent(jbttbotaoDez)
                    .addComponent(jbttbotaoUm)
                    .addComponent(jbttAtestar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbttLimpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jbttAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jlblClient.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    
    private void jbttbotaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttbotaoCincoActionPerformed
         totalAbastecer +=botaoCincoValor;
        
         JOptionPane.showConfirmDialog(rootPane, totalAbastecer); 
    }//GEN-LAST:event_jbttbotaoCincoActionPerformed

    
    private void jbttbotaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttbotaoUmActionPerformed
        totalAbastecer +=botaoUmValor;
        
         JOptionPane.showConfirmDialog(rootPane, totalAbastecer);        
        
    }//GEN-LAST:event_jbttbotaoUmActionPerformed

    private void jbttGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttGasolinaActionPerformed
        energia = "gasolina";
        jtextAreaCliente.append("Energia: Gasolina\n");
        jbttElet.setEnabled(false);
        jbttGasoleo.setEnabled(false);
        jbttGas.setEnabled(false);
        jbttPlasma.setEnabled(false);
        jbttHidro.setEnabled(false);
    }//GEN-LAST:event_jbttGasolinaActionPerformed

    private void jbttGasoleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttGasoleoActionPerformed
        energia = "gasoleo";
        jtextAreaCliente.append("Energia: Gasóleo\n");
        jbttElet.setEnabled(false);
        jbttGas.setEnabled(false);
        jbttGasolina.setEnabled(false);
        jbttPlasma.setEnabled(false);
        jbttHidro.setEnabled(false);
    }//GEN-LAST:event_jbttGasoleoActionPerformed

    private void jbttEletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttEletActionPerformed
        energia = "eletricidade";
        jtextAreaCliente.append("Energia: Electricidade\n");
        jbttGas.setEnabled(false);
        jbttGasoleo.setEnabled(false);
        jbttGasolina.setEnabled(false);
        jbttPlasma.setEnabled(false);
        jbttHidro.setEnabled(false);
    }//GEN-LAST:event_jbttEletActionPerformed

    private void jlblClientPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jlblClientPropertyChange
        
    }//GEN-LAST:event_jlblClientPropertyChange

    private void jbttbotaoDezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttbotaoDezActionPerformed
        totalAbastecer +=botaoDezValor;
        
         JOptionPane.showConfirmDialog(rootPane, totalAbastecer);
    }//GEN-LAST:event_jbttbotaoDezActionPerformed

    private void jbttAbastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttAbastecerActionPerformed
       
        //data.getGuiCliente(totalAbastecer, energia);
        connection.connGetClientes(codigo.codigo);
        connection.connGetData(energia);
        connection.setQuantidadeAbastecer(Integer.toString(totalAbastecer));
        connection.setTipoEnergia(energia);        
        connection.insertVendas();        
        connection.connInsertClientes();
        
    }//GEN-LAST:event_jbttAbastecerActionPerformed

    private void jbttGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttGasActionPerformed
        energia = "gas";
        jtextAreaCliente.append("Energia: Gás\n");
        jbttElet.setEnabled(false);
        jbttGasoleo.setEnabled(false);
        jbttGasolina.setEnabled(false);
        jbttPlasma.setEnabled(false);
        jbttHidro.setEnabled(false);
    }//GEN-LAST:event_jbttGasActionPerformed

    private void jbttPlasmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttPlasmaActionPerformed
        energia = "plasma";
        jtextAreaCliente.append("Energia: Plasma\n");
        jbttElet.setEnabled(false);
        jbttGasoleo.setEnabled(false);
        jbttGasolina.setEnabled(false);
        jbttGas.setEnabled(false);
        jbttHidro.setEnabled(false);
    }//GEN-LAST:event_jbttPlasmaActionPerformed

    private void jbttHidroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttHidroActionPerformed
        energia = "hidrogenio";
        jtextAreaCliente.append("Energia: Hidrogenio\n");
        jbttElet.setEnabled(false);
        jbttGasoleo.setEnabled(false);
        jbttGasolina.setEnabled(false);
        jbttPlasma.setEnabled(false);
        jbttGas.setEnabled(false);
    }//GEN-LAST:event_jbttHidroActionPerformed

    private void jbttAtestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttAtestarActionPerformed
       this.botaoAtestar = rand.nextInt(100)+1;
       totalAbastecer = botaoAtestar;       
       jbttbotaoUm.setEnabled(false);
       jbttbotaoCinco.setEnabled(false);
       jbttbotaoDez.setEnabled(false);
       jtextAreaCliente.append("Quantidade: "+totalAbastecer+ " unidades para atestar\n");
       
       
    }//GEN-LAST:event_jbttAtestarActionPerformed

    private void jbttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttLimparActionPerformed
       totalAbastecer = 0;
       energia = null;
       jtextAreaCliente.setText("");
       jbttbotaoUm.setEnabled(true);
       jbttbotaoCinco.setEnabled(true);
       jbttbotaoDez.setEnabled(true);
       
        jbttElet.setEnabled(true);
        jbttGasoleo.setEnabled(true);
        jbttGasolina.setEnabled(true);
        jbttPlasma.setEnabled(true);
        jbttHidro.setEnabled(true);
        jbttGas.setEnabled(true);
    }//GEN-LAST:event_jbttLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbttAbastecer;
    private javax.swing.JButton jbttAtestar;
    private javax.swing.JButton jbttElet;
    private javax.swing.JButton jbttGas;
    private javax.swing.JButton jbttGasoleo;
    private javax.swing.JButton jbttGasolina;
    private javax.swing.JButton jbttHidro;
    private javax.swing.JButton jbttLimpar;
    private javax.swing.JButton jbttPlasma;
    private javax.swing.JButton jbttbotaoCinco;
    private javax.swing.JButton jbttbotaoDez;
    private javax.swing.JButton jbttbotaoUm;
    private javax.swing.JLabel jlblApp;
    private javax.swing.JLabel jlblClient;
    private javax.swing.JTextArea jtextAreaCliente;
    // End of variables declaration//GEN-END:variables
}
