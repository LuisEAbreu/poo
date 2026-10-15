package engtelecom.poo;

import engtelecom.poo.entidade.Dimensao;
import engtelecom.poo.entidade.SemFio;
import engtelecom.poo.entidade.Telefone;

public class App {
    static void main(String[] args) {
        Telefone telefone = new Telefone(123, "ab27911", "apex", 235, new Dimensao(7,15,20));

        SemFio sF = new SemFio(345, "cd13516", "gamma", 225, new Dimensao(20, 10, 15), 1800, 2, 10);

        IO.println(telefone);
        IO.println(sF);
    }
}
