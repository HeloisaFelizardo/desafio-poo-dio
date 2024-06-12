package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente extends Pessoa {
    final private String endereco;
    final private LocalDate dataNascimento;

    public Paciente(int id, String nome, String telefone, String endereco, LocalDate dataNascimento) {
        super(id, nome, telefone);
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }

    @Override
    public String getDetalhes() {
        return "Paciente: " + getNome() + ", Telefone: " + getTelefone() + ", Endereço: " + getEndereco() + ", Data de Nascimento: " + getDataNascimento();
    }
}
