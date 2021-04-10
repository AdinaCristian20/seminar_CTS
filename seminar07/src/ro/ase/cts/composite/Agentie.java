package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Sediu{
	private String nume;
	private List<Sediu> sedii;
	
	public Agentie(String nume) {
		super();
		this.nume = nume;
		this.sedii=new ArrayList<Sediu>();
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Agentie "+nume);
		for(int i=0;i<sedii.size();i++) {
			sedii.get(i).descriere();
		}
	}

	@Override
	public void adaugaSediu(Sediu sediu) {
		// TODO Auto-generated method stub
		sedii.add(sediu);
	}

	@Override
	public void stergeSediu(Sediu sediu)  {
		// TODO Auto-generated method stub
		sedii.remove(sediu);
	}

	@Override
	public Sediu getSediu(int pozitie) throws Exception {
		// TODO Auto-generated method stub
		if(pozitie<0 || pozitie>=sedii.size())
			throw new Exception();
		return sedii.get(pozitie);
	}

}
