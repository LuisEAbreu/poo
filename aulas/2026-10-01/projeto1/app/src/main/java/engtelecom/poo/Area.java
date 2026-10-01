package engtelecom.poo;

public class Area {
    public int altura;
    public int largura;

    public Area(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Altura: ").append(altura);
        sb.append("\nLargura: ").append(largura);
        sb.append("\nÁrea: ").append(altura * largura);
        return sb.toString();
    }
}
