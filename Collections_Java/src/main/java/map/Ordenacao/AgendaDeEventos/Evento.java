package main.java.map.Ordenacao.AgendaDeEventos;

public class Evento {

    private String nomeEvento;
    private String nomeAtracao;

    Evento(String nomeEvento, String nomeAtracao){
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return " [nome : " + nomeEvento + ", Atracao: " + nomeAtracao + "]";
    }

}
