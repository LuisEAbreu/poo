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

    public void acelerarCarro(int valor) {
        if ((valor + velocidadeAtual) < 100) {
            velocidadeAtual += valor;
        } else {
            velocidadeAtual = 100;
        }
    }

    public void desacelerarCarro(int valor) {
        if (valor < velocidadeAtual) {
            velocidadeAtual -= valor;
        } else {
            velocidadeAtual = 0;
        }
    }
}
