package engtelecom.poo;

public class Disciplina {
    private String nome;
    private String sigla;
    private int cargaHoraria;

    public void definirNome(String novoNome){
        nome = novoNome;
    }

    public void definirSigla(String novaSigla){
        sigla = novaSigla;
    }

    public void definirCargaHoraria(int valor){
        cargaHoraria = valor;
    }

    public String nome(){
        return nome;
    }

    public String sigla(){
        return sigla;
    }

    public int cargaHoraria(){
        return cargaHoraria;
    }
}
