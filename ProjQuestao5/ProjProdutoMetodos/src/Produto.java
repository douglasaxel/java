public class Produto {

    private String nome;
    private String descricao;
    private double valorUnitario;
    private double quantidade;

    public double calcularValorTotal() {
        return this.valorUnitario * this.quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorUn(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValorUn() {
        return this.valorUnitario;
    }

    public double getQuantidade() {
        return this.quantidade;
    }
    
    public String showAll(){
        return "Nome do produto: " + this.nome + "\n"
                + "Descrição: " + this.descricao + "\n"
                + "Valor unitário: " + this.valorUnitario + "\n"
                + "Quantidade: " + this.quantidade + "\n"
                + "Valor total: " + this.calcularValorTotal() + "\n\n\n";
    }

}
