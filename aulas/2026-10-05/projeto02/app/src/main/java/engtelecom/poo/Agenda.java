package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public boolean addContato(Contato contato){
        contatos.add(contato);

        return true;
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> lista = new ArrayList<>();

        contatos.forEach(c -> {
            if(c.getNome().equals(nome) && c.getSobrenome().equals(sobrenome)){
                lista.add(c);
            }
        });

        return lista;
    }
}
