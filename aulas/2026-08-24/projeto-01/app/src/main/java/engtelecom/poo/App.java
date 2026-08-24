package engtelecom.poo;

public class App {
    static void main() {
        Carro fusca = new Carro("azul");
        Carro ferrari = new Carro("vermelha");

        IO.println(fusca.obterCor());
        IO.println(ferrari.obterCor());

        IO.println(fusca.obterVelocidadeAtual());
        fusca.acelerar(37);
        IO.println(fusca.obterVelocidadeAtual());
        fusca.acelerar(70);
        IO.println(fusca.obterVelocidadeAtual());
        fusca.desacelerar(40);
        IO.println(fusca.obterVelocidadeAtual());
        fusca.desacelerar(65);
        IO.println(fusca.obterVelocidadeAtual());

        Pessoa fulano = new Pessoa("José", "jose@gmail.com");
        Pessoa sicrano = new Pessoa("João", "joao@gmail.com");
        Pessoa beltrano = new Pessoa("Roberval", "roberval@gmail.com");

        IO.println(fulano.toString());
        IO.println(sicrano); // equivalente a IO.println(sicrano.toString());
        IO.println(beltrano);
    }
}
