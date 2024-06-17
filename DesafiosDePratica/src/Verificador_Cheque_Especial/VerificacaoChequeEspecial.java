package Verificador_Cheque_Especial;

import java.util.Scanner;

/**
 * Verificação de Cheque Especial
 * 
 * Este programa em Java verifica se uma conta bancária ultrapassou o limite do cheque especial ao tentar realizar um saque.
 * O limite do cheque especial é definido como 500 unidades monetárias.
 * 
 * Entrada:
 * O programa solicita ao usuário que informe o saldo atual da conta bancária e o valor do saque desejado.
 * 
 * Saída:
 * - Se o saque não ultrapassar o saldo disponível, o programa informa que a transação foi realizada com sucesso.
 * - Se o saque ultrapassar o saldo, o programa verifica se o valor do saque ultrapassa o cheque especial (500 unidades monetárias).
 *   - Se ultrapassar, o programa informa que a transação não pode ser realizada devido ao limite excedido.
 *   - Caso contrário, o programa informa que a transação foi realizada com sucesso, utilizando o cheque especial.
 */
public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo atual da conta bancária
        System.out.println("Informe o saldo atual da conta bancária:");
        double saldo = scanner.nextDouble();

        // Solicita o valor do saque desejado
        System.out.println("Informe o valor do saque desejado:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // Imprime mensagem de transação bem-sucedida
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial
            if (Verificar(limiteChequeEspecial, saque - saldo)) {
                // Imprime mensagem de transação bem-sucedida utilizando o cheque especial
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                // Imprime mensagem de transação não realizada devido ao limite excedido
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    /**
     * Verifica se o valor ultrapassa o limite do cheque especial.
     * 
     * @param limite O limite do cheque especial
     * @param valor O valor a ser verificado
     * @return true se o valor não ultrapassar o limite, false caso contrário
     */
    private static boolean Verificar(double limite, double valor) {
        return valor <= limite;
    }
}
