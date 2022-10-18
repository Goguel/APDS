package dominio;

public class Pessoa {
	
	private String nome;
	private int CPF;
	private int numEmpresas;
	
	public int getNumEmpresas() {
		return numEmpresas;
	}
	public void setNumEmpresas(int numEmpresas) {
		this.numEmpresas = numEmpresas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
}