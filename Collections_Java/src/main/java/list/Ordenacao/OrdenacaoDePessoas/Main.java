package main.java.list.Ordenacao.OrdenacaoDePessoas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar instância de OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionar pessoas
        ordenacaoPessoa.adicionarPessoa("Alice", 25, 1.65);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.75);
        ordenacaoPessoa.adicionarPessoa("Charlie", 22, 1.80);
        ordenacaoPessoa.adicionarPessoa("Diana", 28, 1.70);

        // Exibir lista original
        System.out.println("Lista original:");
        for (Pessoa pessoa : ordenacaoPessoa.ordenarPorIdade()) {
            System.out.println(pessoa);
        }

        // Ordenar e exibir por idade
        List<Pessoa> pessoasPorIdade = ordenacaoPessoa.ordenarPorIdade();
        System.out.println("\nLista ordenada por idade:");
        for (Pessoa pessoa : pessoasPorIdade) {
            System.out.println(pessoa);
        }

        // Ordenar e exibir por altura
        List<Pessoa> pessoasPorAltura = ordenacaoPessoa.ordenarPorAltura();
        System.out.println("\nLista ordenada por altura:");
        for (Pessoa pessoa : pessoasPorAltura) {
            System.out.println(pessoa);
        }
    }
}
