package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client("Marcel",23);
		Copiator client2= client.copiaza();
		
		System.out.println(client);
		System.out.println(client2);
		
		Bilet bilet1=new Bilet(23,"echipa1", "echipa2","12:00");
		Bilet b2=(Bilet)bilet1.copiaza();
		b2.setCod(11);
		Bilet b3=(Bilet)bilet1.copiaza();
		b3.setCod(123);
		Bilet b4=(Bilet)bilet1.copiaza();
		b4.setCod(1234);
		
		System.out.println(bilet1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
