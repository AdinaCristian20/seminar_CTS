package ro.ase.cts.factory;

public class Atacant extends Jucator{

	public Atacant(String numeJucator) {
		super(numeJucator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getNumeJucator());
		return builder.toString();
	}
	
}
