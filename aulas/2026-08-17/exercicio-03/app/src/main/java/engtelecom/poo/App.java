package engtelecom.poo;

public class App {
    static void main() {
        Batedeira mixer = new Batedeira();

        mixer.definirPreco(299.90);
        mixer.definirCor("Vermelha");
        mixer.definirMarca("Britânia");
        mixer.definirPotencia(150);

        String mensagem = String.format("Preço da batedeira R$%.2f", mixer.preco());
        IO.println(mensagem);

        mensagem = String.format("Cor: %s", mixer.cor());
        IO.println(mensagem);

        mensagem = String.format("Marca: %s", mixer.marca());
        IO.println(mensagem);

        mensagem = String.format("Potência: %dW", mixer.potencia());
        IO.println(mensagem);
    }
}
