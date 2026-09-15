package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_MAX = 23;
    private static final int SEGUNDO_MINUTO_MAX = 59;

    private boolean valorValido(int valorMax, int valor) {
        return valorMax >= valor && valor >= 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        if (valorValido(HORA_MAX, hora) && valorValido(SEGUNDO_MINUTO_MAX, minuto) && valorValido(SEGUNDO_MINUTO_MAX, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Horario(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public Horario() {
        this(0, 0, 0);
    }

    private String numParaString(int valor, char genero) {
        String numero = switch (valor) {
            case 0 -> "zero";
            case 1 -> (genero == 'm') ? "um" : "uma";
            case 2 -> (genero == 'm') ? "dois" : "duas";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "catorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
        return numero;
    }

    private String retornaEmTexto(int valor, char genero) {
        if (valor > 20) {
            int d = (valor / 10) * 10;
            int u = valor % 10;

            return (u == 0) ? numParaString(d, genero) : String.format("%s e %s", numParaString(d, genero), numParaString(u, genero));
        }
        return numParaString(valor, genero);
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if (valorValido(HORA_MAX, hora)) {
            this.hora = hora;

            return true;
        }
        return false;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if (valorValido(SEGUNDO_MINUTO_MAX, minuto)) {
            this.minuto = minuto;

            return true;
        }
        return false;
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if (valorValido(SEGUNDO_MINUTO_MAX, segundo)) {
            this.segundo = segundo;

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String porExtenso() {
        String hora = String.format("%s %s", retornaEmTexto(this.hora, 'f'), (this.hora == 1) ? "hora" : "horas");
        String minuto = String.format("%s %s", retornaEmTexto(this.minuto, 'm'), (this.minuto == 1) ? "minuto" : "minutos");
        String segundo = String.format("%s %s", retornaEmTexto(this.segundo, 'm'), (this.segundo == 1) ? "segundo" : "segundos");

        return String.format("%s, %s e %s.", hora, minuto, segundo);
    }

    public long emSegundos() {
        return hora * 3600L + minuto * 60L + segundo;
    }

    public long diferencaEmSegundos(Horario horario) {
        return Math.abs(this.emSegundos() - horario.emSegundos());
    }
}
