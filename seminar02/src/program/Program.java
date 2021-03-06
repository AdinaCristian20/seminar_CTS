package program;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Aplicant;
import readers.ReaderElevi;

public class Program {
	
	//public static List<Aplicant> citesteAplicanti()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = ReaderElevi.readPupil("elevi.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
