package soft_views;

import soft_bd.ConexaoMySql;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import soft_class.Venda;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 */
public class RelatorioFuncoes {
    
    public void relatorio_CupomFiscal (int idvenda) {

        Connection con = ConexaoMySql.getConexao();
        
        URL arquivo = getClass().getResource("soft_relatorio/cupomFiscal.jasper");

        HashMap map = new HashMap();

        map.put("idvenda", idvenda);

        JasperReport jr;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle("Cupom Fiscal");
            
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    
    public void relatorio_ProdutoTodos (int idproduto) {

        Connection con = ConexaoMySql.getConexao();
        
        URL arquivo = getClass().getResource("soft_relatorio/produtoTodos.jasper");

        HashMap map = new HashMap();

        map.put("idproduto", idproduto);

        JasperReport jr;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle("Relatório Produtos");
            
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    
    public void relatorio_FornecedorTodos (int id) {
        
        //System.out.print(id);

        Connection con = ConexaoMySql.getConexao();
        
        URL arquivo = getClass().getResource("soft_relatorio/fornecedoresTodos.jasper");

        HashMap map = new HashMap();

        map.put("id", id);

        JasperReport jr;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle("Relatório Fornecedor");
            
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    
    public void relatorio_ClienteTodos (int id) {
        
        Connection con = ConexaoMySql.getConexao();
        
        URL arquivo = getClass().getResource("soft_relatorio/clienteTodos.jasper");

        HashMap map = new HashMap();

        map.put("id", id);

        JasperReport jr;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle("Relatório Cliente");
            
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
     
    public void relatorio_ClienteNome (String nome) {
        
        Connection con = ConexaoMySql.getConexao();
        
        URL arquivo = getClass().getResource("soft_relatorio/clienteNome.jasper");

        HashMap map = new HashMap();

        map.put("nome", nome);

        JasperReport jr;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle("Relatorio");
            
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    
}
