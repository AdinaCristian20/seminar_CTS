package readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String fileName;
	
	public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}

	//aici trebuia readerAplicanti
	public abstract List<Aplicant> readAplicant() throws FileNotFoundException;
	
	public void citesteAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(vect, nr);
		
	}
	
}
