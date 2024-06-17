package Verificacao_numero_Conta;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

/**
 * Verificador de Número de Conta
 * 
 * Este programa em Java verifica se um número de conta bancária possui exatamente 8 dígitos.
 * Caso o número da conta não tenha exatamente 8 dígitos, uma exceção IllegalArgumentException é lançada.
 * 
 * Entrada:
 * O programa solicita ao usuário que digite o número da conta bancária.
 * 
 * Saída:
 * - Se o número da conta tiver 8 dígitos, o programa informa que é um número de conta válido.
 * - Se o número da conta não tiver 8 dígitos, o programa lança uma exceção e informa que o número de conta é inválido.
 */
public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o número da conta:");
            String numeroConta = scanner.nextLine();

            // Chama o método que verifica se o número da conta é válido
            verificarNumeroConta(numeroConta);
            
            // Se nenhum erro ocorrer, imprime a mensagem de sucesso
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            // Captura a exceção e exibe a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    /**
     * Verifica se o número da conta possui exatamente 8 dígitos.
     * Lança uma IllegalArgumentException se o número de dígitos for diferente de 8.
     * 
     * @param numeroConta Número da conta a ser verificado
     * @throws IllegalArgumentException Se o número de conta não tiver exatamente 8 dígitos
     */
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8) {
            // Lança uma IllegalArgumentException com a mensagem apropriada
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}
