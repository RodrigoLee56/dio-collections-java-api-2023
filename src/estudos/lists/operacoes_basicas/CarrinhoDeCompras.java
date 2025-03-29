package src.estudos.lists.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i: itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for (Item i : itemList){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.printf("O valor total é: %.2f \n",carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("X-SALADA",10.00, 3);
        carrinhoDeCompras.adicionarItem("Refrigrante 1l",6.00, 1);


        System.out.printf("O valor total é: %.2f \n",carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}
