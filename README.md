# Desafio POO Dio

Neste desafio, você poderá desenvolver sua capacidade de abstração com um problema real e implementar as evoluções que achar interessantes:

# Sistema de Gerenciamento de Consultório Odontológico

Este sistema é projetado para gerenciar as operações diárias de um consultório odontológico, facilitando a organização de pacientes, dentistas, consultas, procedimentos e pagamentos.

## Funcionalidades

- **Gerenciamento de Pacientes**: Cadastro e manutenção de informações dos pacientes, incluindo identificação, nome, endereço, telefone e data de nascimento.
- **Gerenciamento de Dentistas**: Registro e controle dos dentistas, com detalhes como identificação, nome, especialidade e telefone.
- **Agendamento de Consultas**: Possibilidade de agendar consultas, associando pacientes e dentistas, e definindo data, hora e procedimentos a serem realizados.
- **Registro de Procedimentos**: Cadastro de procedimentos odontológicos disponíveis, com descrição e preço.
- **Processamento de Pagamentos**: Registro de pagamentos realizados, vinculados às consultas e com controle de datas e valores.

## Entidades

### Consultorio
- Mantém listas de `Paciente`, `Dentista`, `Consulta`, `Procedimento` e `Pagamento`.
- Permite agendar consultas e registrar novos pacientes, dentistas, procedimentos e pagamentos.

### Paciente
- Armazena informações pessoais e de contato dos pacientes.

### Dentista
- Contém dados dos dentistas, incluindo sua especialidade.

### Consulta
- Representa uma consulta odontológica, com detalhes do paciente, dentista, data, hora e procedimentos.

### Procedimento
- Define um procedimento odontológico, com sua descrição e preço.

### Pagamento
- Registra os detalhes financeiros de uma consulta, incluindo o valor e a data do pagamento.

## Como Usar

O sistema é projetado para ser intuitivo e fácil de usar, com métodos claros para cada ação necessária. 



