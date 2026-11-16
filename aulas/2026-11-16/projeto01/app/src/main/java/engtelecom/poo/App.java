package engtelecom.poo;

import java.util.ArrayList;

public class App {
    static void main(String[] args) {
        ArrayList<Disciplina> d = new ArrayList<>();

        d.add(new Disciplina(
                "POO",
                new DiasDaSemana[]{DiasDaSemana.SEGUNDA, DiasDaSemana.QUINTA})
        );

        d.add(new Disciplina(
                "SOP",
                new DiasDaSemana[]{DiasDaSemana.TERCA, DiasDaSemana.SEXTA})
        );

        d.add(new Disciplina(
                "EMG",
                new DiasDaSemana[]{DiasDaSemana.SEGUNDA, DiasDaSemana.SEXTA})
        );

        d.forEach(e -> {
            DiasDaSemana[] vet = e.getDias();

            for (DiasDaSemana dS : vet) {
                if (dS == DiasDaSemana.SEGUNDA) {
                    IO.println(e.getSigla());
                }
            }
        });

        IO.println(Planeta.getPorPosicao(3));
    }
}
