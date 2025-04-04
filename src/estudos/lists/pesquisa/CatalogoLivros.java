package src.estudos.lists.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    /*
     * 1. Catálogo de Livros
     * Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título,
     * autor e ano de publicação.
     *
     * Implemente os seguintes métodos:
     *
     * adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
     * pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
     * pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
     * pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
     */
    private List<Livro> livroList;

    public CatalogoLivros() { this.livroList = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Susan J. Fowler"));

//        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

//        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

//        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

//        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

//        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
