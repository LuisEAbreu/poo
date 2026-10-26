package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public class Retangulo extends FormaGeometrica {
    private Coordenada fim;

    public Retangulo(String corDaLinha, int xInicio, int yInicio, int xFim, int yFim) {
        super(corDaLinha, xInicio, yInicio);
        this.fim = new Coordenada(xFim, yFim);
    }

    @Override
    public String desenhar(){
        StringBuilder sb = new StringBuilder();

        sb.append("Desenhando retângulo ").append(corDaLinha);
        sb.append(" com largura ").append(getLargura());
        sb.append(" e altura ").append(getAltura());

        return sb.toString();
    }

    public double getLargura(){
        return Math.abs(fim.x - inicio.x);
    }

    public double getAltura(){
        return Math.abs(fim.y - inicio.y);
    }

    @Override
    public double calcularArea(){
        return getAltura() * getLargura();
    }

    @Override
    public double calcularPerimetro(){
        return 2 * getAltura() + 2 * getLargura();
    }
}
