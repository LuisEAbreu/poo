package engtelecom.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;

    public Caneta(String cor, double nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public Caneta(String cor) {
        this(cor, 100);
    }

    public Caneta() {
        this("preta");
    }
}
