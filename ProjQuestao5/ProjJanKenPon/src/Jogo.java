
public class Jogo {

    JanKenPon usuario;
    JanKenPon computador;

    public Jogo(byte jogadaUsuario) {
        this.usuario = new JanKenPon(jogadaUsuario);
        byte sorteio = (byte)(Math.random()*3+1);
        this.computador = new JanKenPon(sorteio);
    }

    public String verificarVencedor() {
        byte usu = this.usuario.getJogada();
        byte pc = this.computador.getJogada();

        if (pc == usu) {
            return "Empate";
        } else if (usu == 1 && pc == 3 || usu == 2 && pc == 1 || usu == 3 && pc == 2) {
            return "Usuário vence!";
        } else {
            return "Computador vence!";
        }
    }

    @Override
    public String toString() {
        return "Usuário jogou: " + usuario + "\n"
                + "Computador jogou: " + computador;
    }
}
