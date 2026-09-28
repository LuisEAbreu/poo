package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripuplantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private boolean ligado;
    private String tipoPropulsao;
    private ArrayList<Motor> propulsores;

    public Aviao(int maxTripuplantes, int maxPassageiros, int maxCombustivel, String tipoPropulsao, int qtdMotores) {
        this.maxTripuplantes = maxTripuplantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.ligado = false;
        this.tipoPropulsao = tipoPropulsao;

        this.propulsores = new ArrayList<>();

        for (int i = 0; i < qtdMotores; i++) {
            propulsores.add(new Motor(tipoPropulsao));
        }
    }

    public int getMaxTripuplantes() {
        return maxTripuplantes;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public int getMaxCombustivel() {
        return maxCombustivel;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getTipoPropulsao() {
        return tipoPropulsao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Número máximo de tripulantes: ").append(maxTripuplantes);
        sb.append("\nNúmero máximo de passageiros: ").append(maxPassageiros);
        sb.append("\nCapacidade máxima de combustível: ").append(maxCombustivel);
        sb.append("\nEstado: ").append(ligado?"ligado":"desligado").append("\n");
        sb.append(propulsores.size()).append(" propulsores do tipo ").append(tipoPropulsao);

        return sb.toString();
    }

    public boolean ligarDeslgiar(){
        this.ligado = !ligado;

        propulsores.forEach(e -> e.setLigado(ligado));

        return ligado;
    }

    public boolean ligarDeslgiarMotor(int numMotor){
        Motor m = propulsores.get(numMotor);

        m.ligarDesligar();

        return m.isLigado();
    }
}
