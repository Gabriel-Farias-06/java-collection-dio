package map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
  private Map<String, Livro> livraria;

  public LivrariaOnline() {
    this.livraria = new HashMap<>();
  }

  public void adicionarLivro(String link, Livro livro) {
    this.livraria.put(link, livro);
  }

  public void removerLivro(String titulo) {
    List<String> chavesRemover = new ArrayList<>();
    for(Map.Entry<String, Livro> m: this.livraria.entrySet()) {
      if (m.getValue().getTitulo() == titulo) {
        chavesRemover.add(m.getKey());
        break;
      }
    }

    for (String key : chavesRemover) {
      livraria.remove(key);
    }
  }

  public List<Map.Entry<String, Livro>> exibirLivrosOrdenadosPorPreco() {
    List<Map.Entry<String, Livro>> livrosAOrdenar = new ArrayList<>(livraria.entrySet());
    Collections.sort(livrosAOrdenar, new ComparatorPreco()
    );

    return livrosAOrdenar;
  }

  public List<Map.Entry<String, Livro>> pesquisarLivrosPorAutor(String autor) {
    List<Map.Entry<String, Livro>> livrosPorAutor = new ArrayList<>();
    for(Map.Entry<String, Livro> m: this.livraria.entrySet()) {
      if (m.getValue().getAutor() == autor) {
        livrosPorAutor.add(m);
        break;
      }
    }
    return livrosPorAutor;
  }

  public Map.Entry<String, Livro> obterLivroMaisCaro() {
    List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livraria.entrySet());
    Collections.sort(livrosOrdenados, new ComparatorPreco()
    );

    return livrosOrdenados.getLast();
  }

  public Map.Entry<String, Livro> exibirLivroMaisBarato() {
    List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livraria.entrySet());
    Collections.sort(livrosOrdenados, new ComparatorPreco()
    );

    return livrosOrdenados.getFirst();
  }

  public static void main(String[] args) {
    LivrariaOnline livrariaOnline = new LivrariaOnline();
    // Adiciona os livros à livraria online
    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

    System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

    String autorPesquisa = "Josh Malerman";
    livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

    System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

    System.out.println("Livro mais barato: " + livrariaOnline.exibirLivroMaisBarato());

    livrariaOnline.removerLivro("1984");
    System.out.println(livrariaOnline.livraria);

  }
}