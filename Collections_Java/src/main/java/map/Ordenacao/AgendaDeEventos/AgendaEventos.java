package main.java.map.Ordenacao.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventos;

    AgendaEventos(){
        agendaEventos = new HashMap<LocalDate, Evento>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        agendaEventos.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<LocalDate, Evento>(this.agendaEventos);
        for(LocalDate data : eventosTreeMap.keySet()){
            System.out.println("Evento: " + eventosTreeMap.get(data).toString());
        }
    }

    public void obterProxEvento(){
        
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<LocalDate, Evento>(this.agendaEventos);
        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + 
                entry.getValue().toString() + 
                " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }
}
