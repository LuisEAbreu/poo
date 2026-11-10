package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Data a = new Data(10, 3, 2020);
        Data b = new Data(10, 3, 2022);

        IO.println("Data 1: " + a);
        IO.println("Data 2: " + b);
        IO.println("Por extenso: " + a.porExtenso());

        IO.println(String.format("Diferença: %d dias", a.diferencaEmDias(b)));

        IO.println("\n--- Outros testes ---");

        Data c = new Data(1, 1, 2024);
        Data d = new Data(1, 1, 2025);

        IO.println(String.format("%s até %s: %d dias", c, d, c.diferencaEmDias(d)));

        Data e = new Data(10, 3, 2024);
        Data f = new Data(20, 3, 2024);

        IO.println(String.format("%s até %s: %d dias", e, f, e.diferencaEmDias(f)));

        Data g = new Data(29, 2, 2024);
        Data h = new Data(1, 3, 2024);

        IO.println(String.format("%s até %s: %d dias", g, h, g.diferencaEmDias(h)));

        Data i = new Data(31, 2, 2024);

        IO.println(String.format("Data inválida: %s", i));
    }
}