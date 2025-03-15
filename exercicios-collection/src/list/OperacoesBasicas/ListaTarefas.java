package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
  private List<Tarefa> tarefas;

  public ListaTarefas() {
    this.tarefas = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    this.tarefas.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasARemover = new ArrayList<>();
    for (Tarefa t : tarefas) {
      if(t.getDescricao().equalsIgnoreCase(descricao))
      tarefasARemover.add(t);
    }

    this.tarefas.removeAll(tarefasARemover);
  }

  public int obterNumeroTotalTarefas() {
    return this.tarefas.size();
  }

  public String obterDescricoesTarefas() {
    return this.tarefas.toString();
  }

  public static void main(String[] args) {
    ListaTarefas casa = new ListaTarefas();
    casa.adicionarTarefa("Lavar Louça");
    casa.adicionarTarefa("Cozinhar");
    casa.adicionarTarefa("Lavar a Casa");
    System.out.println(casa.obterNumeroTotalTarefas());
    System.out.println(casa.obterDescricoesTarefas());
    casa.removerTarefa("Lavar Louça");
    System.out.println(casa.obterNumeroTotalTarefas());
    System.out.println(casa.obterDescricoesTarefas());
  }
}
