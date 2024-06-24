package main.java.list.Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar instância de CatalogoLivros
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionar livros ao catálogo
        catalogo.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro(new Livro("1984", "George Orwell", 1949));
        catalogo.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);

        // Pesquisar por autor
        System.out.println("Livros de George Orwell:");
        ArrayList<Livro> livrosOrwell = catalogo.pesquisarPorAutor("George Orwell");
        for (Livro livro : livrosOrwell) {
            System.out.println("Título: " + livro.getTitulo() + ", Ano: " + livro.getAno());
        }

        // Pesquisar por intervalo de anos
        System.out.println("\nLivros publicados entre 1940 e 1955:");
        ArrayList<Livro> livrosPeriodo = catalogo.pesquisarPorIntervaloAnos(1940, 1955);
        for (Livro livro : livrosPeriodo) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano: " + livro.getAno());
        }

        // Pesquisar por título
        System.out.println("\nPesquisar livro por título '1984':");
        Livro livro1984 = catalogo.pesquisarPorTitulo("1984");
        if (livro1984 != null) {
            System.out.println("Título: " + livro1984.getTitulo() + ", Autor: " + livro1984.getAutor() + ", Ano: " + livro1984.getAno());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
