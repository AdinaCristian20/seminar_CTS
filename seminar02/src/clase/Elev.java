package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private int sumaFinantata=30;
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Elev: ");
		builder.append(super.toString())
		.append("Clasa= ").append(this.clasa)
		.append(", Tutore=").append(tutore);
		return builder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	@Override
	public void afisareSumaFinantare() {
		// TODO Auto-generated method stub
		System.out.println(super.compunereStringPentruSumaFinantare(this.sumaFinantata, "Elev"));
	}
	
}

