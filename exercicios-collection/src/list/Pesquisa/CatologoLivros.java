package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatologoLivros {
  private List<Livro> livros;

  public CatologoLivros() {
    livros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    if(livros.isEmpty()) return null;
    List<Livro> livrosPorAutor = new ArrayList<>();
    for (Livro l : livros) {
      if (l.getAutor().equalsIgnoreCase(autor))
        livrosPorAutor.add(l);
    }

    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    if(livros.isEmpty()) return null;
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    for (Livro l : livros) {
      if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
        livrosPorIntervaloAnos.add(l);
    }

    return livrosPorIntervaloAnos;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    if(livros.isEmpty()) return null;
    Livro livroPorTitulo = null;
    for (Livro l : livros) {
      if (l.getTitulo().equalsIgnoreCase(titulo)) {
        livroPorTitulo = l;
        break;
      }

      return livroPorTitulo;
    }

    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatologoLivros fantasia = new CatologoLivros();
    fantasia.adicionarLivro("A lebre e a Raposa", "Monteiro Lobato", 1980);
    fantasia.adicionarLivro("Harry Potter", "JK Rowling", 1996);
    fantasia.adicionarLivro("Turma da Mônica Jovem", "Maurício de Sousa", 2013);
    fantasia.adicionarLivro("Turma da Mônica - Tesouro Pirata", "Maurício de Sousa", 2011);
    System.out.println(fantasia.pesquisarPorAutor("Maurício de Sousa").toString());
    System.out.println(fantasia.pesquisarPorTitulo("A lebre e a Raposa").toString());
    System.out.println(fantasia.pesquisarPorIntervaloAnos(1996, 2012).toString());

  }
}
