package main.java.map.Ordenacao.AgendaDeEventos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criar instância de AgendaEventos
        AgendaEventos agenda = new AgendaEventos();

        // Adicionar alguns eventos
        agenda.adicionarEvento(LocalDate.of(2024, 7, 1), "Concerto de Rock", "Banda XYZ");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 25), "Feira de Tecnologia", "Empresas Tech");
        agenda.adicionarEvento(LocalDate.of(2024, 8, 15), "Festival de Cinema", "Filmes Independentes");
        agenda.adicionarEvento(LocalDate.of(2024, 7, 10), "Conferência de Saúde", "Especialistas em Saúde");

        // Exibir a agenda de eventos
        System.out.println("Agenda de Eventos:");
        agenda.exibirAgenda();

        // Obter o próximo evento a partir da data atual
        System.out.println("\nPróximo Evento:");
        agenda.obterProxEvento();
    }
}
