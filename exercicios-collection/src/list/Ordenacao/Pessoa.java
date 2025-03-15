package list.Ordenacao;
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public String getNome() {
      return nome;
  }

  public int getIdade() {
      return idade;
  }

  public double getAltura() {
      return altura;
  }

  @Override
  public String toString() {
    return "pessoa{ nome " + this.nome + " idade " + this.idade + " altura " + this.altura + " }";
  }

  @Override
  public int compareTo(Pessoa p) {
    return Integer.compare(this.idade, p.idade);
  }

}

class ComparatorAltura implements Comparator<Pessoa> {

  @Override
  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }
}
