package engtelecom.poo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void lerArquivo(String nomeArquivo) {
        try(Scanner leitor = new Scanner(new File(nomeArquivo))) {
            while (leitor.hasNext()) {
                IO.println(leitor.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo");
        }
    }

    public static void calculadora(){
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

    public static void main(String[] args) {
        calculadora();

        lerArquivo(".gitignore");
        lerArquivo(".ab");
    }
}
