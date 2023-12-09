/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RtaCliente;
import bean.RtaUsuarios;
import bean.RtaVendas;
import bean.RtaVendasproduto;
import dao.RtaClientes_DAO;
import dao.RtaUsuarios_DAO;
import dao.RtaVendasProduto_DAO;
import dao.RtaVendas_DAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author Usuario
 */
public class JDlgRtaVendas extends javax.swing.JDialog {

 public RtaVendas vendas;
    public RtaVendas_DAO vendas_DAO;
    public RtaUsuarios_DAO usuarios_DAO;
    public RtaCliente clientes;
    public RtaClientes_DAO rtaCliente_DAO;
    public RtaVendas_DAO rtaVendas_DAO;
    public RtaVendasProduto_DAO rtaVendasProduto_DAO;
  public RtaVendasproduto rtaVendasproduto;
  public JDlgRtaVendas jDlgRtaVendas;
  public JDlgRtaVendasProduto jDlgRtaVendasProduto;
    public VendasProdutoController vendasProdutoController;    

      private boolean incluindo;
      MaskFormatter mascaraData;
    public JDlgRtaVendas(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Vendas dos doces");
        
        Util.habilitar(false, jBtnConfirmar, jBtnCancelar, jTxtId, jCboCliente, jFmtData, jCboUser,jTxtValor, jBtnAlterarVendasP, jBtnIncluirVendasP, jBtbExcluirVendasP);
        Util.habilitar(true, jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar);

        
         try {
            mascaraData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgRtaVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));

         vendas = new RtaVendas();
        rtaVendas_DAO = new RtaVendas_DAO();
        
        rtaVendasProduto_DAO = new RtaVendasProduto_DAO();
        List lista = new ArrayList();
        vendasProdutoController = new VendasProdutoController();
        vendasProdutoController.setList(lista);
        jTable1.setModel(vendasProdutoController);

        rtaCliente_DAO = new RtaClientes_DAO();
        List listaCliente= rtaCliente_DAO.listAll();
        for (int i = 0; i < listaCliente.size(); i++) {
            RtaCliente clientes = (RtaCliente) listaCliente.get(i);
            jCboCliente.addItem(clientes);
        }

        RtaUsuarios_DAO rtaUsuarios_DAO = new RtaUsuarios_DAO();
        List listaFuncionario = rtaUsuarios_DAO.listAll();
        for (int i = 0; i < listaFuncionario.size(); i++) {
            RtaUsuarios funcionario = (RtaUsuarios) listaFuncionario.get(i);
            jCboUser.addItem(funcionario);
        }
    }
    
    

     public RtaVendas viewBean() {

        vendas = new RtaVendas();

        vendas.setIdrtaVendas(Util.strInt(jTxtId.getText()));

        vendas.setRtaCliente((RtaCliente) jCboCliente.getSelectedItem());
        vendas.setRtaUsuarios((RtaUsuarios) jCboUser.getSelectedItem());
        vendas.setRtaData(Util.strDate(jFmtData.getText()));
        vendas.setRtaValorTotal(Util.strDouble(jTxtValor.getText()));
      
        return vendas;

    }

    public void beanView(RtaVendas vendas) {

        jTxtId.setText(Util.intStr(vendas.getIdrtaVendas()));
        jCboCliente.setSelectedItem(vendas.getRtaCliente());
        jCboUser.setSelectedItem((vendas.getRtaUsuarios()));
        jFmtData.setText(Util.datestr(vendas.getRtaData()));
        jTxtValor.setText(Util.doubleStr(vendas.getRtaValorTotal()));

        rtaVendasProduto_DAO = new RtaVendasProduto_DAO();
        List listaProdutos = (List) rtaVendasProduto_DAO.listProdutos(vendas);

         vendasProdutoController.setList(listaProdutos);

    }
    
      public int getSelectedRowProd() {
        return jTable1.getSelectedRow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jCboCliente = new javax.swing.JComboBox<RtaCliente>();
        jLabel3 = new javax.swing.JLabel();
        jCboUser = new javax.swing.JComboBox<RtaUsuarios>();
        jLabel4 = new javax.swing.JLabel();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluirVendasP = new javax.swing.JButton();
        jBtnAlterarVendasP = new javax.swing.JButton();
        jBtbExcluirVendasP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("ID Vendas");

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Clientes");

        jLabel3.setText("Usuarios");

        jLabel4.setText("Data");

        jLabel5.setText("Valor Total");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setText("Perquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBtnIncluir)
                .addGap(50, 50, 50)
                .addComponent(jBtnAlterar)
                .addGap(50, 50, 50)
                .addComponent(jBtnExcluir)
                .addGap(50, 50, 50)
                .addComponent(jBtnConfirmar)
                .addGap(50, 50, 50)
                .addComponent(jBtnCancelar)
                .addGap(50, 50, 50)
                .addComponent(jBtnPesquisar)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnPesquisar))
                .addContainerGap())
        );

        jBtnIncluirVendasP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ConfirmIcon.png"))); // NOI18N
        jBtnIncluirVendasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirVendasPActionPerformed(evt);
            }
        });

        jBtnAlterarVendasP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EditIcon.png"))); // NOI18N
        jBtnAlterarVendasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarVendasPActionPerformed(evt);
            }
        });

        jBtbExcluirVendasP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CancelIcon.png"))); // NOI18N
        jBtbExcluirVendasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbExcluirVendasPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnIncluirVendasP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnAlterarVendasP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtbExcluirVendasP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jBtnIncluirVendasP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAlterarVendasP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jBtbExcluirVendasP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        
        
        
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        Util.habilitar(true, jTxtId, jFmtData, jCboCliente, jCboUser, jTxtValor, jBtnConfirmar, jBtnCancelar, jBtnAlterarVendasP, jBtnIncluirVendasP, jBtbExcluirVendasP, jTable1);
        Util.habilitar(false, jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar); 

        Util.limparCampos(jTxtId, jFmtData, jCboCliente, jCboUser, jTxtValor);

        vendasProdutoController.setList(new ArrayList());
        jTxtId.grabFocus();
        incluindo = true;
        vendas = new RtaVendas();
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
   if (vendas != null) {
            if (Util.perguntar("Deseja excluir a Compra ?") == true) {
                rtaVendasProduto_DAO = new RtaVendasProduto_DAO();
                RtaVendasproduto vendasProduto;
                for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                    vendasProduto = vendasProdutoController.getBean(linha);
                   rtaVendasProduto_DAO.delete(vendasProduto);
                }
                rtaVendasProduto_DAO.delete(vendas);
               
            }
        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
        }
Util.limparCampos(jTxtId, jFmtData, jCboCliente, jCboUser, jTxtValor, jTable1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
  vendas = viewBean();
 rtaVendas_DAO = new RtaVendas_DAO();
        
        if (incluindo == true) {
            rtaVendas_DAO.insert(vendas);
            rtaVendasProduto_DAO = new RtaVendasProduto_DAO();
            RtaVendasproduto vendasProduto;
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                vendasProduto = vendasProdutoController.getBean(linha);
                vendasProduto.setRtaVendas(vendas);
                rtaVendas_DAO.insert(vendasProduto);

            }

        } else {
            rtaVendas_DAO.update(vendas);
            rtaVendasProduto_DAO = new RtaVendasProduto_DAO();
            RtaVendasproduto vendasProduto;
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                vendasProduto = vendasProdutoController.getBean(linha);
                vendasProduto.setRtaVendas(vendas);
                rtaVendas_DAO.insert(vendasProduto);
            }

            Util.habilitar(false, jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar);
            Util.limparCampos(jTxtId, jFmtData, jCboCliente, jCboUser, jTxtValor);
            vendasProdutoController.setList(new ArrayList());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtbExcluirVendasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbExcluirVendasPActionPerformed
        if (getSelectedRowProd() == -1) {
            Util.mensagem("Nenhuma linha selecionada");
        } else {
            if (Util.perguntar("ConfirmarExclusão do produto") == true) {
                vendasProdutoController.removeBean(getSelectedRowProd());
            }
        }            //butaum lateral
    }//GEN-LAST:event_jBtbExcluirVendasPActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgRtaVendasPesquisa jDlgRtaVendasPesquisa = new JDlgRtaVendasPesquisa(null, true);
        jDlgRtaVendasPesquisa.setTelaAnterior(this);
        jDlgRtaVendasPesquisa.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirVendasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirVendasPActionPerformed
        jDlgRtaVendasProduto = new JDlgRtaVendasProduto(null, true);
        jDlgRtaVendasProduto.setTitle("Inclusão de produtos");
        jDlgRtaVendasProduto.setTelaAnterior(this);
        jDlgRtaVendasProduto.setVisible(true);
        //butaum lateral
    }//GEN-LAST:event_jBtnIncluirVendasPActionPerformed

    private void jBtnAlterarVendasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarVendasPActionPerformed
        jDlgRtaVendasProduto = new JDlgRtaVendasProduto(null, true);
        jDlgRtaVendasProduto.setTitle("Alteração de produtos");
        jDlgRtaVendasProduto.setTelaAnterior(this);
        int linSel = jTable1.getSelectedRow();
        RtaVendasproduto vendasProduto = (RtaVendasproduto) vendasProdutoController.getBean(linSel);
        jDlgRtaVendasProduto.beanView(vendasProduto);
        jDlgRtaVendasProduto.setVisible(true);
        //butaum lateral
    }//GEN-LAST:event_jBtnAlterarVendasPActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.habilitar(false, jTxtId, jCboCliente, jFmtData, jCboUser, jTxtValor, jBtnConfirmar, jBtnCancelar, jBtnAlterarVendasP, jBtnIncluirVendasP, jBtbExcluirVendasP);
        Util.habilitar(true, jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar);
        Util.limparCampos(jTxtId, jCboCliente, jFmtData, jCboUser, jTxtValor, jTable1);
        vendasProdutoController.setList(new ArrayList());        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
       Util.habilitar(false, jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar);

        if (vendas != null) {
            
           rtaVendasProduto_DAO = new RtaVendasProduto_DAO();
                RtaVendasproduto rtaVendasproduto;
                for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                    rtaVendasproduto = vendasProdutoController.getBean(linha);
                    rtaVendasProduto_DAO.delete(rtaVendasproduto);}
                
                
            Util.habilitar(true, jTxtId, jCboCliente, jFmtData, jCboUser, jTxtValor, jBtnConfirmar, jBtnCancelar, jBtnAlterarVendasP, jBtnIncluirVendasP, jBtbExcluirVendasP, jTable1);
            
        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
        }
incluindo = false;
        
        
        
    }//GEN-LAST:event_jBtnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgRtaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgRtaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgRtaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgRtaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRtaVendas dialog = new JDlgRtaVendas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtbExcluirVendasP;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterarVendasP;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluirVendasP;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<RtaCliente> jCboCliente;
    private javax.swing.JComboBox<RtaUsuarios> jCboUser;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtValor;
    // End of variables declaration//GEN-END:variables
}
