package petshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCliente.class.getName());

    public TelaCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 6, 184, -1));
        getContentPane().add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 34, 184, -1));
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 62, 184, -1));

        jLabel1.setText("ID Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, -1, -1));

        jLabel3.setText("Telefone:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, -1, -1));

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(this::btnCadastrarClienteActionPerformed);
        getContentPane().add(btnCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btnConsultarCliente.setText("Consultar");
        btnConsultarCliente.addActionListener(this::btnConsultarClienteActionPerformed);
        getContentPane().add(btnConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.addActionListener(this::btnAlterarClienteActionPerformed);
        getContentPane().add(btnAlterarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 110, 80, -1));

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(this::btnExcluirClienteActionPerformed);
        getContentPane().add(btnExcluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        // TODO add your handling code here:
        
        if(txtNomeCliente.getText().equals("") || txtTelefone.getText().equals("")) {

            JOptionPane.showMessageDialog(null,"Preencha todos os campos!");

            return;
        }   
        try {

        Connection conn = Conexao.conectar();

        String sql = "INSERT INTO cliente(nome, telefone) VALUES (?, ?)";

        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, txtNomeCliente.getText());
        pst.setString(2, txtTelefone.getText());

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Cliente cadastrado!");

        pst.close();
        conn.close();

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e);

    }
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        // TODO add your handling code here:
        try {

        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM cliente WHERE id_cliente=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setInt(1, Integer.parseInt(txtIdCliente.getText()));

        ResultSet rs = pst.executeQuery();

        if(rs.next()){

            txtNomeCliente.setText(rs.getString("nome"));
            txtTelefone.setText(rs.getString("telefone"));

        } else {

            JOptionPane.showMessageDialog(null, "Cliente não encontrado");

        }

        conn.close();

        } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        // TODO add your handling code here:
        try {

        Connection conn = Conexao.conectar();

        String sql = "UPDATE cliente SET nome=?, telefone=? WHERE id_cliente=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, txtNomeCliente.getText());
        pst.setString(2, txtTelefone.getText());
        pst.setInt(3, Integer.parseInt(txtIdCliente.getText()));

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Cliente atualizado!");

        conn.close();

        } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        // TODO add your handling code here:
         try {

        Connection conn = Conexao.conectar();

        String sql = "DELETE FROM cliente WHERE id_cliente=?";

        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setInt(1, Integer.parseInt(txtIdCliente.getText()));

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Cliente excluído!");

        conn.close();

        } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtIdCliente.setText("");
        txtNomeCliente.setText("");
        txtTelefone.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
