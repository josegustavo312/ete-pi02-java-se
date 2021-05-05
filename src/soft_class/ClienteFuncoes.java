package soft_class;

import soft_bd.ConexaoMySql;
import soft_views.CadastrarCliente;
import soft_views.ConsultarCliente;
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
public class ClienteFuncoes {

    public static boolean inserirCliente(Cliente objCliente) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "insert into cliente "
                    + "(nome, endereco, bairro, cidade, uf, cep, telefone)"
                    + " values (?,?,?,?,?,?,?) ";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objCliente.getNome());
            stmt.setString(2, objCliente.getEndereco());
            stmt.setString(3, objCliente.getBairro());
            stmt.setString(4, objCliente.getCidade());
            stmt.setString(5, objCliente.getUf());
            stmt.setString(6, objCliente.getCep());
            stmt.setString(7, objCliente.getTelefone());

            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(ClienteFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ClienteFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static List<Cliente> retornaCliente(String nome) {
        Connection con = ConexaoMySql.getConexao();
        List<Cliente> listaObjCliente = new ArrayList<Cliente>();
        Cliente objCliente = null;

        String sql = "SELECT * FROM cliente where nome like '%" + nome + "%';";
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

                objCliente = new Cliente();
                objCliente.setId($id);
                objCliente.setNome($nome);
                objCliente.setEndereco($endereco);
                objCliente.setBairro($bairro);
                objCliente.setCidade($cidade);
                objCliente.setUf($uf);
                objCliente.setCep($cep);
                objCliente.setTelefone($telefone);

                listaObjCliente.add(objCliente);

            }
            return listaObjCliente;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static List<Cliente> retornaClientes_todos() {
        Connection con = ConexaoMySql.getConexao();
        List<Cliente> listaObjCliente = new ArrayList<Cliente>();
        Cliente objCliente = null;

        String sql = "SELECT * FROM cliente order by nome ;";
        try {
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String $codigo = rs.getString("id");
                String $nome = rs.getString("nome");
                String $datanasc = rs.getString("bairro");
                String $endereco = rs.getString("endereco");
                String $cidade = rs.getString("cidade");
                String $uf = rs.getString("uf");
                String $cep = rs.getString("cep");
                String $telefone = rs.getString("telefone");

                objCliente = new Cliente();
                objCliente.setCodigo($codigo);
                objCliente.setNome($nome);
                objCliente.setBairro($datanasc);
                objCliente.setEndereco($endereco);
                objCliente.setCidade($cidade);
                objCliente.setUf($uf);
                objCliente.setCep($cep);
                objCliente.setTelefone($telefone);



                listaObjCliente.add(objCliente);

            }
            return listaObjCliente;

        } catch (SQLException ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Cliente retCliente(String id) {
        Connection con = ConexaoMySql.getConexao();
        
        Cliente objCliente = null;

        String sql = "SELECT * FROM cliente where id = '" + id + "';";
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

                objCliente = new Cliente();
                objCliente.setId($id);
                objCliente.setNome($nome);
                objCliente.setEndereco($endereco);
                objCliente.setBairro($bairro);
                objCliente.setCidade($cidade);
                objCliente.setUf($uf);
                objCliente.setCep($cep);
                objCliente.setTelefone($telefone);
            }
            return objCliente;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
       public static boolean alterarCliente(Cliente objCliente) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE cliente SET nome = (?), endereco = (?), bairro = (?), cidade = (?), uf = (?), cep = (?), telefone = (?) WHERE id = (?);";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objCliente.getNome());
            stmt.setString(2, objCliente.getBairro());
            stmt.setString(3, objCliente.getEndereco());
            stmt.setString(4, objCliente.getCidade());
            stmt.setString(5, objCliente.getUf());
            stmt.setString(6, objCliente.getCep());
            stmt.setString(7, objCliente.getTelefone());
            stmt.setString(8, objCliente.getId());
            
            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(ClienteFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ClienteFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
       
   public static boolean excluirCliente(Cliente objCliente) {

        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM cliente where id = (?);";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, objCliente.getId());
            
            stmt.executeUpdate();

            con.commit();
            ConexaoMySql.fecharConexao();
            return true;
            
        } catch (SQLException ex) {
            try {
                con.rollback();
                return false;
            } catch (SQLException ex1) {
                Logger.getLogger(ClienteFuncoes.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ClienteFuncoes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }  
    
}
