package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	List<IComanda>comenzi;

	public ManagerComenzi() {
		super();
		comenzi=new ArrayList<IComanda>();
	}
	
	public void invoca(IComanda comanda) {
		comenzi.add(comanda);
	}
	
	public void executaComanda() throws Exception {
		if(comenzi.size()>0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
		else {
			throw new Exception();
		}
	}
	
	public void executaComenzi() {
		for(IComanda c: comenzi) {
			c.executa();
		}
		comenzi.clear();
	}
}
