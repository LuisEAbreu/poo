package engtelecom.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class App {
    private static final int OPCAO_SAIDA = 12;

    Agenda agenda = new Agenda();

    static void main(String[] args) {
        App a = new App();

        int opcao;

        do {
            opcao = a.menu();

            switch (opcao) {
                case 1 -> a.adicionarContato();
                case 2 -> a.encontrarContato();
                case 3 -> a.removerContato();
                case 4 -> a.adicionarTelefone();
                case 5 -> a.adicionarEmail();
                case 6 -> a.atualizarTelefone();
                case 7 -> a.atualizarEmail();
                case 8 -> a.removerTelefone();
                case 9 -> a.removerEmail();
                case 10 -> a.listarDadosDoContato();
                case 11 -> a.listarTodosContatos();
                case OPCAO_SAIDA -> IO.println("Saindo...");
            }
        } while (opcao != OPCAO_SAIDA);
    }

    private int menu() {
        IO.println(String.format(
                """
                        === MENU ===
                        
                        1 - Adicionar contato.
                        2 - Encontrar contato.
                        3 - Remover contato.
                        4 - Adicionar telefone
                        5 - Adicionar e-mail
                        6 - Atualizar telefone
                        7 - Atualizar e-mail
                        8 - Remover telefone
                        9 - Remover e-mail
                        10 - Listar dados de um contato.
                        11 - Listar todos os contatos.
                        %d - Sair do sistema.
                        """, OPCAO_SAIDA));

        return Integer.parseInt(IO.readln("Entre com a opção: "));
    }

    private void adicionarContato() {
        String nome = IO.readln("Nome: ");
        String sobrenome = IO.readln("Sobrenome: ");
        LocalDate dataNasc = stringDataParaLocalDate();

        boolean retorno = agenda.addContato(new Contato(nome, sobrenome, dataNasc));

        if (retorno) {
            IO.println("Contato adicionado com sucesso!");
        } else {
            IO.println("Não foi possível adicionar o contato.");
        }
    }

    private void encontrarContato() {
        String nome = IO.readln("Nome: ");
        String sobrenome = IO.readln("Sobrenome: ");

        ArrayList<Contato> lista = agenda.findContato(nome, sobrenome);

        if (lista.isEmpty()) {
            IO.println("Nenhum contato encontrado.");
        } else {
            lista.forEach(IO::println);
        }
    }

    private void removerContato() {
        int indice = Integer.parseInt(IO.readln("Índice do contato: "));

        boolean retorno = agenda.removeContato(indice);

        if (retorno) {
            IO.println("Contato removido com sucesso!");
        } else {
            IO.println("Não foi possível remover o contato.");
        }
    }

    private void adicionarTelefone() {
        int indice = Integer.parseInt(IO.readln("Indice do contato: "));

        String rotulo = IO.readln("Rótulo de identificação: ");
        String valor = IO.readln("Número: ");

        boolean retorno = agenda.addTelefone(rotulo, valor, indice);

        if (retorno) {
            IO.println("Telefone adicionado com sucesso!");
        } else {
            IO.println("Não foi possível adicionar o telefone.");
        }
    }

    private void adicionarEmail() {
        int indice = Integer.parseInt(IO.readln("Indice do contato: "));

        String rotulo = IO.readln("Rótulo de identificação: ");
        String valor = IO.readln("Número: ");

        boolean retorno = agenda.addEmail(rotulo, valor, indice);

        if (retorno) {
            IO.println("E-mail adicionado com sucesso!");
        } else {
            IO.println("Não foi possível adicionar o e-mail.");
        }
    }

    private void atualizarTelefone() {
        int indice = Integer.parseInt(IO.readln("Indice do contato: "));

        String rotulo = IO.readln("Rótulo de identificação: ");
        String valor = IO.readln("Número: ");

        boolean retorno = agenda.updateTelefone(rotulo, valor, indice);

        if (retorno) {
            IO.println("Telefone atualizado com sucesso!");
        } else {
            IO.println("Não foi possível atualizar o telefone.");
        }
    }

    private void atualizarEmail() {
        int indice = Integer.parseInt(IO.readln("Indice do contato: "));

        String rotulo = IO.readln("Rótulo de identificação: ");
        String valor = IO.readln("Número: ");

        boolean retorno = agenda.updateEmail(rotulo, valor, indice);

        if (retorno) {
            IO.println("E-mail atualizado com sucesso!");
        } else {
            IO.println("Não foi possível atualizar o e-mail.");
        }
    }

    private void removerTelefone() {
        int indice = Integer.parseInt(IO.readln("Indice do contato: "));

        String rotulo = IO.readln("Rótulo de identificação: ");

        boolean retorno = agenda.removeTelefone(rotulo, indice);

        if (retorno) {
            IO.println("Telefone removido com sucesso!");
        } else {
            IO.println("Não foi possível remover o telefone.");
        }
    }

    private void removerEmail() {
        int indice = Integer.parseInt(IO.readln("Indice do contato: "));

        String rotulo = IO.readln("Rótulo de identificação: ");

        boolean retorno = agenda.removeEmail(rotulo, indice);

        if (retorno) {
            IO.println("E-mail removido com sucesso!");
        } else {
            IO.println("Não foi possível remover o e-mail.");
        }
    }

    private void listarDadosDoContato() {
        int indice = Integer.parseInt(IO.readln("Indice do contato: "));

        IO.println(agenda.listarDadosDoContato(indice));
    }

    private void listarTodosContatos() {
        IO.println(agenda);
    }

    private LocalDate stringDataParaLocalDate() {
        String dataString = IO.readln("Entre com a data (dd/mm/aaaa): ");

        // Formato da data - d representa dia, M representa mês e y representa ano
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Converte a Stringpara LocalDate,considerando oformato informadona String
        return LocalDate.parse(dataString, formato);
    }
}
