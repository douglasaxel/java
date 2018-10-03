
import java.util.ArrayList;


public class Biblioteca {
    private String nome;
    private long cnpj;
    private ArrayList<Livro> listaDeLivros;
    
    public Biblioteca(){
        this.listaDeLivros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(ArrayList<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }
    
    public String mostrarLivros(){
        String r = "";
        
        for (int i = 0; i < listaDeLivros.size(); i++) {
            r += "::::::::::::::::LIVRO "+(i+1)+"::::::::::::::::"
                    + this.listaDeLivros.get(i)
               + ":::::::::::::::::::::::::::::::::::::::::::\n\n";
        }
        return r;
    }

    @Override
    public String toString() {
        String r = "Nome:" + nome + "\n"
                + "cnpj: " + cnpj + "\n";
        
        if (this.listaDeLivros.isEmpty()) {
            r += "Não existem livros cadastrados.";
        } else {
            r += "listaDeLivros: " + this.mostrarLivros();
        }
        return r;
    }
}
