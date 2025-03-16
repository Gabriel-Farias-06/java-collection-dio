package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  Map<String, Integer> contador;

  public ContagemPalavras() {
    this.contador = new HashMap<>();
  }

  public void adicionarPalavras(String palavra, int contagem) {
    this.contador.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    this.contador.remove(palavra);
  }

  public int exibirContagemPalavras() {
    int contagem = 0;

    for (Integer i : contador.values()) {
      contagem += i;
    }

    return contagem;
  }

  public String encontrarPalavrasMaisFrequente() {
    String palavraFrequente = null;
    int maiorFrequencia = Integer.MIN_VALUE;

    for (Map.Entry<String, Integer> m : contador.entrySet()) {
      if (m.getValue() > maiorFrequencia) {
        palavraFrequente = m.getKey();
        maiorFrequencia = m.getValue();
      }
    }

    return palavraFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemLinguagens = new ContagemPalavras();

    contagemLinguagens.adicionarPalavras("Java", 2);
    contagemLinguagens.adicionarPalavras("Python", 8);
    contagemLinguagens.adicionarPalavras("JavaScript", 1);
    contagemLinguagens.adicionarPalavras("C#", 6);

    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
  }
}
