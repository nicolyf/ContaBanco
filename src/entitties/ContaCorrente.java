package entitties;

public class ContaCorrente {
	private Cliente cliente;
	private float saldo;

	public ContaCorrente() {

	}
	
	public ContaCorrente(Cliente cliente) {
		this.cliente = cliente;
		this.setSaldo(0);
	}
	
	public void depositar(float valorDeposito) {
		this.setSaldo(getSaldo() + valorDeposito);
	}

	public boolean sacar(float valorSaque) {
		if (valorSaque <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valorSaque);
			return true;
		}
		return false;
	}

	public boolean transferindoConta(ContaEspecial conta) {
		conta.depositar(this.getSaldo());
		this.sacar(this.getSaldo());
		conta.setCliente(this.getCliente());
		return true;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getSaldo() {
		return this.saldo;
	}

	protected void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return this.getCliente() + "\nSeu saldo é: "+ this.getSaldo() + "\nVocê possui Conta Corrente.";
	}

}
