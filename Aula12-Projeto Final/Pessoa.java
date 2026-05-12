/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(int idade, String nome, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", sexo=").append(sexo);
        sb.append(", experiencia=").append(experiencia);
        sb.append('}');
        return sb.toString();
    }



}
