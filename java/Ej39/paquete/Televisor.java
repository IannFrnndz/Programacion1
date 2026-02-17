package paquete;

public class Televisor extends Electrodomestico{
protected int pulgadas;

public Televisor(String marca, double precio, int pulgadas){
	super(marca, precio);
	
	this.pulgadas = pulgadas;
	
}

public void mostrarDatos() {
	System.out.println("Marca: " + marca);
	System.out.println("Precio: " + precio);
	System.out.println("Pulgadas: " + pulgadas);
}
}
