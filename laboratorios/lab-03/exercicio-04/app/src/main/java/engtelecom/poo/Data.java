package engtelecom.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static final int DIA_MES_PADRAO = 1;
    private static final int ANO_PADRAO = 1970;

    private boolean verificaBissexto(int ano) {
        return ((ano % 4 == 0) && !((ano % 100 == 0) && !(ano % 400 == 0)));
    }

    private boolean verificaMes(int mes) {
        return mes > 0 && mes < 13;
    }

    private int retornaDiasDoMes(int mes, int ano) {
        if (verificaMes(mes)) {
            return switch (mes) {
                case 2 -> verificaBissexto(ano) ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };
        }
        return 0;
    }

    private boolean verificaData(int dia, int mes, int ano) {
        int qtdDiasMes = retornaDiasDoMes(mes, ano);
        return dia > 0 && dia <= qtdDiasMes;
    }

    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = DIA_MES_PADRAO;
            this.mes = DIA_MES_PADRAO;
            this.ano = ANO_PADRAO;
        }
    }

    public Data(int dia, int mes) {
        this(dia, mes, ANO_PADRAO);
    }

    public Data(int dia) {
        this(dia, DIA_MES_PADRAO, ANO_PADRAO);
    }

    public Data() {
        this(DIA_MES_PADRAO, DIA_MES_PADRAO, ANO_PADRAO);
    }

    public boolean setDia(int dia) {
        if (verificaData(dia, this.mes, this.ano)) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public boolean setMes(int mes) {
        if (verificaData(this.dia, mes, this.ano)) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public boolean setAno(int ano) {
        if (verificaData(this.dia, this.mes, ano)) {
            this.ano = ano;
            return true;
        }
        return false;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String porExtenso() {
        String mes = switch (this.mes) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            case 12 -> "dezembro";
            default -> "";
        };

        return String.format("%02d de %s de %04d", dia, mes, ano);
    }

    public int quantidadeDeDias() {
        int qtdDias = dia;

        for (int i = 1; i < mes; i++) {
            qtdDias += retornaDiasDoMes(i, ano);
        }

        return qtdDias;
    }

    public int diferencaEmDias(Data d) {
        Data maior;
        Data menor;

        if (this.ano > d.ano) {
            maior = this;
            menor = d;
        } else {
            maior = d;
            menor = this;
        }
        int dias = 0;

        for (int i = menor.ano; i < maior.ano; i++) {
            dias += verificaBissexto(i) ? 366 : 365;
        }

        dias += menor.quantidadeDeDias();
        dias -= maior.quantidadeDeDias();

        return Math.abs(dias);
    }
}
