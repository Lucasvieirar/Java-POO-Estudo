package aula1;
public class Aula1 {
    public static  void main(String[] args){
            Caneta c1 = new Caneta();
            c1.modelo  = "Bic";
            c1.cor = "Azul";
            c1.ponta = 0.5f;
            c1.tampar();
            c1.rabiscar();
            c1.status();

            Caneta c2 = new Caneta();
            c1.modelo  = "Pilot";
            c1.cor = "Preta";
            c1.ponta = 0.8f;
            c1.destampar();
            c1.rabiscar();
            c1.status();
    }
}
