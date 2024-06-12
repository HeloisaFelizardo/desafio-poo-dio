import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();

        // Criando Paciente
        Paciente paciente1 = new Paciente(1, "João Silva", "123456789", "Rua A", LocalDate.of(1990, 1, 1));

        // Criando Dentista
        Dentista dentista1 = new Dentista(1, "Dr. Carlos", "987654321", "Ortodontia");

        //Cadastrando Paciente
        consultorio.registrarPaciente(paciente1);

        // Criando Paciente
        Paciente paciente2 = new Paciente(1, "João Silva", "123456789", "Rua A", LocalDate.of(1990, 1, 1));

        //Cadastrando Paciente
        consultorio.registrarPaciente(paciente2);


        //Cadastrando Dentista
        consultorio.registrarDentista(dentista1);

        // Criando Procedimentos
        Procedimento procedimento1 = new Procedimento(1, "Limpeza", 200.0);
        Procedimento procedimento2 = new Procedimento(2, "Extração", 500.0);

        consultorio.registrarProcedimento(procedimento1);
        consultorio.registrarProcedimento(procedimento2);

        // Criando Conjunto de Procedimentos
        Set<Procedimento> procedimentos = new LinkedHashSet<>();
        procedimentos.add(procedimento1);
        procedimentos.add(procedimento2);

        // Criando Consulta
        LocalDate dataConsulta = LocalDate.of(2024, 7, 22);
        LocalTime horaConsulta = LocalTime.of(10, 0);
        Consulta consulta1 = new Consulta(1, paciente1, dentista1, dataConsulta, horaConsulta, procedimentos);

        //Agendando Consulta
        consultorio.agendarConsulta(consulta1);

        System.out.println();

        // Exibindo detalhes da consulta
        System.out.println("============== Dados da Consulta ==============");
        System.out.println("Consulta ID: " + consulta1.getId());
        System.out.println("Paciente: " + consulta1.getPaciente().getNome());
        System.out.println("Dentista: " + consulta1.getDentista().getNome());
        System.out.println("Data da Consulta: " + consulta1.getData());
        System.out.println("Hora da Consulta: " + consulta1.getHora());

        System.out.println();

        System.out.println("============== Procedimentos ==============");
        consulta1.getProcedimentos().forEach(proc ->
                System.out.println("- " + proc.getDescricao() + ": R$ " + proc.getPreco())
        );
        double totalAPagar = consulta1.calcularCustoTotal();
        System.out.println("Custo Total: R$ " + totalAPagar);

        System.out.println();

        // Exibindo detalhes das pessoas
        System.out.println("============== Dados Pessoais ==============");
        consultorio.exibirDetalhesPessoa(paciente1);
        consultorio.exibirDetalhesPessoa(dentista1);

        //Efetuando pagamento
        LocalDate dataPagamento = LocalDate.now();
        Pagamento pagamento = new Pagamento(1, consulta1, totalAPagar, dataPagamento);

        System.out.println();

        //Dados do pagamento
        System.out.println("============== Dados de Pagamento ==============");
        System.out.println(pagamento);

        //Registrando Pagamento
        consultorio.registrarPagamento(pagamento);
    }
}
