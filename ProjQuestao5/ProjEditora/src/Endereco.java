
public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private int cep;
    private String cidade;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public String toString(){
        return "Rua: "+rua+"\n"
                + "Número: "+numero+"\n"
                + "Bairro: "+bairro+"\n"
                + "CEP: "+cep+"\n"
                + "Cidade: "+cidade+"\n";
    }
}
