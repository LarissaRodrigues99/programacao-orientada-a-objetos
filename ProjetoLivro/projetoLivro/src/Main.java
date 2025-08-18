//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        p[0] = new Pessoa("Amanda", 26,'F');
        p[1] = new Pessoa("Junior", 19, 'M');

        l[0] = new Livro("A branca de neve", "Irmãos Grimm", 100,p[0]);
        l[1] = new Livro("O codificador limpo", "Robert C. Martin", 210,p[1]);
        l[2] = new Livro("O madico de Oz", "Frank Baum",300, p[1]);

        l[0].abrir();
        l[0].folhear(10);
        l[0].avancarPag();
        l[0].fechar();
        l[0].detalhes();

        System.out.println("======================================");

        l[1].abrir();
        l[1].folhear(10);
        l[1].avancarPag();
        l[1].voltarPag();
        l[1].detalhes();

    }
}