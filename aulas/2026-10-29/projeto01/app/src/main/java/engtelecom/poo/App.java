package engtelecom.poo;

import engtelecom.poo.formas.*;

import java.util.ArrayList;

public class App {
    static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Linha("azul", 0, 0, 3, 2));
        formas.add(new Circulo("verde", 1, 1, 5));
        formas.add(new Retangulo("vermelho", 2,3, 0, 0));
        formas.add(new Triangulo("amarelo", 0,0,1,2,3,0));

        formas.forEach(e-> IO.println(e.desenhar()));

        formas.forEach(e->{
            if(e instanceof FormaGeometrica f){
                IO.println(String.format("Área: %.2f m²", f.calcularArea()));
            }
        });

        formas.forEach(e->{
            if(e instanceof FormaGeometrica f){
                IO.println(String.format("Perímetro: %.2f m", f.calcularPerimetro()));
            }
        });
    }
}
