package ro.ase.cts.template;

public class MasaInBar extends TemplateOcupareMasa{
	private int cod;
	
	
	@Override
	public void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Masa "+this.cod+" este curatata");
	}

	public MasaInBar(int cod) {
		super();
		// TODO Auto-generated constructor stub
		this.cod=cod;
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
