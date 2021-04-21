package ro.ase.cts.observer.program;

import ro.ase.cts.observer.Client;
import ro.ase.cts.observer.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant=new Restaurant("restaurant", "Bucuresti");
		Client c1=new Client("Ion");
		Client c2=new Client("Ioana");
		Client c3=new Client("Mihai");
		
		restaurant.adaugaObserver(c1);
		restaurant.adaugaObserver(c2);
		restaurant.realizareOfertaPret();
		
		restaurant.stergeObserver(c2);
		restaurant.adaugaObserver(c3);
		
		restaurant.introducereMeniu();
	}

}
