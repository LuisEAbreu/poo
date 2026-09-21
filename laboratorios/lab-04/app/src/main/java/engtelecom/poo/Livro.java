package engtelecom.poo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    private boolean verificaNullOuEmpty(String s){
        if(s == null){
            return true;
        }
        return s.isEmpty();
    }

    public Livro(String isbn, String titulo, String autor, int anoPublicacao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean setTitulo(String titulo) {
        if(!verificaNullOuEmpty(titulo)){
            this.titulo = titulo;
            return true;
        }
        return false;
    }

    public boolean setAutor(String autor) {
        if(!verificaNullOuEmpty(titulo)){
            this.autor = autor;
            return true;
        }
        return false;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("ISBN: ").append(isbn);
        sb.append("\nTítulo: ").append(titulo);
        sb.append("\nAutor: ").append(autor);
        sb.append("\nAno de publicação: ").append(anoPublicacao);
        sb.append("\n").append(codigoDeBarra());

        return sb.toString();
    }

    public String retornaIsbnTitulo() {
        final StringBuilder sb = new StringBuilder();

        sb.append("ISBN: ").append(isbn);
        sb.append(" Título: ").append(titulo);

        return sb.toString();
    }

    public String codigoDeBarra(){
        int largura = 105;
        int altura = 5;
        StringBuilder saida = new StringBuilder();

        try{
            EAN13Writer writer = new EAN13Writer();

            BitMatrix matrix = writer.encode(isbn, BarcodeFormat.EAN_13, largura, 1);

            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < matrix.getWidth(); j++) {
                    if(matrix.get(j, 0)){   // se bit == 1
                        saida.append("\u2588");
                    } else {
                        saida.append(" ");
                    }
                }
                saida.append("\n");
            }
        } catch (Exception e){}

        return saida.toString();
    }

}
