package soft_class;

import soft_bd.ConexaoMySql;
import soft_views.ConsultarProdutos;
import soft_class.Produtos;
import soft_views.CadastrarCliente;
import soft_views.CadastrarProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 */
public class ProdutosFuncoes {

    public static boolean inserirProdutos(Produtos objProdutos) {
        
        Connection con = ConexaoMySql.getConexao();
        String sql = "insert into produto "
                    + "(nome, valor, fornecedor, estoque)"
                    + " values (?,?,?,?) ";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objProdutos.getNome());
            stmt.setString(2, objProdutos.getValor());
            stmt.setString(3, objProdutos.getFornecedor());
            stmt.setString(4, objProdutos.getEstoque());

            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(ProdutosFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ProdutosFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static List<Produtos> retornaProdutos(String nome) {
        Connection con = ConexaoMySql.getConexao();
        List<Produtos> listaObjProdutos = new ArrayList<Produtos>();
        Produtos objProdutos = null;

        String sql = "SELECT * FROM produto where nome like '%" + nome + "%';";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String $idproduto = rs.getString("idproduto");
                String $nome = rs.getString("nome");
                String $valor = rs.getString("valor");
                String $fornecedor = rs.getString("fornecedor");
                String $estoque = rs.getString("estoque");
                
                objProdutos = new Produtos();
                objProdutos.setCodigo($idproduto);
                objProdutos.setNome($nome);
                objProdutos.setValor($valor);
                objProdutos.setFornecedor($fornecedor);
                objProdutos.setEstoque($estoque);
                
                listaObjProdutos.add(objProdutos);

            }
            return listaObjProdutos;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarProdutos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static List<Produtos> retornaProdutos_todos() {
        Connection con = ConexaoMySql.getConexao();
        List<Produtos> listaObjProdutos = new ArrayList<Produtos>();
        Produtos objProdutos = null;

        String sql = "SELECT * FROM produto order by nome ;";
        try {
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String $idproduto = rs.getString("idproduto");
                String $nome = rs.getString("nome");
                String $valor = rs.getString("valor");
                String $fornecedor = rs.getString("fornecedor");
                String $estoque = rs.getString("estoque");

                objProdutos = new Produtos();
                objProdutos.setCodigo($idproduto);
                objProdutos.setNome($nome);
                objProdutos.setValor($valor);
                objProdutos.setFornecedor($fornecedor);
                objProdutos.setEstoque($estoque);

                listaObjProdutos.add(objProdutos);

            }
            return listaObjProdutos;

        } catch (SQLException ex) {
            Logger.getLogger(CadastrarProdutos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Produtos retProdutos(String idproduto) {
        Connection con = ConexaoMySql.getConexao();
        
        Produtos objProdutos = null;

        String sql = "SELECT * FROM produto where idproduto = '" + idproduto + "';";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String $idproduto = rs.getString("idproduto");
                String $nome = rs.getString("nome");
                String $valor = rs.getString("valor");
                String $fornecedor = rs.getString("fornecedor");
                String $estoque = rs.getString("estoque");

                objProdutos = new Produtos();
                objProdutos.setCodigo($idproduto);
                objProdutos.setNome($nome);
                objProdutos.setValor($valor);
                objProdutos.setFornecedor($fornecedor);
                objProdutos.setEstoque($estoque);
                
            }
            return objProdutos;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarProdutos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static boolean alterarProdutos(Produtos objProdutos) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE produto SET nome = (?), valor = (?), fornecedor = (?), estoque = (?) WHERE idproduto = (?);";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objProdutos.getNome());
            stmt.setString(2, objProdutos.getValor());
            stmt.setString(3, objProdutos.getFornecedor());
            stmt.setString(4, objProdutos.getEstoque());
            stmt.setString(5, objProdutos.getCodigo());
            
            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(ProdutosFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ProdutosFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
        public static boolean excluirProdutos(Produtos objProdutos) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM produto where idproduto = (?);";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objProdutos.getCodigo());
            
            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(ProdutosFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ProdutosFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
}
