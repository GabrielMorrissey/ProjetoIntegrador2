/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import methods.Cliente;
import methods.Compra;
import methods.Produto;
/**
 *
 * @author PC
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Perfumaria
     */
    public TelaVendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_Sup = new javax.swing.JPanel();
        painelCompra = new javax.swing.JPanel();
        txtCod_Prod = new javax.swing.JFormattedTextField();
        LcodProduto = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        quantidade = new javax.swing.JLabel();
        painelPagamento = new javax.swing.JPanel();
        LvalorEntregue = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        Ltroco = new javax.swing.JLabel();
        txtValorEntregue = new javax.swing.JTextField();
        Lvalor1 = new javax.swing.JLabel();
        txtTotalCompra = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        jftCpfCliente = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painel_Sup.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra"));
        painel_Sup.setToolTipText("Compra");
        painel_Sup.setName("Compra"); // NOI18N

        painelCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtCod_Prod.setToolTipText("Código do produto");
        txtCod_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_ProdActionPerformed(evt);
            }
        });

        LcodProduto.setText("Código do Produto:");

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        quantidade.setText("Quantidade:");

        javax.swing.GroupLayout painelCompraLayout = new javax.swing.GroupLayout(painelCompra);
        painelCompra.setLayout(painelCompraLayout);
        painelCompraLayout.setHorizontalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addComponent(quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addComponent(LcodProduto)
                        .addGap(18, 18, 18)
                        .addComponent(txtCod_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCompraLayout.setVerticalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod_Prod, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(LcodProduto))
                .addGap(18, 18, 18)
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidade)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        painelPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pagamento"));

        LvalorEntregue.setText("Valor Entregue:");

        txtTroco.setToolTipText("O valor de troco do cliente");
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });

        Ltroco.setText("Troco:");

        txtValorEntregue.setToolTipText("Digite o velor recebido");
        txtValorEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorEntregueActionPerformed(evt);
            }
        });

        Lvalor1.setText("Valor da Compra:");

        txtTotalCompra.setToolTipText("O valor de troco do cliente");
        txtTotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCompraActionPerformed(evt);
            }
        });

        lblCliente.setText("Cliente");

        try {
            jftCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelPagamentoLayout = new javax.swing.GroupLayout(painelPagamento);
        painelPagamento.setLayout(painelPagamentoLayout);
        painelPagamentoLayout.setHorizontalGroup(
            painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPagamentoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPagamentoLayout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jftCpfCliente))
                    .addGroup(painelPagamentoLayout.createSequentialGroup()
                        .addComponent(Lvalor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPagamentoLayout.createSequentialGroup()
                        .addComponent(Ltroco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPagamentoLayout.createSequentialGroup()
                        .addComponent(LvalorEntregue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        painelPagamentoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTroco, txtValorEntregue});

        painelPagamentoLayout.setVerticalGroup(
            painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LvalorEntregue)
                        .addComponent(lblCliente))
                    .addComponent(jftCpfCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ltroco)
                    .addComponent(Lvalor1)
                    .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPagamentoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtTroco, txtValorEntregue});

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Carrinho de compras"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Produto", "Descrição", "Qtd", "Valor da Compra"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );

        javax.swing.GroupLayout painel_SupLayout = new javax.swing.GroupLayout(painel_Sup);
        painel_Sup.setLayout(painel_SupLayout);
        painel_SupLayout.setHorizontalGroup(
            painel_SupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_SupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_SupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel_SupLayout.setVerticalGroup(
            painel_SupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_SupLayout.createSequentialGroup()
                .addComponent(painelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_Sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_Sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrocoActionPerformed

    private void txtCod_ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_ProdActionPerformed
        
    }//GEN-LAST:event_txtCod_ProdActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String codigotxt= txtCod_Prod.getText().replace(" ", "");
        int cod = Integer.parseInt(codigotxt);
        Date dataCompra = new Date();
        Cliente comprador = new Cliente();
        Compra umaCompra = new Compra();
        SimpleDateFormat formatadorDatas = new SimpleDateFormat("yyyy-MM-dd");
        String limite = formatadorDatas.format(dataCompra);
        
        
        String cpfCliente = jftCpfCliente.getText().replace(".", "").replace("-", "");
        try {
            comprador = dao.ConsultarDAO.consultarClienteCpfUnico(cpfCliente);
        } catch (SQLException ex) {
            Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
/*==========================================================================================================*/     
        Produto novo =new Produto();
        try {
             novo = dao.ConsultarDAO.consultarProdutoId(cod);
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       if(novo==null){
            JOptionPane.showMessageDialog(null,"Codigo inexistente");
            }else{
            DefaultTableModel modelTabela = (DefaultTableModel) jTable1.getModel();
            int multiplicador = Integer.parseInt(txtQtd.getText());
            double totalDoItem = multiplicador * novo.getPrecoProduto();
            this.valor+=totalDoItem;
           
             
            modelTabela.addRow(new Object[]{
            novo.getCodigo(),
            novo.getNomeProduto(),
            multiplicador,
            totalDoItem});
            
            try {
                boolean confirmado = controller.CompraController.Comprar(comprador.getIdcliente(), novo.getCodigo(), limite, multiplicador);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Compra falhada 404");
            }
            
            String valorT = Double.toString(valor);
            txtTotalCompra.setText(valorT);
       }
        
    }//GEN-LAST:event_btnAdicionarActionPerformed
public double valor= 0.00;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtValorEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorEntregueActionPerformed
        String pago = txtValorEntregue.getText();
        double pagoD = Double.valueOf(pago).doubleValue();
        double troco = pagoD-valor;
        String trocoEntregue = Double.toString(troco);
        trocoEntregue.replace(".",",");
        txtTroco.setText("R$ "+ trocoEntregue);
    }//GEN-LAST:event_txtValorEntregueActionPerformed

    private void txtTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCompraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LcodProduto;
    private javax.swing.JLabel Ltroco;
    private javax.swing.JLabel Lvalor1;
    private javax.swing.JLabel LvalorEntregue;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jftCpfCliente;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JPanel painelCompra;
    private javax.swing.JPanel painelPagamento;
    private javax.swing.JPanel painel_Sup;
    private javax.swing.JLabel quantidade;
    private javax.swing.JFormattedTextField txtCod_Prod;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTotalCompra;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtValorEntregue;
    // End of variables declaration//GEN-END:variables

    private String toString(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
