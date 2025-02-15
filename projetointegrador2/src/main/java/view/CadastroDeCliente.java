package view;

import controller.clienteController;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import methods.Cliente;

public class CadastroDeCliente extends javax.swing.JFrame {
    public Cliente alterarCliente = null;
    /**
     * Creates new form CadastroUsuario
     */
    public CadastroDeCliente() {
        initComponents();
        formatarCampo();
    }
    public CadastroDeCliente(int ID) throws SQLException {
        initComponents();
        preencherFormulario(ID);
    }
    
    public void preencherFormulario(int ID) throws SQLException{
        alterarCliente= dao.ConsultarDAO.consultarClienteId(ID);
        if(alterarCliente != null){
            this.lblID.setText(String.valueOf(alterarCliente.getIdcliente()));
            this.txtNome1.setText(String.valueOf(alterarCliente.getNomeCliente()));
            this.ftxtCpf1.setText(String.valueOf(alterarCliente.getCpfCliente()));
            this.txtCep.setText(String.valueOf(alterarCliente.getCep()));
            this.txtEmail.setText(String.valueOf(alterarCliente.getEmail()));
            this.txtContato.setText(String.valueOf(alterarCliente.getContato()));
            this.txtEndereco.setText(String.valueOf(alterarCliente.getEnderecoCliente()));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastroCliente = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblContato = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        txtContato = new javax.swing.JFormattedTextField();
        btnFechar = new javax.swing.JButton();
        lblCpf1 = new javax.swing.JLabel();
        ftxtCpf1 = new javax.swing.JFormattedTextField();
        lblEndereco1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        lblEndereco2 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastroCliente.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        lblCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroCliente.setText("Cadastro de Cliente");

        txtEndereco.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblNome.setText("Nome");

        lblEndereco.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblEndereco.setText("Endereço");

        txtEmail.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblContato.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblContato.setText("Contato");

        btnConfirmar.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContatoActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblCpf1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblCpf1.setText("CPF");

        try {
            ftxtCpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpf1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        ftxtCpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtCpf1ActionPerformed(evt);
            }
        });

        lblEndereco1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblEndereco1.setText("E-mail");

        txtNome1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });

        lblEndereco2.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblEndereco2.setText("CEP");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCpf1)
                                        .addComponent(ftxtCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEndereco2)
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblContato)
                                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEndereco1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtEmail)
                                            .addGap(1, 1, 1))))
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEndereco)
                                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnConfirmar, btnFechar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCpf1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEndereco1)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEndereco2)
                        .addGap(49, 49, 49)))
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnConfirmar, btnFechar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       
        boolean executado=false;
       
       
        if(alterarCliente != null){
       int ID=Integer.parseInt(this.lblID.getText());
       String nome = txtNome1.getText();
       String cpf =  ftxtCpf1.getText().replace("-", "").replace(".","");
       String endereco = txtEndereco.getText();
       String CEP = txtCep.getText().replace(".", "").replace("-", "");
       String email = txtEmail.getText();
       String contato = txtContato.getText().replace("(", "").replace(")", "").replace("-", "");
       
        if("".equals(nome) || "".equals(cpf) || "".equals(endereco) || "".equals(CEP) || "".equals(email) || "".equals(contato)){
            
             JOptionPane.showMessageDialog(null, "Campo Obrigatório não preenchido!", "Inormação Incorreta!", JOptionPane.WARNING_MESSAGE);
             
        }else{
       
        try {
            executado = controller.clienteController.editar(nome, cpf, endereco, CEP, email, contato,ID);
            if(executado){
            JOptionPane.showMessageDialog(null, "Cliente Alterado");
            }
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        }else{
       String nome = txtNome1.getText();
       String cpf =  ftxtCpf1.getText().replace("-", "").replace(".","");
       String endereco = txtEndereco.getText();
       String CEP = txtCep.getText().replace(".", "").replace("-", "");
       String email = txtEmail.getText();
       String contato = txtContato.getText().replace("(", "").replace(")", "").replace("-", "");
       if(txtCep == null){
       this.txtCep.setText("default");
       }
       if(txtEndereco == null){
       this.txtEndereco.setText("default");
       }
       
        if("".equals(nome) || "".equals(cpf) || "".equals(endereco) || "".equals(CEP) || "".equals(email) || "".equals(contato)){
            
             JOptionPane.showMessageDialog(null, "Campo Obrigatório não preenchido!", "Inormação Incorreta!", JOptionPane.WARNING_MESSAGE);
             
        }else{
       
        try {
            executado = controller.clienteController.salvar(nome, cpf, endereco, CEP, email, contato);
            if(executado){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado");
            }
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
       
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContatoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void ftxtCpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtCpf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtCpf1ActionPerformed

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void formatarCampo() {
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.install(txtContato);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Insira um CPF válido!", "ERRO", JOptionPane.ERROR);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JFormattedTextField ftxtCpf1;
    private javax.swing.JLabel lblCadastroCliente;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEndereco2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
