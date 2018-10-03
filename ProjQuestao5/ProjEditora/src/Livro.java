
public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private Editora objEditora;
    
    public Livro(){
        this.objEditora = new Editora();
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getObjEditora() {
        return objEditora;
    }

    public void setObjEditora(Editora objEditora) {
        this.objEditora = objEditora;
    }
    
    public String toString(){
        return "Titulo: "+titulo+"\n"
                + "Autor: "+autor+"\n"
                + "Gênero: "+genero+"\n"
                + "ISBN: "+isbn+"\n"
                + objEditora.toString();
    }
    
}
