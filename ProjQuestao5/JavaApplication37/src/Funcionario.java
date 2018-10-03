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
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getValorTotalPassagem() {
        return valorTotalPassagem;
    }

    public void setValorTotalPassagem(double valorTotalPassagem) {
        this.valorTotalPassagem = valorTotalPassagem;
    }

    public boolean isOpcaoVT() {
        return opcaoVT;
    }

    public void setOpcaoVT(boolean opcaoVT) {
        this.opcaoVT = opcaoVT;
    }
    
    public double calcularSalarioBruto(){
        return this.valorHora * this.cargaHoraria;
    }
    
    public void receberVT(){
        this.opcaoVT = true;
    }
    
    public void cancelarVT(){
        this.opcaoVT = false;
    }
    
    public String mostrarLegendaVT(){
        return "";
    }
    
    public double calcularVT(){
        if (opcaoVT) {
            double vt = this.calcularSalarioBruto() * 0.06;
        } else
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
