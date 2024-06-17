package Verificador_Idade;

import java.util.Scanner;

/**
 * Verificador de Elegibilidade para Conta Bancária
 * 
 * Este programa em Java verifica se um cliente é elegível para criar uma conta bancária com base na idade.
 * O cliente deve ter pelo menos 18 anos para ser considerado elegível.
 * 
 * Entrada:
 * O programa solicita ao usuário que digite sua idade.
 * 
 * Saída:
 * - Se a idade for maior ou igual a 18, o programa informa que o cliente é elegível para criar uma conta bancária.
 * - Se a idade for menor que 18, o programa informa que o cliente não é elegível para criar uma conta bancária.
 */
public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite sua idade
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        // Verifica se o cliente é elegível com base na idade
        boolean elegivel = Verificar(idade);
        
        // Exibe mensagem de acordo com a elegibilidade
        if (elegivel) {
            System.out.println("Você está elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não está elegível para criar uma conta bancária.");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    /**
     * Verifica se o cliente é elegível para criar uma conta bancária.
     * O cliente deve ter pelo menos 18 anos para ser elegível.
     * 
     * @param idade Idade do cliente a ser verificada
     * @return true se o cliente tiver 18 anos ou mais, false caso contrário
     */
    private static boolean Verificar(int idade) {
        return idade >= 18;
    }
}
