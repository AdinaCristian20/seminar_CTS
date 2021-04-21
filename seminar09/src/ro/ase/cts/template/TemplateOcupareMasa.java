package ro.ase.cts.template;

public abstract class TemplateOcupareMasa {
	protected int codMasa;
	
	public abstract void curataMasa();
	public abstract void aseazaSeretele();
	public abstract void aseazaTacamuri();
	public abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curataMasa();
		aseazaSeretele();
		aseazaTacamuri();
		invitaPersoane();
	};
}
