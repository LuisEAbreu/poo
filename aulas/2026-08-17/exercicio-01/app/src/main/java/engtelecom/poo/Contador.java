package engtelecom.poo;

public class Contador {
    private int valorAtual;

    public void atribuirValor(int valor){
        valorAtual = (valor >= 0) ? valor : valorAtual;
    }

    public void incrementar(){
        valorAtual++;
    }

    public int obterValor(){
        return valorAtual;
    }
}
