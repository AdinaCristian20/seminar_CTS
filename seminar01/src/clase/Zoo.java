package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private Zookeeper z;
	private List<Animal> animale;
	
	public Zoo(Zookeeper z, List<Animal> animale) {
		super();
		this.z = z;
		this.animale = animale;
	}

	public Zoo() {
		super();
		this.z = new Zookeeper("Ion");
		this.animale = new ArrayList<>();
	}
	
	public void adaugareAnimal(Animal a)
	{
		this.animale.add(a);
	}
	
	public void feedAnimals()
	{
		for(Animal a: animale) {
			z.feed(a);
		}
	}
	
	
	public void mutareAnimale() {
		for(Animal a: animale) {
			a.merge();
		}
	}
	
	
	

}
