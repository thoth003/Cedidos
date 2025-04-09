package DAO;

import Conexao.ModuloConexao;
import DTO.RelatorioDTO;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    public class RelatorioDAO {
    
        Connection conexao = null;
        PreparedStatement pst = null;
       
    public void cadastrarUsuario(RelatorioDTO reldto) {
        
        String sql = "insert into tb_basecedidos (matricula, nome, vinculo, situacaofun, cargoCarreira, secretaria, lotacao, tipoCessao, statusCessao, TipoSolicitacao, solicitacao, inicioCessao, terminoCessao, localTrabalho, solicitante, publicacaoCessao, dataPublicacao, observacao, cessionario) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        conexao = ModuloConexao.connector();
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,reldto.getMatricula()); 
            pst.setString(2,reldto.getNome()); 
            pst.setString(3,reldto.getVinculo()); 
            pst.setString(4,reldto.getSituacaofun()); 
            pst.setString(5,reldto.getCargoCarreira()); 
            pst.setString(6,reldto.getSecretaria());
            pst.setString(7,reldto.getLotacao()); 
            pst.setString(8,reldto.getTipoCessao()); 
            pst.setString(9,reldto.getStatusCessao()); 
            pst.setString(10,reldto.getTipoSolicitacao()); 
            pst.setString(11,reldto.getSolicitacao()); 
            pst.setString(12,reldto.getInicioCessao()); 
            pst.setString(13,reldto.getTerminoCessao()); 
            pst.setString(14,reldto.getLocalTrabalho()); 
            pst.setString(15,reldto.getSolicitante()); 
            pst.setString(16,reldto.getPublicacaoCessao()); 
            pst.setString(17,reldto.getDataPublicacao()); 
            pst.setString(18,reldto.getobservacao()); 
            pst.setString(19,reldto.getCessionario()); 

        

            int cadastrado = pst.executeUpdate();
            if (cadastrado > 0) {
            JOptionPane.showMessageDialog(null, "CONCLUIDO O PROCESSO cadastrado com sucesso!");
            }
        } catch (HeadlessException | SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + erro.getMessage());
         }
       }  
    
  public void excluirUsuario(RelatorioDTO cssdto){
        
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir este Cedido ??", "Atencao ", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
            String sql = "delete from tb_analise where matricula = ?";
            conexao = ModuloConexao.connector();
        
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,cssdto.getMatricula());
                               
                int apagado = pst.executeUpdate();
                if (apagado > 0){
                    JOptionPane.showMessageDialog(null, "Cedido excluido com sucesso!!");
                }                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir cedido! RelatorioDAO" +erro.getMessage());
            }
        
        }              
    }
    
    
    
    }