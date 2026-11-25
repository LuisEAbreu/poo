package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import engtelecom.poo.carta.Carta;
import engtelecom.poo.carta.CartaGUI;
import engtelecom.poo.carta.Naipe;
import engtelecom.poo.carta.Valor;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<>();

        for(Naipe n : Naipe.values()){
            for(Valor v : Valor.values()){
                baralho.add(new Carta(v, n));
            }
        }

        int largura = 500;
        int altura = 500;

        Draw draw = new Draw();
        draw.setCanvasSize(largura, altura);
        draw.setXscale(0, largura);
        draw.setYscale(0, altura);

        CartaGUI c = new CartaGUI(Valor.AS, Naipe.ESPADAS, largura/2, altura/2);

        c.desenhar(draw);
    }
}
