
public class Livro {
    private String titulo;
    private String autor;
    private long isbn;
    private double valor;
    private Data dataLancamento;
    
    public Livro(){
        this.dataLancamento = new Data();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Data getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Data dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String toString(){
        return "Titulo: "+titulo+"\n"
                + "Autor: "+autor+"\n"
                + "ISBN: "+isbn+"\n"
                + "Data de lançamento: "+dataLancamento.toString();
    }
}
