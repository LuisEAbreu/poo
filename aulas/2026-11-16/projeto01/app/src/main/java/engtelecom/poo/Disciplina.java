package engtelecom.poo;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias;

    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    public String getSigla() {
        return sigla;
    }

    public DiasDaSemana[] getDias() {
        return dias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Sigla: ").append(sigla).append("\n");
        sb.append("Dias com aula:").append("\n");
        for (DiasDaSemana dia : dias) {
            sb.append(" - ").append(dia.nome).append("\n");
        }
        return sb.toString();
    }
}
