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

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual = Math.min((valor + velocidadeAtual), 100);
//            velocidadeAtual = ((valor + velocidadeAtual) < 100) ? velocidadeAtual + valor : 100; equivalente
        }
    }

    public void desacelerar(int valor) {
        if (valor < velocidadeAtual) {
            velocidadeAtual -= valor;
        } else {
            velocidadeAtual = 0;
        }
    }
}
