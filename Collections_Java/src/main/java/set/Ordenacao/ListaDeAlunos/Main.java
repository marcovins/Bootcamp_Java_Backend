package main.java.set.Ordenacao.ListaDeAlunos;

public class Main {

    public static void main(String[] args) {
        // Criar instância de GerenciadorAlunos
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        // Adicionar alguns alunos
        gerenciador.adicionarAluno("Alice", 1001, 9.5);
        gerenciador.adicionarAluno("Bob", 1002, 8.2);
        gerenciador.adicionarAluno("Carol", 1003, 7.8);
        gerenciador.adicionarAluno("David", 1004, 8.9);

        // Exibir todos os alunos
        System.out.println("Todos os alunos:");
        gerenciador.exibirAlunos();

        // Remover um aluno
        gerenciador.removerAluno(1003);
        System.out.println("\nAlunos após remover Carol (matrícula 1003):");
        gerenciador.exibirAlunos();

        // Exibir alunos ordenados por nome
        System.out.println("\nAlunos ordenados por nome:");
        gerenciador.exibirAlunosPorNome();

        // Exibir alunos ordenados por nota
        System.out.println("\nAlunos ordenados por nota:");
        gerenciador.exibirAlunosPorNota();
    }
}
