package ro.ase.cts.singleton.lazy;

import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class Main {

	public static void main(String[] args) {
		ReceptieHotel receptie1 = ReceptieHotel.getInstanta("Ion", 4, "Hotel1");
		ReceptieHotel receptie2 = ReceptieHotel.getInstanta("Andrei", 2, "Hotel2");
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		receptie1.setNumeReceptioner("Andrei");
		receptie2.setEtaj(4);
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		
		//Liceu liceu1 = Liceu.getInstanta("Liceu1", 200, 8.1);
		//Liceu liceu2 = Liceu.getInstanta("Liceu2", 300, 9.1);
		//System.out.println(liceu1.toString());
		//System.out.println(liceu2.toString());
		}

}