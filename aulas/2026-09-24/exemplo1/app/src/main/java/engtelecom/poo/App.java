package engtelecom.poo;

public class App {
    static void main(String[] args) {
        Motor v8 = new Motor(700, 8);
        Carro charger = new Carro("Dodge", v8);

        Endereco e = new Endereco("Rua Getulio Vargas","329","Centro","São José","SC");
        Aluno a = new Aluno("Joao", e);

        e = null;

        IO.println(a);
    }
}
