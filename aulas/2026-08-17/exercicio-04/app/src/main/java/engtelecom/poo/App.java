package engtelecom.poo;

public class App {
    static void main() {
        Disciplina poo = new Disciplina();

        poo.definirNome("Programação orientada a objeto");
        poo.definirSigla("POO");
        poo.definirCargaHoraria(80);

        IO.println("Disciplina: " + poo.nome());

        IO.println("Sigla: " + poo.sigla());

        String mensagem = String.format("Carga horária: %dh", poo.cargaHoraria());
        IO.println(mensagem);
    }
}
