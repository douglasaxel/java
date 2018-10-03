
public class Aluno {

    public String nome;
    public long ra;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarConceito() {

        if (this.calcularMedia() >= 9) {
            return "A";
        } else if (this.calcularMedia() >= 8) {
            return "B";
        } else if (this.calcularMedia() >= 6) {
            return "C";
        } else {
            return "D";
        }
    }
}
