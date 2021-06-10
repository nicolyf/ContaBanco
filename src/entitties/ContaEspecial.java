package entitties;

public class ContaEspecial extends ContaCorrente {
	private float limite;

	public ContaEspecial() {

	}

	public ContaEspecial(Cliente cliente) {
		super(cliente);
		this.setLimite(4000);
		this.setSaldo(0);
	}

	public boolean transferindoConta(ContaCorrente conta) {
		conta.depositar(this.getSaldo());
		this.sacar(this.getSaldo());
		conta.setCliente(this.getCliente());
		return true;
	}

	private void setLimite(float limite) {
		this.limite = limite;
	}

	public float getLimite() {
		return this.limite;
	}

	@Override
	public boolean sacar(float valorSaque) {
		if (valorSaque <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valorSaque);
			return true;
		}
		if (this.getSaldo() <= 0 && valorSaque <= this.getLimite()) {
			this.setLimite(this.getLimite() - valorSaque);
			this.setSaldo(this.getSaldo() - valorSaque);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.getCliente() + "\nSeu saldo é: " + this.getSaldo() + "\nVocê possui Conta Especial.";
	}

}
