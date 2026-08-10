package engtelecom.poo;

import java.util.Random;

public class Sorteio {
    static void main() {
        Random aleatorio = new Random();
        int sorteado = aleatorio.nextInt(1,100);

        int palpite;
        int tentativas = 0;

        do {
            palpite = Integer.parseInt(IO.readln("Entre com o palpite: "));

            if (palpite != sorteado) {
                String mensagem = String.format("Você errou. O número sorteado é %s que o palpite", (sorteado > palpite) ? "maior" : "menor");
                IO.println(mensagem);
                tentativas++;
            }
        } while (palpite != sorteado);

        String saida = String.format("Parabéns, você acertou! \nUsou %d tentativas",tentativas);
        IO.println(saida);
    }
}
