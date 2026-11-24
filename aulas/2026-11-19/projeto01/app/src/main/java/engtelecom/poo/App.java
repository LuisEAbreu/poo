package engtelecom.poo;

import engtelecom.poo.carta.Carta;
import engtelecom.poo.carta.Naipe;
import engtelecom.poo.carta.Valor;

public class App {
    public static void main(String[] args) {
        Carta c = new Carta(Valor.AS, Naipe.ESPADAS);

        IO.println(c);
    }
}
