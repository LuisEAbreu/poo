package engtelecom.poo;

public class Pessoa {
    String nome;
    String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("nome: ").append(nome).append('\n');
        sb.append("email: ").append(email);

        return sb.toString();
    }
}
