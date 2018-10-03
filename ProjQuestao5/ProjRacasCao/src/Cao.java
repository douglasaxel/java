public class Cao {

    private String nome;
    private String raca;
    private String cor;
    private int idade;
    private String porte;
    private String dono;
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public String getCor() {
        return this.cor;
    }

    public int getIdade() {
        return this.idade;
    }
    
    public String getPorte() {
        return this.porte;
    }

    public String getDono() {
        return this.dono;
    }
    
    public String showAll(){
        return    "Nome: " + this.nome + "\n"
                + "Raça: " + this.raca + "\n"
                + "Cor: " + this.cor + "\n"
                + "Idade: " + this.idade + "\n"
                + "Porte: " + this.porte + "\n"
                + "Dono: " + this.dono + "\n\n\n";
    }
}
