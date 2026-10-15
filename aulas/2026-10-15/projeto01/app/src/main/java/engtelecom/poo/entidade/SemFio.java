package engtelecom.poo.entidade;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao);

        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Frequência: ").append(frequencia).append("Hz").append("\n");
        sb.append("Canais: ").append(canais).append("\n");
        sb.append("Distância de Operação: ").append(distanciaOperacao);

        return super.toString() + sb.toString();
    }
}
