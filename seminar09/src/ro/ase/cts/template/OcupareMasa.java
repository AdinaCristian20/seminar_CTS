package ro.ase.cts.template;

public class OcupareMasa extends TemplateOcupareMasa{
	private int cod;
	

	public OcupareMasa(int cod) {
		super();
		this.cod = cod;
	}

	@Override
	public void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Masa "+this.cod+" este curatata");
	}

	@Override
	public void aseazaSeretele() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa "+this.cod+" s-au asezat servetelele.");
	}

	@Override
	public void aseazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa "+this.cod+" s-au asezat tacamurile.");
	}

	@Override
	public void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("L-a masa "+this.cod+" au fost invitate persoanele");
	}
	
}
