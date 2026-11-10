package engtelecom.poo.animais;

public abstract class Ave extends Animal implements Oviparo{
    public Ave(String nome) {
        super(nome);
    }

    @Override
    public abstract String chocar();
}
