
public class Perro extends AnimalBase{

	
	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau guau");
		
	}
	
	public void estaContento() {
		System.out.println( nombre+ " esta contento");
	}

}
