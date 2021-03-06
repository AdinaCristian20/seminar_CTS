package program;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Angajat;
import readers.ReaderAngajati;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Angajat> listaAngajati;
		try {
			listaAngajati = ReaderAngajati.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
