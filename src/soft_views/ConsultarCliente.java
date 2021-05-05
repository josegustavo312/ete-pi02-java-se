package soft_views;

import soft_class.Cliente;
import soft_class.ClienteFuncoes;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Gui_PesquisaCliente.java
 *
 * Created on 03/10/2012, 15:29:42
 */
/**
 *
 * @author Energy
 */
public class ConsultarCliente extends javax.swing.JFrame {

    private List<Cliente> listaCliente;

    /** Creates new form Gui_PesquisaCliente */
    public ConsultarCliente() {
        initComponents();
    }
    
    CadastrarCliente cadastrarCliente;
    
    private void chamarCadastarCliente (){
    if(cadastrarCliente==null){
        cadastrarCliente = new CadastrarCliente ();
        cadastrarCliente.setVisible(true);
        cadastrarCliente.setLocationRelativeTo(null);
    }
    else{
        cadastrarCliente.setVisible(true);
    }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPesquisa_Cliente = new javax.swing.JTextField();
        jButtonPesquisar_Cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jNome = new javax.swing.JTextField();
        jEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBairro = new javax.swing.JTextField();
        jUf = new javax.swing.JTextField();
        jCidade = new javax.swing.JTextField();
        jTelefone = new javax.swing.JTextField();
        jCep = new javax.swing.JTextField();
        jId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jNomeCliente_Botao = new javax.swing.JToggleButton();
        jAlterarCliente_Botao = new javax.swing.JToggleButton();
        jExcluirCliente_Botao = new javax.swing.JToggleButton();
        jFecharCliente_Botao = new javax.swing.JToggleButton();
        jLimpar_Botao = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setTitle("Consultar Cliente");

        jTextFieldPesquisa_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisa_ClienteActionPerformed(evt);
            }
        });

        jButtonPesquisar_Cliente.setText("Pesquisar");
        jButtonPesquisar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisar_ClienteActionPerformed(evt);
            }
        });

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cidade", "Endereço"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableClienteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID");

        jBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBairroActionPerformed(evt);
            }
        });

        jTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefoneActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nome");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Endereço");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Bairro");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Cidade");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("UF");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("CEP");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Telefone");

        jNomeCliente_Botao.setText("Novo");
        jNomeCliente_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeCliente_BotaoActionPerformed(evt);
            }
        });

        jAlterarCliente_Botao.setText("Alterar");
        jAlterarCliente_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarCliente_BotaoActionPerformed(evt);
            }
        });

        jExcluirCliente_Botao.setText("Excluir");
        jExcluirCliente_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirCliente_BotaoActionPerformed(evt);
            }
        });

        jFecharCliente_Botao.setText("Fechar");
        jFecharCliente_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharCliente_BotaoActionPerformed(evt);
            }
        });

        jLimpar_Botao.setText("Limpar");
        jLimpar_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpar_BotaoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Painel Cliente");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft_images/user_botao.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBairro)
                                .addGap(18, 18, 18)
                                .addComponent(jEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa_Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisar_Cliente)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jFecharCliente_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNomeCliente_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jAlterarCliente_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jExcluirCliente_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLimpar_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar_Cliente))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(13, 13, 13)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeCliente_Botao)
                    .addComponent(jAlterarCliente_Botao)
                    .addComponent(jExcluirCliente_Botao)
                    .addComponent(jLimpar_Botao))
                .addGap(18, 18, 18)
                .addComponent(jFecharCliente_Botao)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisar_ClienteActionPerformed
        // TODO add your handling code here:
        String dados = jTextFieldPesquisa_Cliente.getText().toString();
        carregarTudo(dados);
    }//GEN-LAST:event_jButtonPesquisar_ClienteActionPerformed

    private void jTableClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMousePressed
        // TODO add your handling code here:
        carregaCamposClientes();
    }//GEN-LAST:event_jTableClienteMousePressed

    private void jTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefoneActionPerformed

    private void jBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBairroActionPerformed

    private void jNomeCliente_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeCliente_BotaoActionPerformed
        // Cadastrar um novo cliente:
        chamarCadastarCliente ();
    }//GEN-LAST:event_jNomeCliente_BotaoActionPerformed

    private void jAlterarCliente_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarCliente_BotaoActionPerformed
        // Alterar Cliente:
        alterarCliente();
        limparTodosCampos(rootPane);
    }//GEN-LAST:event_jAlterarCliente_BotaoActionPerformed

    private void jExcluirCliente_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirCliente_BotaoActionPerformed
        // Exluir Cliente:
        excluirCliente();
        limparTodosCampos(rootPane);
        
    }//GEN-LAST:event_jExcluirCliente_BotaoActionPerformed

    private void jFecharCliente_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharCliente_BotaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jFecharCliente_BotaoActionPerformed

    private void jTextFieldPesquisa_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisa_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisa_ClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ConsultarCliente().setVisible(true);
            }
        });
    }
    
    private DefaultTableModel carregaTabela(List<Cliente> listCliente) {

        String[] colunas = new String[4];
        colunas[0] = "ID";
        colunas[1] = "Nome";
        colunas[2] = "Cidade";
        colunas[3] = "Endereço";

        DefaultTableModel df = new DefaultTableModel(colunas, 0);

        for (Cliente c : listCliente) {
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
        jTableCliente.setModel(modelo);
        jTableCliente.setShowGrid(true);
        jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(1); //tamanho da coluna
        jTableCliente.getColumnModel().getColumn(0).setResizable(false);
        jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableCliente.getColumnModel().getColumn(1).setResizable(false);
        jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableCliente.getColumnModel().getColumn(2).setResizable(false);
        jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableCliente.getColumnModel().getColumn(3).setResizable(false);
    }

    private void carregarTudo(String dados) {
        listaCliente = ClienteFuncoes.retornaCliente(dados);
        DefaultTableModel retDf = new DefaultTableModel();

        retDf = carregaTabela(listaCliente);
        carregaTabela(retDf);

    }

    private void carregaCamposClientes() {

        int i = jTableCliente.getSelectedRow();
        if (i < -1) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");

        } else {
            String codigo = (String) jTableCliente.getValueAt(i, 0);
            Cliente cliente = new Cliente();
            cliente  = ClienteFuncoes.retCliente(codigo);
            
            jId.setText(cliente.getId());
            jNome.setText(cliente.getNome().toString());
            jEndereco.setText(cliente.getBairro().toString());
            jBairro.setText(cliente.getEndereco().toString());
            jCidade.setText(cliente.getCidade().toString());
            jUf.setText(cliente.getUf().toString());
            jCep.setText(cliente.getCep().toString());
            jTelefone.setText(cliente.getTelefone().toString());

        }
    }
    
    private void limparDados() {
        jId.setText("");
        jNome.setText("");
        jBairro.setText("");
        jEndereco.setText("");
        jCep.setText("");
        jCidade.setText("");
        jCep.setText("");
        jUf.setText("");
        jTelefone.setText("");
    }
    
    private void excluirCliente() {
        String id = jId.getText();
        String nome = jNome.getText();
        String bairro = jBairro.getText();
        String endereco = jEndereco.getText();
        String cep = jCep.getText();
        String cidade = jCidade.getText();
        String uf = jUf.getText();
        String fone = jTelefone.getText();

        Cliente objCliente = new Cliente();

        objCliente.setId(id);
        objCliente.setNome(nome);
        objCliente.setBairro(bairro);
        objCliente.setEndereco(endereco);
        objCliente.setCep(cep);
        objCliente.setCidade(cidade);
        objCliente.setUf(uf);
        objCliente.setTelefone(fone);

        boolean ret = ClienteFuncoes.excluirCliente(objCliente);

        if (ret == true) {
            JOptionPane.showMessageDialog(null, "Cliente Excluido com Sucesso");

        }
        
        else if (ret == false){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir o Cliente");
        }

    }
    
    private void alterarCliente() {
        String id = jId.getText();
        String nome = jNome.getText();
        String bairro = jBairro.getText();
        String endereco = jEndereco.getText();
        String cep = jCep.getText();
        String cidade = jCidade.getText();
        String uf = jUf.getText();
        String fone = jTelefone.getText();

        Cliente objCliente = new Cliente();

        objCliente.setId(id);
        objCliente.setNome(nome);
        objCliente.setBairro(bairro);
        objCliente.setEndereco(endereco);
        objCliente.setCep(cep);
        objCliente.setCidade(cidade);
        objCliente.setUf(uf);
        objCliente.setTelefone(fone);

        boolean ret = ClienteFuncoes.alterarCliente(objCliente);

        if (ret == true) {
            JOptionPane.showMessageDialog(null, "Cliente Alterado com Sucesso");
        }
        
         else if (ret == false){
            JOptionPane.showMessageDialog(null, "Erro ao Alterar o Cliente");
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
    
    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jAlterarCliente_Botao;
    private javax.swing.JTextField jBairro;
    private javax.swing.JButton jButtonPesquisar_Cliente;
    private javax.swing.JTextField jCep;
    private javax.swing.JTextField jCidade;
    private javax.swing.JTextField jEndereco;
    private javax.swing.JToggleButton jExcluirCliente_Botao;
    private javax.swing.JToggleButton jFecharCliente_Botao;
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
    private javax.swing.JToggleButton jNomeCliente_Botao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTelefone;
    private javax.swing.JTextField jTextFieldPesquisa_Cliente;
    private javax.swing.JTextField jUf;
    // End of variables declaration//GEN-END:variables
}