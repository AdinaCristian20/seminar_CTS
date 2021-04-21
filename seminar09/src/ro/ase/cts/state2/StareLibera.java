package ro.ase.cts.state2;

public class StareLibera implements State {

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof StareLibera)){
			System.out.println("Masa cu codul "+masa.getCodMasa()+" este eliberata.");
			masa.setStare(this);
		}
		else {
			System.out.println("Masa nu poate fi eliberata!");
		}
	}

}
