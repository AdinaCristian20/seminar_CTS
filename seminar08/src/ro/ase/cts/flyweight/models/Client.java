package ro.ase.cts.flyweight.models;

public class Client implements FlyweightAbstract{
	private String nume;
	private String nrTelefon;
	private String email;
	

	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=").append(nume).append(", nrTelefon=").append(nrTelefon).append(", email=")
				.append(email).append("]");
		return builder.toString();
	}

	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+this.toString() + " a realizat o rezervare "+ rezervare.toString());
	}

}
