/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi;

import java.io.File;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Yuri Lopam
 */
public class TelaExcluirProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaExcluirProduto() {
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

        jPanel1 = new javax.swing.JPanel();
        campoNomeProduto = new javax.swing.JTextField();
        campoDataCadastroProduto = new javax.swing.JFormattedTextField();
        campoTipoProduto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricaoProduto = new javax.swing.JTextArea();
        botaoPesquisarProduto = new java.awt.Button();
        botaoExcluirProduto = new java.awt.Button();

        setBackground(new java.awt.Color(2, 86, 112));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeProdutoActionPerformed(evt);
            }
        });

        try {
            campoDataCadastroProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CINTO", "TERNO", "MEIA", "SAPATO", "GRAVATA" }));
        campoTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Cadastrar Produto");

        jLabel2.setText("Nome:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Data de Cadastro:");

        jLabel15.setText("Descrição:");

        campoDescricaoProduto.setColumns(20);
        campoDescricaoProduto.setRows(5);
        jScrollPane1.setViewportView(campoDescricaoProduto);

        botaoPesquisarProduto.setLabel("Pesquisar");
        botaoPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarProdutoActionPerformed(evt);
            }
        });

        botaoExcluirProduto.setEnabled(false);
        botaoExcluirProduto.setLabel("Excluir");
        botaoExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoDataCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(botaoPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoDataCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(botaoExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeProdutoActionPerformed

    private void campoTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoProdutoActionPerformed

    private void botaoPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarProdutoActionPerformed
        XmlProdutoCadastrado xml = new XmlProdutoCadastrado();
        File arquivos = new File("C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\produtos");
        File[] nomesProdutos = arquivos.listFiles();
        for (File nomeProduto : nomesProdutos){
            if(nomeProduto.getName().equals(campoNomeProduto.getText()+".xml")){
                Produto dadosProduto = xml.LerXmlProduto(nomeProduto.getName());
                campoNomeProduto.setText(dadosProduto.getNomeProduto());
                campoDataCadastroProduto.setText(dadosProduto.getDataCadastroProduto());
                campoTipoProduto.setSelectedIndex(recuperarTipoProduto(dadosProduto));
                campoDescricaoProduto.setText(dadosProduto.getDescricaoProduto());            
                campoNomeProduto.setEditable(true);
                campoTipoProduto.setEditable(true);
                campoDescricaoProduto.setEditable(true);
                botaoExcluirProduto.setEnabled(true);
            }
        }
    }//GEN-LAST:event_botaoPesquisarProdutoActionPerformed

    private void botaoExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirProdutoActionPerformed
        File produtoAExcluir = new File("C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\produtos\\"+campoNomeProduto.getText()+".xml");
            if(produtoAExcluir.delete()){
                JOptionPane.showMessageDialog(TelaExcluirProduto.this, "O produto foi excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(TelaExcluirProduto.this, "Falha na operação de exclusão!");
            }
            resetarCampos();
    }//GEN-LAST:event_botaoExcluirProdutoActionPerformed

    private int recuperarTipoProduto(Produto dadosProduto) {
        switch(dadosProduto.getTipoProduto()){
            case "CINTO":
                return 0;
            case "TERNO":
                return 1;
            case "MEIA":
                return 2;
            case "SAPATO": 
                return 3;
            case "GRAVATA":
                return 4;
        } return -1;
    }
    
    private boolean formularioAlteracaoProdutoValidado() {
        return !StringUtils.isEmpty(campoNomeProduto.getText())
                && !StringUtils.isEmpty(campoDataCadastroProduto.getText())
                && !StringUtils.isEmpty(campoTipoProduto.getSelectedItem().toString())
                && !StringUtils.isEmpty(campoDescricaoProduto.getText());
    }
    
    private void resetarCampos() {
        campoNomeProduto.setText(null);
        campoDataCadastroProduto.setText(null);
        campoTipoProduto.setSelectedIndex(0);
        campoDescricaoProduto.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoExcluirProduto;
    private java.awt.Button botaoPesquisarProduto;
    private javax.swing.JFormattedTextField campoDataCadastroProduto;
    private javax.swing.JTextArea campoDescricaoProduto;
    private javax.swing.JTextField campoNomeProduto;
    private javax.swing.JComboBox<String> campoTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
