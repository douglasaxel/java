public class Nadador {
    private String nome;
    private byte idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(byte idade){
        this.idade = idade;
    }
    
    public String classificarNadador(){
        if (this.idade < 8 || this.idade > 60) {
            return "Não pode ser nadador, mínimo 8 anos e no máximo 60";
        } else if (this.idade <= 10) {
            return "Infantil";
        } else if (this.idade < 18) {
            return "Juvenil";
        } else if (this.idade < 50) {
            return "adulto";
        } 
            return "Terceira idade";
    }
    
    public String mostrarTudo(){
        return    "Nome: "+this.nome+"\n"
                + "idade: "+this.idade+"\n"
                + "Classificação: "+this.classificarNadador();
    }
}
