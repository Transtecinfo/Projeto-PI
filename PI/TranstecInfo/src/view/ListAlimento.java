/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AlimentoDAO;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Alimento;

/**
 *
 * @author 181720019
 */
public class ListAlimento extends javax.swing.JInternalFrame {

     public JDesktopPane jdpTelaInicial;
     
    public ListAlimento(JDesktopPane jdpPainel) {
        initComponents();
        this.jdpTelaInicial = jdpPainel;
        carregarTabela();
    }
    
    public void carregarTabela(){
        List<Alimento> lista = AlimentoDAO.getALimentos();
        DefaultTableModel model = new DefaultTableModel();
        String[] colunas = {"Código" , "Nome", "Descrição", "Quantidade", "Situação","Maximo", "Medio", "Minimo"};
        model.setColumnIdentifiers(colunas);
        
        for (Alimento ali : lista) {
            Object[] linha = {
                ali.getCodigo(),
                ali.getNome(),
                ali.getDescricao(),
                ali.getQuantidade(),
                ali.getSituacao(),
                ali.getMinimo(),
                ali.getMedio(),
                ali.getMaximo()
            };
            model.addRow( linha );
        }
        tableAlimentos.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPainel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlimentos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Alimentos");

        tableAlimentos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tableAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição", "Quantidade", "Situação", "Maximo", "Medio", "Minimo"
            }
        ));
        jScrollPane1.setViewportView(tableAlimentos);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(19, 19, 19))
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tableAlimentos.getSelectedRow();
        if (linha<0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um alimento!");       
        }else{
            int codigo = (int) tableAlimentos.getValueAt(linha, 0);
            FrmAlimento tela = new FrmAlimento(codigo,this );
            jdpTelaInicial.add(tela);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tableAlimentos.getSelectedRow();
        if(linha<0){
            JOptionPane.showMessageDialog(this,"Você deve selecionar um alimento!");
        }else{
            int codigo = (int)tableAlimentos.getValueAt(linha,0);
            String nome = (String)tableAlimentos.getValueAt(linha,1);
            
            int resposta = JOptionPane.showConfirmDialog(this,
                    "Confirma a exclusão do alimento"+ nome,
                    "Excluir Alimento", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_NO_OPTION){
            Alimento alimento = new Alimento();
            alimento.setCodigo(codigo);
            AlimentoDAO.excluir(alimento);
            carregarTabela();
        }
       
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jdpPainel;
    private javax.swing.JTable tableAlimentos;
    // End of variables declaration//GEN-END:variables
}
