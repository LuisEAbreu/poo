package engtelecom.poo;

public class App {
    static void main(String[] args) {
        Aviao dc10 = new Aviao(3, 250, 70, "turbina", 3);

        IO.println(dc10.getMaxTripuplantes());
        IO.println(dc10.getMaxPassageiros());
        IO.println(dc10.getMaxCombustivel());
        IO.println(dc10.isLigado());
        IO.println(dc10.getTipoPropulsao());

        IO.println(dc10);

        dc10.ligarDeslgiar();

        IO.println(dc10);

        IO.println(dc10.ligarDeslgiarMotor(1));
        IO.println(dc10.ligarDeslgiarMotor(1));
        IO.println(dc10.ligarDeslgiarMotor(2));
        IO.println(dc10.ligarDeslgiarMotor(2));
        IO.println(dc10.ligarDeslgiarMotor(3));
    }
}
