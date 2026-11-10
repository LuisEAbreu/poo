package engtelecom.poo.personagens;

public class Aldeao extends Personagem {
    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "Aldeão se movendo com velocidade: " + this.velocidade;
    }

    @Override
    public String atacar(){
        return "Aldeão atacando com força: " + this.ataque;
    }
}
