package engtelecom.poo.personagens;

public class Cavaleiro extends Personagem {
    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String mover() {
        return "Cavaleiro se movendo com velocidade: " + this.velocidade;
    }

    @Override
    public String atacar(){
        return "Cavaleiro atacando com força: " + this.ataque;
    }
}
