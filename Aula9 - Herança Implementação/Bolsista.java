/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public final class Bolsista  extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada");

    }
    @Override
    public void pagarMensa(){
        System.out.println("A mensalidade do bolsista foi paga");
    }

}
