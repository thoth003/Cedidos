package Views;

import javax.swing.JOptionPane;

public class TelaInicio extends javax.swing.JFrame {
 
    public TelaInicio() {
        initComponents();       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadUsu = new javax.swing.JMenuItem();
        mencadCessao = new javax.swing.JMenuItem();
        bttPageRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(120, 120));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Desktop.setMaximumSize(new java.awt.Dimension(1100, 850));
        Desktop.setMinimumSize(new java.awt.Dimension(1100, 850));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );

        getContentPane().add(Desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 990));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuario.setBackground(new java.awt.Color(204, 204, 204));
        lblUsuario.setText("----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblUsuario)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addContainerGap(955, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 70, 980));

        menCad.setText("Cadastro ");

        menCadUsu.setText("Usuario");
        menCadUsu.setToolTipText("");
        menCadUsu.setEnabled(false);
        menCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuActionPerformed(evt);
            }
        });
        menCad.add(menCadUsu);

        mencadCessao.setText("Cessao");
        mencadCessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mencadCessaoActionPerformed(evt);
            }
        });
        menCad.add(mencadCessao);

        bttPageRelatorio.setText("Relatorio");
        bttPageRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPageRelatorioActionPerformed(evt);
            }
        });
        menCad.add(bttPageRelatorio);

        jMenuBar1.add(menCad);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1359, 1040);
    }// </editor-fold>//GEN-END:initComponents

    private void menCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuActionPerformed
    TelaDeUsuario usu;
    
        try {
            usu = new TelaDeUsuario();
            usu.setVisible(true);
            
            Desktop.add(usu);

        } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro ao Acessar a pagina usuario " +erro.getMessage());
            }            
    }//GEN-LAST:event_menCadUsuActionPerformed

    private void mencadCessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mencadCessaoActionPerformed
    TelaCessao cess ;
    
        try {
            cess = new TelaCessao();
            cess.setVisible(true);
            
            Desktop.add(cess);

        } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro ao Acessar a pagina cessao " +erro.getMessage());
            } 
    }//GEN-LAST:event_mencadCessaoActionPerformed

    private void bttPageRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPageRelatorioActionPerformed
    TelaRelatorio rel ;
    
        try {
            rel = new TelaRelatorio();
            rel.setVisible(true);
            
            Desktop.add(rel);

        } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro ao Acessar a pagina cessao " +erro.getMessage());
            } 
    }//GEN-LAST:event_bttPageRelatorioActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem bttPageRelatorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    public static javax.swing.JMenu menCad;
    public static javax.swing.JMenuItem menCadUsu;
    private javax.swing.JMenuItem mencadCessao;
    // End of variables declaration//GEN-END:variables
}
