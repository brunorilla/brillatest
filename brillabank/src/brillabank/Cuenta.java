package brillabank;

public abstract class Cuenta implements ITasaInteres {
	
	public Cuenta() {
		
	}
	
	public Cuenta(String name) {
		System.out.println("Super " + name);
	}
}
