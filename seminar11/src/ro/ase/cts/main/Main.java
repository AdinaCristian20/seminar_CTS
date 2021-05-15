package ro.ase.cts.main;

import ro.ase.cts.memento.ManagerMemento;
import ro.ase.cts.memento.MeciJucat;
import ro.ase.cts.memento.Memento;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci1=new MeciJucat("Echipa 1", "Echipa 2", 250, 150, 145,100);
		Memento memento=meci1.creareMemento();
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(memento);
		
		meci1.setNumarSpectatori(7500);
		meci1.setNrBileteVandute(10000);
		meci1.setEchibaGazda("Real");
		meci1.setEchipaOaspeti("FCSB");
		
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getLastMemento());
		System.out.println(meci1.toString());
	}
}
