package ro.ase.cts.program;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare r1=new Rezervare(1234, false, false, false, true, "Rock");
		Rezervare r2=new RezervareBuilder(15).setAreScaunErgonomic(true).build();
		Rezervare r3=new RezervareBuilder(25).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).setGenMuzica("Jezz").build();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		RezervareBuilder br=new RezervareBuilder();
		Rezervare r4=br.setCodRezervare(35).setAreBauturaInclusa(true).build();
		Rezervare r5=br.setCodRezervare(45).setAreMuzicaAmbientala(true).setGenMuzica("Pop").build();
		
		System.out.println(r4);
		System.out.println(r5);
		
		RezervareBuilderV2 rv2=new RezervareBuilderV2();
		rv2.setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare r6=rv2.setCodRezervare(55).build();
		Rezervare r7=rv2.setCodRezervare(65).build();
			
		System.out.println(r6.toString());
		System.out.println(r7.toString());
	}

}
