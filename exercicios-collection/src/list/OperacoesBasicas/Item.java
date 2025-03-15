package list.OperacoesBasicas;

public class Item {
  private String nome;
  private double preco;
  private int quantidade;

  public Item(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "Item{ nome: " + this.nome + " preco: " + String.format("%.2f", preco)  + " quantidade: " + this.quantidade + " }";
  }

  protected String getNome() {
      return nome;
  }

  protected double getPreco() {
      return preco;
  }

  protected int getQuantidade() {
      return quantidade;
  }
}
