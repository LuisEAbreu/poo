package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public abstract class Forma {
    protected String corDaLinha;
    protected Coordenada inicio;

    public Forma(String corDaLinha, Coordenada inicio) {
        this.corDaLinha = corDaLinha;
        this.inicio = inicio;
    }

    public abstract String desenhar();
}
