package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> numeros;

  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    for (Integer i : numeros) {
      soma += i;
    }

    return soma;
  }

  public int encontrarMaiorNumero() {
    int maior = Integer.MIN_VALUE;
    if(!numeros.isEmpty()){
      for (Integer i : numeros) {
        if(i > maior)
          maior = i;
      }
    }

    else throw new RuntimeException("A lista está vazia!");

    return maior;
  }

  public int encontrarMenorNumero() {
    int menor = Integer.MAX_VALUE;
    if(!numeros.isEmpty()){
      for (Integer i : numeros) {
        if(i < menor)
          menor = i;
      }
    }

    else throw new RuntimeException("A lista está vazia!");

    return menor;
  }

  public List<Integer> exibirNumeros() {
    return this.numeros;
  }

  public static void main(String[] args) {
    
    SomaNumeros somaNumeros = new SomaNumeros();

    
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);

    System.out.println(somaNumeros.encontrarMenorNumero());
    
    somaNumeros.adicionarNumero(0);
    
    System.out.println(somaNumeros.calcularSoma());
    
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);

    System.out.println(somaNumeros.encontrarMaiorNumero());

    System.out.println(somaNumeros.exibirNumeros());
  }
}
