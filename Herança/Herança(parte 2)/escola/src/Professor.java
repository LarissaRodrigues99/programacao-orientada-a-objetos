public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(){
        if (this.getSalario() < 1500){
            int porcentAum = 100 / 10;
            float aumento = getSalario() + porcentAum;
            System.out.println("Você vai receber um aumento de 10%, o valor vai para " + aumento);
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
