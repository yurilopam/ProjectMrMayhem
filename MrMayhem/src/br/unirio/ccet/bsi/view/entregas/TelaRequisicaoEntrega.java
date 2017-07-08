/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.entregas;

import br.unirio.ccet.bsi.model.Entrega;
import br.unirio.ccet.bsi.utils.Enums;
import br.unirio.ccet.bsi.utils.Utils;
import br.unirio.ccet.bsi.utils.XmlEntrega;
import br.unirio.ccet.bsi.view.produtos.TelaAlterarProduto;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri Lopam
 */
public class TelaRequisicaoEntrega extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaRequisicaoEntrega() {
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
        campoNumeroEntrega = new javax.swing.JFormattedTextField();
        campoNomeCliente = new javax.swing.JTextField();
        campoCep = new javax.swing.JFormattedTextField();
        campoNumero = new javax.swing.JFormattedTextField();
        campoEstatusEntrega = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        botaoProcurarEntrega = new java.awt.Button();
        botaoLimparBusca = new java.awt.Button();
        botaoAtualizarStatusEntrega = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(2, 86, 112));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        try {
            campoNumeroEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoNomeCliente.setEditable(false);

        campoCep.setEditable(false);
        try {
            campoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCepActionPerformed(evt);
            }
        });

        campoNumero.setEditable(false);
        campoNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        campoEstatusEntrega.setModel(new DefaultComboBoxModel(Enums.Status.values()));
        campoEstatusEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstatusEntregaActionPerformed(evt);
            }
        });

        campoObservacoes.setEditable(false);
        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane1.setViewportView(campoObservacoes);

        botaoProcurarEntrega.setLabel("Procurar entrega");
        botaoProcurarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarEntregaActionPerformed(evt);
            }
        });

        botaoLimparBusca.setLabel("Limpar busca");
        botaoLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparBuscaActionPerformed(evt);
            }
        });

        botaoAtualizarStatusEntrega.setEnabled(false);
        botaoAtualizarStatusEntrega.setLabel("Atualizar estatus da entrega");
        botaoAtualizarStatusEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarStatusEntregaActionPerformed(evt);
            }
        });

        jLabel1.setText("Entregas");

        jLabel2.setText("Número da entrega:");

        jLabel3.setText("Nome do cliente:");

        jLabel4.setText("CEP da entrega:");

        jLabel12.setText("Número da residência:");

        jLabel5.setText("Estatus da entrega:");

        jLabel6.setText("Observações:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(campoEstatusEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoAtualizarStatusEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNumeroEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoProcurarEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoLimparBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(212, 212, 212))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoProcurarEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoNumeroEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoLimparBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(campoEstatusEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAtualizarStatusEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

    private void campoCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCepActionPerformed

    private void campoEstatusEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstatusEntregaActionPerformed
    }//GEN-LAST:event_campoEstatusEntregaActionPerformed

    private void botaoProcurarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarEntregaActionPerformed
        XmlEntrega xml = new XmlEntrega();
        File arquivos = new File(Utils.recuperarPath("Entregas"));
        File[] numsPedidos = arquivos.listFiles();
        for (File numPedido : numsPedidos){
            if (numPedido.getName().equals(campoNumeroEntrega.getText()+".xml")){
                Entrega dadosEntrega = xml.LerXml(numPedido.getName());
                campoNomeCliente.setText(dadosEntrega.getNomeComprador());
                campoCep.setText(dadosEntrega.getCepDestinatario());
                campoNumero.setText(dadosEntrega.getNumeroCasaDestinatario());
                campoEstatusEntrega.setSelectedIndex(recuperarEstatusEntrega(dadosEntrega));
                campoObservacoes.setText(dadosEntrega.getObservacoes());
                campoNumeroEntrega.setEnabled(false);
                campoObservacoes.setEditable(true);
                botaoAtualizarStatusEntrega.setEnabled(true);
            }
        }
    }//GEN-LAST:event_botaoProcurarEntregaActionPerformed

    private void botaoLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparBuscaActionPerformed
        limparPesquisa();
    }//GEN-LAST:event_botaoLimparBuscaActionPerformed

    private void botaoAtualizarStatusEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarStatusEntregaActionPerformed
        Entrega entregaAtualizada = new Entrega();
        entregaAtualizada.setNumeroPedido(campoNumeroEntrega.getText());
        entregaAtualizada.setNomeComprador(campoNomeCliente.getText());
        entregaAtualizada.setCepDestinatario(campoCep.getText());
        entregaAtualizada.setNumeroCasaDestinatario(campoNumero.getText());
        entregaAtualizada.setStatus((Enums.Status) campoEstatusEntrega.getSelectedItem());
        entregaAtualizada.setObservacoes(campoObservacoes.getText());
        XmlEntrega xml = new XmlEntrega();
        xml.GerarXml(entregaAtualizada);
        JOptionPane.showMessageDialog(TelaRequisicaoEntrega.this, "Entrega atualizada com sucesso!");
        resetarCampos();
    }//GEN-LAST:event_botaoAtualizarStatusEntregaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoAtualizarStatusEntrega;
    private java.awt.Button botaoLimparBusca;
    private java.awt.Button botaoProcurarEntrega;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JComboBox<String> campoEstatusEntrega;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JFormattedTextField campoNumero;
    private javax.swing.JFormattedTextField campoNumeroEntrega;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private int recuperarEstatusEntrega(Entrega dadosEntrega) {
        switch (dadosEntrega.getStatus()) {
            case PENDENTE:
                return 0;
            case ACEITO:
                return 1;
            case RECUSADO:
                return 2;
            case ENTREGUE:
                return 3;
            default:
                break;
        }
        return -1;
    }

    private void limparPesquisa() {
        campoNumeroEntrega.setText(null);
        campoNumeroEntrega.setValue(null);
        campoNumeroEntrega.setEnabled(true);
        campoNomeCliente.setText(null);
        campoCep.setText(null);
        campoCep.setValue(null);
        campoNumero.setText(null);
        campoNumero.setValue(null);
        campoEstatusEntrega.setSelectedIndex(0);
        campoObservacoes.setText(null);
        campoObservacoes.setEditable(false);
        botaoAtualizarStatusEntrega.setEnabled(false);
    }

    private void resetarCampos() {
        campoNumeroEntrega.setText(null);
        campoNumeroEntrega.setValue(null);
        campoNumeroEntrega.setEnabled(true);
        campoNomeCliente.setText(null);
        campoCep.setText(null);
        campoCep.setValue(null);
        campoNumero.setText(null);
        campoNumero.setValue(null);
        campoEstatusEntrega.setSelectedIndex(0);
        campoObservacoes.setText(null);
        campoObservacoes.setEditable(false);
        botaoAtualizarStatusEntrega.setEnabled(false);
    }

}
