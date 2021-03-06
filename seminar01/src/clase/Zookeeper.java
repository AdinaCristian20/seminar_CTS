package clase;

public class Zookeeper {
	private String nume;

	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	}
	
	public void feed(Animal a) {
		System.out.println("Ingrijitorul "+this.nume +" hraneste animalul "+a.getNume());
	}

}
