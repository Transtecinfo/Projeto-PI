/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AlimentoDAO;
import dao.VestuarioDAO;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Alimento;
import model.Vestuario;

/**
 *
 * @author 181720019
 */
public class U_ListVestuario extends javax.swing.JInternalFrame {

     public JDesktopPane jdpTelaInicial;
     
    public U_ListVestuario(JDesktopPane jdpPainel) {
        initComponents();
        this.jdpTelaInicial = jdpPainel;
        carregarTabela();
        esconder();
    }
    
    private void esconder(){
        lblQuantidade.setVisible(false);
        txtQuantidade.setVisible(false);
        btnDoar.setVisible(false);
        lblNome.setVisible(false);
        lblProduto.setVisible(false);
        
        
    }
    
    private void mostrar(){
        lblQuantidade.setVisible(true);
        txtQuantidade.setVisible(true);
        btnDoar.setVisible(true);
        lblNome.setVisible(true);
        lblProduto.setVisible(true);
        
        
    }
    
    public void carregarTabela(){
        List<Vestuario> lista = VestuarioDAO.getVestuarios();
        DefaultTableModel model = new DefaultTableModel();
        String[] colunas = {"Código" , "Nome", "Descrição", "Quantidade", "Situação","Minimo", "Médio", "Máximo" };
        model.setColumnIdentifiers(colunas);
        
        for (Vestuario vest : lista) {
            Object[] linha = {
                vest.getCodigo(),
                vest.getNome(),
                vest.getDescricao(),
                vest.getQuantidade(),
                vest.getSituacao(),
                vest.getMinimo(),
                vest.getMedio(),
                vest.getMaximo()
            };
            model.addRow( linha );
        }
        tableVestuario.setModel(model);
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
        tableVestuario = new javax.swing.JTable();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JFormattedTextField();
        btnDoar = new javax.swing.JButton();
        lblProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Alimentos");

        jdpPainel.setBackground(new java.awt.Color(255, 255, 255));

        tableVestuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tableVestuario.setModel(new javax.swing.table.DefaultTableModel(
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
        tableVestuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVestuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVestuario);

        lblQuantidade.setText("Quantidade:");

        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        btnDoar.setText("Doar");
        btnDoar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoarActionPerformed(evt);
            }
        });

        lblProduto.setText("Produto:");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("xx");

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPainelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoar)))
                    .addGroup(jdpPainelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProduto))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPainelLayout.createSequentialGroup()
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnDoar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jdpPainelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))))
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

    private void tableVestuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVestuarioMouseClicked
       int linha = tableVestuario.getSelectedRow();
        if(linha<0){
            
            esconder();
            JOptionPane.showMessageDialog(this,"Você deve selecionar um item!");
        }else{
            int codigo = (int) tableVestuario.getValueAt(linha,0);
           
            String nome = (String) tableVestuario.getValueAt(linha,1);
            
            lblNome.setText(nome);
            mostrar();
        }
    }//GEN-LAST:event_tableVestuarioMouseClicked

    private void btnDoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoarActionPerformed
        int linha = tableVestuario.getSelectedRow();
        double qtd = (Double.valueOf(txtQuantidade.getText()));
        if(linha<0){
            esconder();
            JOptionPane.showMessageDialog(this,"Você deve selecionar um item!");
        }else{
            int codigo = (int) tableVestuario.getValueAt(linha,0);
            double max = (double) tableVestuario.getValueAt(linha,7);
            double med = (double) tableVestuario.getValueAt(linha,6);
            double min = (double) tableVestuario.getValueAt(linha,5);
            
            if(qtd <= 3){
                JOptionPane.showMessageDialog(this, "A situação é ruim");
            }else{
                if(qtd >3 && qtd <=5){
                    JOptionPane.showMessageDialog(this, "A situação é regular");
                }else{
                    if(qtd >=5){
                        JOptionPane.showMessageDialog(this, "A situação é boa");
                    }
                }
            }
            
        }
    }//GEN-LAST:event_btnDoarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jdpPainel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTable tableVestuario;
    private javax.swing.JFormattedTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
