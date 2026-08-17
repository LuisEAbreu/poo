package engtelecom.poo;

public class Personagem {
    private String nome;
    private int vida = 100;
    private String classeCombate;

    public void definirNome(String entrada){
        nome = entrada;
    }

    public void dano(int quantidadeDano){
        if(quantidadeDano > 0){
            vida = Math.max(vida - quantidadeDano, 0);
        }
    }

    public void definirClasse(String classe){
        classeCombate = classe;
    }

    public String nome(){
        return nome;
    }

    public int vitalidade(){
        return vida;
    }

    public String consultarClasse(){
        return classeCombate;
    }
}
