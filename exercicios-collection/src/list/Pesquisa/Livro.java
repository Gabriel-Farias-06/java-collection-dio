package list.Pesquisa;

public class Livro {
  private String titulo;
  private String autor;
  private int anoPublicacao;

  public Livro (String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  protected String getTitulo() {
      return titulo;
  }

  protected String getAutor() {
      return autor;
  }

  protected int getAnoPublicacao() {
      return anoPublicacao;
  }

  @Override
  public String toString() {
    return "livro { titulo " + this.titulo + " autor " + this.autor + " anoPublicacao " + this.anoPublicacao + " }";
  }
}
