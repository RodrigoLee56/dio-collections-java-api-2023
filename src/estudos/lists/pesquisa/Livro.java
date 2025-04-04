package src.estudos.lists.pesquisa;

public class Livro {
    /*
    * 1. Catálogo de Livros
    * Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título,
    * autor e ano de publicação. Implemente os seguintes métodos:
    * adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
    * pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    * pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    * pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
    */
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\nLivro{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", anoPublicacao=").append(anoPublicacao);
        sb.append("}\n");
        return sb.toString();
    }

}
