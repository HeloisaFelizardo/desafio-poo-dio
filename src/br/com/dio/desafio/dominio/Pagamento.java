package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pagamento {
    private int id;
    private Consulta consulta;
    private double valor;
    private LocalDate dataPagamento;

    public Pagamento(int id, Consulta consulta, double valor, LocalDate dataPagamento) {
        this.id = id;
        this.consulta = consulta;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Id: " + id + "\n" +
                "Valor: R$ " + String.format("%.2f", valor) + "\n" +
                "Data do pagamento: " + dataPagamento.format(formatterData);
    }
}
