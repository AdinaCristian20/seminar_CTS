package ro.ase.cts.adapter;

public class BiletAdapter extends Bilet implements BiletOnline{

	public BiletAdapter(int pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vindeBiletOnline() {
		// TODO Auto-generated method stub
		super.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		// TODO Auto-generated method stub
		super.rezerva();
	}

}
