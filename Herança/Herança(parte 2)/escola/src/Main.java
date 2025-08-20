//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa();

        Visitante v1 = new Visitante();

        v1.setNome("Fernanda");
        v1.setIdade(22);
        v1.setSexo('F');
        System.out.println(v1.toString());

        System.out.println("============================================");

        Aluno a1 = new Aluno();
        a1.setNome("Clarisse");
        a1.setIdade(15);
        a1.setSexo('F');
        a1.setMatricula(15488);
        a1.setCurso("Engenharia de dados");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        System.out.println("============================================");

        Bolsista b1 = new Bolsista();
        b1.setNome("Clovis");
        b1.setSexo('M');
        b1.setMatricula(15123);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        System.out.println("============================================");

        Professor p1 = new Professor();
        p1.setNome("Fabio");
        p1.setIdade(36);
        p1.setSexo('M');
        p1.setSalario(3200.15f);
        System.out.println(p1.toString());
        p1.setEspecialidade("Engenheiro de dados");

    }
}