package engtelecom.poo.carta;

public class CartaGUI extends Carta{
    private int x;
    private int y;

    public CartaGUI(Valor valor, Naipe naipe, int x, int y) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
    }
}
