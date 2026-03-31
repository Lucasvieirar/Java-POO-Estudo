/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Livro  implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int  pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{titulo='" + titulo + "', autor='"
                + autor + "', totPaginas=" + totPaginas
                + ", pagAtual=" + pagAtual + ", aberto="
                + aberto + ", leitor='" + leitor + "'}";
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abir() {
        
        
    }

    @Override
    public void fechar() {
        
        
    }

    @Override
    public void folhear() {
        if (p > this.totPaginas){
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
        
    }

    @Override
    public void avancarPag() {
        
    }

    @Override
    public void voltarPag() {
        
    }

    
}
