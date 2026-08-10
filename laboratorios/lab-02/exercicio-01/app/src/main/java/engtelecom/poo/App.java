package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mês: ");

        String estacao = switch (mes.toLowerCase()){
            case "janeiro","fevereiro" -> "verão";
            case "março" -> (dia < 20) ? "verão" : "outono";
            case "abril", "maio" -> "outono";
            case "junho" -> (dia < 21) ? "outono" : "inverno";
            case "julho", "agosto" -> "inverno";
            case "setembro" -> (dia < 22) ? "inverno" : "primavera";
            case "outubro", "novembro" -> "primavera";
            case "dezembro" -> (dia < 21) ? "primavera" : "verão";
            default -> "mês inválido";
        };
        String mensagem = String.format("No Brasil, o dia %d de %s é %s",dia, mes, estacao);
        IO.println(mensagem);
    }
}