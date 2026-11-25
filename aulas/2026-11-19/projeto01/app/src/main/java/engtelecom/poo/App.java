package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import engtelecom.poo.carta.Carta;
import engtelecom.poo.carta.CartaGUI;
import engtelecom.poo.carta.Naipe;
import engtelecom.poo.carta.Valor;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<CartaGUI> baralho = new ArrayList<>();

        int x = 50;
        int y = 780;
        for (Naipe n : Naipe.values()) {
            for (Valor v : Valor.values()) {
                baralho.add(new CartaGUI(v, n, x, y));
                x += 100;
                if(x == 950){
                    x = 50;
                    y -= 100;
                }
            }
        }

        int largura = 1000;
        int altura = 1000;

        Draw draw = new Draw();
        draw.setCanvasSize(largura, altura);
        draw.setXscale(0, largura);
        draw.setYscale(0, altura);

        baralho.forEach(e->e.desenhar(draw));
    }
}
