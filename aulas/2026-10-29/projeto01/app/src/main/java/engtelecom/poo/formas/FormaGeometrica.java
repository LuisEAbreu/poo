package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public class FormaGeometrica extends Forma{
    public FormaGeometrica(String corDaLinha, int xInicio, int yInicio) {
        super(corDaLinha, new Coordenada(xInicio, yInicio));
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }
}
