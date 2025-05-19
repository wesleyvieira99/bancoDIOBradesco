public class BancoDigitalApp {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alice");
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        cc.depositar(500);
        cc.imprimirExtrato();

        cp.imprimirExtrato();

        cc.transferir(200, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}