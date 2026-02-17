
public class Loro extends AnimalBase{

	public Loro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerRuido() {
		System.out.println("Te esta imitando");
		
	}
	
	public void volar() {
		System.out.println( nombre+ " esta volando");
	}

}
