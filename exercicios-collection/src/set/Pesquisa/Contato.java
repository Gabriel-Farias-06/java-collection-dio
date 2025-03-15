package set.Pesquisa;

import java.util.Objects;

public class Contato implements Comparable<Contato> {
  private String nome;
  private int numero;

  public Contato(String nome, int numero) {
        this.nome = nome;
      this.numero = numero;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public int getNumero() {
      return numero;
  }

  public void setNumero(int numero) {
      this.numero = numero;
  }

  @Override
  public String toString() {
    return "contato{ nome: " + this.nome + "; numero: " + this.numero + " }";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Contato contato)) return false;
    return this.getNumero() == contato.getNumero();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getNumero());
  }

  @Override
  public int compareTo(Contato c) {
    return Integer.compare(c.getNumero(), this.getNumero());
  }
}
