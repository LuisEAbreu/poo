package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String valor;

    public Telefone(String valor) {
        this.valor = valor;
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
        sb.append(this.formata("+## (##) #####-####", valor));

        return sb.toString();
    }

    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
