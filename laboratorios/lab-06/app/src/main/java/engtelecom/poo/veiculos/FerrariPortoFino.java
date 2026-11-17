package engtelecom.poo.veiculos;

public class FerrariPortoFino extends Veiculo implements Conversivel {
    private boolean controleEstabilidade;
    private boolean capotaAberta;

    public FerrariPortoFino() {
        super();
        this.controleEstabilidade = false;
        this.capotaAberta = false;
    }
}
