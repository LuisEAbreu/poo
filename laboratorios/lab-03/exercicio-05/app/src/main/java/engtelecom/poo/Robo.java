package engtelecom.poo;

public class Robo {
    private String nome;
    private int serial;

    private static int contador = 0;

    public Robo(String nome) {
        this.serial = ++contador;
        setNome(nome);
    }

    public Robo() {
        this("Bob");
    }

    public int getSerial() {
        return serial;
    }

    public String getNome() {
        return nome;
    }

    public static int getQuantidadeCriada() {
        return contador;
    }

    public void setNome(String nome) {
        this.nome = (nome != null && !nome.isBlank()) ? nome : "indigente"+serial;
    }

    public String apresentar() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Olá! Meu nome é ").append(nome);
        sb.append(" e meu número de série é ").append(serial);
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome);
        sb.append("\nSerial nº").append(serial);
        return sb.toString();
    }
}
