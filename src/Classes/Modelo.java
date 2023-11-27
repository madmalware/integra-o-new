/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Mad Malware
 */
public class Modelo {
    
    private int quant, ano, id;
    private String nome, crlv;
    Especie especie;
    
    public Modelo(){
        
    }
    
    public Modelo(String nome){
        this.nome = nome;
    }
    
    public Modelo(int quant, String nome, String crlv, int ano,  Especie especie){
        this.quant = quant;
        this.ano = ano;
        this.nome = nome;
        this.crlv = crlv;
        this.especie = especie;
    }
    
    public enum Especie {PASSAGEIROS, CARGA, MISTO, COMPETIÇÃO, TRAÇÃO, ESPECIAL, COLEÇÃO;}

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the crlv
     */
    public String getCrlv() {
        return crlv;
    }

    /**
     * @param crlv the crlv to set
     */
    public void setCrlv(String crlv) {
        this.crlv = crlv;
    }

    /**
     * @return the especie
     */
    public Especie getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    
    
}
