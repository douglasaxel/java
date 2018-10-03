
public class Contato {
    private String nome;
    private int fone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }    

    @Override
    public String toString() {
        return "\nNome: " + nome + "\n"
                + "Telefone: " + fone + "\n";
    }
}
