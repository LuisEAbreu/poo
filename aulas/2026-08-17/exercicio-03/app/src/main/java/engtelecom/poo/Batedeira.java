package engtelecom.poo;

public class Batedeira {
    private double preco;
    private String cor;
    private String marca;
    private int potencia;

    public void definirPreco(double valor){
        preco = valor;
    }

    public void definirCor(String novaCor){
        cor = novaCor;
    }

    public void definirMarca(String novaMarca){
        marca = novaMarca;
    }

    public void definirPotencia(int valor){
        potencia = valor;
    }

    public double preco(){
        return preco;
    }

    public String cor(){
        return cor;
    }

    public String marca(){
        return marca;
    }

    public int potencia(){
        return potencia;
    }
}
