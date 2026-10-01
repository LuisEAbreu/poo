package engtelecom.poo;

public class Robo {
    private int bateria;
    private Area areaExploracao;
    private Coordenada posicaoAtual;

    public Robo(Area areaExploracao, Coordenada posicaoAtual) {
        this.bateria = 100;
        this.areaExploracao = areaExploracao;
        this.posicaoAtual = posicaoAtual;
    }

    public int getBateria() {
        return bateria;
    }

    public Area getAreaExploracao() {
        return areaExploracao;
    }

    public Coordenada getPosicaoAtual() {
        return posicaoAtual;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Bateria restante: ").append(bateria);
        sb.append("\nPosicao Atual: ").append(posicaoAtual);
        sb.append("\nArea de Exploração:\n").append(areaExploracao);
        return sb.toString();
    }
}
