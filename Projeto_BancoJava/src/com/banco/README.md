# Descrição do Projeto de Banco

## Visão Geral
Este projeto implementa um sistema bancário básico utilizando Java, com várias classes para representar clientes, contas e operações bancárias. O sistema permite a criação e gerenciamento de clientes, contas correntes, contas poupança, contas salário e operações bancárias básicas como saques, depósitos e transferências. O sistema também inclui exceções personalizadas para tratar erros comuns, como email, CPF e CNPJ já cadastrados, saldo insuficiente e limite diário de saques excedido.

## Estrutura do Projeto

### Pacotes
- **com.banco**: Contém as classes principais do sistema bancário.
- **com.banco.Cliente**: Contém as classes relacionadas aos clientes.
- **com.banco.Contas**: Contém as classes relacionadas às contas bancárias.
- **com.banco.Excecoes**: Contém as exceções personalizadas.
- **com.banco.MapaDeGastos**: Contém a classe para gerenciamento de gastos.

### Classes Principais

1. **Banco**
   - Gerencia um conjunto de clientes.
   - Métodos para adicionar, buscar e remover clientes.

2. **Cliente**
   - Classe abstrata representando um cliente genérico.
   - Atributos: nome, email, endereço, conjunto de contas, emails cadastrados.
   - Métodos para adicionar e remover contas.

3. **Empresa**
   - Subclasse de Cliente.
   - Atributos: CNPJ, conjunto de funcionários.
   - Métodos para adicionar e remover funcionários.

4. **Funcionario**
   - Subclasse de Cliente.
   - Atributos: nome, cargo, salário, conta para pagamento.

5. **Pessoal**
   - Subclasse de Cliente.
   - Atributos: CPF.

6. **Conta**
   - Classe abstrata representando uma conta bancária.
   - Atributos: saldo, agência, cliente, extrato, mapa de gastos.
   - Métodos abstratos para saques, depósitos e transferências.
   - Implementa a interface Operações.

7. **ContaCorrente**
   - Subclasse de Conta.
   - Atributos: cheque especial, limite de crédito, limite de saques.
   - Métodos para saques, depósitos e transferências com regras específicas.

8. **ContaPoupanca**
   - Subclasse de Conta.
   - Atributo: taxa de rendimento.
   - Método para aplicar taxa de rendimento.

9. **ContaSalario**
   - Subclasse de Conta.
   - Método para garantir que transferências só possam ser feitas para contas do mesmo titular.

10. **MapaDeGastos**
    - Gerencia os gastos do cliente.
    - Métodos para adicionar e exibir gastos.

### Exceções Personalizadas
- **CnpjJaCadastradoException**: Lançada quando um CNPJ já está cadastrado.
- **CpfJaCadastradoException**: Lançada quando um CPF já está cadastrado.
- **EmailJaCadastradoException**: Lançada quando um email já está cadastrado.
- **DailyWithdrawalLimitExceededException**: Lançada quando o limite diário de saques é excedido.
- **InsufficientFundsException**: Lançada quando não há saldo suficiente para uma operação.
- **ContaInvalidaException**: Lançada quando uma transferência é feita para uma conta de um titular diferente.

### Funcionalidades
- **Gerenciamento de Clientes**: Adicionar, buscar e remover clientes.
- **Gerenciamento de Contas**: Criar contas correntes, poupança e salário; realizar saques, depósitos e transferências.
- **Gerenciamento de Funcionários**: Adicionar e remover funcionários para clientes do tipo Empresa.
- **Gerenciamento de Gastos**: Adicionar e exibir gastos categorizados.
- **Tratamento de Exceções**: Exceções personalizadas para cenários comuns de erro.

### Testes
- **JUnit**: Utilização do JUnit para criar testes unitários que validam as principais funcionalidades do sistema, como criação de clientes, adição de contas, operações bancárias e tratamento de exceções.

Este projeto fornece uma base sólida para um sistema bancário simples, mas pode ser expandido para incluir funcionalidades adicionais conforme necessário.
