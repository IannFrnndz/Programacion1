package paquete;

public class Lavadora extends Electrodomestico{
	
protected double capacidadKg;
	
public Lavadora(String marca, double precio, double capacidadKg) {
	super(marca, precio);
	this.capacidadKg = capacidadKg;
	
}

public void mostrarDatos() {
	System.out.println("Marca: " + marca);
	System.out.println("Precio: " + precio);
	System.out.println("Capacidad: " + capacidadKg);
}
}
