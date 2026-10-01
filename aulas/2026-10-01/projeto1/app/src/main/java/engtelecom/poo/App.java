package engtelecom.poo;

public class App {
    static void main(String[] args) {
        Area a = new Area(5, 6);
        Coordenada c = new Coordenada(2, 1);

        Robo r = new Robo(a, c);

        a = null;
        c = null;

        IO.println(r);

        IO.println(r.deslocar(6, "N"));
        IO.println(r.getBateria());
        IO.println(r.deslocar(2, "S"));
        IO.println(r.getBateria());
        IO.println(r.deslocar(5, "S"));
        IO.println(r.getBateria());
    }
}
