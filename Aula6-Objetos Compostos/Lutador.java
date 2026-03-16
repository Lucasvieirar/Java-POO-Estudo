public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.getNome();
        this.getNacionalidade();
        this.getIdade();
        this.getAltura();
        this.getVitoria();
        this.getDerrota();
        this.getEmpates();
    }
    public String getNome(){
        return  nome;
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }

    
    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

   private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Peso inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";

        } else if (this.peso<=83.9) {
            this.categoria = "Médio";

        } else if (this.peso<= 120.2) {
            this.categoria = "Pesado";

        }else{
            this.categoria = "Inválido";
        }
   }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("lutador" + this.getNome());
        System.out.println("Origem"+ this.getNacionalidade());
        System.out.println("Idade" + this.getIdade());
        System.out.println("altura" + this.getAltura());
        System.out.println("peso" + this.getPeso());
        System.out.println("Ganhou" + this.getVitoria());
        System.out.println("perdeu" + this.getDerrota());
        System.out.println("empatou" + this.getEmpates());
    }
    public void status(){

    }
    public void ganharLuta(){
         setVitoria(getVitoria() + 1);
    }
    public void PerderLuta(){
             setDerrota(getDerrota() + 1);
    }
    public void empatarLuta(){
             setEmpates(getEmpates() + 1);
    }
}
