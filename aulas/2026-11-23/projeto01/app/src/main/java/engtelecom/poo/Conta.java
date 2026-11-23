package engtelecom.poo;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
}
