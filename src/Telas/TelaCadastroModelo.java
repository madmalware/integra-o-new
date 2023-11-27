/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Modelo;
import Classes.Modelo.Especie;
import Classes.Veiculo;
import Conexão.DatabaseConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author gsiqueira
 */
public class TelaCadastroModelo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroModelo
     */
    public TelaCadastroModelo() {
        initComponents();
        PreencherComboEspecie();
    }
    
    public void PreencherComboEspecie(){

        for (Especie s : Especie.values()) {
            comboEspecie.addItem(s.toString());
        }

    }
    
    private void limparCampos(){
        
        textNome.setText("");
        textCrlv.setText("");
        textQuantidade.setText(null);
        textAno.setText(null);
        
        textQuantidade.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        buttonSair = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();
        buttonMenuCadastros = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        textCrlv = new javax.swing.JTextField();
        textAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textQuantidade = new javax.swing.JTextField();
        buttonCadastroModelo = new javax.swing.JButton();
        textNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboEspecie = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        barraMenu = new javax.swing.JMenu();
        barraCadastros = new javax.swing.JMenu();
        menuItemMontadora = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemVeiculo = new javax.swing.JMenuItem();
        barraSair = new javax.swing.JMenu();

        jPanel3.setPreferredSize(new java.awt.Dimension(741, 45));

        buttonSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonSair.setText("Sair");

        buttonMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonMenu.setText("Menu");

        buttonMenuCadastros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonMenuCadastros.setText("Menu Cadastros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(buttonMenuCadastros)
                .addGap(243, 243, 243)
                .addComponent(buttonSair)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSair)
                    .addComponent(buttonMenu)
                    .addComponent(buttonMenuCadastros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(105, 105, 105));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(105, 105, 105));

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ESPECIE VEICULO");

        textQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQuantidadeActionPerformed(evt);
            }
        });

        buttonCadastroModelo.setText("Cadastrar");
        buttonCadastroModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroModeloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cadastro de Modelo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("QUANTIDADE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NOME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CRLV");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ANO MODELO");

        comboEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCrlv, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(comboEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonCadastroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCrlv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(741, 47));

        barraMenu.setText("Menu");
        jMenuBar1.add(barraMenu);

        barraCadastros.setText("Cadastros");

        menuItemMontadora.setText("Montadora");
        menuItemMontadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMontadoraActionPerformed(evt);
            }
        });
        barraCadastros.add(menuItemMontadora);

        menuItemUsuario.setText("Usuario");
        barraCadastros.add(menuItemUsuario);

        menuItemVeiculo.setText("Veiculo");
        barraCadastros.add(menuItemVeiculo);

        jMenuBar1.add(barraCadastros);

        barraSair.setText("Sair");
        jMenuBar1.add(barraSair);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQuantidadeActionPerformed

    private void buttonCadastroModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroModeloActionPerformed
        // TODO add your handling code here:
        
        Modelo m = new Modelo();
        m.setQuant(Integer.parseInt(textQuantidade.getText()));
        m.setCrlv(textCrlv.getText());
        m.setNome(textNome.getText());
        m.setAno(Integer.parseInt(textAno.getText()));
        m.setEspecie(Especie.valueOf((String) comboEspecie.getSelectedItem()));
        
        if(textCrlv.getText().isEmpty() || textAno.getText().isEmpty() || textNome.getText().isEmpty() || textQuantidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos! ");
        }else{
            DatabaseConnection c = new DatabaseConnection();
            c.createModelo(m);

            limparCampos();
        }
    }//GEN-LAST:event_buttonCadastroModeloActionPerformed

    private void comboEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecieActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboEspecieActionPerformed

    private void menuItemMontadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMontadoraActionPerformed
        // TODO add your handling code here:
        CadastroMontadora t= new CadastroMontadora();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemMontadoraActionPerformed
                                
    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        TelaCadastro t= new TelaCadastro();
        t.setVisible(true);
        dispose();
    }                                               

    private void barraSairActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        dispose();
    }                            
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
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu barraCadastros;
    private javax.swing.JMenu barraMenu;
    private javax.swing.JMenu barraSair;
    private javax.swing.JButton buttonCadastroModelo;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonMenuCadastros;
    private javax.swing.JButton buttonSair;
    private javax.swing.JComboBox<String> comboEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem menuItemMontadora;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenuItem menuItemVeiculo;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textCrlv;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textQuantidade;
    // End of variables declaration//GEN-END:variables
}
