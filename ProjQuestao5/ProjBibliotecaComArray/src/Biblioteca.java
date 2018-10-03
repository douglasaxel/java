
public class Biblioteca {

    private String nome;
    private long cnpj;
    private Livro[] listaDeLivros;

    public Biblioteca(int quantidadeLivros) {

        this.listaDeLivros = new Livro[quantidadeLivros];

        for (int i = 0; i < quantidadeLivros; i++) {
            this.listaDeLivros[i] = new Livro();
        }
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

    public Livro[] getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(Livro[] listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    @Override
    public String toString() {
        String r = "\n"
                + "Nome: " + nome + "\n"
                + "CNPJ: " + cnpj + "\n\n";
        for (int i = 0; i < this.listaDeLivros.length; i++) {
            r += "::::::::::::::::LIVRO " + (i + 1) + ":::::::::::::::" + this.listaDeLivros[i] + "\n";
        }
        return r;
    }

}
