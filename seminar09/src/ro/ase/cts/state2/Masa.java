package ro.ase.cts.state2;

public class Masa {
	private State stare;
	private int codMasa;
	
	public Masa(int codMasa) {
		super();
		this.stare=new StareLibera();
		this.codMasa = codMasa;
	}

	public void setStare(State stare) {
		this.stare = stare;
	}

	public void setCodMasa(int codMasa) {
		this.codMasa = codMasa;
	}

	public State getStare() {
		return stare;
	}

	public int getCodMasa() {
		return codMasa;
	}
	
	public void rezervaMasa() {
		StareRezervata stareRezervata=new StareRezervata();
		stareRezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata stareOcupata=new StareOcupata();
		stareOcupata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareLibera stareLibera=new StareLibera();
		stareLibera.modificaStare(this);
	}
	
	public void ridicaRezervare() {
		ocupaMasa();
	}
}
