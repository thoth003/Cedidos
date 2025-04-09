package Views;

import Conexao.ModeloTabela;
import Conexao.ModuloConexao;
import DAO.UsuariosDAO;
import DTO.UsuarioDTO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class TelaDeUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    
    public TelaDeUsuario() throws SQLException {
        initComponents();
        
        conexao = ModuloConexao.connector();
        try {
            PreencherTabela("select * from   tbusuarios order by usuario");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao chamar tabela" + erro.getMessage());
        }
                
        desabilitartxt();           
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodusu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        bttNovo = new javax.swing.JButton();
        bttSalvar = new javax.swing.JButton();
        bttEditar = new javax.swing.JButton();
        bttDeletar = new javax.swing.JButton();
        bttLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCam = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela de Usuario");
        setPreferredSize(new java.awt.Dimension(990, 790));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Codigo do Usuario:");

        txtCodusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodusuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Usuario:");

        txtUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Fone:");

        txtFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoneActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Login:");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Senha:");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Perfil:");

        cmbPerfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Admin", "Usuario" }));
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        bttNovo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bttNovo.setText("Novo");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });

        bttSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bttSalvar.setText("Cadastrar");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });

        bttEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bttEditar.setText("Editar");
        bttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEditarActionPerformed(evt);
            }
        });

        bttDeletar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bttDeletar.setText("Deletar");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });

        bttLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bttLimpar.setText("Limpar");
        bttLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimparActionPerformed(evt);
            }
        });

        tblCam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblCam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCam);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSenha)
                            .addComponent(txtFone)
                            .addComponent(txtUsu)
                            .addComponent(txtLogin)
                            .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodusu, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodusu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttNovo)
                    .addComponent(bttSalvar)
                    .addComponent(bttEditar)
                    .addComponent(bttDeletar)
                    .addComponent(bttLimpar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 990, 789);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuActionPerformed

    private void txtCodusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodusuActionPerformed

    private void txtFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoneActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
        Deletar();
    }//GEN-LAST:event_bttDeletarActionPerformed

    private void bttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimparActionPerformed
        Limpar();       
    }//GEN-LAST:event_bttLimparActionPerformed

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
        Novo();
    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        Salvar();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEditarActionPerformed
        Editar();
    }//GEN-LAST:event_bttEditarActionPerformed

    private void tblCamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCamMouseClicked
        SetarCampos();
    }//GEN-LAST:event_tblCamMouseClicked

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttEditar;
    private javax.swing.JButton bttLimpar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCam;
    private javax.swing.JTextField txtCodusu;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables

    public void desabilitartxt(){
        
        txtCodusu.setEnabled(false);
        txtCodusu.setBackground(new Color(190,190,190));
        txtUsu.setEnabled(false);
        txtUsu.setBackground(new Color(190,190,190));
        txtFone.setEnabled(false);
        txtFone.setBackground(new Color(190,190,190));
        txtLogin.setEnabled(false);
        txtLogin.setBackground(new Color(190,190,190));
        txtSenha.setEnabled(false);
        txtSenha.setBackground(new Color(190,190,190));
        cmbPerfil.setEnabled(false);
        cmbPerfil.setBackground(new Color(190,190,190));   
  
        bttSalvar.setVisible(false);
        bttEditar.setVisible(false);
        bttDeletar.setVisible(false);
        bttLimpar.setVisible(false);     
    }

    public void habilitar (){
        
        txtCodusu.setEnabled(true);
        txtCodusu.setBackground(new Color(255,255,255));
        txtUsu.setEnabled(true);
        txtUsu.setBackground(new Color(255,255,255));
        txtFone.setEnabled(true);
        txtFone.setBackground(new Color(255,255,255));
        txtLogin.setEnabled(true);
        txtLogin.setBackground(new Color(255,255,255));
        txtSenha.setEnabled(true);
        txtSenha.setBackground(new Color(255,255,255));
    
        cmbPerfil.setEnabled(true);   
        cmbPerfil.setBackground(new Color(255,255,255));    
    
        bttDeletar.setVisible(true);
        bttLimpar.setVisible(true);
        bttEditar.setVisible(true);
        bttSalvar.setVisible(true);   
    }

    public void Limpar (){

        txtCodusu.setText("");
        txtUsu.setText("");
        txtFone.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
    
        cmbPerfil.setSelectedIndex(0);
    }

    public void Novo(){
    
        habilitar();
    
        bttSalvar.setVisible(true);
    }

    public void Salvar(){
    
        String usu, fone,login,senha,perfil;
     
        usu = txtUsu.getText();
        fone = txtFone.getText();
        login = txtLogin.getText();
        senha = txtSenha.getText();
        perfil = cmbPerfil.getSelectedItem() != null ? cmbPerfil.getSelectedItem().toString() : "";

        if (usu.isEmpty() || fone.isEmpty() || login.isEmpty() || senha.isEmpty() || perfil.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
            
            return; 
        } if (!perfil.equalsIgnoreCase("admin") && !perfil.equalsIgnoreCase("usuario")) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione 'admin' ou 'usuario' para o perfil!");
        return; 
        }


     
        UsuarioDTO usudto = new UsuarioDTO();
     
        usudto.setUsuario(usu);
        usudto.setFone(fone);
        usudto.setLogin(login);
        usudto.setSenha(senha);
        usudto.setPerfil(perfil);
     
        UsuariosDAO usudao = new UsuariosDAO();
     
        usudao.cadastrarUsario(usudto);
     
        try {
            Limpar();
            PreencherTabela("Select * from tbusuarios order by usuario");        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar " +erro.getMessage());
        }     
    }
    
     
   public void Editar (){
      
        int iduser;     
        String usu, fone,login,senha,perfil;
     
        iduser = Integer.parseInt (txtCodusu.getText());
        usu = txtUsu.getText();
        fone = txtFone.getText();
        login = txtLogin.getText();
        senha = txtSenha.getText();
        perfil = cmbPerfil.getSelectedItem().toString();                                  
         
        UsuarioDTO usudto = new UsuarioDTO();
        
        usudto.setIdusser(iduser);
        usudto.setUsuario(usu);
        usudto.setFone(fone);
        usudto.setLogin(login);
        usudto.setSenha(senha);
        usudto.setPerfil(perfil);
        
                
        UsuariosDAO usudao = new UsuariosDAO();
        usudao.alterarUsuario(usudto);
                
        try {
            PreencherTabela("select * from tbusuarios order by usuario");
            Limpar();            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Editar " +erro.getMessage());
        }
    }
         
         
    public void Deletar(){
        
        int iduser;
            
        iduser = Integer.parseInt(txtCodusu.getText());
            
        UsuarioDTO usudto = new UsuarioDTO();
        usudto.setIdusser(iduser);
            
        UsuariosDAO usudao = new UsuariosDAO();
        usudao.excluirUsuario(usudto);
            
        try {
            PreencherTabela("select * from tbusuarios order by usuario");
            Limpar();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro Deletar " +erro.getMessage());
        }              
    }
        
    
    public void PreencherTabela(String SQL) throws SQLException {
            
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"iduser","usuario","fone","login","senha","perfil"};
                       
        pst =  conexao.prepareStatement(SQL);
        rs = pst.executeQuery();
            
        try {
            if(rs.next())
                do{
                    dados.add(new Object[]{rs.getInt("iduser"),rs.getString("usuario"),rs.getString("fone"),rs.getString("login"),rs.getString("senha"),rs.getString("perfil")});
                }while(rs.next());                
        } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro ao Preencher Tabela " +erro.getMessage());
            }
            
            ModeloTabela modelo = new ModeloTabela(dados,Colunas);
            tblCam.setModel (modelo);
            tblCam.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCam.getColumnModel().getColumn(0).setResizable(false);
            tblCam.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblCam.getColumnModel().getColumn(1).setResizable(false);
            tblCam.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblCam.getColumnModel().getColumn(2).setResizable(false);
            tblCam.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblCam.getColumnModel().getColumn(3).setResizable(false);
            tblCam.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblCam.getColumnModel().getColumn(4).setResizable(false);
            tblCam.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblCam.getColumnModel().getColumn(5).setResizable(false);      
    }

    
    public void SetarCampos(){
           
        int setar = tblCam.getSelectedRow();
           
        txtCodusu.setText(tblCam.getModel().getValueAt(setar,0).toString());
        txtUsu.setText(tblCam.getModel().getValueAt(setar,1).toString());
        txtFone.setText(tblCam.getModel().getValueAt(setar,2).toString());
        txtLogin.setText(tblCam.getModel().getValueAt(setar,3).toString());
        txtSenha.setText(tblCam.getModel().getValueAt(setar,4).toString());
        cmbPerfil.setSelectedItem(tblCam.getModel().getValueAt(setar,5));     
           
        String perfilTabela = tblCam.getModel().getValueAt(setar, 5).toString().trim();
        boolean encontrado = false;

        for (int i = 0; i < cmbPerfil.getItemCount(); i++) {
            String item = cmbPerfil.getItemAt(i).toString().trim();
                
            if (perfilTabela.equalsIgnoreCase(item)) {
                cmbPerfil.setSelectedItem(item);
                encontrado = true;
            break;
            }
        }if (!encontrado) {
                cmbPerfil.setSelectedIndex(0);
        }
            habilitar();
    }
}
     
     
     
     

             
            
            
  












