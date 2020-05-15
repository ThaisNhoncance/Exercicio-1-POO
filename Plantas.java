package classes;

public class Plantas {
	
	private String nome;
	private double tamanho;
	private boolean flores;
	private boolean seca;
	
	
	public Plantas(String no, double ta, boolean fl,  boolean seca) {
		this.nome = no;
		this.tamanho = ta;
		this.flores = false;
		this.seca = false;
	}
	
	
	public boolean getSeca() {
		return seca;
	}
	public void setSeca(boolean seca) {
		this.seca = seca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double ta) {
		this.tamanho = ta;
	}
	public boolean getFlores() {
		return flores;
	}
	public void setFlores(boolean fl) {
		this.flores = fl;
	}
	
	
	public void regarPlanta() {
		this.setSeca(false);
		this.setFlores(true);
		this.setTamanho(this.getTamanho()+3);
		System.out.println("Plantinha regada!" + "\nParece que ela cresceu!");
	}
	
	public void podarPlanta() {
		this.setTamanho(this.getTamanho()-3);
		this.setFlores(false);
		System.out.println("Plantinha podada!" + "\nParece que ela diminuiu!");
	}
	
	public void tomarSol() {
		this.setSeca(true);
		System.out.println("A plantinha ficou muito tempo no sol!" + "\nPrecisa ser regada!");
	}


	@Override
	public String toString() {
		return "=====================================================================================\n" +
				"Plantinha Info\n" + "Nome: " + nome + "\nTamanho: " + tamanho + "\nPossui flores? " 
				+ flores + "\nEsta seca? " + seca +
				"\n=====================================================================================\n";
	}
	
	
}
