package engtelecom.poo;

public class Motor {
    private String tipoPropulsao;
    private boolean ligado;

    public Motor(String tipoPropulsao) {
        this.tipoPropulsao = tipoPropulsao;
        this.ligado = false;
    }

    public String getTipoPropulsao() {
        return tipoPropulsao;
    }

    public void setTipoPropulsao(String tipoPropulsao) {
        this.tipoPropulsao = tipoPropulsao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Tipo propulsao: ").append(tipoPropulsao);
        sb.append("Estado: ").append(ligado?"ligado":"desligado");
        return sb.toString();
    }

    public boolean ligarDesligar(){
        this.ligado = !ligado;
        return ligado;
    }
}
