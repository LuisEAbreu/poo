package engtelecom.poo;

public class Motor {
    int hp;
    int giroAtual;
    int cilindros;

    public Motor(int hp, int cilindros) {
        this.hp = hp;
        this.giroAtual = 0;
        this.cilindros = cilindros;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    public void setGiroAtual(int giroAtual) {
        this.giroAtual = giroAtual;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public void acelerar(int v){
        this.giroAtual += v;
    }
}
