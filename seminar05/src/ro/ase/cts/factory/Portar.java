package ro.ase.cts.factory;

public class Portar extends Jucator{
	public Portar(String numeJucator) {
		super(numeJucator);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getNumeJucator());
		return builder.toString();
	}


	
	
}
