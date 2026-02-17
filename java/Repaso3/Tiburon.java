
public class Tiburon extends AnimalBase{

	public Tiburon(String nombre) {
		super(nombre);
	}
	public void nadar() {
		System.out.println(nombre+ " esta volando");
	}
	@Override
	public void hacerRuido() {
		System.out.println(nombre+ " hace busbujas al nadar");
		
	}
}
