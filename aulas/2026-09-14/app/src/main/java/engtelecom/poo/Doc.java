package engtelecom.poo;

import java.util.ArrayList;

public class Doc {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("POO");
        lista.add("IFSC");

        String s = lista.get(1);

        // for i
        for (int i = 0; i < lista.size(); i++) {
            IO.println(lista.get(i));
        }

        // for each
        for (String elemento : lista){
            IO.println(elemento);
        }

        // usando lambda
        lista.forEach(elemento-> IO.println(elemento));

        // lambda com mais de uma instrução
        lista.forEach(e-> {
            IO.println(e);
        });

        // method reference
        lista.forEach(IO::println);

        lista.removeIf(e->e.equals("IFSC"));
    }
}
