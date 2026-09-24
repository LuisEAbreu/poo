package engtelecom.poo;

public class Aluno {
    private String nome;
    private Endereco endereco;

    public Aluno(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nome: ").append(nome).append("\n");
        sb.append("endereco: ").append(endereco);

        return sb.toString();
    }
}
