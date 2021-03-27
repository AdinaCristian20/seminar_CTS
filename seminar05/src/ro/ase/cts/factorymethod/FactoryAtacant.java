package ro.ase.cts.factorymethod;

public class FactoryAtacant implements Factory{

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Atacant(numeJucator);
	}

}
