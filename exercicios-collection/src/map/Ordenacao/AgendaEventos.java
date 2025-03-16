package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> agenda;

  public AgendaEventos() {
    this.agenda = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    this.agenda.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> agendaCrescente = new TreeMap<>(agenda);
    System.out.println(agendaCrescente);
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    Map<LocalDate, Evento> agendaCrescente = new TreeMap<>(agenda);
    for (Map.Entry<LocalDate, Evento> m: agendaCrescente.entrySet()) {
      if(m.getKey().isEqual(dataAtual) || m.getKey().isAfter(dataAtual))
        System.out.println("O próximo evento: " + m.getValue() + "acontecerá na data: " + m.getKey());
        break;
    }
  }

    public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();
  }
}
