
public class Main {

	public static void main(String[] args) {
		
		Cliente igor = new Cliente();
		igor.setNome("Igor");

		Conta cc = new ContaCorrente(igor);
		cc.depositar(500);

		Conta poupanca = new ContaPoupanca(igor);
		cc.transferir(100, poupanca);
		cc.sacar(50);
		
		poupanca.sacar(50);
		
				

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
