package engtelecom.poo;

import java.time.LocalDate;
import java.time.Month;

public class App {
    static void main(String[] args) {
        LocalDate dN = LocalDate.of(2003, Month.APRIL, 5);

        Contato c = new Contato("Juca", "Soares", dN);

        c.addTelefone("celular", "5548919487913");
        c.addEmail("pessoal", "juca@example.org");

        IO.println(c);
    }
}
