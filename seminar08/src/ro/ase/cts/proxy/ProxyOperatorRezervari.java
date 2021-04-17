package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{
	
	private OperatorRezervari operator;
	private int nrMinimPersoane;
	
	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinim) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMinim;
	}

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		// TODO Auto-generated method stub
		if(nrPersoane>=nrMinimPersoane) {
			operator.realizeazaRezervare(numeClient, nrPersoane);
		}
		else {
			System.out.println("Va rugam veniti direct fara rezervare!");
		}
	}
	
}
