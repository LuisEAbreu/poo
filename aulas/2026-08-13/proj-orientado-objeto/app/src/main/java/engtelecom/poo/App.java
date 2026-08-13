package engtelecom.poo;

public class App {
    static void main() {
        Carro fusca = new Carro();
        Carro ferrari = new Carro();

        fusca.definirCor("azul");

        IO.println(fusca.obterCor());
        IO.println(ferrari.obterCor());

        IO.println(fusca.obterVelocidadeAtual());
        fusca.acelerarCarro(37);
        IO.println(fusca.obterVelocidadeAtual());
        fusca.acelerarCarro(70);
        IO.println(fusca.obterVelocidadeAtual());
        fusca.desacelerarCarro(40);
        IO.println(fusca.obterVelocidadeAtual());
        fusca.desacelerarCarro(65);
        IO.println(fusca.obterVelocidadeAtual());
    }
}
