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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(double nivelTinta) {
        this.nivelTinta = Math.min(Math.max(0, nivelTinta),100);
    }
}
