package engtelecom.poo.carta;

public enum Valor {
    AS(1, "A", "1"),
    DOIS(2, "2", "2"),
    TRES(3, "3", "3"),
    QUATRO(4, "4", "4"),
    CINCO(5, "5", "5"),
    SEIS(6, "6", "6"),
    SETE(7, "7", "7"),
    OITO(8, "8", "8"),
    NOVE(9, "9", "9"),
    DEZ(10, "10", "10"),
    VALETE(11, "J", "j"),
    DAMA(12, "Q", "q"),
    REI(13, "K", "k");

    public final int numero;
    public final String simbolo;
    public final String sigla;

    Valor(int numero, String simbolo, String sigla) {
        this.numero = numero;
        this.simbolo = simbolo;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "" + numero;
    }
}
