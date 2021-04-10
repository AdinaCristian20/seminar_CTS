package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.Decorator;
import ro.ase.cts.decorator.DecoratorContactLessTelefon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1=new Card("Ion", 3000);
		card1.realizeazaPlataNormala(200);
		card1.realizeazaPlataOnline(300);
		
		Decorator cardNou=new Decorator(card1);
		cardNou.platesteContactLess(400);
		cardNou.realizeazaPlataNormala(100);
		cardNou.realizeazaPlataOnline(200);
		
		DecoratorContactLessTelefon decoratorContactLessTelefon=new DecoratorContactLessTelefon(card1);
		decoratorContactLessTelefon.platesteContactLess(300);
	}

}
