/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package montadora;

import Conexão.DatabaseConnection;
import Telas.CadastroMontadora;
import Telas.TelaCadastro;
import Telas.TelaCadastroModelo;
import Telas.TelaCadastroVeiculo;
import Telas.TelaLogin;
import Telas.TelaRelatorioVeiculos;


/**
 *
 * @author Mad Malware
 */
public class Montadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DatabaseConnection c = new DatabaseConnection();
        c.getConnection();
        
        TelaCadastro t = new TelaCadastro();
        TelaCadastroVeiculo t3 = new TelaCadastroVeiculo();
        TelaLogin t2 = new TelaLogin();
        TelaRelatorioVeiculos t4 = new TelaRelatorioVeiculos();
        TelaCadastroModelo t1 = new TelaCadastroModelo();
        CadastroMontadora tela= new CadastroMontadora();
        t.setVisible(true);
        
    }
    
}
