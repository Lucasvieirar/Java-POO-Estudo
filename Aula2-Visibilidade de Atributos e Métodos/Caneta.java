package aula2;
public class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    void status(){
        System.out.println("Uma caneta " + this.cor );
        System.out.println("Está tampada? " + this.tampada );
        System.out.println("Ponta" + this.ponta);
        System.out.println("Carga" + this.carga);
        System.out.println("modelo" + this.modelo);
    }
   public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Caneta.java tampada");
        } else{
            System.out.println("Rabiscando");
        }

    }

   public void tampar(){
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}