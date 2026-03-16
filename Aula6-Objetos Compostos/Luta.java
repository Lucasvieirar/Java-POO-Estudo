
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiente;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiente() {
        return desafiente;
    }

    public void setDesafiente(Lutador desafiente) {
        this.desafiente = desafiente;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLutar(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){

            this.aprovada = true;
            this.desafiado = l1;
            this.desafiente = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiente = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            this.desafiado.apresentar();
            this.desafiente.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: 
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiente.empatarLuta();
                    break;
                case 1:
                    System.out.println("Desafiado ganhou");
                    this.desafiado.ganharLuta();
                    this.desafiente.PerderLuta();
                    break;
                case 2:
                    System.out.println("Desafiante ganhou");
                    this.desafiado.PerderLuta();
                    this.desafiente.ganharLuta();
                    break;

            }
        }else{
            System.out.println("Luta não aconteceu");
        }

    }
}
