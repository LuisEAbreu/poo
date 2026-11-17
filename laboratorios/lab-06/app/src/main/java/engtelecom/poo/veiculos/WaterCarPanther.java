package engtelecom.poo.veiculos;

public class WaterCarPanther extends Anfibio implements Conversivel, OffRoad {
    private boolean capotaAberta;
    private boolean tracaoIntegral;

    public WaterCarPanther(int capacidadeLastro) {
        super(capacidadeLastro);
        this.capotaAberta = false;
        this.tracaoIntegral = false;
    }
}
