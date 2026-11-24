package engtelecom.poo.carta;

public enum Naipe {
    PAUS("\u2663"),
    OUROS("\u2666"),
    COPAS("\u2665"),
    ESPADAS("\u2660");

    public final String simbolo;

    Naipe(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return simbolo;
    }
}
