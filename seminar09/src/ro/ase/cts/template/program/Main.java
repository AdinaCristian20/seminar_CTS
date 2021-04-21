package ro.ase.cts.template.program;

import ro.ase.cts.template.MasaInBar;
import ro.ase.cts.template.OcupareMasa;
import ro.ase.cts.template.TemplateOcupareMasa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemplateOcupareMasa masa=new OcupareMasa(23);
		masa.ocupaMasa();
		
		TemplateOcupareMasa masa2=new MasaInBar(123);
		masa2.ocupaMasa();
	}

}
