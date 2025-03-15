package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  private List<Pessoa> grupo;

  public OrdenacaoPessoas() {
    this.grupo = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    this.grupo.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    if(this.grupo.isEmpty())
      throw new RuntimeException("A lista está vazia");
    List<Pessoa> pessoasPorIdade = new ArrayList<>(grupo);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;    
  }
  
  public List<Pessoa> ordenarPorAltura() {
    if(this.grupo.isEmpty())
      throw new RuntimeException("A lista está vazia");
    List<Pessoa> pessoasPorAltura = new ArrayList<>(grupo);
    Collections.sort(pessoasPorAltura, new ComparatorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    System.out.println(ordenacaoPessoas.grupo);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}
