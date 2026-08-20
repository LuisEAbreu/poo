package engtelecom.poo;

public class App {
    static void main(String[] args) {
        Caneta bic = new Caneta("Azul");

        bic.setNivelTinta(12);
        IO.println(bic.getNivelTinta());
        bic.setNivelTinta(3);
        IO.println(bic.getNivelTinta());
        bic.setNivelTinta(120);
        IO.println(bic.getNivelTinta());
        bic.setNivelTinta(-30);
        IO.println(bic.getNivelTinta());
        bic.setNivelTinta(0.01);
        IO.println(bic.getNivelTinta());

        IO.println(bic.desenhar(1, 3, 3 , 5));
        IO.println(bic.getNivelTinta());
    }
}
