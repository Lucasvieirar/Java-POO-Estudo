
/**
 *
 * @author Lucas
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoas p1 =new Pessoas();
        Aluno p2 =new Aluno();
        Professor p3 =new Professor();
        Funcionario p4 =new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");

        p2.setNome("maria");
        p1.setSexo("f");

        p3.setNome("cláudio");
        p1.setSexo("m");

        p4.setNome("fabiana");
        p1.setSexo("f");

        p2.setCurso("informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.ReceberAum(550.20f);
        p4.mudarTrabalho();
        p2.cancelarMatri();
    }

}
