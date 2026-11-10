package engtelecom.poo;

public class Email {
    private String valor;

    public Email(String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        if(valor.matches(eR)) {
            this.valor = valor;
        }
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(valor);

        return sb.toString();
    }
}
