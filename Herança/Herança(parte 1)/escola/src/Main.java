public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Clara");
        p2.setNome("Patric");
        p3.setNome("Victor");
        p4.setNome("Julia");

        p1.setSexo('F');
        p2.setSexo('M');
        p3.setSexo('M');
        p4.setSexo('F');

        p1.setIdade(16);
        p2.setIdade(15);
        p3.setIdade(30);
        p4.setIdade(25);

        p2.setCurso("Informática");
        p3.setSalario(2500.0f);
        p4.setSetor("Biblioteca");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}