package engtelecom.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones = new HashMap<>();
    private HashMap<String, Email> emails = new HashMap<>();

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String valor) {
        if (telefones.containsKey(rotulo)) {
            return false;
        }
        telefones.put(rotulo, new Telefone(valor));

        return true;
    }

    public boolean addEmail(String rotulo, String valor) {
        if (emails.containsKey(rotulo)) {
            return false;
        }
        emails.put(rotulo, new Email(valor));

        return true;
    }

    public boolean removeTelefone(String rotulo) {
        return (telefones.remove(rotulo) != null);
    }

    public boolean removeEmail(String rotulo) {
        return (emails.remove(rotulo) != null);
    }

    public boolean updateTelefone(String rotulo, String valor) {
        Telefone t = telefones.get(rotulo);

        if (t != null) {
            t.setValor(valor);

            return true;
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor) {
        Email e = emails.get(rotulo);

        if (e != null) {
            e.setValor(valor);

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Nome completo: ").append(nome).append(" ").append(sobrenome).append("\n");
        sb.append("Data de nascimento: ").append(dataNasc).append("\n");

        sb.append("Telefone(s):").append("\n");
        telefones.forEach((rotulo, telefone) -> {
            sb.append(rotulo).append(": ").append(telefone).append("\n");
        });

        sb.append("E-mail(s):").append("\n");
        emails.forEach((rotulo, email) -> {
            sb.append(rotulo).append(": ").append(email);
        });
        sb.append("\n");

        return sb.toString();
    }
}
