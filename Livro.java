public class Livro {
    String titulo;
    Autor autor;

    Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void exibirDetalhes() {
        System.out.printf("Livro: %s | Autor: %s (%s)%n",
                titulo, autor.nome, autor.nacionalidade);
    }
}
