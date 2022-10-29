//implementação de uma interface
public interface IConta {
	
	void sacar(double valor);
		
	void depositar(double valor);
		
	void tranferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
	
}
