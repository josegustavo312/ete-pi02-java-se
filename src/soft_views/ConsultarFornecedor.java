/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_views;

import soft_class.FornecedorFuncoes;
import soft_class.Fornecedor;
import java.awt.Component;
import java.awt.Container;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GUSTAVO
 */
public class ConsultarFornecedor extends javax.swing.JFrame {
    
    private List<Fornecedor> listaFornecedor;

    /**
     * Creates new form ConsultarFornecedor
     */
    public ConsultarFornecedor() {
        initComponents();
    }
    
    CadastrarFornecedor cadastrarFornecedor;
    
    private void chamarCadastarFornecedor (){
    if(cadastrarFornecedor==null){
        cadastrarFornecedor = new CadastrarFornecedor ();
        cadastrarFornecedor.setVisible(true);
        cadastrarFornecedor.setLocationRelativeTo(null);
    }
    else{
        cadastrarFornecedor.setVisible(true);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPesquisa_Fornecedor = new javax.swing.JTextField();
        jButtonPesquisar_Fornecedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jEndereco = new javax.swing.JTextField();
        jCep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jUf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTelefone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jExcluirFornecedor_Botao = new javax.swing.JToggleButton();
        jFecharFornecedor_Botao = new javax.swing.JToggleButton();
        jAlterarFornecedor_Botao = new javax.swing.JToggleButton();
        jNomeFornecedor_Botao = new javax.swing.JToggleButton();
        jLimpar_Botao = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setTitle("Consultar Fornecedor");

        jTextFieldPesquisa_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisa_FornecedorActionPerformed(evt);
            }
        });

        jButtonPesquisar_Fornecedor.setText("Pesquisar");
        jButtonPesquisar_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisar_FornecedorActionPerformed(evt);
            }
        });

        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cidade", "Endereço"
            }
        ));
        jTableFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableFornecedorMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFornecedor);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nome");

        jBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBairroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Endereço");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Bairro");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("CEP");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("UF");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Cidade");

        jTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefoneActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Telefone");

        jExcluirFornecedor_Botao.setText("Excluir");
        jExcluirFornecedor_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirFornecedor_BotaoActionPerformed(evt);
            }
        });

        jFecharFornecedor_Botao.setText("Fechar");
        jFecharFornecedor_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharFornecedor_BotaoActionPerformed(evt);
            }
        });

        jAlterarFornecedor_Botao.setText("Alterar");
        jAlterarFornecedor_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarFornecedor_BotaoActionPerformed(evt);
            }
        });

        jNomeFornecedor_Botao.setText("Novo");
        jNomeFornecedor_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeFornecedor_BotaoActionPerformed(evt);
            }
        });

        jLimpar_Botao.setText("Limpar");
        jLimpar_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpar_BotaoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Painel Fornecedor");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft_images/fornecedor_botao.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jFecharFornecedor_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel17)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel16)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa_Fornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar_Fornecedor)))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNomeFornecedor_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jAlterarFornecedor_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jExcluirFornecedor_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLimpar_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBairro)
                                .addGap(18, 18, 18)
                                .addComponent(jEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(179, 179, 179))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jUf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTelefone)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jNome)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar_Fornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeFornecedor_Botao)
                    .addComponent(jAlterarFornecedor_Botao)
                    .addComponent(jExcluirFornecedor_Botao)
                    .addComponent(jLimpar_Botao))
                .addGap(18, 18, 18)
                .addComponent(jFecharFornecedor_Botao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisa_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisa_FornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisa_FornecedorActionPerformed

    private void jButtonPesquisar_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisar_FornecedorActionPerformed
        // TODO add your handling code here:
        String dados = jTextFieldPesquisa_Fornecedor.getText().toString();
        carregarTudo(dados);
    }//GEN-LAST:event_jButtonPesquisar_FornecedorActionPerformed

    private void jTableFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFornecedorMousePressed
        // TODO add your handling code here:
        carregaCamposFornecedor();
    }//GEN-LAST:event_jTableFornecedorMousePressed

    private void jBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBairroActionPerformed

    private void jTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefoneActionPerformed

    private void jExcluirFornecedor_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirFornecedor_BotaoActionPerformed
        // Exluir Cliente:
        excluirFornecedor();
        limparTodosCampos(rootPane);
    }//GEN-LAST:event_jExcluirFornecedor_BotaoActionPerformed

    private void jFecharFornecedor_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharFornecedor_BotaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jFecharFornecedor_BotaoActionPerformed

    private void jAlterarFornecedor_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarFornecedor_BotaoActionPerformed
        // Alterar Cliente:
        alterarFornecedor();
        limparTodosCampos(rootPane);
    }//GEN-LAST:event_jAlterarFornecedor_BotaoActionPerformed

    private void jNomeFornecedor_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeFornecedor_BotaoActionPerformed
        // Cadastrar um novo cliente:
        chamarCadastarFornecedor ();
    }//GEN-LAST:event_jNomeFornecedor_BotaoActionPerformed

    private void jLimpar_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpar_BotaoActionPerformed
        // Limpa os campos:
        limparTodosCampos(rootPane);

    }//GEN-LAST:event_jLimpar_BotaoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFornecedor().setVisible(true);
            }
        });
    }
    
    private DefaultTableModel carregaTabela(List<Fornecedor> listFornecedor) {

        String[] colunas = new String[4];
        colunas[0] = "ID";
        colunas[1] = "Nome";
        colunas[2] = "Cidade";
        colunas[3] = "Endereço";


        DefaultTableModel df = new DefaultTableModel(colunas, 0);

        for (Fornecedor c : listFornecedor) {
            String $id = c.getId().toString();
            String $nome = c.getNome().toString();
            String $cidade = c.getCidade().toString();
            String $endereco = c.getEndereco().toString();
            String[] linhas = new String[4];
            linhas[0] = $id;
            linhas[1] = $nome;
            linhas[2] = $cidade;
            linhas[3] = $endereco;
            df.addRow(linhas);

        }
        return df;
    }

    private void carregaTabela(DefaultTableModel modelo) {
        jTableFornecedor.setModel(modelo);
        jTableFornecedor.setShowGrid(true);
        jTableFornecedor.getColumnModel().getColumn(0).setPreferredWidth(1); //tamanho da coluna
        jTableFornecedor.getColumnModel().getColumn(0).setResizable(false);
        jTableFornecedor.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableFornecedor.getColumnModel().getColumn(1).setResizable(false);
        jTableFornecedor.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableFornecedor.getColumnModel().getColumn(2).setResizable(false);
        jTableFornecedor.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableFornecedor.getColumnModel().getColumn(3).setResizable(false);
    }

    private void carregarTudo(String dados) {
        listaFornecedor = FornecedorFuncoes.retornaFornecedor(dados);
        DefaultTableModel retDf = new DefaultTableModel();

        retDf = carregaTabela(listaFornecedor);
        carregaTabela(retDf);

    }

    private void carregaCamposFornecedor() {

        int i = jTableFornecedor.getSelectedRow();
        if (i < -1) {
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor");

        } else {
            String codigo = (String) jTableFornecedor.getValueAt(i, 0);
            Fornecedor fornecedor = new Fornecedor();
            fornecedor  = FornecedorFuncoes.retFornecedor(codigo);
            
            jId.setText(fornecedor.getId());
            jNome.setText(fornecedor.getNome().toString());
            jEndereco.setText(fornecedor.getBairro().toString());
            jBairro.setText(fornecedor.getEndereco().toString());
            jCidade.setText(fornecedor.getCidade().toString());
            jUf.setText(fornecedor.getUf().toString());
            jCep.setText(fornecedor.getCep().toString());
            jTelefone.setText(fornecedor.getTelefone().toString());

        }
    }
    
    private void excluirFornecedor() {
        String id = jId.getText();
        String nome = jNome.getText();
        String bairro = jBairro.getText();
        String endereco = jEndereco.getText();
        String cep = jCep.getText();
        String cidade = jCidade.getText();
        String uf = jUf.getText();
        String fone = jTelefone.getText();

        Fornecedor objFornecedor = new Fornecedor();

        objFornecedor.setId(id);
        objFornecedor.setNome(nome);
        objFornecedor.setBairro(bairro);
        objFornecedor.setEndereco(endereco);
        objFornecedor.setCep(cep);
        objFornecedor.setCidade(cidade);
        objFornecedor.setUf(uf);
        objFornecedor.setTelefone(fone);

        boolean ret = FornecedorFuncoes.excluirFornecedor(objFornecedor);

        if (ret == true) {
            JOptionPane.showMessageDialog(null, "Fornecedor Excluido com Sucesso");

        }
        
        else if (ret == false){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir o Fornecedor");
        }

    }
    
    private void alterarFornecedor() {
        String id = jId.getText();
        String nome = jNome.getText();
        String bairro = jBairro.getText();
        String endereco = jEndereco.getText();
        String cep = jCep.getText();
        String cidade = jCidade.getText();
        String uf = jUf.getText();
        String fone = jTelefone.getText();

        Fornecedor objFornecedor = new Fornecedor();

        objFornecedor.setId(id);
        objFornecedor.setNome(nome);
        objFornecedor.setBairro(bairro);
        objFornecedor.setEndereco(endereco);
        objFornecedor.setCep(cep);
        objFornecedor.setCidade(cidade);
        objFornecedor.setUf(uf);
        objFornecedor.setTelefone(fone);

        boolean ret = FornecedorFuncoes.alterarFornecedor(objFornecedor);

        if (ret == true) {
            JOptionPane.showMessageDialog(null, "Fornecedor Alterado com Sucesso");
        }
        
         else if (ret == false){
            JOptionPane.showMessageDialog(null, "Erro ao Alterar o Fornecedor");
        }        
    }
    
    public void limparTodosCampos(Container container) {

        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setValue(null);
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            } else if (component instanceof Container) {
                limparTodosCampos((Container) component);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jAlterarFornecedor_Botao;
    private javax.swing.JTextField jBairro;
    private javax.swing.JButton jButtonPesquisar_Fornecedor;
    private javax.swing.JTextField jCep;
    private javax.swing.JTextField jCidade;
    private javax.swing.JTextField jEndereco;
    private javax.swing.JToggleButton jExcluirFornecedor_Botao;
    private javax.swing.JToggleButton jFecharFornecedor_Botao;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jLimpar_Botao;
    private javax.swing.JTextField jNome;
    private javax.swing.JToggleButton jNomeFornecedor_Botao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTextField jTelefone;
    private javax.swing.JTextField jTextFieldPesquisa_Fornecedor;
    private javax.swing.JTextField jUf;
    // End of variables declaration//GEN-END:variables
}
