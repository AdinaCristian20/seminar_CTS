package ro.ase.cts.flyweight.models;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Client>map;

	public FlyweightFactory() {
		super();
		this.map = new HashMap<>();
	}
	
	public Client getClient(String nrTelefon) {
		Client client;
		client=map.get(nrTelefon);
		if(client==null) {
			client=new Client("Ion", nrTelefon, "Email");
			map.put(nrTelefon, client);
		}
		return client;
	}
}
