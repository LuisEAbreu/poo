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

    public boolean recolherRodas() {
        if (velocidadeAtual == 0) {
            rodasRecolhidas = true;
            esvaziarLastro();

            return true;
        }
        return false;
    }

    public boolean encherLastro() {
        if (rodasRecolhidas) {
            return false;
        }
        nivelAtualLastro = capacidadeLastro;

        return true;
    }

    public void esvaziarLastro() {
        nivelAtualLastro = 0;
    }
}
