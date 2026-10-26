package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public class FormaGeometrica {
    protected String corDaLinha;
    protected Coordenada inicio;

    public FormaGeometrica(String corDaLinha, Coordenada inicio) {
        this.corDaLinha = corDaLinha;
        this.inicio = inicio;
    }

    public String desenhar(){
        return "";
    }
}
