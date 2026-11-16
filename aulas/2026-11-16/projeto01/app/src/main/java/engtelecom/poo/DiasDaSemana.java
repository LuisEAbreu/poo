package engtelecom.poo;

public enum DiasDaSemana {
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "segunda-feira"),
    TERCA(3, "terça-feira"),
    QUARTA(4, "quarta-feira"),
    QUINTA(5, "quinta-feira"),
    SEXTA(6, "sexta-feira"),
    SABADO(7, "sábado");

    public final int codigo;
    public final String nome;

    DiasDaSemana(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
