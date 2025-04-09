package Conexao;
   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
    
public class ModuloConexao {

    // Método para obter a conexão com o banco de dados
    public static Connection connector() {
        Connection conexao = null;        
        try {
         String driver = "com.mysql.cj.jdbc.Driver";
         String url = "jdbc:mysql://127.0.0.1/db_cedidos?useTimezone=true&serverTimezone=UTC";
         String user = "root";
         String password = "pmbbetim";         
         conexao = DriverManager.getConnection (url,user,password);
         return conexao;          
        } 
        catch (SQLException erro) {    
            JOptionPane.showMessageDialog(null,"Erro ao conectar o banco de dados " +erro.getMessage());
            return null;            
        }
    
    }
   
}
