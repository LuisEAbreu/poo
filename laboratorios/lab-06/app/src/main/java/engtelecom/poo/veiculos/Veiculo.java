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
}
