package engtelecom.poo;

import java.util.ArrayList;

public class App {
    static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fulano", "fulano@example.org");
        Pessoa p2 = new Pessoa("Ana", "sicrano@example.org");
        Pessoa p3 = new Pessoa("Ana", "beltrano@example.org");

        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        IO.println("Antes");
        lista.forEach(IO::println);

        lista.removeIf(e->e.getNome().equals("Ana"));

        IO.println("Depois");
        lista.forEach(IO::println);
    }
}
