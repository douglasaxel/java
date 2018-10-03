public class Saque {
    private int valor;
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return 0;
    }
    
    public int calcularNotaDe100(int valor){
        return this.valor/100;
        //resto de um valor * por 100 / por 50;
    }
    
    public int calcularNotaDe50(int valor){
        return this.valor/50;
    }
    
    public int calcularNotaDe5(int valor){
        return this.valor/5;
    }
    
    public int calcularNotaDe1(int valor){
        return this.valor/1;
    }
    
    public String mostrarTudo(){
        
        return "";
    }
}
