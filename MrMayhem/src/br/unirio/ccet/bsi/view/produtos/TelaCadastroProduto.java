/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.produtos;

import br.unirio.ccet.bsi.model.Produto;
import br.unirio.ccet.bsi.utils.Enums;
import br.unirio.ccet.bsi.utils.Utils;
import br.unirio.ccet.bsi.utils.XmlProduto;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Yuri Lopam
 */
public class TelaCadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroProduto() {
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
        campoNome = new javax.swing.JTextField();
        campoDataCadastramento = new javax.swing.JFormattedTextField();
        campoTipoProduto = new javax.swing.JComboBox<>();
        campoCodigo = new javax.swing.JFormattedTextField();
        campoPreco = new javax.swing.JFormattedTextField();
        campoQuantidadeInicial = new javax.swing.JFormattedTextField();
        botaoCadastar = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricaoProduto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 86, 112));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        try {
            campoDataCadastramento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoTipoProduto.setModel(new DefaultComboBoxModel(Enums.TiposDeProduto.values()));
        campoTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoProdutoActionPerformed(evt);
            }
        });

        try {
            campoCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        campoQuantidadeInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        botaoCadastar.setLabel("Cadastrar");
        botaoCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cadastrar Produto");

        jLabel2.setText("Nome:");

        jLabel3.setText("Código do produto:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Data de Cadastro:");

        jLabel15.setText("Descrição:");

        campoDescricaoProduto.setColumns(20);
        campoDescricaoProduto.setRows(5);
        jScrollPane1.setViewportView(campoDescricaoProduto);

        jLabel4.setText("Preço: R$");

        jLabel7.setText("Quantidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoDataCadastramento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCodigo)))))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoQuantidadeInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoDataCadastramento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(campoQuantidadeInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
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

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void botaoCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastarActionPerformed
        if (formularioCadastroValidado()) {
            Produto novoProduto = new Produto();
            novoProduto.setNome(campoNome.getText());
            novoProduto.setDataCadastramento(campoDataCadastramento.getText());
            novoProduto.setTipo(campoTipoProduto.getSelectedItem().toString());
            novoProduto.setCodigo(campoCodigo.getText());
            novoProduto.setDescricao(campoDescricaoProduto.getText());
            novoProduto.setValor(campoPreco.getText());
            novoProduto.setQuantidade(campoQuantidadeInicial.getText());
            XmlProduto xml = new XmlProduto();
            xml.GerarXml(novoProduto);
            JOptionPane.showMessageDialog(TelaCadastroProduto.this, "Produto cadastrado com sucesso!");
            resetarCampos();
        } else {
            JOptionPane.showMessageDialog(TelaCadastroProduto.this, "Por favor preencha todos os campos do formulário parada finalizar o seu cadastro.");
        }
    }//GEN-LAST:event_botaoCadastarActionPerformed

    private void campoTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoProdutoActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private boolean formularioCadastroValidado() {
        boolean formularioValidado = false;
        if (!StringUtils.isEmpty(campoNome.getText())
                && campoDataCadastramento.getValue() != null && !campoDataCadastramento.getValue().toString().equals("")
                && campoCodigo.getValue() != null && !campoCodigo.getValue().toString().equals("")
                && campoPreco.getValue() != null && !campoPreco.getValue().toString().equals("")
                && campoQuantidadeInicial.getValue() != null && !campoQuantidadeInicial.getValue().toString().equals("")
                && !StringUtils.isEmpty(campoTipoProduto.getSelectedItem().toString())
                && !StringUtils.isEmpty(campoCodigo.getText())
                && !StringUtils.isEmpty(campoDescricaoProduto.getText())
                && verificarCodigoProdutoCadastrado()){
            formularioValidado = true;
        }
        return formularioValidado;
    }
    
    private boolean verificarCodigoProdutoCadastrado(){
        boolean validacao;
        int contadorCadastros = 0;
        XmlProduto xml = new XmlProduto();
        File arquivos = new File(Utils.recuperarPath("Produtos"));
        String[] codsProdutos = arquivos.list();
        for (String codProduto : codsProdutos) {
            Produto dadosProduto = xml.LerXml(codProduto);
            if (dadosProduto.getCodigo().equals(campoCodigo.getText()))
                contadorCadastros++;
        }
        if (contadorCadastros == 0) {
            validacao = true;
        } else {
            JOptionPane.showMessageDialog(TelaCadastroProduto.this, "Cõdigo do produto já consta na base de dados.");
            validacao = false;
        }
        return validacao;
    }
    
    private void resetarCampos() {
        campoNome.setText(null);
        campoDataCadastramento.setText(null);
        campoDataCadastramento.setValue(null);
        campoTipoProduto.setSelectedIndex(0);
        campoCodigo.setText(null);
        campoCodigo.setValue(null);
        campoDescricaoProduto.setText(null);
        campoPreco.setText(null);
        campoPreco.setValue(null);
        campoQuantidadeInicial.setText(null);
        campoQuantidadeInicial.setValue(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoCadastar;
    private javax.swing.JFormattedTextField campoCodigo;
    private javax.swing.JFormattedTextField campoDataCadastramento;
    private javax.swing.JTextArea campoDescricaoProduto;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoPreco;
    private javax.swing.JFormattedTextField campoQuantidadeInicial;
    private javax.swing.JComboBox<String> campoTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
