package src.estudos.lists.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : listaNumeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!this.listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

}
