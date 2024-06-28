# Diagrama de Classes UML - Banco Java

```mermaid
classDiagram
    class Banco {
        -Set<Cliente> clientes;

        +void adicionarCliente(Cliente cliente)
        +Cliente buscarCliente(Cliente clienteBuscar)
        +void removerCliente(Cliente cliente)

    }

    class Operacoes {
        <<interface>>
        +void sacar(double valor)
        +void depositar(double valor)
        +void transferir(double valor, Conta contaDestino)
    }

    class Conta{
        <<abstract>>
        #double saldo;
        #String agencia;
        #Cliente cliente;
        #String extrato;
        #MapaDeGastos mapaDeGastos;
        
        +double getSaldo()
        +String getAgencia()
        +Cliente getCliente()
        +MapaDeGastos getMapaDeGastos()
        +void exibirExtrato()
        +abstract String tipoConta()
    }

    class ContaCorrente {
        -double chequeEspecial;
        -double limiteCredito;
        -int limiteSaques;
        
        +double getChequeEspecial()
        +double getLimiteCredito()
        +int getLimiteSaques()
        -void setCredito()
    }

    class ContaPoupanca {
        -static final double TAXA_RENDIMENTO = 0.01;

        +void aplicarTaxa()
    }

    class ContaSalario{

    }

    class Cliente {
        <<abstract>>
        #String nome;
        #String email;
        #String endereco;
        #Set<Conta> contas;
        protected static Set<String> emailsCadastrados;

        +String getNome()
        +String getEmail()
        +String getEndereco()
        +Set<Conta> getContas()
        +adicionarConta(Conta conta)
        +removerConta(Conta conta)
    }

    class Empresa{
        -String cnpj;
        -Set<Pessoal> funcionarios;

        +String getCnpj()
        +Set<Funcionario> getFuncionarios()
        +void adicionarFuncionario(Funcionario funcionario)
        +void removerFuncionario(Funcionario funcionario)
        +boolean pagarFuncionarios()
        +void exibirFolhaPagamento()

    }

    class Funcionario{
        -String nome;
        -String cargo;
        -double salario;
        -Conta contaPagamento;

        +String getNome()
        +String getCargo()
        +double getSalario()
        +Conta getContaPagamento()

    }

    class Pessoal{
        -String cpf;
        -static Set<String> cpfsCadastrados;
        
        +String getcpf()
    }

    class MapaDeGastos{
        -Map<String, double> gastos;
        
        +void adicionarGasto(String categoria, double valor)
        +void exibirGastos()
    }

    Banco "1" *--  Cliente 
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Conta <|-- ContaSalario
    Conta ..|> Operacoes
    Cliente "1" *-->  Conta 
    Cliente ..|> Empresa
    Cliente ..|> Pessoal
    Cliente ..|> Funcionario
    Conta "1" -- "1" MapaDeGastos
    Empresa "1" *-- Funcionario 
