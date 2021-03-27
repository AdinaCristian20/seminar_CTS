package ro.ase.cts.factory;

public class Jucator {
	private String numeJucator;
	
	public String getNumeJucator() {
		return numeJucator;
	}

	public void setNumeJucator(String numeJucator) {
		this.numeJucator = numeJucator;
	}

	public Jucator(String numeJucator) {
		super();
		this.numeJucator = numeJucator;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [numeJucator=").append(numeJucator).append("]");
		return builder.toString();
	}
	
}
