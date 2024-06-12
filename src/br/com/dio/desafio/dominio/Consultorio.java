package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Consultorio {
    private Set<Paciente> pacientes = new HashSet<>();
    private Set<Dentista> dentistas = new HashSet<>();
    private Set<Consulta> consultas = new LinkedHashSet<>();
    private Set<Procedimento> procedimentos = new HashSet<>();
    private Set<Pagamento> pagamentos = new HashSet<>();

    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void registrarDentista(Dentista dentista) {
        dentistas.add(dentista);
    }

    public void registrarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void registrarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void exibirDetalhesPessoa(Pessoa pessoa) {
        System.out.println(pessoa.getDetalhes());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consultorio that = (Consultorio) o;
        return Objects.equals(pacientes, that.pacientes) && Objects.equals(dentistas, that.dentistas) && Objects.equals(consultas, that.consultas) && Objects.equals(procedimentos, that.procedimentos) && Objects.equals(pagamentos, that.pagamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacientes, dentistas, consultas, procedimentos, pagamentos);
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "pacientes=" + pacientes +
                ", dentistas=" + dentistas +
                ", consultas=" + consultas +
                ", procedimentos=" + procedimentos +
                ", pagamentos=" + pagamentos +
                '}';
    }
}
