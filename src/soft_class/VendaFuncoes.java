package soft_class;

import soft_bd.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 */
public class VendaFuncoes {
    
    private ConexaoMySql conexao = new ConexaoMySql();
    private Connection con;
    
    public int inserirVenda(Venda venda)
    {
        PreparedStatement stmt;
        Connection conn;
        String sql = "insert into venda "
                + "(cliente, produto, quantidade, desconto, valor, data, total)"
                + " values (?,?,?,?,?,?,?); ";
        
        int idVenda = 0;
        
        try{
            conn = conexao.getConexao();
            stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, venda.getCliente());
            stmt.setString(2, venda.getProduto());
            stmt.setDouble(3, venda.getQuantidade());
            stmt.setDouble(4, venda.getDesconto());
            stmt.setDouble(5, venda.getValor());
            stmt.setDate(6, venda.getData());
            stmt.setDouble(7, venda.getTotal());
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            while (rs.next()) {
                idVenda = rs.getInt(1);
            }

            stmt.close();   
        }
        
        catch(SQLException ex){
            System.err.println("Ocorreu um erro em Inserir Venda: \n"+ex);
        }
        
        finally {
            conexao.fecharConexao();
        }
        
        return idVenda;
        
    }

}