package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(5, 4, "ASCII");
        Retangulo r3 = new Retangulo(6, 3, "utf8");
        Retangulo r4 = new Retangulo(0, -2, "invalido");

        IO.println(r1);
        IO.println(r2);
        IO.println(r3);
        IO.println(r4);

        // Getters
        IO.println("r2 largura: " + r2.getLargura());
        IO.println("r2 altura: " + r2.getAltura());
        IO.println("r2 codificacao: " + r2.getCodificacao());

        // Área e perímetro
        IO.println("r2 área: " + r2.retornaArea());
        IO.println("r2 perímetro: " + r2.retornaPerimetro());

        // Setters válidos
        IO.println("setLargura(8): " + r2.setLargura(8));
        IO.println("setAltura(6): " + r2.setAltura(6));
        IO.println("setCodificacao(utf8): " + r2.setCodificacao("utf8"));
        IO.println("r2 após alterações:\n" + r2);

        // Setters inválidos
        int larguraAntes = r2.getLargura();
        IO.println("setLargura(0): " + r2.setLargura(0));
        IO.println("largura não alterada: " + (larguraAntes == r2.getLargura()));

        int alturaAntes = r2.getAltura();
        IO.println("setAltura(-1): " + r2.setAltura(-1));
        IO.println("altura não alterada: " + (alturaAntes == r2.getAltura()));

        String codificacaoAntes = r2.getCodificacao();
        IO.println("setCodificacao(XYZ): " + r2.setCodificacao("XYZ"));
        IO.println("codificação não alterada: " + codificacaoAntes.equals(r2.getCodificacao()));

        // Valores limite
        r4.setLargura(1);
        r4.setAltura(1);
        IO.println("r4 largura: " + r4.getLargura());
        IO.println("r4 altura: " + r4.getAltura());
        IO.println("r4 área: " + r4.retornaArea());
        IO.println("r4 perímetro: " + r4.retornaPerimetro());
    }
}
