package engtelecom.poo;

import engtelecom.poo.personagens.Aldeao;
import engtelecom.poo.personagens.Arqueiro;
import engtelecom.poo.personagens.Cavaleiro;

public class App {
    static void main(String[] args) {
        Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        IO.println(aldeao.atacar());
        IO.println(aldeao.mover());

        IO.println(arqueiro.atacar());
        IO.println(arqueiro.mover());

        IO.println(cavaleiro.atacar());
        IO.println(cavaleiro.mover());
    }
}
