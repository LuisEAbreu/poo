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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Id: ").append(id);
        sb.append("\nNome: ").append(nome);
        sb.append("\nEmail: ").append(email);

        return sb.toString();
    }
}
