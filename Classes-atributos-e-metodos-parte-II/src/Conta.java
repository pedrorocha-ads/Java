public class Conta {
    public String nome;
    public String CPF;
    public int banco;
    public int saldo;
    public boolean clienteEspecial;

    public Conta(String nome, String CPF, int banco, int saldo, boolean clienteEspecial) {
        this.nome = nome;
        this.CPF = CPF;
        this.banco = banco;
        this.saldo = saldo;
        this.clienteEspecial = clienteEspecial;
    }
    public double bonus(double valor){
        return saldo *0.1;
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else {
            this.saldo -= valor;
            System.out.println("Saldo após o saque : " + saldo);
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Saldo atualizado : " + saldo);
    }
    public void mostrarDados(){
        System.out.println("Nome: " + nome
        + "\nCPF: " + CPF
        + "\nBanco: " + banco
        + "\nSaldo: " + saldo
        + "\nbonus: " + bonus(saldo)
        + "\nCliente Especial: " + (clienteEspecial ? "Sim" : "Não")
        + "\nBonificação : " + calcularBonificacao());
    }
    public boolean clienteEspecial(){
        return clienteEspecial;
    }
    public void setClienteEspecial(boolean clienteEspecial){
        this.clienteEspecial = clienteEspecial;
    }
    public double calcularBonificacao(){
        if(clienteEspecial){
            return saldo * 0.1;
        }else{
            return saldo * 0.05;
        }
    }
    public void transferir(double valor, Conta destino){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferencia de R$ " + String.format("%.2f", valor) + " realizada com sucesso");
        }
    }
}
