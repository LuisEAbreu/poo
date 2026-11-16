package engtelecom.poo;

public enum Planeta {
    MERCURIO(1, "Mercúrio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8, "Netuno");

    public final int posicao;
    public final String nome;

    Planeta(int posicao, String nome) {
        this.posicao = posicao;
        this.nome = nome;
    }

    public static Planeta getPorPosicao(int posicao){
        for(Planeta p : Planeta.values()){
            if (posicao == p.posicao){
                return p;
            }
        }
        throw new IllegalArgumentException("Código inválido");
    }
}
