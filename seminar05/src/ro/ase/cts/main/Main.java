package ro.ase.cts.main;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.Jucator;
import ro.ase.cts.factory.TipJucator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.Portar, "Dorel");
		Jucator fundas=factory.getJucator(TipJucator.Fundas, "Ionel");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
