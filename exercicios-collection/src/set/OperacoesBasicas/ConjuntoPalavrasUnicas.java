package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> palavras;

  public ConjuntoPalavrasUnicas() {
    this.palavras = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    this.palavras.add(palavra);
  }

  public void removerPalavra(String palavra) {
    this.palavras.remove(palavra);
  }

  public void verificarPalavra(String nome) {
    System.out.println(this.palavras.contains(nome));
  }

  public void exibirPalavrasUnicas() {
    System.out.println(this.palavras);
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas anagrama = new ConjuntoPalavrasUnicas();
    anagrama.adicionarPalavra("Banana");
    anagrama.adicionarPalavra("Nabana");
    anagrama.adicionarPalavra("Nanaba");
    anagrama.adicionarPalavra("Abanna");
    anagrama.removerPalavra("Nanaba");
    anagrama.verificarPalavra("Abanna");
    anagrama.verificarPalavra("Nanaba");
    anagrama.exibirPalavrasUnicas();
    
  }
}
