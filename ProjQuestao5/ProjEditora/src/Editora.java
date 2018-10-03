
public class Editora {
    private String nome;
    private long cnpj;
    private String fone;
    private Endereco objEndereco;
    
    public Editora(){
        this.objEndereco = new Endereco();
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

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Endereco getObjEndereco() {
        return objEndereco;
    }

    public void setObjEndereco(Endereco objEndereco) {
        this.objEndereco = objEndereco;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome+"\n"
                + "CNPJ: "+cnpj+"\n"
                + "Telefone: "+fone+"\n"
                + objEndereco.toString();
    }
}
