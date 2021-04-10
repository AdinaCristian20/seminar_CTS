package ro.ase.cts.facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana persoana=new Persoana("Georgel","1990412125711");
		if(persoana.getVarsta()>=18) {
			if(Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou=new BirouDeCredite();
				if(!birou.areCredite(persoana)) {
					System.out.println("S-a creat contul");
				}
			}
		}
		
		Persoana persoana2=new Persoana("Marian", "1990022123113");
		if(VerificatorPersoana.verificaPersoana(persoana2)) {
			System.out.println("S-a creat contul");
		}
		else {
			System.out.println("Ne pare rau");
		}
	}

}
