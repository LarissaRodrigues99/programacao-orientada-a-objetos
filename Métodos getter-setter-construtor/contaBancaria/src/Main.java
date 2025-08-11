 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(12568);
        p1.setDono("Ana");
        p1.abrirConta("CONTA CORRENTE");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(52897);
        p2.setDono("Giovane");
        p2.abrirConta("CONTA POUPANÇA");

        p1.depositar(100);
        p2.depositar(520);
        p2.sacar(200);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}