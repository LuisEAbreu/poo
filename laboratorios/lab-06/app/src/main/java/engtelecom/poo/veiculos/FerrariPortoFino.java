package engtelecom.poo.veiculos;

public class FerrariPortoFino extends Veiculo implements Conversivel {
    private boolean controleEstabilidade;
    private boolean capotaAberta;

    public FerrariPortoFino() {
        super();
        this.controleEstabilidade = false;
        this.capotaAberta = false;
    }

    @Override
    public boolean abrirCapota() {
        if(velocidadeAtual == 0){
            capotaAberta = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean fecharCapota() {
        if(velocidadeAtual == 0){
            capotaAberta = false;
            return true;
        }
        return false;
    }
}
