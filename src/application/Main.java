package application;
import entitties.Cliente;
import entitties.ContaCorrente;
import entitties.ContaEspecial;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("Nicoly");
		ContaCorrente cc = new ContaCorrente();
		ContaEspecial ce = new ContaEspecial(5000, c);
		ce.sacar(4000);
		ce.transferindoConta(cc);
		System.out.println(ce.toString());
		cc.depositar(2000);
		System.out.println(cc.toString());
		cc.transferindoConta(ce);
		System.out.println(cc.toString());
		ce.sacar(1000);
		ce.sacar(2000);
		ce.sacar(1000);
		ce.sacar(2000);
		ce.sacar(2000);
		ce.sacar(1000);
		System.out.println(ce.toString());
	}
	
}
