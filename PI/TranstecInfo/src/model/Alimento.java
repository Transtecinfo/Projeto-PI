/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Alimento {
    
    public static final String BOA = "b";
    public static final String RUIM = "r";
    public static final String OTIMA = "o";
    
    private int codigo;
    private String nome, descricao, situacao;
    private double quantidade, maximo, medio, minimo;
    
     public Alimento(int codigo, String nome, String descricao, double quantidade, double maximo,
             double minimo, double medio, String situacao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.maximo = maximo;
        this.medio = medio;
        this.minimo = minimo;
        this.situacao = situacao;
    }

    public Alimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public  String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(){
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    public double getMedio() {
        return medio;
    }

    public void setMedio(double medio) {
        this.medio = medio;
    }

    public double getMinimo() {
        return minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setDescricao(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
