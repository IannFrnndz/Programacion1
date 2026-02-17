
public abstract class AnimalBase implements Animal{

	protected String nombre;
	public AnimalBase(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void comer() {
		System.out.println(nombre +" esta comiendo");
	}
	
	@Override
	public abstract void hacerRuido();

}
