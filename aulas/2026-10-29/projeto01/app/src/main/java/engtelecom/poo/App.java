package engtelecom.poo;

import engtelecom.poo.formas.Circulo;
import engtelecom.poo.formas.Forma;
import engtelecom.poo.formas.Linha;
import engtelecom.poo.formas.Retangulo;

public class App {
    static void main(String[] args) {
        Linha l = new Linha("azul", 0, 0, 3, 2);

        IO.println(l.desenhar());
        IO.println();

        Circulo c = new Circulo("verde", 1, 1, 5);

        IO.println(c.desenhar());
        IO.println("Área do círculo: " + c.calcularArea());
        IO.println("Perimetro do círculo: " + c.calcularPerimetro());
        IO.println();

        Retangulo r = new Retangulo("vermelho", 2,3, 0, 0);

        IO.println(r.desenhar());
        IO.println("Área do retângulo: " + r.calcularArea());
        IO.println("Perimetro do retângulo: " + r.calcularPerimetro());

        Forma f = new Forma("verde", new Coordenada(3,4));
    }
}
