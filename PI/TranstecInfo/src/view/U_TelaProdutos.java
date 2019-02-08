/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;



/**
 *
 * @author 181720100
 */
public class U_TelaProdutos extends javax.swing.JFrame {

    

    public U_TelaProdutos() {
        initComponents();
    }

       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpTela = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        cmbOpcoes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jdpTela.setBackground(new java.awt.Color(255, 255, 255));
        jdpTela.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Controle de Produtos");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Categoria:");

        cmbCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbCategoria.setMaximumRowCount(3);
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione....", "Alimento", "Limpeza", "Higiene", "Vestuario", "" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        cmbOpcoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbOpcoes.setMaximumRowCount(3);
        cmbOpcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione....", "Listar e Doar" }));
        cmbOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcoesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Opção:");

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logotrans.PNG"))); // NOI18N

        jdpTela.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(cmbCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(cmbOpcoes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(btnOK, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpTelaLayout = new javax.swing.GroupLayout(jdpTela);
        jdpTela.setLayout(jdpTelaLayout);
        jdpTelaLayout.setHorizontalGroup(
            jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpTelaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(59, 59, 59)
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaLayout.createSequentialGroup()
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
        );
        jdpTelaLayout.setVerticalGroup(
            jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaLayout.createSequentialGroup()
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpTelaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdpTelaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jMenu1.setText("Inicial");

        MenuVoltar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        MenuVoltar.setText("Voltar a tela  anterior");
        MenuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVoltarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuVoltar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOpcoesActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
     int p1 = cmbCategoria.getSelectedIndex();
        
        int p2 = cmbOpcoes.getSelectedIndex();


        
        if (p1 == 1 && p2 == 1) {
            U_ListAlimento tela = new U_ListAlimento(jdpTela);
            jdpTela.add(tela);
            tela.setVisible(true);
        }

        
        if (p1 == 2 && p2 == 1) {
            U_ListLimpeza tela = new U_ListLimpeza(jdpTela);
            jdpTela.add(tela);
            tela.setVisible(true);
        }

        
        if (p1 == 3 && p2 == 1) {
            U_ListHigiene tela = new U_ListHigiene(jdpTela);
            jdpTela.add(tela);
            tela.setVisible(true);
        }

        
        if (p1 == 4 && p2 == 1) {
            U_ListVestuario tela = new U_ListVestuario(jdpTela);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void MenuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVoltarActionPerformed
        TelaUser tela = new TelaUser();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaProdutos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuVoltar;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbOpcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpTela;
    // End of variables declaration//GEN-END:variables

}
