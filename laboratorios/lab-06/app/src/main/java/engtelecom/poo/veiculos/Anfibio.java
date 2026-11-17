package engtelecom.poo.veiculos;

public abstract class Anfibio extends Veiculo{
    private static final int LIMITE_MAX_LASTRO = 100;
    private final int capacidadeLastro;
    private int nivelAtualLastro;
    protected boolean rodasRecolhidas;
}
