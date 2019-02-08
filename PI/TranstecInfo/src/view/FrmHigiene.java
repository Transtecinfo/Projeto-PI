/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AlimentoDAO;
import dao.HigieneDAO;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Alimento;
import model.Higiene;

/**
 *
 * @author assparremberger
 */
public class FrmHigiene extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCidade
     */
    private Higiene higiene;
    private ListHigiene telaListHigiene;

    public FrmHigiene() {
        initComponents();
        lblCodigo.setVisible(false);
        lblCodigoValor.setVisible(false);
        higiene = null;

    }

    public FrmHigiene(int codigo, ListHigiene telaListHigiene) {
        this.telaListHigiene = telaListHigiene;
        initComponents();
        lblCodigo.setVisible(true);
        lblCodigoValor.setVisible(true);
        higiene = HigieneDAO.getHigienesByCodigo(codigo);
        carregarFormulario();
    }

    private void carregarFormulario() {
        lblCodigoValor.setText(String.valueOf(higiene.getCodigo()));
        txtNome.setText(higiene.getNome());
        txtDescricao.setText(higiene.getDescricao());
        txtQuantidade.setText(String.valueOf(higiene.getQuantidade()));
        txtMaximo.setText(String.valueOf(higiene.getMaximo()));
        txtMedio.setText(String.valueOf(higiene.getMedio()));
        txtMinimo.setText(String.valueOf(higiene.getMinimo()));
        
       
        
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSituacao = new javax.swing.ButtonGroup();
        lblCodigo = new javax.swing.JLabel();
        lblCodigoValor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JFormattedTextField();
        txtMedio = new javax.swing.JFormattedTextField();
        txtMinimo = new javax.swing.JFormattedTextField();
        txtMaximo = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Formulário de Higiene");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigo.setText("Código: ");

        lblCodigoValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigoValor.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nome: ");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Quantidade:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Valores:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Mínimo:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Médio:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Máximo:");

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        txtMedio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        txtMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedioActionPerformed(evt);
            }
        });

        txtMinimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        txtMaximo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 530, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                            .addComponent(txtQuantidade)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMinimo)
                            .addComponent(txtMedio)
                            .addComponent(txtMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtMedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblCodigoValor))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void limparFormulario() {
        txtNome.setText("");
        txtQuantidade.setText("");
        txtDescricao.setText("");
        txtMinimo.setText("");
        txtMedio.setText("");
        txtMinimo.setText("");

    }
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String qtd = txtMinimo.getText();
        String descricao = txtDescricao.getText();
        String max = txtMaximo.getText();
        String min = txtMinimo.getText();
        String med = txtMedio.getText();
 
        double quantidade=0;
        double maximo = 0;
        double minimo = 0;
        double medio = 0;
    
        
        if (!qtd.isEmpty()) {
             quantidade = Double.valueOf(qtd);
        }
        if (!max.isEmpty()) {
             maximo = Double.valueOf(max);
        }
        if (!med.isEmpty()) {
             medio = Double.valueOf(med);
        }
        if (!min.isEmpty()) {
             minimo = Double.valueOf(min);
        }


            if (nome.isEmpty() | qtd.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome e Quantidade são obrigatórios!");
            } else {
                boolean nova = false;
                if (higiene == null) {
                    nova = true;
                    higiene = new Higiene();
                }
                higiene.setNome(nome);
                higiene.setCodigo(0);
                higiene.setDescricao(descricao);
                higiene.setQuantidade(quantidade);
                higiene.setMaximo(maximo);
                higiene.setMinimo(minimo);
                higiene.setMedio(medio);
                
                if (nova) {
                    HigieneDAO.inserir(higiene);
                } else {
                    HigieneDAO.editar(higiene);
                    telaListHigiene.carregarTabela();
                    this.dispose();
                }

            }
            limparFormulario();
        
                                        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
       txtQuantidade.setText("");
        txtMaximo.setText("");
        txtDescricao.setText("");
        txtMinimo.setText("");
        txtMedio.setText("");
     
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroupSituacao;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoValor;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JFormattedTextField txtMaximo;
    private javax.swing.JFormattedTextField txtMedio;
    private javax.swing.JFormattedTextField txtMinimo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
