package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public class Forma {
    protected String corDaLinha;
    protected Coordenada inicio;

    public Forma(String corDaLinha, Coordenada inicio) {
        this.corDaLinha = corDaLinha;
        this.inicio = inicio;
    }

    public String desenhar(){
        return "";
    }
}
