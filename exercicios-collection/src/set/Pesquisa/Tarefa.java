package set.Pesquisa;

public class Tarefa {
  private String descricao;
  private boolean concluida;

  Tarefa(String descricao) {
      this.descricao = descricao;
      this.concluida = false;
  }

  public String getDescricao() {
      return descricao;
  }

  public boolean isConcluida() {
      return concluida;
  }

  public void setConcluida(boolean concluida) {
      this.concluida = concluida;
  }

  @Override
  public String toString() {
    return "tarefa{ descricao: " + this.descricao + " }";
  }
}
