/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import dao.HigieneDAO;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Higiene;

/**
 *
 * @author 181720019
 */
public class U_ListHigiene extends javax.swing.JInternalFrame {

     public JDesktopPane jdpTelaInicial;
     
    public U_ListHigiene(JDesktopPane jdpPainel) {
        initComponents();
        this.jdpTelaInicial = jdpPainel;
    }
    
    public void carregarTabela(){
        List<Higiene> lista = HigieneDAO.getHigienes();
        DefaultTableModel model = new DefaultTableModel();
        String[] colunas = {"Código" , "Nome", "Descrição", "Quantidade", "Situação","Maximo", "Medio", "Minimo"};
        model.setColumnIdentifiers(colunas);
        
        for (Higiene hig : lista) {
            Object[] linha = {
                hig.getCodigo(),
                hig.getNome(),
                hig.getDescricao(),
                hig.getQuantidade(),
                hig.getSituacao(),
                hig.getMinimo(),
                hig.getMedio(),
                hig.getMaximo()
            };
            model.addRow( linha );
        }
        table.setModel(model);
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
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Higiene");

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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPainelLayout.createSequentialGroup()
                .addContainerGap(698, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(19, 19, 19))
            .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdpPainelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelLayout.createSequentialGroup()
                .addContainerGap(547, Short.MAX_VALUE)
                .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap())
            .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdpPainelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
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
        int linha = table.getSelectedRow();
        if (linha<0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item!");       
        }else{
            int codigo = (int) table.getValueAt(linha, 0);
            FrmHigiene tela = new FrmHigiene(codigo,this );
            jdpTelaInicial.add(tela);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = table.getSelectedRow();
        if(linha<0){
            JOptionPane.showMessageDialog(this,"Você deve selecionar um item!");
        }else{
            int codigo = (int)table.getValueAt(linha,0);
            String nome = (String)table.getValueAt(linha,1);
            
            int resposta = JOptionPane.showConfirmDialog(this,
                    "Confirma a exclusão do item"+ nome,
                    "Excluir item", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_NO_OPTION){
            Higiene higiene = new Higiene();
            higiene.setCodigo(codigo);
            HigieneDAO.excluir(higiene);
            carregarTabela();
        }
       
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jdpPainel;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
