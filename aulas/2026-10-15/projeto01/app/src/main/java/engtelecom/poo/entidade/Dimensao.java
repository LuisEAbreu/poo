package engtelecom.poo.entidade;

public class Dimensao {
    private double altura;
    private double largura;
    private double profundidade;

    public Dimensao(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("   Altura: ").append(altura).append("\n");
        sb.append("   Largura: ").append(largura).append("\n");
        sb.append("   Profundidade: ").append(profundidade);
        return sb.toString();
    }
}
