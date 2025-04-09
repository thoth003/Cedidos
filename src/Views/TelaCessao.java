package Views;

import Conexao.ModeloTabela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexao.ModuloConexao;
import DAO.CessaoDAO;
import DTO.CessaoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class TelaCessao extends javax.swing.JInternalFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaCessao() {
        
        initComponents();
                               
        conexao = ModuloConexao.connector();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtVinculo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSitFun = new javax.swing.JTextField();
        txtCargoCarreira = new javax.swing.JTextField();
        bttPesquisar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtSolicitante = new javax.swing.JTextField();
        txtPublicaoCessao = new javax.swing.JTextField();
        txtObs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLocalTrabalho = new javax.swing.JTextField();
        txtDataPublicacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLotacao = new javax.swing.JTextField();
        txtSecretaria = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbTipoCessao = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cmbStatusCessao = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cmbTipoSolicitacao = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtSolicitacao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbCessionario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtInicioCessao = new javax.swing.JTextField();
        txtTerminoCessao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCedidos = new javax.swing.JTable();
        bttLimpar = new javax.swing.JButton();
        bttCadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnalise = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela Cessao");
        setPreferredSize(new java.awt.Dimension(1130, 1000));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel2.setMinimumSize(new java.awt.Dimension(1100, 850));
        jPanel2.setRequestFocusEnabled(false);

        txtVinculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVinculoActionPerformed(evt);
            }
        });

        jLabel13.setText("Publicaçao da Cessao");

        txtSitFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSitFunActionPerformed(evt);
            }
        });

        txtCargoCarreira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoCarreiraActionPerformed(evt);
            }
        });

        bttPesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bttPesquisar.setText("Pesquisar");
        bttPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPesquisarActionPerformed(evt);
            }
        });

        jLabel14.setText("Data Publicaçao");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel15.setText("Observacao:");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        txtSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolicitanteActionPerformed(evt);
            }
        });

        txtPublicaoCessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublicaoCessaoActionPerformed(evt);
            }
        });

        txtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsActionPerformed(evt);
            }
        });

        jLabel8.setText("Secretaria");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtLocalTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalTrabalhoActionPerformed(evt);
            }
        });

        txtDataPublicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPublicacaoActionPerformed(evt);
            }
        });

        jLabel10.setText("Lotaçao:");

        jLabel11.setText("Solicitante:");

        jLabel12.setText("Local de trabalho Cessionario");

        jLabel1.setText("Matricula:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Vinculo:");

        jLabel4.setText("Situaçao Funcioal:");

        jLabel5.setText("Cargo Carreira:");

        txtLotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotacaoActionPerformed(evt);
            }
        });

        txtSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecretariaActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo cessao:");

        cmbTipoCessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "COM ONUS", "SEM ONUS", "PERMUTA" }));

        jLabel17.setText("Status da Cessao:");

        cmbStatusCessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "EM ANALISE" }));

        jLabel18.setText("Tipo de Solicitacao:");

        cmbTipoSolicitacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "COM CONVENIO", "SEM CONVENIO" }));

        jLabel19.setText("Solicitaçao");

        txtSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolicitacaoActionPerformed(evt);
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

        jLabel6.setText("Inicio Cessao:");

        jLabel7.setText("Termino Cessao");

        txtInicioCessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioCessaoActionPerformed(evt);
            }
        });

        txtTerminoCessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerminoCessaoActionPerformed(evt);
            }
        });

        tblCedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCedidos);

        bttLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bttLimpar.setText("Limpar");
        bttLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimparActionPerformed(evt);
            }
        });

        bttCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bttCadastrar.setText("Cadastrar");
        bttCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarActionPerformed(evt);
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
        jScrollPane2.setViewportView(tblAnalise);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCargoCarreira))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLotacao))
                    .addComponent(txtSecretaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(808, 808, 808)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(txtSitFun))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtObs)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bttCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLocalTrabalho))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                        .addComponent(txtTerminoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSitFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCargoCarreira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbTipoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cmbStatusCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cmbTipoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cmbCessionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtInicioCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTerminoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtPublicaoCessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtDataPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrar)
                    .addComponent(bttLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAnaliseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnaliseMouseClicked
        PesquisarFuncionarioAnalise();
    }//GEN-LAST:event_tblAnaliseMouseClicked

    private void bttCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarActionPerformed
        Cadastrar();

        PesquisarFuncionarioAnalise();
    }//GEN-LAST:event_bttCadastrarActionPerformed

    private void bttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_bttLimparActionPerformed

    private void tblCedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCedidosMouseClicked
        int selectedRow = tblCedidos.getSelectedRow();

        if (selectedRow != -1) {

            txtMatricula.setText(tblCedidos.getValueAt(selectedRow, 0).toString());
            txtNome.setText(tblCedidos.getValueAt(selectedRow, 1).toString());
            txtCargoCarreira.setText(tblCedidos.getValueAt(selectedRow, 3).toString());
            txtSecretaria.setText(tblCedidos.getValueAt(selectedRow, 4).toString());
            txtLotacao.setText(tblCedidos.getValueAt(selectedRow, 5).toString());
            txtSitFun.setText(tblCedidos.getValueAt(selectedRow, 6).toString());
            txtVinculo.setText(tblCedidos.getValueAt(selectedRow, 7).toString());

            cmbTipoCessao.setSelectedItem(tblCedidos.getValueAt(selectedRow, 8).toString());
            cmbCessionario.setSelectedItem(tblCedidos.getValueAt(selectedRow, 9).toString());
        }
    }//GEN-LAST:event_tblCedidosMouseClicked

    private void txtTerminoCessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerminoCessaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerminoCessaoActionPerformed

    private void txtInicioCessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioCessaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioCessaoActionPerformed

    private void cmbCessionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCessionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCessionarioActionPerformed

    private void cmbCessionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCessionarioMouseClicked
        preencherComboBox();
    }//GEN-LAST:event_cmbCessionarioMouseClicked

    private void txtSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolicitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolicitacaoActionPerformed

    private void txtSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecretariaActionPerformed

    private void txtLotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLotacaoActionPerformed

    private void txtDataPublicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPublicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPublicacaoActionPerformed

    private void txtLocalTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalTrabalhoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObsActionPerformed

    private void txtPublicaoCessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublicaoCessaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPublicaoCessaoActionPerformed

    private void txtSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolicitanteActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        PesquisarFuncionario();
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void bttPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPesquisarActionPerformed
        PesquisarFuncionario();
    }//GEN-LAST:event_bttPesquisarActionPerformed

    private void txtCargoCarreiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoCarreiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoCarreiraActionPerformed

    private void txtSitFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSitFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSitFunActionPerformed

    private void txtVinculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVinculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVinculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCadastrar;
    private javax.swing.JButton bttLimpar;
    private javax.swing.JButton bttPesquisar;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblAnalise;
    private javax.swing.JTable tblCedidos;
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
     
    
     CessaoDTO cssdto = new CessaoDTO();
    
        cssdto.setMatricula(matricula);
        cssdto.setNome(nome);
        cssdto.setVinculo(vinculo);
        cssdto.setSituacaofun(sitFun);
        cssdto.setCargoCarreira(cargoCarreira);
        cssdto.setSecretaria(Secretaria);
        cssdto.setLotacao(lotacao);
        cssdto.setSolicitacao(solicitacao);
        cssdto.setInicioCessao(inicioCessao);
        cssdto.setTerminoCessao(terminoCessao);
        cssdto.setLocalTrabalho(localTrabalho);
        cssdto.setSolicitante(solicitante);
        cssdto.setPublicacaoCessao(publicacaoCessao);
        cssdto.setDataPublicacao(dataPublicacao);
        cssdto.setobservacao(observacao);
        cssdto.setTipoCessao(TipoCessao);
        cssdto.setStatusCessao(StatusCessao);
        cssdto.setTipoSolicitacao(TipoSolicitacao);
        cssdto.setCessionario(Cessionario);
           
     CessaoDAO cssdao = new CessaoDAO();
     
     cssdao.cadastrarUsuario(cssdto);
     
   
    }
           
    public void Limpar (){

        txtMatricula.setText("");
        txtNome.setText("");
        txtVinculo.setText("");
        txtSitFun.setText("");
        txtCargoCarreira.setText("");
        txtSecretaria.setText("");    
        txtLotacao.setText("");
        txtSolicitacao.setText("");
        txtInicioCessao.setText("");
        txtTerminoCessao.setText("");
        txtLocalTrabalho.setText("");
        txtSolicitante.setText("");   
        txtPublicaoCessao.setText("");
        txtDataPublicacao.setText("");
        txtObs.setText("");      
    
        cmbCessionario.setSelectedIndex(0);
        cmbStatusCessao.setSelectedIndex(0);
        cmbTipoSolicitacao.setSelectedIndex(0);
        cmbTipoCessao.setSelectedIndex(0);    
    }
        
    public void PesquisarFuncionario(){            
        String sql = "SELECT matricula, nome, cpf, cargocarreira, secretaria, lotacao, situacaofun, vinculo FROM tb_cedidos WHERE nome LIKE ?";
            
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtPesquisa.getText()+ "%");
                rs = pst.executeQuery();
                tblCedidos.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro ao pesquisar funcionario para ser cedido " +erro.getMessage());            
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
   
    public void PreencherTabelaAnalise(String SQL) throws SQLException { 
        ArrayList<Object[]> dados = new ArrayList<>();
        String[] Colunas = new String[]{"matricula", "nome", "vinculo", "situacaofun", "cargoCarreira", "secretaria", "lotacao", "tipoCessao", "statusCessao", "tipoSolicitacao", "solicitacao", "inicioCessao", "terminoCessao", "localTrabalho", "solicitante", "publicacaoCessao", "dataPublicacao", "observacao", "cessionario"};
                       
            pst = conexao.prepareStatement(SQL);
            rs = pst.executeQuery();
    
        try {
            while (rs.next()) {
                dados.add(new Object[]{
                rs.getString("matricula"), 
                rs.getString("nome"), 
                rs.getString("vinculo"), 
                rs.getString("situacaofun"), 
                rs.getString("cargoCarreira"), 
                rs.getString("secretaria"), 
                rs.getString("lotacao"), 
                rs.getString("tipoCessao"), 
                rs.getString("statusCessao"), 
                rs.getString("tipoSolicitacao"), 
                rs.getString("solicitacao"), 
                rs.getString("inicioCessao"), 
                rs.getString("terminoCessao"), 
                rs.getString("localTrabalho"), 
                rs.getString("solicitante"), 
                rs.getString("publicacaoCessao"), 
                rs.getString("dataPublicacao"), 
                rs.getString("observacao"), 
                rs.getString("cessionario")
                  });
           }
        } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro ao Preencher Tabela: " + erro.getMessage());
            }
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                tblAnalise.setModel(modelo);    
                tblAnalise.getColumnModel().getColumn(0).setPreferredWidth(10);
                tblAnalise.getColumnModel().getColumn(0).setResizable(false);
                tblAnalise.getColumnModel().getColumn(1).setPreferredWidth(150);
                tblAnalise.getColumnModel().getColumn(1).setResizable(false);
                tblAnalise.getColumnModel().getColumn(2).setPreferredWidth(15);
                tblAnalise.getColumnModel().getColumn(2).setResizable(false);
                tblAnalise.getColumnModel().getColumn(3).setPreferredWidth(150);
                tblAnalise.getColumnModel().getColumn(3).setResizable(false);
                tblAnalise.getColumnModel().getColumn(4).setPreferredWidth(150);
                tblAnalise.getColumnModel().getColumn(4).setResizable(false);
                tblAnalise.getColumnModel().getColumn(5).setPreferredWidth(200);
                tblAnalise.getColumnModel().getColumn(5).setResizable(false);
                tblAnalise.getColumnModel().getColumn(6).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(6).setResizable(false);
                tblAnalise.getColumnModel().getColumn(7).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(7).setResizable(false);
                tblAnalise.getColumnModel().getColumn(8).setPreferredWidth(30);
                tblAnalise.getColumnModel().getColumn(8).setResizable(false);
                tblAnalise.getColumnModel().getColumn(9).setPreferredWidth(300);
                tblAnalise.getColumnModel().getColumn(9).setResizable(false);
                tblAnalise.getColumnModel().getColumn(10).setPreferredWidth(30);
                tblAnalise.getColumnModel().getColumn(10).setResizable(false);
                tblAnalise.getColumnModel().getColumn(11).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(11).setResizable(false);
                tblAnalise.getColumnModel().getColumn(12).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(12).setResizable(false);
                tblAnalise.getColumnModel().getColumn(13).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(13).setResizable(false);
                tblAnalise.getColumnModel().getColumn(14).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(14).setResizable(false);
                tblAnalise.getColumnModel().getColumn(15).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(15).setResizable(false);
                tblAnalise.getColumnModel().getColumn(16).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(16).setResizable(false);
                tblAnalise.getColumnModel().getColumn(17).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(17).setResizable(false);
                tblAnalise.getColumnModel().getColumn(18).setPreferredWidth(45);
                tblAnalise.getColumnModel().getColumn(18).setResizable(false);
    }    
}
