package list.OperacoesBasicas;

public class Tarefa {
  private String descricao;

  protected Tarefa(String descricao) {
    this.descricao = descricao;
  }

  protected String getDescricao() {
      return descricao;
  }

  @Override
  public String toString() {
    return "descrição: " + descricao;
  }

}
