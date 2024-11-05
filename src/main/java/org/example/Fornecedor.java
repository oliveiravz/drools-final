package org.example;

public class Fornecedor {

    private String nome;
    private Double preco;
    private Integer frete;
    private String condicaoPgto;
    private Integer reputacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getFrete() {
        return frete;
    }

    public void setFrete(Integer frete) {
        this.frete = frete;
    }

    public String getCondicaoPgto() {
        return condicaoPgto;
    }

    public void setCondicaoPgto(String condicaoPgto) {
        this.condicaoPgto = condicaoPgto;
    }

    public Integer getReputacao() {
        return reputacao;
    }

    public void setReputacao(Integer reputacao) {
        this.reputacao = reputacao;
    }
}