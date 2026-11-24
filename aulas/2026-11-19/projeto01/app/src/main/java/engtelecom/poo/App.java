package engtelecom.poo;

import engtelecom.poo.carta.Carta;
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

        baralho.forEach(IO::println);
    }
}
