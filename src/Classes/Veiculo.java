/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Mad Malware
 */
public class Veiculo {
    
    private int quantPortas, quantRodas, ano, modelo, cor, montadora, IDveiculo;
    private String placa, ipva, chassi, renavam, revisaoPeriodica;
    private Status status;
    
    public Veiculo(int IDveiculo,String placa, int quantPortas, int quantRodas, Status status, String ipva, String revisaoPeriodica, String chassi, String renavam, int modelo, int cor, int ano, int montadora){
        this.ano = ano;
        this.chassi = chassi;
        this.ipva = ipva;
        this.modelo = modelo;
        this.placa = placa;
        this.quantPortas = quantPortas;
        this.quantRodas = quantRodas;
        this.renavam = renavam;
        this.revisaoPeriodica = revisaoPeriodica;
        this.status = status;
        this.cor = cor;
        this.montadora = montadora;
        this.IDveiculo = IDveiculo;
    }
    
    public Veiculo(){
        
    }
    
    public enum Status {VENDIDO, DISPONÍVEL, MANUTENÇÃO;}

    /**
     * @return the quantPortas
     */
    public int getQuantPortas() {
        return quantPortas;
    }

    /**
     * @param quantPortas the quantPortas to set
     */
    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    /**
     * @return the quantRodas
     */
    public int getQuantRodas() {
        return quantRodas;
    }

    /**
     * @param quantRodas the quantRodas to set
     */
    public void setQuantRodas(int quantRodas) {
        this.quantRodas = quantRodas;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the ipva
     */
    public String getIpva() {
        return ipva;
    }

    /**
     * @param ipva the ipva to set
     */
    public void setIpva(String ipva) {
        this.ipva = ipva;
    }

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the renavam
     */
    public String getRenavam() {
        return renavam;
    }

    /**
     * @param renavam the renavam to set
     */
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the revisaoPeriodica
     */
    public String getRevisaoPeriodica() {
        return revisaoPeriodica;
    }

    /**
     * @param revisaoPeriodica the revisaoPeriodica to set
     */
    public void setRevisaoPeriodica(String revisaoPeriodica) {
        this.revisaoPeriodica = revisaoPeriodica;
    }

    /**
     * @return the cor
     */
    public int getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(int cor) {
        this.cor = cor;
    }

    /**
     * @return the montadora
     */
    public int getMontadora() {
        return montadora;
    }

    /**
     * @param montadora the montadora to set
     */
    public void setMontadora(int montadora) {
        this.montadora = montadora;
    }

    /**
     * @return the IDveiculo
     */
    public int getIDveiculo() {
        return IDveiculo;
    }

    /**
     * @param IDveiculo the IDveiculo to set
     */
    public void setIDveiculo(int IDveiculo) {
        this.IDveiculo = IDveiculo;
    }
  
}
