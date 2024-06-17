package Controle_Saques;

import java.util.Locale;
import java.util.Scanner;

/**
 * Controle Simples de Saques
 * 
 * Este programa auxilia um cliente a realizar saques de uma conta bancária
 * até atingir um limite diário predefinido.
 * 
 * Entrada:
 * O programa solicita ao usuário que informe o limite diário de saque e o valor de cada saque.
 * 
 * Saída:
 * - Para cada saque, o programa verifica se o valor ultrapassa o limite diário.
 * - Se ultrapassar, o programa informa que o limite foi atingido e encerra o loop.
 * - Se não ultrapassar, o programa informa que o saque foi realizado com sucesso e atualiza o limite diário.
 */
public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Define o locale para usar o ponto como separador decimal

        // Solicita o limite diário de saque ao usuário
        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicita o valor do saque ao usuário
            System.out.println("Informe o valor do saque (ou 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            // Verifica se o usuário deseja encerrar as transações
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; // Encerra o loop
            // Verifica se o valor do saque ultrapassa o limite diário
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Encerra o loop
            } else {
                // Atualiza o limite diário e imprime a saída no formato dos exemplos
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
