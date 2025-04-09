package DAO;

import Conexao.ModuloConexao;
import DTO.CessaoDTO;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


    public class CessaoDAO {
    
        Connection conexao = null;
        PreparedStatement pst = null;
       
    public void cadastrarUsuario(CessaoDTO cssdto) {
        
        String sql = "insert into tb_analise (matricula, nome, vinculo, situacaofun, cargoCarreira, secretaria, lotacao, tipoCessao, statusCessao, tipoSolicitacao, solicitacao, inicioCessao, terminoCessao, localTrabalho, solicitante, publicacaoCessao, dataPublicacao, observacao, cessionario) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";        
            
        conexao = ModuloConexao.connector();
    
    try {
        pst = conexao.prepareStatement(sql);
        pst.setString(1,cssdto.getMatricula()); 
        pst.setString(2,cssdto.getNome()); 
        pst.setString(3,cssdto.getVinculo()); 
        pst.setString(4,cssdto.getSituacaofun()); 
        pst.setString(5,cssdto.getCargoCarreira()); 
        pst.setString(6,cssdto.getSecretaria());
        pst.setString(7,cssdto.getLotacao()); 
        pst.setString(8,cssdto.getTipoCessao()); 
        pst.setString(9,cssdto.getStatusCessao()); 
        pst.setString(10,cssdto.getTipoSolicitacao()); 
        pst.setString(11,cssdto.getSolicitacao()); 
        pst.setString(12,cssdto.getInicioCessao()); 
        pst.setString(13,cssdto.getTerminoCessao()); 
        pst.setString(14,cssdto.getLocalTrabalho()); 
        pst.setString(15,cssdto.getSolicitante()); 
        pst.setString(16,cssdto.getPublicacaoCessao()); 
        pst.setString(17,cssdto.getDataPublicacao()); 
        pst.setString(18,cssdto.getobservacao()); 
        pst.setString(19,cssdto.getCessionario()); 

        int cadastrado = pst.executeUpdate();
            if (cadastrado > 0) {
                JOptionPane.showMessageDialog(null, "Cedido cadastrado com sucesso!");
            }
    } catch (HeadlessException | SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + erro.getMessage());
    }
}
        

    public void excluirUsuario(CessaoDTO cssdto){
        
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir este Cedido ??", "Atencao ", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
            String sql = "delete from tb_cedidos where matricula = ?";
            conexao = ModuloConexao.connector();
        
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,cssdto.getMatricula());
                

                
                int apagado = pst.executeUpdate();
                if (apagado > 0){
                    JOptionPane.showMessageDialog(null, "Cedido excluido com sucesso!!");
                }                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir cedido! DAO" +erro.getMessage());
            }
        
        }              
    }
  
   
    public void alterarUsuario(CessaoDTO cssdto){
      
        int atualizar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja  alterar este cedido??", "Atençao", JOptionPane.YES_NO_OPTION);
     
        if (atualizar == JOptionPane.YES_OPTION){
            String sql = "update  tb_cedidos set nome = ?, cargocarreira = ?, secretaria = ?, lotacao = ?, situacaofun = ?, vinculo = ?, tipocessao = ?, cessionario = ?, situacoes = ? where matricula = ?";
            conexao = ModuloConexao.connector();
         
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,cssdto.getNome().toUpperCase());
                pst.setString(3,cssdto.getCargoCarreira());
                pst.setString(4,cssdto.getSecretaria());
                pst.setString(5,cssdto.getLotacao());
                pst.setString(6,cssdto.getSituacaofun());
                pst.setString(7,cssdto.getVinculo());
                pst.setString(8,cssdto.getTipoCessao());
                pst.setString(9,cssdto.getCessionario());;
                pst.setString(11,cssdto.getMatricula());
            
                int atualizado = pst.executeUpdate();
                if (atualizado > 0){
                JOptionPane.showConfirmDialog(null, "Cedido Alterado com sucesso!!!");
                pst.close();}
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o Cedido! DAO  " +erro.getMessage());            }        
        }
    }

}
    
