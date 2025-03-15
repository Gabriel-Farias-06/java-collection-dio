package set.Pesquisa;

import java.util.TreeSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> agenda;

  public AgendaContatos() {
    this.agenda = new TreeSet<>();
  }

  public void adicionarContatos(String nome, int numero) {
    this.agenda.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(this.agenda);
  }

  public Contato pesquisarPorNome(String nome) {
    for (Contato c : agenda) {
      if (c.getNome().equalsIgnoreCase(nome))
        return c;
    }
    
    return null;
  }

  public void atualizarNumeroContato(String nome, int novoNumero) {
    for (Contato c : agenda) {
      if(c.getNome().equalsIgnoreCase(nome)) {
        c.setNome(nome);
        c.setNumero(novoNumero);
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaContatos minhaAgenda = new AgendaContatos();
    minhaAgenda.adicionarContatos("Júlia", 932458703);
    minhaAgenda.adicionarContatos("Jeferson", 989045834);
    minhaAgenda.adicionarContatos("Pedro", 989436037);
    minhaAgenda.adicionarContatos("Carlos", 932458703);
    minhaAgenda.atualizarNumeroContato("Júlia", 954786523);
    minhaAgenda.pesquisarPorNome("Júlia");
    minhaAgenda.exibirContatos();
  }
}
