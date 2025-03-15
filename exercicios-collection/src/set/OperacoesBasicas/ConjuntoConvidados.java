package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidados;

  public ConjuntoConvidados() {
    this.convidados = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    this.convidados.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    for (Convidado c : convidados) {
      if (c.getCodigoConvite() == codigoConvite) {
        this.convidados.remove(c);
        break;
      }
    }
  }

  public int contarConvidados() {
    return this.convidados.size();
  }

  public void exibirConvidados() {
    System.out.println(this.convidados);
  }

  public static void main(String[] args) {
    ConjuntoConvidados festa = new ConjuntoConvidados();
    festa.adicionarConvidado("Carlos", 1);
    festa.adicionarConvidado("Diego", 2);
    festa.adicionarConvidado("Pedro", 3);
    festa.adicionarConvidado("Sophia", 3);
    festa.removerConvidadoPorCodigoConvite(2);
    festa.exibirConvidados();
    System.out.println(festa.contarConvidados());
  }
}
