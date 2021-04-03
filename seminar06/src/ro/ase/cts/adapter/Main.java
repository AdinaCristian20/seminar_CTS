package ro.ase.cts.adapter;

public class Main {
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	public static void rezervaSiVindeBiletePePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet=new Bilet(20);
		rezervaSiVindeBiletLaCasa(bilet);
		
		BiletAdapter biletAdapter=new BiletAdapter(30);
		rezervaSiVindeBiletePePlatforma(biletAdapter);
		
		BiletOnline biletOnline=new BiletAdapterObiecte(bilet);
		rezervaSiVindeBiletePePlatforma(biletOnline);
	}

}
