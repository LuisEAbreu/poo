package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import engtelecom.poo.carta.Carta;
import engtelecom.poo.carta.CartaGUI;
import engtelecom.poo.carta.Naipe;
import engtelecom.poo.carta.Valor;

import java.util.ArrayList;

public class App implements DrawListener {
    private Draw draw;

    ArrayList<CartaGUI> baralho = new ArrayList<>();

    public App(int altura, int largura){
        draw = new Draw();
        draw.setCanvasSize(largura, altura);
        draw.setXscale(0, largura);
        draw.setYscale(0, altura);
        draw.addListener(this);

        int x = 50;
        int y = 780;
        for (Naipe n : Naipe.values()) {
            for (Valor v : Valor.values()) {
                baralho.add(new CartaGUI(v, n, x, y, false));
                x += 100;
                if(x == 950){
                    x = 50;
                    y -= 100;
                }
            }
        }
    }

    public void desenhar() {
        baralho.forEach(e->e.desenhar(draw));
        draw.show();
    }

    static void main(String[] args) {
        App app = new App(1000, 1000);
        app.desenhar();
    }
}
