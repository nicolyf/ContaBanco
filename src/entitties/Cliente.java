package entitties;

public class Cliente {
	private String nome;
	
	public Cliente(){
		
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "Olá, " + this.getNome() +"!";
	}
}
