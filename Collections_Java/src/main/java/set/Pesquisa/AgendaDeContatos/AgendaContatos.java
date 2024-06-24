package main.java.set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> agenda;

    AgendaContatos(){
        this.agenda = new HashSet<Contato>();
    }

    public void adicionarContato(Contato contato) {
        this.agenda.add(contato);
    }

    public void adicionarContato(String nome, int numero) {
        Contato contato = new Contato(nome, numero);
        this.agenda.add(contato);
    }

    public void exibirContatos(){
        for(Contato contato : this.agenda){
            System.out.println(contato.toString());
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatos = new HashSet<Contato>();
        for(Contato contato : this.agenda){
            if(contato.getNome().equals(nome)){
                contatos.add(contato);
            }
        }
        return contatos;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for(Contato contato : this.agenda){
            if(contato.getNome().equals(nome)){
                contato.setNumero(novoNumero);
                break;
            }
        }
    }

}
