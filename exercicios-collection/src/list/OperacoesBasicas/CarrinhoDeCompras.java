package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> carrinho;

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    this.carrinho.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> ItensARemover = new ArrayList<>();
    for (Item i : carrinho) {
      if (i.getNome().equalsIgnoreCase(nome)) ItensARemover.add(i);
    }

    carrinho.removeAll(ItensARemover);
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    for (Item i : carrinho) {
      valorTotal += i.getPreco() * i.getQuantidade();
    }

    return valorTotal;
  }

  public void exibirItens() {
    System.out.println(carrinho.toString());
  }

  public static void main(String[] args) {
    CarrinhoDeCompras verduras = new CarrinhoDeCompras();
    verduras.adicionarItem("Alface", 4, 2);
    verduras.adicionarItem("Alface", 4, 1);
    verduras.adicionarItem("Cenoura", 7, 3);
    verduras.exibirItens();
    System.out.println(verduras.calcularValorTotal());
    verduras.removerItem("Alface");
    verduras.exibirItens();
    System.out.println(verduras.calcularValorTotal());
  }
}
