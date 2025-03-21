package map.Pesquisa;

public class Produto {
  private String nome;
  private int quantidade;
  private double preco;

  public Produto(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public int getQuantidade() {
      return quantidade;
  }

  public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
  }

  public double getPreco() {
      return preco;
  }

  public void setPreco(double preco) {
      this.preco = preco;
  }

  
  @Override
  public String toString() {
    return "produto{ nome " + this.nome + " quantidade " + this.quantidade + " preco " + this.preco + " }";
  }
}
