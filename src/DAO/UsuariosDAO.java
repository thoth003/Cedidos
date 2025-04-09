package DAO;

import Conexao.ModuloConexao;
import DTO.UsuarioDTO;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    public class UsuariosDAO {
        
        Connection conexao = null;
        PreparedStatement pst = null;
      
    public void cadastrarUsario(UsuarioDTO usudto){
            
        String sql = "insert into tbusuarios (usuario,fone,login,senha,perfil) values (?,?,?,?,?)";
            
        conexao = ModuloConexao.connector();
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,usudto.getUsuario().toUpperCase());
            pst.setString(2,usudto.getFone());
            pst.setString(3,usudto.getLogin());
            pst.setString(4,usudto.getSenha());
            pst.setString(5,usudto.getPerfil().toUpperCase());
            
            int cadastrado =  pst.executeUpdate();
            if(cadastrado > 0){
                JOptionPane.showMessageDialog(null,"Uusario Cadastrado com Sucesso!!");
            }
        }catch (HeadlessException | SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Concectar Banco de Dados!!" +erro.getMessage());
        }        
    }
        

  public void excluirUsuario(UsuarioDTO usudto){
        
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir este Usuario ??", "Atencao ", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
            String sql = "delete from tbusuarios where iduser = ?";
        conexao = ModuloConexao.connector();
        
            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1,usudto.getIdusser());
                
                int apagado = pst.executeUpdate();
                if (apagado > 0){
                    JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!!");
                }                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir Usuario! DAO" +erro.getMessage());
         }
        
     }              
}
  
   
  public void alterarUsuario(UsuarioDTO usudto){
      
    int atualizar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja  alterar este usuario??", "Atençao", JOptionPane.YES_NO_OPTION);
     
        if (atualizar == JOptionPane.YES_OPTION){
            String sql = "update  tbusuarios set usuario = ?, fone = ?, login = ?, senha = ?, perfil = ? where iduser = ?";
            conexao = ModuloConexao.connector();
         
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,usudto.getUsuario().toUpperCase());
                pst.setString(2,usudto.getFone());
                pst.setString(3,usudto.getLogin());
                pst.setString(4,usudto.getSenha());
                pst.setString(5,usudto.getPerfil().toUpperCase());
                pst.setInt(6,usudto.getIdusser());
            
            int atualizado = pst.executeUpdate();
            if (atualizado > 0){
                JOptionPane.showConfirmDialog(null, "Usuario Alterado com sucesso!!!");
                pst.close();}
            
            } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o Usuario! DAO  " +erro.getMessage());            }        
        }
    }

}