package engtelecom.poo;

public class App {
    public static void main(String[] args) {

        // Teste dos construtores
        Horario h1 = new Horario();
        Horario h2 = new Horario(10);
        Horario h3 = new Horario(10, 30);
        Horario h4 = new Horario(23, 59, 59);

        IO.println(h1);
        IO.println(h2);
        IO.println(h3);
        IO.println(h4);

        // Teste dos getters
        IO.println(h4.getHora());
        IO.println(h4.getMinuto());
        IO.println(h4.getSegundo());

        // Teste dos setters
        IO.println("Antes: " + h1);

        IO.println(h1.setHora(12));
        IO.println(h1.setMinuto(34));
        IO.println(h1.setSegundo(56));

        IO.println("Depois: " + h1);

        IO.println("setHora(24): " + h1.setHora(24));
        IO.println("setMinuto(60): " + h1.setMinuto(60));
        IO.println("setSegundo(-1): " + h1.setSegundo(-1));

        IO.println("Após inválidos: " + h1);

        // Teste por extenso
        IO.println(h1.porExtenso());
        IO.println(h3.porExtenso());
        IO.println(h4.porExtenso());

        // Teste em segundos
        IO.println(h1 + " = " + h1.emSegundos());
        IO.println(h4 + " = " + h4.emSegundos());

        // Teste diferença
        IO.println(h3 + " - " + h1 + " = " + h3.diferencaEmSegundos(h1) + " segundos");
        IO.println(h1 + " - " + h3 + " = " + h1.diferencaEmSegundos(h3) + " segundos");
    }
}
