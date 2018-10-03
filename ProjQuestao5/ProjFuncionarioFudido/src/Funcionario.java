public class Funcionario {
    private String nome;
    private long cpf;
    private double valorHora;
    private double cargaHoraria;
    private String email;
    private double valorTotalPassagem;
    private boolean opcaoVT;
    
    public Funcionario(String nome, long cpf, double valorHora, double cargaHoraria, double valorTotalPassagem){
        this.nome = nome;
        this.cpf = cpf;
        this.valorHora = valorHora;
        this.cargaHoraria = cargaHoraria;
        this.valorTotalPassagem = valorTotalPassagem;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    
    public void setCargaHoraria(double cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setValorTotalPassagem(double valorTotalPassagem){
        this.valorTotalPassagem = valorTotalPassagem;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public long getCpf(){
        return this.cpf;
    }
    
    public double getValorHora(){
        return this.valorHora;
    }
    
    public double getCargaHoraria(){
        return this.cargaHoraria;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public double getValorTotalPassagem(){
        return this.valorTotalPassagem;
    }
    
    public double calcularSalarioBruto(){
        return this.valorHora*this.cargaHoraria;
    }
    
    public void receberVT(){
        this.opcaoVT = true;
    }
    
    public void cancelarVT(){
        this.opcaoVT = false;
    }
    
    public String mostrarLegendaVT(){
        if (opcaoVT) {
            return "Sim, receber VT";
        }
        return "Não, não receber VT";
    }
    
    public double calcularVT(){
        if (this.calcularSalarioBruto()*0.06 > this.valorTotalPassagem) {
            return this.valorTotalPassagem;
        }
        return this.calcularSalarioBruto() * 0.06;
    }
    
    public double calcularSalarioLiquido(){
        return this.calcularSalarioBruto() - this.calcularVT();
    }
    
    @Override
    public String toString(){
        return "";
    }
}