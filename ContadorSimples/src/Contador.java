import java.util.Scanner;

/**
 * Este programa solicita dois parâmetros ao usuário e realiza uma contagem a partir do primeiro até o segundo parâmetro.
 * Caso o segundo parâmetro seja menor ou igual ao primeiro, uma exceção é lançada e uma mensagem apropriada é exibida.
 */

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicita e lê o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        // Solicita e lê o segundo parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chama o método para realizar a contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            // Caso os parâmetros sejam inválidos, imprime a mensagem apropriada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            terminal.close(); // Fecha o Scanner para liberar recursos
        }
    }

    /**
     * Realiza uma contagem a partir do primeiro parâmetro até o segundo parâmetro.
     * Lança uma exceção se o primeiro parâmetro for maior que o segundo.
     * 
     * @param parametroUm Primeiro parâmetro para iniciar a contagem
     * @param parametroDois Segundo parâmetro para finalizar a contagem
     * @throws ParametrosInvalidosException Se o segundo parâmetro for menor ou igual ao primeiro
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é maior que o segundo e lança a exceção se necessário
        if (parametroUm > parametroDois) {
            // Exceção personalizada para indicar que os parâmetros fornecidos são inválidos.
            
            throw new ParametrosInvalidosException();
        }
        
        // Calcula a quantidade de números a serem impressos
        int contagem = parametroDois - parametroUm;
        
        // Realiza o loop para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
