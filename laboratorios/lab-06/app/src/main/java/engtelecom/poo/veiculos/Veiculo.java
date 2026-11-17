package engtelecom.poo.veiculos;

public abstract class Veiculo {
    private static final int VELOCIDADE_MAX = 200;
    private final int id;
    protected int velocidadeAtual;

    private static int contador = 0;

    public Veiculo() {
        this.id = ++contador;
        this.velocidadeAtual = 0;
    }

    public int getId() {
        return id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual = Math.min((valor + velocidadeAtual), VELOCIDADE_MAX);
        }
    }

    public void frear(int valor) {
        if (valor > 0) {
            velocidadeAtual = Math.max((velocidadeAtual - valor), 0);
        }
    }
}
