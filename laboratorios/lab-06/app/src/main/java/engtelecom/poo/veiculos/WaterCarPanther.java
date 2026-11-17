package engtelecom.poo.veiculos;

public class WaterCarPanther extends Anfibio implements Conversivel, OffRoad {
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
}
