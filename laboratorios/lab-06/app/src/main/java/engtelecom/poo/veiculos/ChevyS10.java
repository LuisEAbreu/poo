package engtelecom.poo.veiculos;

public class ChevyS10 extends Veiculo implements OffRoad {
    private boolean tracaoIntegral;
    private boolean cacambaAberta;

    public ChevyS10() {
        super();
        this.tracaoIntegral = false;
        this.cacambaAberta = false;
    }

    public boolean abrirCacamba() {
        if(velocidadeAtual == 0){
            cacambaAberta = true;

            return true;
        }
        return false;
    }

    public boolean fecharCacamba() {
        if(velocidadeAtual == 0){
            cacambaAberta = false;

            return true;
        }
        return false;
    }

    @Override
    public boolean ativarTracao() {
        if(velocidadeAtual == 0){
            tracaoIntegral = true;

            return true;
        }
        return false;
    }

    @Override
    public boolean desativarTracao() {
        if(velocidadeAtual == 0){
            tracaoIntegral = false;

            return true;
        }
        return false;
    }
}
