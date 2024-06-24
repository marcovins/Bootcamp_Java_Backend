package main.java.set.OperacoesBasicas.ConjuntoDeConvidados;

public class Main {
    public static void main(String[] args) {
        // Criar instância de ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Adicionar convidados
        conjuntoConvidados.adicionarConvidado("Alice", 101);
        conjuntoConvidados.adicionarConvidado("Bob", 102);
        conjuntoConvidados.adicionarConvidado("Charlie", 103);
        conjuntoConvidados.adicionarConvidado(new Convidado("Diana", 104));

        // Exibir todos os convidados
        System.out.println("Lista de Convidados:");
        conjuntoConvidados.exibirConvidados();

        // Contar e exibir o número de convidados
        int numeroConvidados = conjuntoConvidados.contarConvidados();
        System.out.println("Número total de convidados: " + numeroConvidados);

        // Remover um convidado por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(103);
        System.out.println("\nLista de Convidados após remover Charlie pelo código de convite:");
        conjuntoConvidados.exibirConvidados();

        // Remover um convidado por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(102);
        System.out.println("\nLista de Convidados após remover Bob pelo código de convite:");
        conjuntoConvidados.exibirConvidados();
    }
}
