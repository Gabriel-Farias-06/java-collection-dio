package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoque;

  public EstoqueProdutos() {
    this.estoque = new HashMap<>();
  }

  public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
    this.estoque.put(cod, new Produto(nome, quantidade, preco));
  }

  public void exibirProdutos() {
    System.out.println(this.estoque);
  }

  public double calcularValorTotalEstoque() {
    if(this.estoque.isEmpty())
      return 0;
    double valorTotal = 0;
    for (Produto p : this.estoque.values()) {
      valorTotal += (p.getPreco() * p.getQuantidade());
    }

    return valorTotal;
  }

  public Produto obterProdutoMaisCaro() {
    if(this.estoque.isEmpty())
      return null;
    Produto maisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for (Produto p : this.estoque.values()) {
      if (maiorPreco < p.getPreco()) {
        maisCaro = p;
        maiorPreco = p.getPreco();
      }
    }
    
    return maisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    if(this.estoque.isEmpty())
      return null;
    Produto maisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    for (Produto p : this.estoque.values()) {
      if (menorPreco > p.getPreco()) {
        maisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    
    return maisBarato;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();

    estoque.exibirProdutos();

    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

    estoque.exibirProdutos();

    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);

    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaisCaro();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
  }
}
