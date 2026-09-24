package engtelecom.poo;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String rua, String numero, String bairro, String cidade, String uf) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(rua).append(", ").append(numero).append(" - ");
        sb.append(bairro).append(", ").append(cidade).append("/").append(uf);

        return sb.toString();
    }
}
