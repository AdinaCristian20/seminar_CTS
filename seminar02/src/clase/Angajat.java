package clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private int sumaFinantata=10;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	


	@Override
	public void afisareSumaFinantare() {
		// TODO Auto-generated method stub
		System.out.println(super.compunereStringPentruSumaFinantare(this.sumaFinantata, "Angajat"));
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Angajat: ");
		builder.append(super.toString())
		.append("ocupatie= ").append(this.ocupatie)
		.append(", salariu=").append(salariu);
		return builder.toString();
	}
	
	
	
	
}
