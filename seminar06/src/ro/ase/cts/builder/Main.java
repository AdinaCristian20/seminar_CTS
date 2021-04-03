package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare r1=new Rezervare(1234, false, false, false, true, "Rock");
		Rezervare r2=new RezervareBuilder(15).setAreScaunErgonomic(true).build();
		Rezervare r3=new RezervareBuilder(25).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).setGenMuzica("Jezz").build();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

}
