package src.estudos.sets;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(codigoConvite, nome));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidados.isEmpty()) {
            for (Convidado convidado : convidados) {
                if (convidado.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = convidado;
                    break;
                }
            }
            convidados.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Convidado> getConvidados() {
        return convidados;
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        if (!convidados.isEmpty()) {
            System.out.println(getConvidados());
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
