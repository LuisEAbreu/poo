package engtelecom.poo.animais;

public class Ornitorrinco extends Mamifero implements Oviparo{
    public Ornitorrinco(String nome) {
        super(nome);
    }

    @Override
    public String chocar() {
        return "";
    }

    @Override
    public String amamentar() {
        return "";
    }
}
