package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public boolean addContato(Contato contato) {
        contatos.add(contato);

        return true;
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome) {
        ArrayList<Contato> lista = new ArrayList<>();

        contatos.forEach(c -> {
            if (c.getNome().equals(nome) && c.getSobrenome().equals(sobrenome)) {
                lista.add(c);
            }
        });

        return lista;
    }

    private boolean verificaIndiceValido(int indice) {
        return (indice >= 0 && indice < contatos.size());
    }

    public boolean removeContato(int indiceContatoNaLista) {
        return (contatos.remove(indiceContatoNaLista) != null);
    }

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista) {
        if (verificaIndiceValido(indiceContatoNaLista)) {
            Contato c = contatos.get(indiceContatoNaLista);

            if (c != null) {
                return c.addTelefone(rotulo, valor);
            }
        }
        return false;
    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista) {
        if (verificaIndiceValido(indiceContatoNaLista)) {
            Contato c = contatos.get(indiceContatoNaLista);

            if (c != null) {
                return c.addEmail(rotulo, valor);
            }
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String valor, int indiceContatoNaLista) {
        if (verificaIndiceValido(indiceContatoNaLista)) {
            Contato c = contatos.get(indiceContatoNaLista);

            if (c != null) {
                return c.updateTelefone(rotulo, valor);
            }
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor, int indiceContatoNaLista) {
        if (verificaIndiceValido(indiceContatoNaLista)) {
            return contatos.get(indiceContatoNaLista).updateEmail(rotulo, valor);
        }
        return false;
    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista) {
        if (verificaIndiceValido(indiceContatoNaLista)) {
            Contato c = contatos.get(indiceContatoNaLista);

            if (c != null) {
                return c.removeTelefone(rotulo);
            }
        }
        return false;
    }

    public boolean removeEmail(String rotulo, int indiceContatoNaLista) {
        if (verificaIndiceValido(indiceContatoNaLista)) {
            Contato c = contatos.get(indiceContatoNaLista);

            if (c != null) {
                return c.removeEmail(rotulo);
            }
        }
        return false;
    }

    public String listarDadosDoContato(int indiceContatoNaLista) {
        if (verificaIndiceValido(indiceContatoNaLista)) {
            Contato c = contatos.get(indiceContatoNaLista);

            if (c != null) {
                return c.toString();
            }
        }
        return "";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        contatos.forEach(c -> {
            sb.append(contatos.indexOf(c)).append(": ");
            sb.append(c.getNome()).append(" ").append(c.getSobrenome()).append("\n");
        });

        return sb.toString();
    }
}
