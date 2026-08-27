package engtelecom.poo;

public class App {
    static void main(String[] args) {
        Ponto a = new Ponto(3, 5);
        Ponto b = new Ponto(1, 4);

        IO.println("Ponto a: "+ a);
        IO.println("Ponto b: "+ b);

        IO.println("Distância do ponto a até o ponto b é: " + a.distancia(b));
    }
}
