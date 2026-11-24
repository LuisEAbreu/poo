package engtelecom.poo.carta;

public class Carta {
    protected Valor valor;
    protected Naipe naipe;

    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return valor + " " + naipe;
    }
}
