package engtelecom.poo;

public class App {
    static void main() {
        Carro fusca = new Carro();
        Carro ferrari = new Carro();

        fusca.definirCor("azul");

        IO.println(fusca.obterCor());
        IO.println(ferrari.obterCor());
    }
}
