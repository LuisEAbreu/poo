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

        if(verificaIsbn(isbn)){
            Livro l = livros.get(isbn);

            IO.println("Título: " + l.getTitulo());
            String novo = IO.readln("Entre com o novo título (padrão: manter o anterior): ");
            l.setTitulo(novo);

            IO.println("Autor: " + l.getAutor());
            novo = IO.readln("Entre com o novo autor (padrão: manter o anterior): ");
            l.setAutor(novo);

            IO.println("Ano da publicacao: " + l.getAnoPublicacao());
            novo = IO.readln("Entre com o novo ano de publicação (padrão: manter o anterior): ");
            if(!novo.isEmpty()) {
                l.setAnoPublicacao(Integer.parseInt(novo));
            }
            return true;
        }
        return false;
    }

    public boolean removerLivro(){
        String isbn = IO.readln("Entre com o ISBN do livro: ");

        if(verificaIsbn(isbn)){
            return livros.remove(isbn) != null;
        }
        return false;
    }

    public int menu(){
        IO.println("""
                === MENU ===
                
                1. Cadastrar um livro;
                2. Listar somente ISBN e título de todos os livros cadastrados.
                3. Consultar um livro pelo ISBN.
                4. Consultar livros por autor.
                5. Consultar livros por ano de publicação.
                6. Atualizar os dados de um livro.
                7. Remover um livro.
                8. Sair do sistema.
                """);

        return Integer.parseInt(IO.readln("Entre com a opção: "));
    }

    public static void main(String[] args) {
        App a = new App();

        int opcao;
        do{
            opcao = a.menu();

            switch (opcao){
                case 1 -> IO.println(a.cadastrarLivro());
                case 2 -> a.listarLivros();
                case 3 -> IO.println(a.consultarLivroPorIsbn());
                case 4 -> a.consultarLivroPorAutor();
                case 5 -> a.consultarLivroPorAno();
                case 6 -> IO.println(a.atualizarDadosLivro());
                case 7 -> IO.println(a.removerLivro());
                case 8 -> IO.println("Saindo do sistema...");
            }
        } while (opcao != 8);
    }
}
