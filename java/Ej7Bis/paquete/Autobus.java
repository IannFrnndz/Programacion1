package paquete;

public class Autobus extends Vehiculo {
	protected Boolean adaptado;
public Autobus(int codigo, int ano, int plazas, Boolean adaptado) {
	super(codigo, ano, plazas);
	this.adaptado = adaptado;
}

@Override
public void mostrar() {
	System.out.println("El autobus: " + codigo + "\n es del año " + ano + "\n con " + plazas+ "plazas, \n está adaptado: " + adaptado);
}
}
