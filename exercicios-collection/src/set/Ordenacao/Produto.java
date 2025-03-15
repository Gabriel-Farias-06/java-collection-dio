package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
  private long cod;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(long cod, String nome, double preco, int quantidade) {
      this.cod = cod;
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
  }

  
  public long getCod() {
    return cod;
  }

  public void setCod(long cod) {
      this.cod = cod;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public double getPreco() {
      return preco;
  }

  public void setPreco(double preco) {
      this.preco = preco;
  }

  public int getQuantidade() {
      return quantidade;
  }

  public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produto produto)) return false;
    return (produto.getCod() == this.getCod());
  }

  @Override
  public int hashCode() {
    return Long.hashCode(this.getCod());
  }

  @Override
  public String toString() {
    return "produto{ codigo " + this.cod + " nome " + this.nome + " preco " + this.preco + " quantidade " + this.quantidade + " }";
  }


  @Override
  public int compareTo(Produto p) {
    return this.getNome().compareToIgnoreCase(p.getNome());
  }

}
  class ComparatorPorPreco implements Comparator<Produto> {

  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
    }
  } 
