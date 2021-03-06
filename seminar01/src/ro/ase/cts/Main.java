package ro.ase.cts;

import clase.Animal;
import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Animal zebra1 = new Zebra("Monica");
		Animal zebra2 = new Zebra("Marcel");
		Animal girafa1 = new Giraffe("Mariana");
		Animal girafa2 = new Giraffe("Ionel", 500);
		
		zoo.adaugareAnimal(zebra1);
		zoo.adaugareAnimal(zebra2);
		zoo.adaugareAnimal(girafa1);
		zoo.adaugareAnimal(girafa2);
		
		zoo.feedAnimals();
		zoo.mutareAnimale();

	}

}

