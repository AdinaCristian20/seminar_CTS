package ro.ase.cts.memento;

public class Memento {
	private String echibaGazda;
	private String echipaOaspeti;
	private int numarSpectatori;
	
	public Memento(String echibaGazda, String echipaOaspeti, int nrBileteVandute) {
		super();
		this.echibaGazda = echibaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.numarSpectatori = nrBileteVandute;
	}
	
	public String getEchibaGazda() {
		return echibaGazda;
	}
	public String getEchipaOaspeti() {
		return echipaOaspeti;
	}
	public int getNumarSpectatori() {
		return numarSpectatori;
	}
	
}
