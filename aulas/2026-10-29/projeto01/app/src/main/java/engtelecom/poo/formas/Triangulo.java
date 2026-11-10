package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public class Triangulo extends FormaGeometrica{
    private Coordenada verticeSuperior;
    private Coordenada verticeFinal;

    public Triangulo(String corDaLinha, int xInicio, int yInicio, int xSup, int ySup, int xFim, int yFim) {
        super(corDaLinha, xInicio, yInicio);
        this.verticeSuperior = new Coordenada(xSup, ySup);
        this.verticeFinal = new Coordenada(xFim, yFim);
    }

    @Override
    public String desenhar(){
        StringBuilder sb = new StringBuilder();

        sb.append("Desenhando triangulo ").append(corDaLinha);
        sb.append(" com vertice inicial em ").append(inicio);
        sb.append(", vertice superior em ").append(verticeSuperior);
        sb.append(" e vertice final em ").append(verticeFinal);

        return sb.toString();
    }

    public double getBase(){
        return Math.abs(verticeFinal.x - inicio.x); // implementar
    }

    public double getAltura(){
        return Math.abs(verticeSuperior.y - inicio.y);  // implementar
    }

    @Override
    public double calcularArea() {
        return 0;   // implementar
    }

    @Override
    public double calcularPerimetro() {
        return 0;   // implementar
    }
}
