package soft_class;

import soft_bd.ConexaoMySql;
import soft_views.ConsultarFornecedor;
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
public class FornecedorFuncoes {

    public static boolean inserirFornecedor(Fornecedor objFornecedor) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "insert into fornecedores "
                    + "(nome, endereco, bairro, cidade, uf, cep, telefone)"
                    + " values (?,?,?,?,?,?,?) ";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objFornecedor.getNome());
            stmt.setString(2, objFornecedor.getEndereco());
            stmt.setString(3, objFornecedor.getBairro());
            stmt.setString(4, objFornecedor.getCidade());
            stmt.setString(5, objFornecedor.getUf());
            stmt.setString(6, objFornecedor.getCep());
            stmt.setString(7, objFornecedor.getTelefone());

            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(FornecedorFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(FornecedorFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static List<Fornecedor> retornaFornecedor(String nome) {
        Connection con = ConexaoMySql.getConexao();
        List<Fornecedor> listaObjFornecedor = new ArrayList<Fornecedor>();
        Fornecedor objFornecedor = null;

        String sql = "SELECT * FROM fornecedores where nome like '%" + nome + "%';";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String $id = rs.getString("id");
                String $nome = rs.getString("nome");
                String $endereco = rs.getString("endereco");
                String $bairro = rs.getString("bairro");
                String $cidade = rs.getString("cidade");
                String $uf = rs.getString("uf");
                String $cep = rs.getString("cep");
                String $telefone = rs.getString("telefone");

                objFornecedor = new Fornecedor();
                objFornecedor.setId($id);
                objFornecedor.setNome($nome);
                objFornecedor.setEndereco($endereco);
                objFornecedor.setBairro($bairro);
                objFornecedor.setCidade($cidade);
                objFornecedor.setUf($uf);
                objFornecedor.setCep($cep);
                objFornecedor.setTelefone($telefone);

                listaObjFornecedor.add(objFornecedor);

            }
            return listaObjFornecedor;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Fornecedor retFornecedor(String id) {
        Connection con = ConexaoMySql.getConexao();
        
        Fornecedor objFornecedor = null;

        String sql = "SELECT * FROM fornecedores where id = '" + id + "';";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String $id = rs.getString("id");
                String $nome = rs.getString("nome");
                String $endereco = rs.getString("endereco");
                String $bairro = rs.getString("bairro");
                String $cidade = rs.getString("cidade");
                String $uf = rs.getString("uf");
                String $cep = rs.getString("cep");
                String $telefone = rs.getString("telefone");

                objFornecedor = new Fornecedor();
                objFornecedor.setId($id);
                objFornecedor.setNome($nome);
                objFornecedor.setEndereco($endereco);
                objFornecedor.setBairro($bairro);
                objFornecedor.setCidade($cidade);
                objFornecedor.setUf($uf);
                objFornecedor.setCep($cep);
                objFornecedor.setTelefone($telefone);
            }
            return objFornecedor;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static boolean alterarFornecedor(Fornecedor objFornecedor) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE fornecedores SET nome = (?), endereco = (?), bairro = (?), cidade = (?), uf = (?), cep = (?), telefone = (?) WHERE id = (?);";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objFornecedor.getNome());
            stmt.setString(2, objFornecedor.getBairro());
            stmt.setString(3, objFornecedor.getEndereco());
            stmt.setString(4, objFornecedor.getCidade());
            stmt.setString(5, objFornecedor.getUf());
            stmt.setString(6, objFornecedor.getCep());
            stmt.setString(7, objFornecedor.getTelefone());
            stmt.setString(8, objFornecedor.getId());
            
            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(FornecedorFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(FornecedorFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    public static boolean excluirFornecedor(Fornecedor objFornecedor) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM fornecedores where id = (?);";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objFornecedor.getId());
            
            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(FornecedorFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(FornecedorFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
}
