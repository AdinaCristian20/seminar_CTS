package ro.ase.cts.builder;

public class RezervareBuilder implements RezervareBuilderAbstract{
	private Rezervare rezervare;

	public RezervareBuilder() {
		super();
		this.rezervare=new Rezervare(0,false,false,false,false,"");
	}
	
	public RezervareBuilder(int cod) {
		rezervare=new Rezervare(cod,false,false,false,false,null);
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	
	public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}

	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
}
