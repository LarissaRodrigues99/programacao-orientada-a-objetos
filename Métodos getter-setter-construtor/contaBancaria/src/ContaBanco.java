public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() { return status; }

    public void setStatus(boolean status) { this.status = status; }

    public void estadoAtual(){
        System.out.println("=============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if("CONTA CORRENTE".equals(t)){
            this.setSaldo(50);
        } else if("CONTA POUPANÇA".equals(t)){
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0.0f) {
            System.out.println("Realize o saque");
        } else if(this.getSaldo() < 0.0f){
            System.out.println("Pague o valor devedor");
        }else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Conta fechada! Deve estar com a conta ativa para realizar o deposito.");
        }
    }
    public void sacar(float v){
        if((this.getStatus())) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else if (saldo < v) {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (getTipo() == "CC"){
            v = 12;
        }else if(getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else {
            System.out.println("Não foi possivel pagar, conta fechada.");
        }
    }

}
