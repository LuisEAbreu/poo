package engtelecom.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;
    private final double CONSUMO;

    public Caneta(String cor, double nivelTinta, double CONSUMO) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
        this.CONSUMO = CONSUMO;
    }

    public Caneta(String cor, double nivelTinta){
        this(cor, nivelTinta, 0.01);
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

    public double desenhar(int xi, int xf, int yi, int yf){
            double distancia = Math.sqrt((xf - xi) ^ 2 + (yf - yi) ^ 2);

            double consumido = distancia * CONSUMO;

        if (nivelTinta >= consumido) {
            nivelTinta = nivelTinta - consumido;

            return consumido;
        }
        return -1;
    }
}
