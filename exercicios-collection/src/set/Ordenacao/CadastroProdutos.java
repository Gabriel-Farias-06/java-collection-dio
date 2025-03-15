package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  private Set<Produto> cadastro;

  public CadastroProdutos() {
    this.cadastro = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    this.cadastro.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(cadastro);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(cadastro);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

    System.out.println(cadastroProdutos.cadastro);

    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
  }
}
