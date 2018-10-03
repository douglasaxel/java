
public class Aluno {
    private String nome;
    private byte idade;
    private Avaliacao objAvaliacao1;
    private Avaliacao objAvaliacao2;
    
    public Aluno(){
        this.objAvaliacao1 = new Avaliacao();
        this.objAvaliacao2 = new Avaliacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public Avaliacao getObjAvaliacao1() {
        return objAvaliacao1;
    }

    public void setObjAvaliacao1(Avaliacao objAvaliacao1) {
        this.objAvaliacao1 = objAvaliacao1;
    }

    public Avaliacao getObjAvaliacao2() {
        return objAvaliacao2;
    }

    public void setObjAvaliacao2(Avaliacao objAvaliacao2) {
        this.objAvaliacao2 = objAvaliacao2;
    }
    
    public double calcularMedia(){
        return (this.objAvaliacao1.getNota() + this.objAvaliacao2.getNota())/2;
    }
    
    @Override
    public String toString(){
        return "Dados do aluno \n"
                + "Nome: "+this.idade+"\n"
                + "Idade: "+this.idade+"\n"
                + "Nota 1: "+objAvaliacao1.toString()
                + "Nota 2: "+objAvaliacao2.toString()
                + "Media: "+calcularMedia();
    }
}
