package main.java.list.Pesquisa.SomaDeNumeros;

public class Main {
    public static void main(String[] args) {
        // Criar instância de SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionar números à lista
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(15);

        // Exibir todos os números
        System.out.println("Números na lista:");
        somaNumeros.exibirNumeros();

        // Calcular e exibir a soma dos números
        int soma = somaNumeros.calcularSoma();
        System.out.println("Soma dos números: " + soma);

        // Encontrar e exibir o maior número
        int maiorNumero = somaNumeros.encontrarMaiorNumero();
        System.out.println("Maior número: " + maiorNumero);

        // Encontrar e exibir o menor número
        int menorNumero = somaNumeros.encontrarMenorNumero();
        System.out.println("Menor número: " + menorNumero);
    }
}
