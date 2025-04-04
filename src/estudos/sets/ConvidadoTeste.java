package src.estudos.sets;

public class ConvidadoTeste {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Rodrigo", 100);
        System.out.println(conjuntoConvidados.getConvidados());
    }
}
