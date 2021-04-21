package ro.ase.cts.state.program;

import ro.ase.cts.state.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa=new Masa(10);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ridicaRezervare();
		masa.elibereazaMasa();
	}

}
