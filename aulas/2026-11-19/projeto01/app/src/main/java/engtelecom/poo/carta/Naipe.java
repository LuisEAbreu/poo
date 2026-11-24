package engtelecom.poo.carta;

public enum Naipe {
    PAUS(1,"\u2663", "p"),
    OUROS(2,"\u2666", "o"),
    COPAS(3,"\u2665", "c"),
    ESPADAS(4,"\u2660", "e");

    public final int valor;
    public final String simbolo;
    public final String sigla;

    Naipe(int valor, String simbolo, String sigla) {
        this.valor = valor;
        this.simbolo = simbolo;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return simbolo;
    }
}
