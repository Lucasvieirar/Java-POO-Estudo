/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[0] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo java", "Jose", 300, p[0]);
        l[0] = new Livro("Aprendendo poo", "Paulo", 500, p[1]);
        l[2] = new Livro("Java avançado", "Mateus", 800, p[0]);

        System.out.println(l[].detalhes());

        l[0].abir();
        l[0].folhar(100);
        l[0].avancarPag();
    }

}
