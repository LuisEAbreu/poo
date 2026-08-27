package engtelecom.poo;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("(").append(x);
        sb.append(", ").append(y);
        sb.append(")");

        return sb.toString();
    }

    public double distancia(Ponto d){
        return Math.sqrt(Math.pow((d.x - this.x), 2) + Math.pow((d.y - this.y), 2));
    }
}
