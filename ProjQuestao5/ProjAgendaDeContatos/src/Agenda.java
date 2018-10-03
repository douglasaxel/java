
import java.util.ArrayList;


public class Agenda {
    private ArrayList<Contato> listaDeContatos;
    
    public Agenda(){
        listaDeContatos = new ArrayList<>();
    }    

    public ArrayList<Contato> getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(ArrayList<Contato> listaDeContatos) {
        this.listaDeContatos = listaDeContatos;
    }
    
    public String retornaListaNomeContatos(){
        String r = "";
        for (int i = 0; i < this.listaDeContatos.size(); i++) {
            r += "["+(i+1)+"] "+this.listaDeContatos.get(i).getNome()+"\n";
        }
        return r;
    }
    
    public void deletarContato(){
        
    }
    
    public Contato pesquisarContNome(String nome){
        Contato c1 = null;
        for (int i = 0; i < this.listaDeContatos.size() && c1 == null; i++) {
            if(this.listaDeContatos.get(i).getNome().equalsIgnoreCase(nome)){
                c1 = this.listaDeContatos.get(i);
            }//fim do if
        }//fim do for
        return c1;
    }

    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < listaDeContatos.size(); i++) {
            r += "\nNome: "+listaDeContatos.get(i).getNome()+"\n"
            + "Telefone: "+listaDeContatos.get(i).getFone()+"\n";
        }
        return "Lista de contatos\n" + r;
    }
    
    
}//fim da classe
