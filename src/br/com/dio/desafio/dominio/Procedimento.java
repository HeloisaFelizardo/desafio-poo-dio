package br.com.dio.desafio.dominio;

public class Procedimento {
    private int id;
    private String descricao;
    private double preco;

    public Procedimento(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
