package main.java.list.Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;

public class CatalogoLivros {

    private ArrayList<Livro> lista_livros;

    CatalogoLivros(){
        this.lista_livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        this.lista_livros.add(livro);
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.lista_livros.add(livro);
    }

    public ArrayList<Livro> pesquisarPorAutor(String autor){
        ArrayList<Livro> lista = new ArrayList<Livro>();
        for(Livro livro : this.lista_livros){
            if(livro.getAutor().equals(autor)){
                lista.add(livro);
            }
        }
        return lista;
    }

    public ArrayList<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        ArrayList<Livro> lista = new ArrayList<Livro>();
        for(Livro livro : this.lista_livros){
            if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                lista.add(livro);
            }
        }
        return lista;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for(Livro livro : this.lista_livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }
}
