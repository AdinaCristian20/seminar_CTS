package ro.ase.cts.memento;

public class MeciJucat {
	private String echibaGazda;
	private String echipaOaspeti;
	private int nrBileteVandute;
	private int numarSpectatori;
	private int numarJandarmi;
	private int numarStewarzi;
	
	public MeciJucat(String echibaGazda, String echipaOaspeti, int nrBileteVandute, int numarSpectatori,
			int numarJandarmi, int numarStewarzi) {
		super();
		this.echibaGazda = echibaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.numarSpectatori = numarSpectatori;
		this.numarJandarmi = numarJandarmi;
		this.numarStewarzi = numarStewarzi;
	}

	public void setEchibaGazda(String echibaGazda) {
		this.echibaGazda = echibaGazda;
	}

	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNumarSpectatori(int numarSpectatori) {
		this.numarSpectatori = numarSpectatori;
	}

	public void setNumarJandarmi(int numarJandarmi) {
		this.numarJandarmi = numarJandarmi;
	}

	public void setNumarStewarzi(int numarStewarzi) {
		this.numarStewarzi = numarStewarzi;
	}
	
	public Memento creareMemento() {
		Memento memento=new Memento(this.echibaGazda, this.echipaOaspeti, this.numarSpectatori);
		return memento;	
	}
	
	public void setMemento(Memento memento) {
		this.echibaGazda=memento.getEchibaGazda();
		this.echipaOaspeti=memento.getEchipaOaspeti();
		this.numarSpectatori=memento.getNumarSpectatori();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [echibaGazda=");
		builder.append(echibaGazda);
		builder.append(", echipaOaspeti=");
		builder.append(echipaOaspeti);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", numarSpectatori=");
		builder.append(numarSpectatori);
		builder.append(", numarJandarmi=");
		builder.append(numarJandarmi);
		builder.append(", numarStewarzi=");
		builder.append(numarStewarzi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
