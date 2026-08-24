package engtelecom.poo;

public class Sistema {
    private Pessoa[] agenda = new Pessoa[100];
    private static int contador = 0;

    private int menu(){
        IO.println("1 - Cadastrar.");
        IO.println("2 - Listar dados de uma pessoa.");
        IO.println("3 - Listar todas as pessoas.");
        IO.println("0 - Sair");

        int opcao = Integer.parseInt(IO.readln("Entre com a opção: "));

        return opcao;
    }

    private void cadastrar(){
        String nome = IO.readln("Entre com o nome: ");
        String email = IO.readln("Entre com o e-mail: ");

        Pessoa p = new Pessoa(nome, email);
        this.agenda[contador++] = p;
    }

    private void listarDadosPessoa(int id){

    }

    private void listarPessoas(){

    }

    static void main(String[] args) {

    }
}
