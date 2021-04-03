package ro.ase.cts.builder;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic,
			boolean areMuzicaAmbientala, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica=genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	
	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=").append(codRezervare).append(", areMancareInclusa=")
				.append(areMancareInclusa).append(", areBauturaInclusa=").append(areBauturaInclusa)
				.append(", areScaunErgonomic=").append(areScaunErgonomic).append(", areMuzicaAmbientala=")
				.append(areMuzicaAmbientala).append(", genMuzica=").append(genMuzica).append("]");
		return builder.toString();
	}
	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}
	
	
}
