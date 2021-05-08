package ro.ase.cts.chain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cont contEconomii=new ContEconomii(1000,"RO123456");
		Cont contCredit=new ContCredit(2000,"RO773456");
		Cont contCurent=new ContCurent(1200,"RO565678");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(400);
		contCurent.plateste(700);
		contCurent.plateste(2000);
		contCurent.plateste(700);
		contCurent.plateste(700);
	}

}
