/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Gafanhoto extends  Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String login, int idade, String nome, String sexo) {
        super(idade, nome, sexo);
        this.login = login;
        this.totAssistido = 0;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }


}
