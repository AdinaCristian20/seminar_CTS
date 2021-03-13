package readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clase.Angajat;
import clase.Aplicant;

public class ReaderAngajati extends ReaderAplicanti{
	
	public ReaderAngajati(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicant() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		while (input2.hasNext()) {
			Angajat angajat = new Angajat();
			super.citesteAplicant(input2, angajat);
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		input2.close();
		return angajati;
	}
}
