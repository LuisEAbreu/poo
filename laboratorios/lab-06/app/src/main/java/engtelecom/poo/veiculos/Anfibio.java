package engtelecom.poo.veiculos;

public abstract class Anfibio extends Veiculo{
    private static final int LIMITE_MAX_LASTRO = 100;
    private final int capacidadeLastro;
    private int nivelAtualLastro;
    protected boolean rodasRecolhidas;

    public Anfibio(int capacidadeLastro) {
        super();
        this.capacidadeLastro = Math.min(capacidadeLastro, LIMITE_MAX_LASTRO);
        this.rodasRecolhidas = false;
    }
}
