package engtelecom.poo.formas;

import engtelecom.poo.Coordenada;

public class Linha extends Forma {
    private Coordenada fim;

    public Linha(String corDaLinha, int xInicio, int yInicio, int xFim, int yFim) {
        super(corDaLinha, new Coordenada(xInicio, yInicio));
        this.fim = new Coordenada(xFim, yFim);
    }

    @Override
    public String desenhar(){
        StringBuilder sb = new StringBuilder();

        sb.append("Desenhando linha ").append(corDaLinha);
        sb.append(" da coordenada ").append(this.inicio);
        sb.append(" até a coordenada ").append(fim);

        return sb.toString();
    }
}
