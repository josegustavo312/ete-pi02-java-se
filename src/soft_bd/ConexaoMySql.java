package soft_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Energy
 */


public class ConexaoMySql {

    public static Connection con = null;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String str_connection = "jdbc:mysql://localhost/softf5_desktop";
    private static String user = "root";
    private static String senha = "312";

    public static Connection getConexao() {
        try {
            Class.forName(driver);
            try {
                con = DriverManager.getConnection(str_connection, user, senha);
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Falha na Conexão! ");
            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no Driver SQL ! ");
        }

        return con;
    }
    
    public static void fecharConexao(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
