package ro.ase.cts.flyweight.models;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private String ora;
	
	public Rezervare(int nrMasa, int nrPersoane, String ora) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.ora = ora;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=").append(nrMasa).append(", nrPersoane=").append(nrPersoane).append(", ora=")
				.append(ora).append("]");
		return builder.toString();
	}
	
}
