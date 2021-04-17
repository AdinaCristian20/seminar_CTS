package ro.ase.cts.flyweight.models;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare r1=new Rezervare(1,2,"12:00");
		Rezervare r2=new Rezervare(2,2,"14:00");
		Rezervare r3=new Rezervare(3,5,"12:30");
		
		FlyweightFactory flyweightFactory=new FlyweightFactory();
		Client client1= flyweightFactory.getClient("0735869350");
		client1.printeazaRezervare(r1);
		flyweightFactory.getClient("0723233783").printeazaRezervare(r2);
		flyweightFactory.getClient("0735869350").printeazaRezervare(r3);
	}

}
