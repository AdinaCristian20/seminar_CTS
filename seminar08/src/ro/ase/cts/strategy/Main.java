package ro.ase.cts.strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client("Gigel", new PlataCard());
		client.platesteNota(200);
		client.setModPlata(new PlataCash());
		client.platesteNota(20);
	}

}
