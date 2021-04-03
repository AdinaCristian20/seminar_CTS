package ro.ase.cts.adapter;

public class BiletAdapterObiecte implements BiletOnline {
	private Bilet bilet;
	
	public BiletAdapterObiecte(Bilet bilet) {
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.rezerva();
	}

}
