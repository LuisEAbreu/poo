package engtelecom.poo.carta;

import edu.princeton.cs.algs4.Draw;

public class CartaGUI extends Carta{
    private int x;
    private int y;

    public CartaGUI(Valor valor, Naipe naipe, int x, int y) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        String desenho = valor.sigla + naipe.sigla;

        d.picture(x, y, "cartas/"+ desenho + ".png");
    }
}
