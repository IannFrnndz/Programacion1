package paquete;

public class Furgoneta extends Vehiculo {
	protected String carga;
public Furgoneta(int codigo, int ano, int plazas, String carga) {
	super(codigo, ano, plazas);
	this.carga = carga;
}

@Override
public void mostrar() {
	System.out.println("La furgoneta: " + codigo + "\n es del año " + ano + "\n con " + plazas+ "plazas, \n lleva la carga de: " + carga);
}
}