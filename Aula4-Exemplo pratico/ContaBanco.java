package Aula4-Exemplo pratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t= "CC"){
            this.setSaldo(50);

        } else if(t == "CP"){
            this.setSaldo(150);

        }
        System.out.println("Conta aberta");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada porque ainda tem débito");
        }else{
            this.setSaldo(false);
            System.out.println("Conta fechada");
        }
    }
    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
        } else{
            System.out.println("Impossivel depositar em um conta fechada");
        }
    }
    public void sacar(float v){
        if(this.isStatus()){
            if (this.getSaldo() >= v){
               this.setSaldo(this.setSaldo() - v);
                System.out.println("Saque realizado" + this.getDono());

            }else {
                System.out.println("Saldo insuficiente para saque");

            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo("CC")){
            v = 12;

        }else if( this.getTipo("CP")) {
            v = 20;

        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());

        } else{
            System.out.println("Impossivel pagar de uma conta fechada");

        }
    }
    ///
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
