package soft_bd;

/**
 *
 * @author GUSTAVO
 */
public class TestarConexao {
    
    public static void main (String [] args){
        
        ConexaoMySql conexao = new ConexaoMySql();    
        ConexaoMySql.getConexao();
        
    }
    
}
