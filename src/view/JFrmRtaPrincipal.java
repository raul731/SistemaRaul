/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.JDlgRtaUsuarios;


/**
 *
 * @author u06437985100
 */
public class JFrmRtaPrincipal extends javax.swing.JFrame {

    
    /**
     * Creates new form JFrmPrincipal
     * 
     * 
     *
     */
    public JFrmRtaPrincipal() {
        initComponents();
        setTitle("Menu Principal");
        setExtendedState(MAXIMIZED_BOTH);//é verde e maiusculo, em todas linguagens de C e java porque é uma constante.
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBtnCliente = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBtnListagem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuPrincipal = new javax.swing.JMenu();
        jMnuCliente = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuGrupo = new javax.swing.JMenuItem();
        jMnuProd = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimentos = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator2);

        jBtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UsersIcon.png"))); // NOI18N
        jBtnCliente.setFocusable(false);
        jBtnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCliente.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnCliente.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnCliente.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnCliente);
        jToolBar1.add(jSeparator3);

        jBtnListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ShoppingIcon.png"))); // NOI18N
        jBtnListagem.setFocusable(false);
        jBtnListagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnListagem.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnListagem.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnListagem.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnListagem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnListagemActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnListagem);

        jMnuPrincipal.setMnemonic('P');
        jMnuPrincipal.setText("Principal");
        jMnuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPrincipalActionPerformed(evt);
            }
        });

        jMnuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCliente.setMnemonic('C');
        jMnuCliente.setText("Clientes");
        jMnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClienteActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuCliente);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setMnemonic('U');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuUsuarios);

        jMnuGrupo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMnuGrupo.setMnemonic('G');
        jMnuGrupo.setText("Grupo");
        jMnuGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuGrupoActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuGrupo);

        jMnuProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProd.setMnemonic('P');
        jMnuProd.setText("Produto");
        jMnuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuProd);
        jMnuPrincipal.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuSair);

        jMenuBar1.add(jMnuPrincipal);

        jMnuMovimentos.setText("Movimentos");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setText("Vendas");
        jMnuMovimentos.add(jMnuVendas);

        jMenuBar1.add(jMnuMovimentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 234, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPrincipalActionPerformed
        // TODO add your handling code here:
        
    
        
    }//GEN-LAST:event_jMnuPrincipalActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        
        //letra maiuscula classe, minuscula objeto
        //new para criar um novo objeto da classe 
       JDlgRtaUsuarios jDlgRtaUsuarios= new  JDlgRtaUsuarios(null, true);
        jDlgRtaUsuarios.setVisible(true); 
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuGrupoActionPerformed
        JDlgRtaGrupo jDlgRtaGrupo= new  JDlgRtaGrupo(null, true);
        jDlgRtaGrupo.setVisible(true); 
    }//GEN-LAST:event_jMnuGrupoActionPerformed

    private void jMnuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdActionPerformed
       JDlgRtaProdutos jDlgRtaProdutos= new  JDlgRtaProdutos(null, true);
        jDlgRtaProdutos.setVisible(true); 
    }//GEN-LAST:event_jMnuProdActionPerformed

    private void jMnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClienteActionPerformed
         JDlgRtaClientes jDlgRtaClientes= new  JDlgRtaClientes(null, true);
        jDlgRtaClientes.setVisible(true); 
    }//GEN-LAST:event_jMnuClienteActionPerformed

    private void jBtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClienteActionPerformed
        JDlgRtaClientes jDlgRtaClientes= new  JDlgRtaClientes(null, true);
        jDlgRtaClientes.setVisible(true);         jDlgRtaClientes.setVisible(true);     }//GEN-LAST:event_jBtnClienteActionPerformed

    private void jBtnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnListagemActionPerformed
   JDlgRtaProdutos jDlgRtaProdutos= new  JDlgRtaProdutos(null, true);
        jDlgRtaProdutos.setVisible(true);     }//GEN-LAST:event_jBtnListagemActionPerformed

   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrmRtaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmRtaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmRtaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmRtaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmRtaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCliente;
    private javax.swing.JButton jBtnListagem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuCliente;
    private javax.swing.JMenuItem jMnuGrupo;
    private javax.swing.JMenu jMnuMovimentos;
    private javax.swing.JMenu jMnuPrincipal;
    private javax.swing.JMenuItem jMnuProd;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
