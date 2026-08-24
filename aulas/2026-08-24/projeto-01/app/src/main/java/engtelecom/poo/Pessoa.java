package engtelecom.poo;

public class Pessoa {
    private final int id;
    private String nome;
    private String email;

    private static int contador = 0;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = ++contador;
    }
}
