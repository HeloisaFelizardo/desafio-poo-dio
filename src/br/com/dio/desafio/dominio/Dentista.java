package br.com.dio.desafio.dominio;

public class Dentista extends Pessoa {
    final private String especialidade;

    public Dentista(int id, String nome, String telefone, String especialidade) {
        super(id, nome, telefone);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String getDetalhes() {
        return "Dentista: " + getNome() + ", Especialidade: " + getEspecialidade();
    }
}
