import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

/**
 * Programa para criar uma conta bancária coletando dados do usuário.
 * Inclui número da conta, nome do cliente, saldo e agência.
 * Utiliza Scanner para entrada de dados e trata exceções de entrada inválida.
 */
class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", agencia=" + agencia + ", nomeCliente=" + nomeCliente + ", saldo=" + saldo + "]";
    }
}

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Define o locale para usar o ponto como separador decimal

        try {
            Conta conta = new Conta();
            receber(scanner, conta); // Chama o método para receber os dados da conta
            System.out.println("Conta criada com sucesso!");
            System.out.println(conta); // Imprime os detalhes da conta
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao receber os dados: " + e.getMessage());
        } finally {
            scanner.close(); // Fecha o Scanner para liberar recursos
        }
    }

    /**
     * Recebe os dados de uma conta bancária do usuário.
     * 
     * @param scanner Objeto Scanner para leitura da entrada do usuário
     * @param conta Objeto Conta a ser preenchido com os dados fornecidos pelo usuário
     * @throws Exception Caso ocorra um erro na leitura dos dados
     */
    public static void receber(Scanner scanner, Conta conta) throws Exception {
        try {
            // Lê o número da conta
            System.out.print("Digite o Número da conta: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Número inválido. Tente novamente.");
                scanner.next(); // Limpa a entrada inválida
                System.out.print("Digite o Número da conta: ");
            }
            conta.numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do int

            // Lê o nome do cliente
            System.out.print("Digite o Nome do Cliente: ");
            conta.nomeCliente = scanner.nextLine();

            // Lê o saldo da conta
            System.out.print("Digite o Saldo: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Saldo inválido. Tente novamente.");
                scanner.next(); // Limpa a entrada inválida
                System.out.print("Digite o Saldo: ");
            }
            conta.saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do double

            // Lê a agência da conta
            System.out.print("Digite a Agência: ");
            conta.agencia = scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new Exception("Erro ao ler os dados da conta. Tipo de dado incorreto.", e);
        } catch (Exception e) {
            throw new Exception("Erro ao ler os dados da conta.", e);
        }
    }
}
