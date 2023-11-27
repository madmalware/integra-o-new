/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Ano;
import Classes.Cor;
import Classes.Modelo;
import Classes.Montadoras;
import Classes.Veiculo;
import Classes.Veiculo.Status;
import Conexão.DatabaseConnection;
import static Conexão.DatabaseConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gsiqueira
 */
public class TelaCadastroVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroVeiculo
     */
    public TelaCadastroVeiculo() {
        initComponents();
        PreencherComboCor();
        PreencherComboModelo();
        PreencherComboMarca();
        PreencherComboStatus();
        PreencherComboAno();
    }
    
    public void addRevisaoValor(Veiculo m){
        
        DatabaseConnection c = new DatabaseConnection();
        
         try {
             
            Date dataSelecionada = textRevisao.getDate();

            if (dataSelecionada != null) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String dataFormatada = formato.format(dataSelecionada);
                m.setRevisaoPeriodica(dataFormatada);
            } else {
                System.err.println("Data não selecionada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                
    }
    
    public void PreencherComboCor(){
        DatabaseConnection c = new DatabaseConnection();

        ArrayList<Cor> cores = c.readCor();

        for (Cor cor : cores) {
            comboCor.addItem(cor.getCor());
        }
    }
    
    public void PreencherComboAno(){
        DatabaseConnection c = new DatabaseConnection();

        ArrayList<Ano> ano= c.readAno();

        for (Ano a : ano) {
            comboAno.addItem(String.valueOf(a.getAno()));
        }
    }
    
    public void PreencherComboModelo(){
        DatabaseConnection c = new DatabaseConnection();

        ArrayList<Modelo> modelo = c.readModeloNome();

        for (Modelo nomes : modelo) {
            comboModelo.addItem(nomes.getNome());
        }
    }
    
    public void PreencherComboMarca(){
        DatabaseConnection c = new DatabaseConnection();

        ArrayList<Montadoras> montadora = c.readMontadoraNome();

        for (Montadoras nomes : montadora) {
            comboMarca.addItem(nomes.getNome());
        }
    }
    
    public void PreencherComboStatus(){

        for (Status s : Status.values()) {
            comboStatus.addItem(s.toString());
        }

    }
    
    public void setValueIDcor(Veiculo m){
        // Cor
        String corSelecionada = (String) comboCor.getSelectedItem();
        String query = "SELECT IDcor FROM Cores WHERE cor = ?";
        Connection conn = getConnection();
        PreparedStatement sta;
        ResultSet rs;

        try {
            sta = conn.prepareStatement(query);
            sta.setString(1, corSelecionada);
            rs = sta.executeQuery();

            if (rs.next()) {
                int idCor = rs.getInt("IDcor");
                m.setCor(idCor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void setValueIDmontadora(Veiculo m){
        // Montadora
        String marcaSelecionada = (String) comboMarca.getSelectedItem();
        String query = "SELECT IDmontadora FROM Montadora WHERE nome = ?";
        Connection conn = getConnection();
        PreparedStatement sta;
        ResultSet rs;

        try {
            sta = conn.prepareStatement(query);
            sta.setString(1, marcaSelecionada);
            rs = sta.executeQuery();

            if (rs.next()) {
                int idMarca = rs.getInt("IDmontadora");
                m.setMontadora(idMarca);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void setValueIDano(Veiculo m){
        // Montadora
        String anoSelecionado = (String) comboAno.getSelectedItem();
        String query = "SELECT IDano FROM Fabricacao WHERE ano = ?";
        Connection conn = getConnection();
        PreparedStatement sta;
        ResultSet rs;

        try {
            sta = conn.prepareStatement(query);
            sta.setString(1, anoSelecionado);
            rs = sta.executeQuery();

            if (rs.next()) {
                int idAno= rs.getInt("IDano");
                m.setAno(idAno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void limparCampos(){
        
        textChassi.setText("");
        textIpva.setText("");
        textPlaca.setText("");
        textRenavam.setText("");
        //textRevisao.
        
        textPlaca.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        buttonSair = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();
        buttonMenuCadastros = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonCadastroVeiculo = new javax.swing.JButton();
        textRenavam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textIpva = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textChassi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboPortas = new javax.swing.JComboBox<>();
        comboRodas = new javax.swing.JComboBox<>();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboCor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboModelo = new javax.swing.JComboBox<>();
        buttonNovaCor = new javax.swing.JButton();
        comboAno = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        addAno = new javax.swing.JButton();
        comboMarca = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        textRevisao = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        barraMenu = new javax.swing.JMenu();
        barraCadastros = new javax.swing.JMenu();
        menuItemMontadora = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemModelo = new javax.swing.JMenuItem();
        barraSair = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(741, 45));

        buttonSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonSair.setText("Sair");

        buttonMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonMenu.setText("Menu");

        buttonMenuCadastros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonMenuCadastros.setText("Menu Cadastros");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMenu)
                .addGap(257, 257, 257)
                .addComponent(buttonMenuCadastros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSair)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSair)
                    .addComponent(buttonMenu)
                    .addComponent(buttonMenuCadastros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(105, 105, 105));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(105, 105, 105));

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 450));

        buttonCadastroVeiculo.setText("Cadastrar");
        buttonCadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroVeiculoActionPerformed(evt);
            }
        });

        textRenavam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRenavamActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("STATUS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("IPVA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nº RODAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nº PORTAS");

        textPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPlacaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("PLACA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CADASTRO DE VEÍCULO");

        comboPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        comboPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPortasActionPerformed(evt);
            }
        });

        comboRodas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8", "10", "12" }));
        comboRodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRodasActionPerformed(evt);
            }
        });

        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("REVISÂO PERIODICA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CHASSI");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("RENAVAM");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("COR");

        comboCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCorActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("MODELO");

        comboModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModeloActionPerformed(evt);
            }
        });

        buttonNovaCor.setText("Add Cor");
        buttonNovaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaCorActionPerformed(evt);
            }
        });

        comboAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("ANO FABRICADO");

        addAno.setText("Add Ano");
        addAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnoActionPerformed(evt);
            }
        });

        comboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("MARCA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(textPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(textRevisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(textRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textIpva, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(comboPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(comboRodas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(26, 26, 26)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(buttonNovaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(buttonCadastroVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(textChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel6)
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIpva, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboRodas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addAno)
                                .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel13))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNovaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastroVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(221, 221, 221)
                .addComponent(jLabel11))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(741, 47));

        barraMenu.setText("Menu");
        barraMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraMenuActionPerformed(evt);
            }
        });
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
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        barraCadastros.add(menuItemUsuario);

        menuItemModelo.setText("Modelo");
        menuItemModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModeloActionPerformed(evt);
            }
        });
        barraCadastros.add(menuItemModelo);

        jMenuBar1.add(barraCadastros);

        barraSair.setText("Sair");
        barraSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(barraSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPlacaActionPerformed

    private void textRenavamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRenavamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRenavamActionPerformed

    private void comboPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPortasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPortasActionPerformed

    private void comboRodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRodasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRodasActionPerformed

    private void buttonNovaCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaCorActionPerformed
        // TODO add your handling code here
        Cor cor= new Cor();
        
        DatabaseConnection c = new DatabaseConnection();
        
        String value = JOptionPane.showInputDialog(this, "Informe nova cor");
        cor.setCor(value);
        c.createCor(cor);
        
        PreencherComboCor();     
    }//GEN-LAST:event_buttonNovaCorActionPerformed

    private void menuItemModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModeloActionPerformed
        // TODO add your handling code here:
        TelaCadastroModelo t= new TelaCadastroModelo();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemModeloActionPerformed

    private void comboModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModeloActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboModeloActionPerformed

    private void buttonCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroVeiculoActionPerformed
        // TODO add your handling code here:
        Veiculo m = new Veiculo();
        m.setPlaca((textPlaca.getText()));
        m.setIpva((textIpva.getText()));
        //m.setRevisaoPeriodica(textRevisao.getText());
        m.setChassi(textChassi.getText());
        m.setRenavam((textRenavam.getText()));
       
        // preencher comboModelo
        String modeloSelecionado = (String) comboModelo.getSelectedItem();
        String query = "SELECT IDmodelo FROM Modelo WHERE nome = ?";
        Connection conn = getConnection();
        PreparedStatement sta;
        ResultSet rs;

        try {
            sta = conn.prepareStatement(query);
            sta.setString(1, modeloSelecionado);
            rs = sta.executeQuery();

            if (rs.next()) {
                int idModelo = rs.getInt("IDmodelo");
                m.setModelo(idModelo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Combos
        addRevisaoValor(m);
        setValueIDano(m);
        setValueIDmontadora(m);
        setValueIDcor(m);
        m.setStatus(Status.valueOf((String) comboStatus.getSelectedItem()));
        m.setQuantPortas(Integer.parseInt((String) comboPortas.getSelectedItem()));
        m.setQuantRodas(Integer.parseInt((String) comboRodas.getSelectedItem()));
        
        DatabaseConnection c = new DatabaseConnection();
        
        c.createVeiculo(m);
        
        limparCampos();
    }//GEN-LAST:event_buttonCadastroVeiculoActionPerformed

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed

    private void comboAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnoActionPerformed

    private void addAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnoActionPerformed
  
        //Ano BUTTON
        
        Ano ano = new Ano();
        
        DatabaseConnection c = new DatabaseConnection();
        
        String inputValue = JOptionPane.showInputDialog(this, "Informe um novo ano de fabricação:");

        if (inputValue != null && !inputValue.isEmpty()) {
            try {
                int value = Integer.parseInt(inputValue);
                
                ano.setAno(value);
                c.createAno(ano);
                PreencherComboAno();
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um valor válido para o ano.");
            }
        }
    }//GEN-LAST:event_addAnoActionPerformed
    
    private void comboCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCorActionPerformed
 
    }//GEN-LAST:event_comboCorActionPerformed

    private void comboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcaActionPerformed

    }//GEN-LAST:event_comboMarcaActionPerformed

    private void barraMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraMenuActionPerformed
        // TODO add your handling code here:
        PerfilAdmin t= new PerfilAdmin();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_barraMenuActionPerformed

    private void menuItemMontadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMontadoraActionPerformed
        // TODO add your handling code here:
        CadastroMontadora t= new CadastroMontadora();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemMontadoraActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        // TODO add your handling code here:
        TelaCadastro t= new TelaCadastro();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void barraSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_barraSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAno;
    private javax.swing.JMenu barraCadastros;
    private javax.swing.JMenu barraMenu;
    private javax.swing.JMenu barraSair;
    private javax.swing.JButton buttonCadastroVeiculo;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonMenuCadastros;
    private javax.swing.JButton buttonNovaCor;
    private javax.swing.JButton buttonSair;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JComboBox<String> comboCor;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JComboBox<String> comboModelo;
    private javax.swing.JComboBox<String> comboPortas;
    private javax.swing.JComboBox<String> comboRodas;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuItemModelo;
    private javax.swing.JMenuItem menuItemMontadora;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JTextField textChassi;
    private javax.swing.JTextField textIpva;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textRenavam;
    private com.toedter.calendar.JDateChooser textRevisao;
    // End of variables declaration//GEN-END:variables
}
