package engtelecom.poo;

public class Robo {
    private int bateria;
    private Area areaExploracao;
    private Coordenada posicaoAtual;
    private final int CONSUMO = 1;

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

    public Coordenada deslocar(int quantidade, String direcao) {
        if ((bateria - CONSUMO * quantidade) >= 0) {
            switch (direcao) {
                case "N" -> posicaoAtual.y = Math.min(areaExploracao.altura-posicaoAtual.y, posicaoAtual.y+quantidade);
                case "S" -> posicaoAtual.y = Math.max(areaExploracao.altura-posicaoAtual.y, posicaoAtual.y-quantidade);
                case "L" -> posicaoAtual.x = Math.min(areaExploracao.largura-posicaoAtual.x, posicaoAtual.x+quantidade);
                case "O" -> posicaoAtual.x = Math.max(areaExploracao.largura-posicaoAtual.x, posicaoAtual.x-quantidade);
            }
//            bateria -= CONSUMO * quantidade;
        }
        return posicaoAtual;
    }
}
