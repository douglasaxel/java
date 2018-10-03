
import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private long cnpj;
    private ArrayList<Livro> listaDeLivros;

    public Biblioteca() {
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

    public String mostrarLivros() {
        String r = "";

        for (int i = 0; i < this.listaDeLivros.size(); i++) {
            r += ":::::::::::::::::::::::::LIVRO " + (i + 1) + ":::::::::::::::::::::::::"
                    + this.listaDeLivros.get(i)
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n";
        }
        return r;

    }

    @Override
    public String toString() {
        String r = "\n"
                + "Nome: " + nome + "\n"
                + "CNPJ: " + cnpj + "\n";

        if (this.listaDeLivros.isEmpty()) {
            r += "\nNão existem livros cadastrados!\n";
        } else {
            r += "\nLista de livros\n" + this.mostrarLivros() + "\n";
        }
        return r;
    }

}
