package engtelecom.poo;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String isbn, String titulo, String autor, int anoPublicacao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("ISBN: ").append(isbn);
        sb.append("\nTítulo: ").append(titulo);
        sb.append("\nAutor: ").append(autor);
        sb.append("\nAno de publicação: ").append(anoPublicacao);

        return sb.toString();
    }

    public String retornaIsbnTitulo() {
        final StringBuilder sb = new StringBuilder();

        sb.append("ISBN: ").append(isbn);
        sb.append(" Título: ").append(titulo);

        return sb.toString();
    }

}
