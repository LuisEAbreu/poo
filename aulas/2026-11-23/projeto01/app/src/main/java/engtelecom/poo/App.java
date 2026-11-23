package engtelecom.poo;

import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        int a, b;

        try{
            a = Integer.parseInt(IO.readln("Entre com o número: "));
            b = Integer.parseInt(IO.readln("Entre com o número: "));

            int res = a / b;

            IO.println(a + " dividido por " + b + " = " + res);
        } catch (NumberFormatException e) {
            System.err.println("Só é permitido número inteiros");
        } catch (ArithmeticException e){
            System.err.println("Não é permitido dividir por zero");
        } catch (Exception e) {
            System.err.println("Comportamento inesperado");
        }
        IO.println("Fim do programa");
    }
}
