package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> conjuntoTarefas;

  public ListaTarefas() {
    this.conjuntoTarefas = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    this.conjuntoTarefas.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    for (Tarefa t : conjuntoTarefas) {
      if (t.getDescricao() == descricao) {
        this.conjuntoTarefas.remove(t);
        break;
      }
    }
  }

  public void exibirTarefas() {
    System.out.println(this.conjuntoTarefas);
  }

  public int contarTarefas() {
    return this.conjuntoTarefas.size();
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : conjuntoTarefas) {
      if (t.isConcluida())
        tarefasConcluidas.add(t);
    }

    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for (Tarefa t : conjuntoTarefas) {
      if (!t.isConcluida())
        tarefasPendentes.add(t);
    }

    return tarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa t : conjuntoTarefas) {
      if (t.getDescricao() == descricao)
        t.setConcluida(true);
    }
  }

  public void marcarTarefaPendente(String descricao) {
    for (Tarefa t : conjuntoTarefas) {
      if (t.getDescricao() == descricao)
        t.setConcluida(false);
    }
  }

  public void limparListaTarefas() {
    this.conjuntoTarefas.clear();
  }

  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    listaTarefas.exibirTarefas();

    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    System.out.println(listaTarefas.obterTarefasPendentes());

    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    System.out.println(listaTarefas.obterTarefasConcluidas());

    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}
