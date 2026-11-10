package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Robo robo1 = new Robo("Megatron");
        Robo robo2 = new Robo("Optimus Prime");
        Robo robo3 = new Robo();

        IO.println(robo1);

        IO.println(robo2);

        IO.println(robo3);

        robo3.setNome("Bumblebee");

        IO.println("Após alteração:");
        IO.println(robo3);

        IO.println("Apresentação do robo 1:");
        IO.println(robo1.apresentar());

        IO.println("Total de robôs criados: " + Robo.getQuantidadeCriada());
    }
}
