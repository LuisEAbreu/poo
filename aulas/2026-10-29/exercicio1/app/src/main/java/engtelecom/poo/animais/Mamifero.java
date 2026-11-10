package engtelecom.poo.animais;

public abstract class Mamifero extends Animal{
    public Mamifero(String nome) {
        super(nome);
    }

    public abstract String amamentar();
}
