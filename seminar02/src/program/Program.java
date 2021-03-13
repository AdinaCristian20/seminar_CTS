package program;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Aplicant;
import clase.Proiect;
import readers.ReaderAngajati;
import readers.ReaderAplicanti;
import readers.ReaderElevi;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(ReaderAplicanti reader) throws FileNotFoundException{
		List<Aplicant>listaAplicanti=reader.readAplicant();
		return listaAplicanti;
	}
	
	public static void afiseazaAplicanti(List<Aplicant> listaAplicanti) {
		Proiect proiect=new Proiect(81);
		for(Aplicant aplicant:listaAplicanti) {
			System.out.println(aplicant.toString());
			aplicant.afisareSumaFinantare();
		aplicant.afisareStatusProiect(proiect);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti=citesteAplicanti(new ReaderAngajati("angajati.txt"));
			afiseazaAplicanti(listaAplicanti);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
