
package Views;


import Conexao.ModuloConexao;
import DAO.RelatorioDAO;
import DTO.RelatorioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


public class TelaRelatorio extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public TelaRelatorio() {
        
        initComponents();
        
        conexao = ModuloConexao.connector();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cessaoDAO1 = new DAO.CessaoDAO();
        jPanel1 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        bttPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnalise = new javax.swing.JTable();
        bttSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtObs = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSolicitante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLocalTrabalho = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbCessionario = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCargoCarreira = new javax.swing.JTextField();
        txtSecretaria = new javax.swing.JTextField();
        txtLotacao = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cmbStatusCessao = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cmbTipoSolicitacao = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPublicaoCessao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDataPublicacao = new javax.swing.JTextField();
        txtTerminoCessao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtInicioCessao = new javax.swing.JTextField();
        txtSolicitacao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTipoCessao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtVinculo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSitFun = new javax.swing.JTextField();
        bttDELETAR = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tela Relatorio");
        setMaximumSize(new java.awt.Dimension(1200, 850));
        setMinimumSize(new java.awt.Dimension(1200, 850));
        setPreferredSize(new java.awt.Dimension(1200, 850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        bttPesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bttPesquisar.setText("Pesquisar");
        bttPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPesquisarActionPerformed(evt);
            }
        });

        tblAnalise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAnalise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnaliseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnalise);

        bttSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bttSalvar.setText("Salvar");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Matricula:");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        txtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsActionPerformed(evt);
            }
        });

        jLabel15.setText("Observacao:");

        jLabel11.setText("Solicitante:");

        txtSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolicitanteActionPerformed(evt);
            }
        });

        jLabel12.setText("Local de trabalho Cessionario");

        txtLocalTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalTrabalhoActionPerformed(evt);
            }
        });

        jLabel20.setText("Cessionario:");

        cmbCessionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cmbCessionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCessionarioMouseClicked(evt);
            }
        });
        cmbCessionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCessionarioActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo cessao:");

        jLabel10.setText("Lotaçao:");

        jLabel8.setText("Secretaria");

        jLabel5.setText("Cargo Carreira:");

        txtCargoCarreira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoCarreiraActionPerformed(evt);
            }
        });

        txtSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecretariaActionPerformed(evt);
            }
        });

        txtLotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotacaoActionPerformed(evt);
            }
        });

        jLabel17.setText("Status da Cessao:");

        cmbStatusCessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "EM ANALISE", "DEFERIDO", "INDEFERIDO" }));

        jLabel18.setText("Tipo de Solicitacao:");

        cmbTipoSolicitacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "COM CONVENIO", "SEM CONVENIO" }));

        jLabel6.setText("Inicio Cessao:");

        jLabel13.setText("Publicaçao da Cessao");

        txtPublicaoCessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublicaoCessaoActionPerformed(evt);
            }
        });

        jLabel14.setText("Data Publicaçao");

        txtDataPublicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPublicacaoActionPerformed(evt);
            }
        });

        txtTerminoCessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerminoCessaoActionPerformed(evt);
            }
        });

        jLabel7.setText("Termino Cessao");

        txtInicioCessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioCessaoActionPerformed(evt);
            }
        });

        txtSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolicitacaoActionPerformed(evt);
            }
        });

        jLabel19.setText("Solicitaçao");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        cmbTipoCessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "COM ONUS", "SEM ONUS", "PERMUTA" }));

        jLabel3.setText("Vinculo:");

        txtVinculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVinculoActionPerformed(evt);
            }
        });

        jLabel4.setText("Situaçao Funcioal:");

        txtSitFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSitFunActionPerformed(evt);
            }
        });

        bttDELETAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bttDELETAR.setText("Deletar");
        bttDELETAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDELETARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(bttSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bttDELETAR, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCargoCarreira))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbTipoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbStatusCessao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbTipoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(808, 808, 808)
                                    .addComponent(jLabel4)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtSitFun))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtObs))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPublicaoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDataPublicacao))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLocalTrabalho))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbCessionario, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtInicioCessao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTerminoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLotacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 609, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 112, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSitFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCargoCarreira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbTipoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cmbStatusCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cmbTipoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cmbCessionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtInicioCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTerminoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtPublicaoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtDataPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttSalvar)
                    .addComponent(bttDELETAR))
                .addGap(23, 23, 23))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
    PesquisarFuncionarioAnalise();
    
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void bttPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPesquisarActionPerformed
    PesquisarFuncionarioAnalise();
    
    }//GEN-LAST:event_bttPesquisarActionPerformed

    private void tblAnaliseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnaliseMouseClicked
                                     
    int selectedRow = tblAnalise.getSelectedRow();

        txtMatricula.setText(tblAnalise.getModel().getValueAt(selectedRow, 0).toString());
        txtNome.setText(tblAnalise.getModel().getValueAt(selectedRow, 1).toString());
        txtVinculo.setText(tblAnalise.getModel().getValueAt(selectedRow, 2).toString()); 
        txtSitFun.setText(tblAnalise.getModel().getValueAt(selectedRow, 3).toString()); 
        txtCargoCarreira.setText(tblAnalise.getModel().getValueAt(selectedRow, 4).toString());
        txtSecretaria.setText(tblAnalise.getModel().getValueAt(selectedRow, 5).toString()); 
        txtLotacao.setText(tblAnalise.getModel().getValueAt(selectedRow, 6).toString()); 
        cmbTipoCessao.setSelectedItem(tblAnalise.getModel().getValueAt(selectedRow, 7).toString());
        cmbStatusCessao.setSelectedItem(tblAnalise.getModel().getValueAt(selectedRow, 8).toString());
        cmbTipoSolicitacao.setSelectedItem(tblAnalise.getModel().getValueAt(selectedRow, 9).toString());
        txtSolicitacao.setText(tblAnalise.getModel().getValueAt(selectedRow, 10).toString());
        txtInicioCessao.setText(tblAnalise.getModel().getValueAt(selectedRow, 11).toString());
        txtTerminoCessao.setText(tblAnalise.getModel().getValueAt(selectedRow, 12).toString());
        txtLocalTrabalho.setText(tblAnalise.getModel().getValueAt(selectedRow, 13).toString());
        txtSolicitante.setText(tblAnalise.getModel().getValueAt(selectedRow, 14).toString());
        txtPublicaoCessao.setText(tblAnalise.getModel().getValueAt(selectedRow, 15).toString());
        txtDataPublicacao.setText(tblAnalise.getModel().getValueAt(selectedRow, 16).toString());
        txtObs.setText(tblAnalise.getModel().getValueAt(selectedRow, 17).toString());
        cmbCessionario.setSelectedItem(tblAnalise.getModel().getValueAt(selectedRow, 18).toString());
 
    }//GEN-LAST:event_tblAnaliseMouseClicked

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        Cadastrar();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObsActionPerformed

    private void txtSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolicitanteActionPerformed

    private void txtLocalTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalTrabalhoActionPerformed

    private void cmbCessionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCessionarioMouseClicked
        preencherComboBox();
    }//GEN-LAST:event_cmbCessionarioMouseClicked

    private void cmbCessionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCessionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCessionarioActionPerformed

    private void txtCargoCarreiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoCarreiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoCarreiraActionPerformed

    private void txtSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecretariaActionPerformed

    private void txtLotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLotacaoActionPerformed

    private void txtPublicaoCessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublicaoCessaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPublicaoCessaoActionPerformed

    private void txtDataPublicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPublicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPublicacaoActionPerformed

    private void txtTerminoCessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerminoCessaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerminoCessaoActionPerformed

    private void txtInicioCessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioCessaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioCessaoActionPerformed

    private void txtSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolicitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolicitacaoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtVinculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVinculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVinculoActionPerformed

    private void txtSitFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSitFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSitFunActionPerformed

    private void bttDELETARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDELETARActionPerformed
        // TODO add your handling code here:
        Deletar();
        //FAZER AQ
    }//GEN-LAST:event_bttDELETARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDELETAR;
    private javax.swing.JButton bttPesquisar;
    private javax.swing.JButton bttSalvar;
    private DAO.CessaoDAO cessaoDAO1;
    private javax.swing.JComboBox<String> cmbCessionario;
    private javax.swing.JComboBox<String> cmbStatusCessao;
    private javax.swing.JComboBox<String> cmbTipoCessao;
    private javax.swing.JComboBox<String> cmbTipoSolicitacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnalise;
    private javax.swing.JTextField txtCargoCarreira;
    private javax.swing.JTextField txtDataPublicacao;
    private javax.swing.JTextField txtInicioCessao;
    private javax.swing.JTextField txtLocalTrabalho;
    private javax.swing.JTextField txtLotacao;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPublicaoCessao;
    private javax.swing.JTextField txtSecretaria;
    private javax.swing.JTextField txtSitFun;
    private javax.swing.JTextField txtSolicitacao;
    private javax.swing.JTextField txtSolicitante;
    private javax.swing.JTextField txtTerminoCessao;
    private javax.swing.JTextField txtVinculo;
    // End of variables declaration//GEN-END:variables

    
    
    public void Cadastrar(){
        
        String matricula, nome, vinculo, sitFun, Secretaria, cargoCarreira, lotacao,solicitacao, inicioCessao, terminoCessao, localTrabalho, solicitante,publicacaoCessao,dataPublicacao, observacao, TipoCessao, StatusCessao, TipoSolicitacao, Cessionario;
     
            matricula = txtMatricula.getText();
            nome = txtNome.getText();
            vinculo = txtVinculo.getText();
            sitFun = txtSitFun.getText();
            cargoCarreira = txtCargoCarreira.getText();  
            Secretaria = txtSecretaria.getText();
            lotacao = txtLotacao.getText();                  
            solicitacao = txtSolicitacao.getText();       
            inicioCessao = txtInicioCessao.getText();
            terminoCessao = txtTerminoCessao.getText();
            localTrabalho = txtLocalTrabalho.getText();
            solicitante = txtSolicitante.getText();     
            publicacaoCessao = txtPublicaoCessao.getText();
            dataPublicacao = txtDataPublicacao.getText();
            observacao = txtObs.getText();          
        
            TipoCessao = cmbTipoCessao.getSelectedItem().toString(); 
            StatusCessao = cmbStatusCessao.getSelectedItem().toString();
            TipoSolicitacao = cmbTipoSolicitacao.getSelectedItem().toString();        
            Cessionario = cmbCessionario.getSelectedItem().toString(); 
     
    
        RelatorioDTO reldto = new RelatorioDTO();
    
            reldto.setMatricula(matricula);
            reldto.setNome(nome);
            reldto.setVinculo(vinculo);
            reldto.setSituacaofun(sitFun);
            reldto.setCargoCarreira(cargoCarreira);
            reldto.setSecretaria(Secretaria);
            reldto.setLotacao(lotacao);
            reldto.setSolicitacao(solicitacao);
            reldto.setInicioCessao(inicioCessao);
            reldto.setTerminoCessao(terminoCessao);
            reldto.setLocalTrabalho(localTrabalho);
            reldto.setSolicitante(solicitante);
            reldto.setPublicacaoCessao(publicacaoCessao);
            reldto.setDataPublicacao(dataPublicacao);
            reldto.setobservacao(observacao);
            reldto.setTipoCessao(TipoCessao);
            reldto.setStatusCessao(StatusCessao);
            reldto.setTipoSolicitacao(TipoSolicitacao);
            reldto.setCessionario(Cessionario);
           
        RelatorioDAO reldao = new RelatorioDAO();
     
            reldao.cadastrarUsuario(reldto);     
    }
    
    
    
    public void PesquisarFuncionarioAnalise() {
        
        String sql = "SELECT matricula, nome, vinculo, situacaofun, cargoCarreira, secretaria, lotacao, tipoCessao, statusCessao, tipoSolicitacao, solicitacao, inicioCessao, terminoCessao, localTrabalho, solicitante, publicacaoCessao, dataPublicacao, observacao, cessionario FROM tb_analise WHERE nome LIKE ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtPesquisa.getText() + "%"); 
                rs = pst.executeQuery();

                tblAnalise.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar funcionário: " + erro.getMessage());
            }
    }   


 public void preencherComboBox() {
        String sql = "SELECT cessionario FROM tb_cessionarios";
        
        try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                cmbCessionario.removeAllItems();

            while (rs.next()) {
                cmbCessionario.addItem(rs.getString("cessionario"));
            }
        } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher ComboBox: " + erro.getMessage());
            }
    }


 public void Deletar() {

    String matricula;
        
    matricula = txtMatricula.getText();
        
    RelatorioDTO reldto = new RelatorioDTO();
    reldto.setMatricula(matricula);
        
    RelatorioDAO reldao = new RelatorioDAO();
    reldao.excluirUsuario(reldto); 
        
    try {
        PreencherTabela("select * from tb_analise order by usuario");
        Limpar();
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Erro ao Deletar: " + erro.getMessage());
    }
}



}