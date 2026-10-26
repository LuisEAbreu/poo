package engtelecom.poo.personagens;

public class Arqueiro extends Personagem {
    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String mover() {
        return "Arqueiro se movendo com velocidade: " + this.velocidade;
    }

    @Override
    public String atacar(){
        return "Arqueiro atacando com força: " + this.ataque;
    }
}
