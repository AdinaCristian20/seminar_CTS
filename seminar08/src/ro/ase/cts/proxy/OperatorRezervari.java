package ro.ase.cts.proxy;

public class OperatorRezervari implements IOperatorRezervari{

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata rezervarea pentru "+numeClient+ " pentru "+nrPersoane+" persoane");
	}

}
