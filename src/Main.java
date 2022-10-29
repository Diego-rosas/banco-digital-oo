
public class Main {

	public static void main(String[] args) {
	    Cliente diego = new Cliente();
	    diego.setNome("Diego");
	    
		Conta cc = new ContaCorrente(diego);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(diego);
		cc.tranferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
