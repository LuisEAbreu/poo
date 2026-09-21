package engtelecom.poo;

import java.util.HashMap;

public class App {
    private HashMap<String, Livro> livros = new HashMap<>();

    private boolean verificaIsbn(String isbn){
        return livros.containsKey(isbn);
    }

    public boolean cadastrarLivro(){
        String isbn = IO.readln("Entre com o ISBN do livro: ");

        if (verificaIsbn(isbn)){
            return false;
        }

        String titulo = IO.readln("Entre com o título do livro: ");
        String autor = IO.readln("Entre com o autor do livro: ");
        int anoPublicacao = Integer.parseInt(IO.readln("Entre com o ano da publicação do livro: "));

        Livro l = new Livro(isbn, titulo, autor, anoPublicacao);

        livros.put(isbn, l);

        return true;
    }

    public void listarLivros(){
        livros.values().forEach(livro -> IO.println(livro.retornaIsbnTitulo()));
    }

    public boolean consultarLivroPorIsbn(){
        String isbn = IO.readln("Entre com o ISBN do livro: ");

        if (verificaIsbn(isbn)){
            IO.println(livros.get(isbn));
            return true;
        }
        return false;
    }

    public void consultarLivroPorAutor(){
        String autor = IO.readln("Entre com o autor do livro: ");

        livros.values().forEach(l -> {
            if (l.getAutor().equals(autor)){
                IO.println(l.retornaIsbnTitulo());
            }
        });
    }

    public void consultarLivroPorAno(){
        int ano = Integer.parseInt(IO.readln("Entre com o ano da publicação do livro: "));

        livros.values().forEach(l -> {
            if (l.getAnoPublicacao() == ano){
                IO.println(l.retornaIsbnTitulo());
            }
        });
    }

    public boolean atualizarDadosLivro(){
        String isbn = IO.readln("Entre com o ISBN do livro: ");
    }

    public static void main(String[] args) {
        App a = new App();

        IO.println(a.cadastrarLivro());
        IO.println(a.cadastrarLivro());
        IO.println(a.cadastrarLivro());

//        a.listarLivros();
//        a.consultarLivroPorIsbn();
//        a.consultarLivroPorAutor();
        a.consultarLivroPorAno();
    }
}
