package ro.ase.cts.prototype;

public class Bilet implements Copiator {
	private int cod;
	private String echipaA;
	private String ora;
	private String echipaB;
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public Bilet(int cod, String echipaA, String echipaB, String ora) {
		super();
		this.cod = cod;
		this.echipaA = echipaA;
		this.ora = ora;
		this.echipaB = echipaB;
	}
	
	private Bilet() {}

	@Override
	public Copiator copiaza() {
		Bilet bilet=new Bilet();
		bilet.cod=this.cod;
		bilet.echipaA=this.echipaA;
		bilet.echipaB=this.echipaB;
		bilet.ora=this.ora;
		
		return bilet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [cod=").append(cod).append(", echipaA=").append(echipaA).append(", ora=").append(ora)
				.append(", echipaB=").append(echipaB).append("]");
		return builder.toString();
	}
	
}
