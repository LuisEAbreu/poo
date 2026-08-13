package engtelecom.poo;

public class Carro {
    // atributos:
    private String cor;
    private int velocidadeAtual;

    // métodos:
    public void definirCor(String novaCor) {
        cor = novaCor;
    }

    public String obterCor() {
        return cor;
    }

    public int obterVelocidadeAtual() {
        return velocidadeAtual;
    }
}
