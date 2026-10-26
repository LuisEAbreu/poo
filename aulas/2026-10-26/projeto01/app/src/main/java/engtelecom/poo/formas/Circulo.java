package engtelecom.poo.formas;

public class Circulo extends FormaGeometrica {
    private int raio;

    public Circulo(String corDaLinha, int xInicio, int yInicio, int raio) {
        super(corDaLinha, xInicio, yInicio);
        this.raio = raio;
    }

    @Override
    public String desenhar(){
        StringBuilder sb = new StringBuilder();

        sb.append("Desenhando círculo ").append(corDaLinha);
        sb.append(" com centro em ").append(this.inicio);
        sb.append(" e raio ").append(raio);

        return sb.toString();
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
