package engtelecom.poo.veiculos;

public class WaterCarPanther extends Anfibio implements Conversivel, OffRoad {
    private static final int TEMP_MIN_MINIGELADEIRA = 0;
    private static final int TEMP_MAX_MINIGELADEIRA = 10;
    private int tempAtualMiniGel = 5;
    private boolean capotaAberta;
    private boolean tracaoIntegral;

    public WaterCarPanther(int capacidadeLastro) {
        super(capacidadeLastro);
        this.capotaAberta = false;
        this.tracaoIntegral = false;
    }

    @Override
    public boolean abrirCapota() {
        if (velocidadeAtual == 0) {
            capotaAberta = true;

            return true;
        }
        return false;
    }

    @Override
    public boolean fecharCapota() {
        if (velocidadeAtual == 0) {
            capotaAberta = false;

            return true;
        }
        return false;
    }

    @Override
    public boolean ativarTracao() {
        if (velocidadeAtual == 0 && !rodasRecolhidas) {
            tracaoIntegral = true;

            return true;
        }
        return false;
    }

    @Override
    public boolean desativarTracao() {
        if (velocidadeAtual == 0 && !rodasRecolhidas) {
            tracaoIntegral = false;

            return true;
        }
        return false;
    }
}
