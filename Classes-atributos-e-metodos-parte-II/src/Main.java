public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Pedro Rocha", "332.323.456-45", 8, 1200, true );
        Conta conta2 = new Conta("Andre", "787.341.567-14", 3, 1500, false);
//        conta1.mostrarDados(); // Dados do cliente
//        conta1.depositar(100); // Usado para realizar deposito
//        conta1.sacar(50); // Usado para realizar saque
//        conta1.transferir(500, conta2); //Usado para realizar transferencia da conta1 para conta2 ou vice versa
        conta1.mostrarDados();
        conta2.mostrarDados();
    }
}