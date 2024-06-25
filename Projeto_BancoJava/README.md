# Diagrama de Classes UML - Banco Java

```mermaid
classDiagram
    class Banco {
        -Map<Cliente, Conta> bancoDados;
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

        +double getSaldo()
        +String getAgencia()
        +Cliente getCliente()
        +Cliente tipoConta()
        +void aplicarTaxas()
    }

    class ContaCorrente {
        -double chequeEspecial;
        -double limiteCredito;
        -int limiteSaques;
        
        +double getChequeEspecial()
        +double getLimiteCredito()
        +int getLimiteSaques()
        +void extratoContaCorrente()
    }

    class ContaPoupanca {
        -static final double TAXA_RENDIMENTO = 0.01;

        +void extratoContaPoupanca()
    }

    class Cliente {
        <<abstract>>
        #String nome;
        #String email;
        #String endereco;
        #List<Conta> contas

        +String getNome()
        +String getEmail()
        +String getEndereco()
        +adicionarConta(Conta conta)
        +removerConta(Conta conta)
    }

    class Empresa{
        -String cnpj;
        -List<Pessoal> funcionarios;

        +String getCnpj()
        +void adicionarFuncionario(Pessoal funcionario)
        +void removerFuncionario(Pessoal funcionario)
        +boolean pagarFuncionarios()
        +void exibirFolhaPagamento()

    }

    class Funcionario{
        -String nome;
        -String cargo;
        -double salario;
        -Conta contaPagamento;

    }

    class Pessoal{
        -String cpf;
        
        +String getcpf()
    }

    class MapaDeGastos{
        -Map<String, double> gastos;

        +void exibirGastos()
    }

    Banco "1" *--  Conta 
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    ContaCorrente ..|> Operacoes
    ContaPoupanca ..|> Operacoes
    Cliente "1" -->  Conta 
    Cliente ..|> Empresa
    Cliente ..|> Pessoal
    Pessoal "1" -- "1" MapaDeGastos
    Empresa "1" *-- Funcionario 
