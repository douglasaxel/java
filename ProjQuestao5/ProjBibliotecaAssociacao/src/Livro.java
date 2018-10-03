
public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    protected boolean status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String mostrarStatus(){
        if(status){
            return "não disponível";
        }
        return "Disponível";
    }
    
    @Override
    public String toString(){
        return "Titulo: "+titulo+"\n"
                + "Genero: "+genero+"\n"
                + "Autor: "+autor+"\n"
                + "Status: "+mostrarStatus();
    }
}
