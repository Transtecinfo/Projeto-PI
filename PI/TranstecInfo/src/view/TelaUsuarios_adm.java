/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



/**
 *
 * @author 181720100
 */
public class TelaUsuarios_adm extends javax.swing.JFrame {


    public TelaUsuarios_adm() {
        initComponents();
    }

       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpTela = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));

        jdpTela.setBackground(new java.awt.Color(255, 255, 255));
        jdpTela.setForeground(new java.awt.Color(0, 153, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Controle de Usuários");

        btnOK.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnCadastro.setText("Cadastrar Usuários");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnLista.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnLista.setText("Listar Usuários");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logotrans.PNG"))); // NOI18N

        jdpTela.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(btnOK, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(btnCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(btnLista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTela.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpTelaLayout = new javax.swing.GroupLayout(jdpTela);
        jdpTela.setLayout(jdpTelaLayout);
        jdpTelaLayout.setHorizontalGroup(
            jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLista)
                    .addComponent(btnCadastro)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        jdpTelaLayout.setVerticalGroup(
            jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaLayout.createSequentialGroup()
                .addGroup(jdpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpTelaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jdpTelaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCadastro)
                .addGap(47, 47, 47)
                .addComponent(btnLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        jMenu1.setText("Inicial");

        MenuVoltar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        MenuVoltar.setText("Voltar a tela anterior");
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
   
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        FrmUsuario tela = new FrmUsuario();
            jdpTela.add(tela);
            tela.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
             ListUsuario tela = new ListUsuario(jdpTela);
            jdpTela.add(tela);
            tela.setVisible(true);
      
    }//GEN-LAST:event_btnListaActionPerformed

    private void MenuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVoltarActionPerformed
        TelaAdmin2 tela = new TelaAdmin2();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuVoltar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpTela;
    // End of variables declaration//GEN-END:variables

}
