package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public abstract class FormaGeometrica extends Forma{
    public FormaGeometrica(String corDaLinha, int xInicio, int yInicio) {
        super(corDaLinha, new Coordenada(xInicio, yInicio));
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
