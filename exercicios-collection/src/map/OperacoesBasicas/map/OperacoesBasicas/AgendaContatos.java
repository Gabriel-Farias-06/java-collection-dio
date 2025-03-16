package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agenda;

  public AgendaContatos() {
    this.agenda = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer contato) {
    this.agenda.put(nome, contato);
  }

  public void removerContato(String nome) {
    this.agenda.remove(nome);
  } 

  public void exibirContatos() {
    System.out.println(this.agenda);
  }

  public int pesquisarPorNome(String nome) {
    if(!this.agenda.isEmpty() && this.agenda.containsKey(nome))
      return this.agenda.get(nome);
    else return -1;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("João", 5665);
    agendaContatos.adicionarContato("Carlos", 1111111);
    agendaContatos.adicionarContato("Ana", 654987);
    agendaContatos.adicionarContato("Maria", 1111111);
    agendaContatos.adicionarContato("Camila", 44444);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Maria");
    agendaContatos.exibirContatos();

    String nomePesquisa = "João";
    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }
}
