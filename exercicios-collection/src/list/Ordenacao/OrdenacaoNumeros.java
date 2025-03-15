package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<Integer> numeros;

  public OrdenacaoNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public List<Integer> ordenarAscendente() {
    if(this.numeros.isEmpty())
      throw new RuntimeException("A lista está vazia");
    List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
    Collections.sort(numerosAscendente);
    return numerosAscendente;
  }

  public List<Integer> ordenarDescendente() {
    if(this.numeros.isEmpty())
      throw new RuntimeException("A lista está vazia");
    List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
    numerosDescendente.sort(Collections.reverseOrder());
    return numerosDescendente;
  }

  public void exibirNumeros() {
    if(this.numeros.isEmpty())
    throw new RuntimeException("A lista está vazia");
    System.out.println(this.numeros);
  }

  public static void main(String[] args) {
    OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

    ordenacaoNumeros.adicionarNumero(2);
    ordenacaoNumeros.adicionarNumero(5);
    ordenacaoNumeros.adicionarNumero(4);
    ordenacaoNumeros.adicionarNumero(1);
    ordenacaoNumeros.adicionarNumero(99);

    ordenacaoNumeros.exibirNumeros();

    System.out.println(ordenacaoNumeros.ordenarAscendente());

    System.out.println(ordenacaoNumeros.ordenarDescendente());

    ordenacaoNumeros.exibirNumeros();
  }
}
