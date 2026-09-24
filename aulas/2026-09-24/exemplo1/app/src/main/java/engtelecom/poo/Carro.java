package engtelecom.poo;

public class Carro {
    String marca;
    Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Motor propulsor) {
        this.propulsor = propulsor;
    }

    void acelerar(int v){
        this.propulsor.acelerar(v);
    }
}
