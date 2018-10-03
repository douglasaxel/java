public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String fone;
    private String sexo;
    private String email;
    private int qtdDependentes;
    private int chapa;
    private String cargo;
    private int tempoDeServicoAno;
    private double valorHora;
    private double cargaHorariaBase;
    private double qtdHorasExtras;
    boolean opcaoVT;
    private double valorTotalPassagem;
    private byte grauInsalubridade;

    public Funcionario(String nome, String cpf, String endereco, String fone, int chapa, double valorHora) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
        this.chapa = chapa;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFone() {
        return fone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(int qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    public int getChapa() {
        return chapa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTempoDeServicoAno() {
        return tempoDeServicoAno;
    }

    public void setTempoDeServicoAno(int tempoDeServicoAno) {
        this.tempoDeServicoAno = tempoDeServicoAno;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getCargaHorariaBase() {
        return cargaHorariaBase;
    }

    public void setCargaHorariaBase(double cargaHorariaBase) {
        this.cargaHorariaBase = cargaHorariaBase;
    }

    public double getQtdHorasExtras() {
        return qtdHorasExtras;
    }

    public void setQtdHorasExtras(double qtdHorasExtras) {
        this.qtdHorasExtras = qtdHorasExtras;
    }

    public double getValorTotalPassagem() {
        return valorTotalPassagem;
    }

    public void setValorTotalPassagem(double valorTotalPassagem) {
        this.valorTotalPassagem = valorTotalPassagem;
    }

    public byte getGrauInsalubridade() {
        return grauInsalubridade;
    }

    public void setGrauInsalubridade(byte grauInsalubridade) {
        this.grauInsalubridade = grauInsalubridade;
    }
    
    public String mostrarLegendaVT(){
        if (opcaoVT) {
            return "Sim, ganha VT";
        }
        return "Não, não ganha VT";
    }
    
    public void receberVT(){
        this.opcaoVT = true;
    }
    
    public void cancelarVT(){
        this.opcaoVT = false;
    }
    
    public Double calcularHoraExtra(){
        if (this.qtdHorasExtras <= 2){
            return (this.qtdHorasExtras * this.valorHora) /2;
        }
        return (this.qtdHorasExtras-1) * this.valorHora;
    }
    
    public double calcularSalarioBruto(){
        return (this.cargaHorariaBase * this.valorHora) + calcularHoraExtra();
    }
    
    public double calcularVT(){
        double vt = this.calcularSalarioBruto() * 0.06;
        if (this.valorTotalPassagem < vt) {
            return this.valorTotalPassagem;
        }
        return vt;
    }
    
    public double calcularINSS(){
        if (this.calcularSalarioBruto() <= 1399.12) {
            return this.calcularSalarioBruto() * 0.08;
        } else if (this.calcularSalarioBruto() <= 2331.88) {
            return this.calcularSalarioBruto() * 0.09;
        } else if (this.calcularSalarioBruto() <= 4663.75) {
            return this.calcularSalarioBruto() * 0.11;
        }
            return 513.0125;
    }
    
    public double calcularInsalubridade(){
        switch(this.grauInsalubridade){
            case 1:
                return 86.8;
            case 2:
                return 173.6;
            case 3:
                return 347.2;
            default:
                return 0;
        }
    }
    
    public double calcularSalarioFamilia(){
        switch(this.qtdDependentes) {
            case 0:
                return 0;
            case 1:
                return this.calcularSalarioBruto() * 0.02;
            case 2:
            case 3:
                return this.calcularSalarioBruto() * 0.04;
            default:
                return this.calcularSalarioBruto() * 0.05;
        }
    }
    
    public double calcularPlanoDeCarreira(){
        int pc = this.tempoDeServicoAno/3;
        return (0.05 * pc)*this.calcularSalarioBruto();
    }
    
    public double calcularPlanoDeSaude(){
        return (this.calcularSalarioBruto() * 0.005) + (this.qtdDependentes / 100) * this.calcularSalarioBruto();
    }
    
    public double calcularSalarioLiquido(){
        return calcularSalarioBruto() + calcularInsalubridade() + calcularPlanoDeCarreira()  + calcularSalarioFamilia() - calcularPlanoDeSaude() - calcularINSS() - calcularVT();
    }
    
    @Override
    public String toString(){
        return "\nDados do funcionário\n"
                + "Nome: " + this.nome + "\n"
                + "CPF: " + this.cpf + "\n"
                + "RG: " + this.rg + "\n"
                + "Endereço: " + this.endereco + "\n"
                + "Fone: " + this.fone + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "E-mail: " + this.email + "\n"
                + "Quantidade de dependentes: " + this.qtdDependentes + "\n"
                + "Chapa: " + this.chapa + "\n"
                + "Cargo: " + this.cargo + "\n"
                + "Tempo de serviço: " + this.tempoDeServicoAno + "\n"
                + "Valor hora: R$ " + this.valorHora + "\n"
                + "Carga horária base: " + this.cargaHorariaBase + "\n"
                + "Horas extras: " + this.qtdHorasExtras + "\n"
                + "Valor da passagem: " + this.valorTotalPassagem + "\n"
                + "Grau de insalubridade: " + this.grauInsalubridade + "\n"
                + "Salario bruto: R$ " + this.calcularSalarioBruto() + "\n"
                + "Valor das horas extras: R$ " + this.calcularHoraExtra() + "\n"
                + "Vale transporte: R$ " + this.calcularVT() + "\n"
                + "INSS: R$ " + this.calcularINSS() + "\n"
                + "Valor de insalubridade: R$ " + this.calcularInsalubridade() + "\n"
                + "Salario familia: R$ " + this.calcularSalarioFamilia() + "\n"
                + "Plano de carreira: R$ " + this.calcularPlanoDeCarreira() + "\n"
                + "Plano de saúde: R$ " + this.calcularPlanoDeSaude() + "\n"
                + "Salario liquido: R$ " + this.calcularSalarioLiquido();
    }
}
