package engtelecom.poo;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
//               (chave, valor)
        HashMap <String, Pessoa> mapa = new HashMap<>();

        mapa.put("123", new Pessoa("Flavinho", "flavinho@do.pneu"));
        mapa.put("456", new Pessoa("Shaolin", "shaolin@matador.deporco"));
        mapa.put("789", new Pessoa("Fulano", "fulano@example.org"));

        mapa.forEach((c,v) -> IO.println("Chave: " + c + ", valor: " + v));

        var removida = mapa.remove("123");
        IO.println("Pessoa removida: " + removida);

        mapa.values().removeIf(e -> e.getNome().equals("Shaolin"));
    }
}
