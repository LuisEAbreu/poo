package engtelecom.poo;

public class App {
    static void main() {
        Personagem p = new Personagem();

        p.definirNome("Sícrano");
        p.definirClasse("guerreiro");

        p.dano(63);

        IO.println("Personagem: " + p.nome());
        IO.println("Vida atual é " + p.vitalidade());
        IO.println("A classe é " + p.consultarClasse());
    }
}
