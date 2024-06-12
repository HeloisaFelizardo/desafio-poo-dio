package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Set;

public class Consulta {
    private int id;
    private Paciente paciente;
    private Dentista dentista;
    private LocalDate data;
    private LocalTime hora;
    private Set<Procedimento> procedimentos;

    public Consulta(int id, Paciente paciente, Dentista dentista, LocalDate data, LocalTime hora, Set<Procedimento> procedimentos) {
        this.id = id;
        this.paciente = paciente;
        this.dentista = dentista;
        this.data = data;
        this.hora = hora;
        this.procedimentos = new LinkedHashSet<>(procedimentos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public String getData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Set<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(Set<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public double calcularCustoTotal() {
        return procedimentos.stream().mapToDouble(Procedimento::getPreco).sum();
    }


}
