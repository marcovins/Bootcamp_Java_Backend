package org.Implementacao;
import org.Interfaces.AparelhoTelefonico;
import org.Interfaces.NavegadorInternet;
import org.Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet { 

    //ReprodutorMusical
    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando música no Ipod...");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Música selecionada: " + musica);
    }

    //AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Ligação Atendida...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz...");
    }

    //NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo a página: {url}");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Nova aba adicionada...");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando página...");
    }
}
