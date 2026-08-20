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
        if (nivelTinta > 0) {
            double distancia = Math.sqrt((xf - xi) ^ 2 + (xf - xi) ^ 2);

            double consumo = distancia * 0.01;
            nivelTinta = nivelTinta - consumo;

            return consumo;
        }
        return -1;
    }
}
