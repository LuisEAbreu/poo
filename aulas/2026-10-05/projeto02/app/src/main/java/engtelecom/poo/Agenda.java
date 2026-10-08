package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public boolean addContato(Contato contato){
        contatos.add(contato);

        return true;
    }
}
