package Operacoes_Bancarias_Switch;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Simulação Bancária em Java
 * 
 * Este programa simula operações bancárias básicas como depósito, saque e consulta de saldo em uma conta virtual.
 * Utiliza um menu interativo com opções numeradas para que o usuário escolha a operação desejada.
 */
public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Configura o Scanner para aceitar ponto como separador decimal
        double saldo = 0;
        DecimalFormat df = new DecimalFormat("#0.0"); // Formato para exibir o saldo com uma casa decimal
        boolean continuar = true;

        System.out.println("Bem-vindo à Simulação Bancária!");

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Realiza um depósito na conta
                    saldo = Depositar(scanner, saldo);
                    Saldo(saldo, df); // Exibe o saldo atualizado
                    break;
                case 2:
                    // Realiza um saque na conta
                    saldo = Sacar(scanner, saldo, df);
                    break;
                case 3:
                    // Exibe o saldo atual da conta
                    Saldo(saldo, df);
                    break;
                case 0:
                    // Encerra o programa
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
        scanner.close(); // Fecha o Scanner ao finalizar o programa
    }

    /**
     * Função para realizar um depósito na conta.
     * 
     * @param scanner Scanner para ler a entrada do usuário
     * @param saldo   Saldo atual da conta
     * @return        Novo saldo após o depósito
     */
    public static double Depositar(Scanner scanner, double saldo) {
        System.out.println("Digite o valor a ser depositado:");
        double valor = scanner.nextDouble();
        return valor + saldo;
    }

    /**
     * Função para realizar um saque na conta, verificando se há saldo suficiente.
     * 
     * @param scanner Scanner para ler a entrada do usuário
     * @param saldo   Saldo atual da conta
     * @param df      DecimalFormat para formatar o saldo na saída
     * @return        Novo saldo após o saque, ou o saldo atual se o saque não puder ser efetuado
     */
    public static double Sacar(Scanner scanner, double saldo, DecimalFormat df) {
        System.out.println("Digite o valor a ser sacado:");
        double valor = scanner.nextDouble();
        if (saldo >= valor) {
            saldo -= valor;
            Saldo(saldo, df); // Exibe o saldo atualizado após o saque
            return saldo;
        } else {
            System.out.println("Saldo insuficiente.");
            return saldo;
        }
    }

    /**
     * Função para exibir o saldo atual da conta formatado com uma casa decimal.
     * 
     * @param saldo Saldo atual da conta
     * @param df    DecimalFormat para formatar o saldo na saída
     */
    public static void Saldo(double saldo, DecimalFormat df) {
        System.out.println("Saldo atual: " + df.format(saldo));
    }
}
