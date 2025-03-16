package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionario;

  public Dicionario() {
    this.dicionario = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    this.dicionario.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    this.dicionario.remove(palavra);
  }

  public void exibirPalavras() {
    System.out.println(this.dicionario);
  }

  public String pesquisarPorPalavra(String palavra) {
    if(!this.dicionario.isEmpty() && this.dicionario.containsKey(palavra))
      return this.dicionario.get(palavra);
    else
      return "Palavra não existente no dicionário";
  }
  
  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

    // Exibir todas as palavras
    dicionario.exibirPalavras();

    String definicaoJava = dicionario.pesquisarPorPalavra("java");
    System.out.println("Definição da linguagem 'java': " + definicaoJava);

    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
    System.out.println(definicaoCSharp);

    dicionario.removerPalavra("typescript");
    dicionario.exibirPalavras();
  }
}
