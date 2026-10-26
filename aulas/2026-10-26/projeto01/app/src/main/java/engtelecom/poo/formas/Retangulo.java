package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public class Retangulo extends Forma {
    private Coordenada fim;

    public Retangulo(String corDaLinha, int xInicio, int yInicio, int xFim, int yFim) {
        super(corDaLinha, new Coordenada(xInicio, yInicio));
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

    public double calcularArea(){
        return getAltura() * getLargura();
    }

    public double calcularPerimetro(){
        return 2 * getAltura() + 2 * getLargura();
    }
}
