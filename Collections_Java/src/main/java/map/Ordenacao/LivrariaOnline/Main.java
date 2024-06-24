package main.java.map.Ordenacao.LivrariaOnline;

public class Main {
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();
        
        livraria.adicionarLivro("link1", "Java Basics", "Author A", 50.0);
        livraria.adicionarLivro("link2", "Advanced Java", "Author B", 70.0);
        livraria.adicionarLivro("link3", "Java Design Patterns", "Author C", 40.0);
        livraria.adicionarLivro("link4", "Java Performance Tuning", "Author D", 60.0);
        
        System.out.println("Livros ordenados por preço:");
        livraria.exibirLivrosOrdenadosPorPreco();
        
        livraria.removerLivro("Java Basics");
        System.out.println("\nApós remover 'Java Basics':");
        livraria.exibirLivrosOrdenadosPorPreco();
    }
}
