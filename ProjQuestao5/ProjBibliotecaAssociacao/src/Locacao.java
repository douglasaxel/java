
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Locacao {

    private double valorLocacao;
    private double valorMulta;
    private Funcionario objFuncionario;
    private ArrayList<Funcionario> listaDeFuncionarios;
    private Usuario objUsuario;
    private ArrayList<Usuario> listaDeUsuarios;
    private Livro objLivro;
    private ArrayList<Livro> listaDeLivros;
    private Data dataLocacao;
    private Data dataDevolucao;

    public Locacao() {
        this.objFuncionario = new Funcionario();
        this.objUsuario = new Usuario();
        this.listaDeLivros = new ArrayList<>();
        this.listaDeFuncionarios = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
        this.dataLocacao = new Data();
        this.dataDevolucao = new Data();
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Funcionario getObjFuncionario() {
        return objFuncionario;
    }

    public void setObjFuncionario(Funcionario objFuncionario) {
        this.objFuncionario = objFuncionario;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }
    
    public ArrayList<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(ArrayList<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public ArrayList<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(ArrayList<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public Livro getObjLivro() {
        return objLivro;
    }

    public void setObjLivro(Livro objLivro) {
        this.objLivro = objLivro;
    }

    public ArrayList<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(ArrayList<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double calcularLocacao() throws ParseException {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/mm/yyyy");
        Date dataLoc = dataFormatada.parse(dataLocacao.toString());
        Date dataDev = dataFormatada.parse(dataDevolucao.toString());

        long dias = (dataDev.getTime() - dataLoc.getTime()) / 864000000;

        if (dias <= 7) {
            return this.valorLocacao;
        }
        return (dias - 7) * this.valorMulta + this.valorLocacao;
    }

    public void locarLivro() {
        this.objLivro.status = true;
    }

    public void devolverLivro() {
        this.objLivro.status = false;
    }

    @Override
    public String toString() {
        try {
            return "Valor locação: " + calcularLocacao() + "\n"
                    + "Valor multa: " + valorMulta + "\n";
        } catch (ParseException ex) {
            Logger.getLogger(Locacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
