
public class Venda {
    private int codigo;
    private Data dataVenda;
    private Livro objLivro;
    private Livro objLivro1;
    
    public Venda(){
        this.dataVenda = new Data();
        this.objLivro = new Livro();
        this.objLivro1 = new Livro();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public double calcularVenda(){
        return objLivro.getValor() + objLivro1.getValor();
    }

    public Livro getObjLivro() {
        return objLivro;
    }

    public void setObjLivro(Livro objLivro) {
        this.objLivro = objLivro;
    }

    public Livro getObjLivro1() {
        return objLivro1;
    }

    public void setObjLivro1(Livro objLivro1) {
        this.objLivro1 = objLivro1;
    }
    
    @Override
    public String toString(){
        return "Informações do livro 1\n"
                + objLivro.toString()+"\n\n"
                + "Informações do livro 2\n"
                + objLivro1.toString()+"\n";
    }
}
