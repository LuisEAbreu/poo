package engtelecom.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;

    private static final String COD_PADRAO = "ASCII";

    private boolean validaCodificacao(String codificacao) {
        return "ASCII".equalsIgnoreCase(codificacao) || "UTF8".equalsIgnoreCase(codificacao);
    }

    public Retangulo(int largura, int altura, String codificacao) {
        this.largura = (largura > 0) ? largura : 4;
        this.altura = (altura > 0) ? altura : 3;
        this.codificacao = (validaCodificacao(codificacao)) ? codificacao.toUpperCase() : COD_PADRAO;
    }

    public Retangulo() {
        this(4, 3, COD_PADRAO);
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        }
        return false;
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        }
        return false;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public boolean setCodificacao(String codificacao) {
        if (validaCodificacao(codificacao)) {
            this.codificacao = codificacao.toUpperCase();
            return true;
        }
        return false;
    }

    public int retornaArea() {
        return this.altura * this.largura;
    }

    public int retornaPerimetro() {
        return 2 * (this.altura + this.largura);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        boolean ascii = codificacao.equals("ASCII");

        String cse = (ascii) ? "+" : "\u250c";
        String csd = (ascii) ? "+" : "\u2510";
        String cie = (ascii) ? "+" : "\u2514";
        String cid = (ascii) ? "+" : "\u2518";
        String ch = (ascii) ? "-" : "\u2500";
        String cv = (ascii) ? "|" : "\u2502";

        sb.append(cse);
        sb.repeat(ch, largura - 2);
        sb.append(csd).append('\n');
        sb.repeat((cv + " ".repeat(largura - 2) + cv + '\n'), altura - 2);
        sb.append(cie);
        sb.repeat(ch, largura - 2);
        sb.append(cid);

        return sb.toString();
    }
}
