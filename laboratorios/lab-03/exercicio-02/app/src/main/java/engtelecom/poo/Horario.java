package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_MAX = 23;
    private static final int SEGUNDO_MINUTO_MAX = 59;

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Horario(int hora, int minuto){
        this(hora, minuto, 0);
    }

    public Horario(int hora){
        this(hora, 0, 0);
    }

    public Horario(){
        this(0, 0, 0);
    }

    private String extensoInterno(int valor){
        String numero;
        if (valor < 20 && valor >= 10) {
            numero = switch (valor) {
                case 10 -> "Dez";
                case 11 -> "Onze";
                case 12 -> "Doze";
                case 13 -> "Treze";
                case 14 -> "Catorze";
                case 15 -> "Quinze";
                case 16 -> "Dezesseis";
                case 17 -> "Dezessete";
                case 18 -> "Dezoito";
                case 19 -> "Dezenove";
                default -> "";
            };
        }
        return numero;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    private int valorValido(int valorMax, int valor){
        if (valor >= 0){
            return Math.max(valorMax, valor);
        }
        return 0;
    }


}
