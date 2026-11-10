package engtelecom.poo;

public class Coordenada {
    public int x;
    public int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("(").append(x).append(", ").append(y).append(")");
        return sb.toString();
    }
}
